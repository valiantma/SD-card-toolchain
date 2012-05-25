package com.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.licensing.a.b;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public final class s
  implements ServiceConnection
{
  private static final SecureRandom a = new SecureRandom();
  private ILicensingService b;
  private PublicKey c;
  private final Context d;
  private final q e;
  private Handler f;
  private final String g;
  private final String h;
  private final Set i;
  private final Queue j;

  public s(Context paramContext, q paramq, String paramString)
  {
    HashSet localHashSet = new HashSet();
    this.i = localHashSet;
    LinkedList localLinkedList = new LinkedList();
    this.j = localLinkedList;
    this.d = paramContext;
    this.e = paramq;
    PublicKey localPublicKey = a(paramString);
    this.c = localPublicKey;
    String str1 = this.d.getPackageName();
    this.g = str1;
    String str2 = this.g;
    String str3 = a(paramContext, str2);
    this.h = str3;
    HandlerThread localHandlerThread = new HandlerThread("background thread");
    localHandlerThread.start();
    Looper localLooper = localHandlerThread.getLooper();
    Handler localHandler = new Handler(localLooper);
    this.f = localHandler;
  }

  private static String a(Context paramContext, String paramString)
  {
    try
    {
      String str1 = String.valueOf(paramContext.getPackageManager().getPackageInfo(paramString, 0).versionCode);
      return str1;
    }
    catch (PackageManager.NameNotFoundException str2)
    {
      while (true)
      {
        Log.e("LicenseChecker", "Package not found. could not get version code.");
        String str2 = "";
      }
    }
  }

  private static PublicKey a(String paramString)
  {
    try
    {
      Object localObject = b.a(paramString);
      KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
      X509EncodedKeySpec localX509EncodedKeySpec = new X509EncodedKeySpec(localObject);
      localObject = localKeyFactory.generatePublic(localX509EncodedKeySpec);
      return localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
    catch (com.android.vending.licensing.a.a locala)
    {
      Log.e("LicenseChecker", "Could not decode from Base64.");
      throw new IllegalArgumentException(locala);
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      Log.e("LicenseChecker", "Invalid key specification.");
    }
    throw new IllegalArgumentException(localInvalidKeySpecException);
  }

  /** @deprecated */
  private void a(a parama)
  {
    monitorenter;
    try
    {
      this.i.remove(parama);
      if (this.i.isEmpty())
        c();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  private void b()
  {
    while (true)
    {
      a locala = (a)this.j.poll();
      if (locala == null)
        return;
      try
      {
        StringBuilder localStringBuilder = new StringBuilder("Calling checkLicense on service for ");
        String str1 = locala.c();
        String str2 = str1;
        Log.i("LicenseChecker", str2);
        ILicensingService localILicensingService = this.b;
        long l = locala.b();
        String str3 = locala.c();
        f localf = new f(this, locala);
        localILicensingService.a(l, str3, localf);
        this.i.add(locala);
      }
      catch (RemoteException localRemoteException)
      {
        Log.w("LicenseChecker", "RemoteException in checkLicense call.", localRemoteException);
        b(locala);
      }
    }
  }

  /** @deprecated */
  private void b(a parama)
  {
    monitorenter;
    try
    {
      q localq = this.e;
      t localt = t.c;
      localq.a(localt, null);
      if (this.e.a())
        parama.a().a();
      while (true)
      {
        return;
        parama.a().b();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void c()
  {
    if (this.b != null);
    try
    {
      this.d.unbindService(this);
      this.b = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
    }
  }

  /** @deprecated */
  public final void a()
  {
    monitorenter;
    try
    {
      c();
      this.f.getLooper().quit();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  /** @deprecated */
  public final void a(p paramp)
  {
    monitorenter;
    while (true)
    {
      a locala;
      try
      {
        boolean bool = this.e.a();
        if (!bool)
          continue;
        Log.i("LicenseChecker", "Using cached license response");
        paramp.a();
        return;
        q localq = this.e;
        m localm = new m();
        int k = a.nextInt();
        String str1 = this.g;
        String str2 = this.h;
        p localp = paramp;
        locala = new a(localq, localm, localp, k, str1, str2);
        if (this.b != null)
          break label198;
        Log.i("LicenseChecker", "Binding to licensing service.");
        try
        {
          Context localContext = this.d;
          String str3 = ILicensingService.class.getName();
          Intent localIntent = new Intent(str3);
          if (!localContext.bindService(localIntent, this, 1))
            break label181;
          this.j.offer(locala);
        }
        catch (SecurityException localSecurityException)
        {
          v localv = v.e;
          paramp.a(localv);
        }
        continue;
      }
      finally
      {
        monitorexit;
      }
      label181: Log.e("LicenseChecker", "Could not bind to service.");
      b(locala);
      continue;
      label198: this.j.offer(locala);
      b();
    }
  }

  /** @deprecated */
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    monitorenter;
    int k;
    if (paramIBinder == null)
      k = 0;
    try
    {
      while (true)
      {
        this.b = k;
        b();
        return;
        Object localObject1 = paramIBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
        if ((localObject1 != null) && ((localObject1 instanceof ILicensingService)))
        {
          localObject1 = (ILicensingService)localObject1;
          continue;
        }
        localObject1 = new i(paramIBinder);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }

  /** @deprecated */
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    monitorenter;
    try
    {
      Log.w("LicenseChecker", "Service unexpectedly disconnected.");
      this.b = null;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.s
 * JD-Core Version:    0.6.0
 */