package com.admob.android.ads;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public final class af
  implements b
{
  private static af a = null;
  private static Context b = null;
  private static Thread c = null;
  private static String d = null;
  private Properties e;
  private Context f;

  private af(Context paramContext)
  {
    this.f = paramContext;
    this.e = i;
    d = a();
    if (a != null)
      a.e = i;
    if ((!b()) && (c == null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("http://mm.admob.com/static/android/i18n/20101109");
      localStringBuilder.append("/");
      String str1 = d;
      localStringBuilder.append(str1);
      localStringBuilder.append(".properties");
      String str2 = localStringBuilder.toString();
      String str3 = ak.g(this.f);
      n localn = a.a(str2, str3, this);
      Thread localThread = new Thread(localn);
      c = localThread;
      localThread.start();
    }
  }

  private static File a(Context paramContext, String paramString)
  {
    Object localObject = paramContext.getCacheDir();
    File localFile = new File((File)localObject, "admob_cache");
    localObject = localFile.exists();
    if (localObject == 0)
      localFile.mkdir();
    localObject = new File(localFile, "20101109");
    if (!((File)localObject).exists())
      ((File)localObject).mkdir();
    String str = paramString + ".properties";
    return (File)new File((File)localObject, str);
  }

  public static String a()
  {
    if (d == null)
    {
      String str = Locale.getDefault().getLanguage();
      d = str;
      if (str == null)
        d = "en";
    }
    return d;
  }

  public static String a(String paramString)
  {
    a(b);
    Object localObject = a;
    ((af)localObject).b();
    if (((af)localObject).e != null)
    {
      localObject = ((af)localObject).e.getProperty(paramString);
      if ((localObject != null) && (!((String)localObject).equals("")));
    }
    for (localObject = paramString; ; localObject = paramString)
      return localObject;
  }

  public static void a(Context paramContext)
  {
    if ((b == null) && (paramContext != null))
      b = paramContext.getApplicationContext();
    if (a == null)
    {
      Context localContext = b;
      a = new af(localContext);
    }
  }

  private boolean b()
  {
    Properties localProperties = this.e;
    if (localProperties == null);
    try
    {
      localProperties = new Properties();
      Object localObject2 = this.f;
      String str = d;
      localObject2 = a((Context)localObject2, str);
      if (((File)localObject2).exists())
      {
        FileInputStream localFileInputStream = new FileInputStream((File)localObject2);
        localProperties.load(localFileInputStream);
        this.e = localProperties;
      }
      localProperties = this.e;
      if (localProperties != null)
      {
        int i = 1;
        return i;
      }
    }
    catch (IOException localObject1)
    {
      while (true)
      {
        int j = 0;
        this.e = j;
        continue;
        Object localObject1 = null;
      }
    }
  }

  public final void a(n paramn)
  {
    try
    {
      byte[] arrayOfByte = paramn.c();
      if (arrayOfByte != null)
      {
        Context localContext = this.f;
        String str = d;
        File localFile = a(localContext, str);
        FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
        localFileOutputStream.write(arrayOfByte);
        localFileOutputStream.close();
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 3))
          continue;
        Log.d("AdMobSDK", "Could not store localized strings to cache file.");
      }
    }
  }

  public final void a(n paramn, Exception paramException)
  {
    if (bh.a("AdMobSDK", 3))
      Log.d("AdMobSDK", "Could not get localized strings from the AdMob servers.");
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.af
 * JD-Core Version:    0.6.0
 */