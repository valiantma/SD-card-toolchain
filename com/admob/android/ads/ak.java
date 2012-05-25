package com.admob.android.ads;

import Z;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.GregorianCalendar;

public final class ak
{
  private static String a;
  private static int b;
  private static String c;
  private static String d;
  private static String e;
  private static String[] f;
  private static String g;
  private static Location h;
  private static boolean i;
  private static boolean j;
  private static long k;
  private static String l;
  private static GregorianCalendar m;
  private static bf n;
  private static boolean o;
  private static Boolean p;

  static
  {
    int i1 = 0;
    e = ci.a.toString();
    f = i1;
    boolean bool1 = i;
    boolean bool2 = j;
    boolean bool3 = o;
    if (bh.a("AdMobSDK", 4))
      Log.i("AdMobSDK", "AdMob SDK version is 20101109-ANDROID-3312276cc1406347");
    p = i1;
  }

  static j a(ah paramah)
  {
    j localj = 1;
    int i1 = paramah.a.getMode();
    Object localObject;
    if (b())
      localObject = j.c;
    while (true)
    {
      return localObject;
      if ((paramah.a.isMusicActive()) || (paramah.a.isSpeakerphoneOn()) || (localObject == 2) || (localObject == localj))
      {
        localObject = j.b;
        continue;
      }
      localObject = paramah.a.getRingerMode();
      if ((localObject == 0) || (localObject == localj))
      {
        localObject = j.b;
        continue;
      }
      localObject = j.a;
    }
  }

  public static String a()
  {
    return e;
  }

  private static String a(Bundle paramBundle, String paramString1, String paramString2)
  {
    int i1 = 0;
    String str1 = paramBundle.getString(paramString1);
    if (bh.a("AdMobSDK", 3))
    {
      String str2 = "Publisher ID read from AndroidManifest.xml is " + str1;
      Log.d("AdMobSDK", str2);
    }
    Object localObject;
    if ((paramString2 == null) && (str1 != null))
      localObject = str1;
    return localObject;
  }

  static void a(Context paramContext)
  {
    boolean bool1;
    o = bool1;
    if (!bool1)
      bool1 = o;
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      String str1 = paramContext.getPackageName();
      ApplicationInfo localApplicationInfo = ((PackageManager)localObject1).getApplicationInfo(str1, 128);
      if (localApplicationInfo != null)
      {
        Object localObject2 = localApplicationInfo.metaData;
        if (localObject2 != null)
        {
          localObject2 = localApplicationInfo.metaData;
          String str2 = c;
          localObject2 = a((Bundle)localObject2, "ADMOB_PUBLISHER_ID", str2);
          if (localObject2 != null)
          {
            b((String)localObject2);
            if (bh.a("AdMobSDK", 4))
            {
              String str3 = "Publisher ID set to " + (String)localObject2;
              Log.i("AdMobSDK", str3);
            }
            c = (String)localObject2;
          }
          localObject2 = localApplicationInfo.metaData;
          String str4 = d;
          localObject2 = a((Bundle)localObject2, "ADMOB_INTERSTITIAL_PUBLISHER_ID", str4);
          if (localObject2 != null)
          {
            b((String)localObject2);
            if (bh.a("AdMobSDK", 4))
            {
              String str5 = "Interstitial Publisher ID set to " + (String)localObject2;
              Log.i("AdMobSDK", str5);
            }
            d = (String)localObject2;
          }
          j = (Z)localObject2;
          if (localObject2 == null)
          {
            boolean bool2 = localApplicationInfo.metaData.getBoolean("ADMOB_ALLOW_LOCATION_FOR_ADS", null);
            boolean bool3 = i;
          }
        }
        a = localApplicationInfo.packageName;
        if (c != null)
          b(c);
        if (d != null)
          b(d);
        if (bh.a("AdMobSDK", 2))
        {
          StringBuilder localStringBuilder1 = new StringBuilder().append("Application's package name is ");
          String str6 = a;
          String str7 = str6;
          Log.v("AdMobSDK", str7);
        }
      }
      localObject1 = ((PackageManager)localObject1).getPackageInfo(str1, 0);
      if (localObject1 != null)
      {
        b = ((PackageInfo)localObject1).versionCode;
        if (bh.a("AdMobSDK", 2))
        {
          StringBuilder localStringBuilder2 = new StringBuilder().append("Application's version number is ");
          int i1 = b;
          String str8 = i1;
          Log.v("AdMobSDK", str8);
        }
      }
      label370: return;
    }
    catch (Exception localException)
    {
      break label370;
    }
  }

  protected static void a(String paramString)
  {
    if (bh.a("AdMobSDK", 6))
      Log.e("AdMobSDK", paramString);
    throw new IllegalArgumentException(paramString);
  }

  public static String b(Context paramContext)
  {
    if (a == null)
      a(paramContext);
    return a;
  }

  private static void b(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 15))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("SETUP ERROR:  Incorrect AdMob publisher ID.  Should 15 [a-f,0-9] characters:  ");
      String str1 = c;
      a(str1);
    }
    if ((a != null) && (paramString.equalsIgnoreCase("a1496ced2842262")))
    {
      String str2 = a;
      if (!"com.admob.android.ads".equals(str2))
      {
        String str3 = a;
        if (!"com.example.admob.lunarlander".equals(str3))
          a("SETUP ERROR:  Cannot use the sample publisher ID (a1496ced2842262).  Yours is available on www.admob.com.");
      }
    }
  }

  public static boolean b()
  {
    String str1 = Build.BOARD;
    boolean bool = "unknown".equals(str1);
    if (bool)
    {
      String str2 = Build.DEVICE;
      bool = "generic".equals(str2);
      if (bool)
      {
        String str3 = Build.BRAND;
        bool = "generic".equals(str3);
        if (bool)
          bool = true;
      }
    }
    while (true)
    {
      return bool;
      Object localObject = null;
    }
  }

  protected static int c(Context paramContext)
  {
    if (a == null)
      a(paramContext);
    return b;
  }

  static String c()
  {
    return String.valueOf(k / 1000L);
  }

  private static String c(String paramString)
  {
    int i1 = 0;
    int i2 = 0;
    if ((paramString != null) && (paramString.length() > 0));
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      byte[] arrayOfByte = paramString.getBytes();
      int i3 = paramString.length();
      ((MessageDigest)localObject).update(arrayOfByte, 0, i3);
      Object[] arrayOfObject = new Object[1];
      localObject = ((MessageDigest)localObject).digest();
      BigInteger localBigInteger = new BigInteger(1, localObject);
      arrayOfObject[0] = localBigInteger;
      localObject = String.format("%032X", arrayOfObject);
      return localObject;
    }
    catch (Exception str1)
    {
      while (true)
      {
        if (bh.a("AdMobSDK", 3))
        {
          String str2 = "Could not generate hash of " + paramString;
          Log.d("AdMobSDK", str2, localException);
        }
        String str1 = paramString.substring(i1, 32);
      }
    }
  }

  public static String d()
  {
    return l;
  }

  public static String d(Context paramContext)
  {
    if (c == null)
      a(paramContext);
    if ((c == null) && (bh.a("AdMobSDK", 6)))
      Log.e("AdMobSDK", "getPublisherId returning null publisher id.  Please set the publisher id in AndroidManifest.xml or using AdManager.setPublisherId(String)");
    return c;
  }

  static String e()
  {
    int i1 = 2;
    int i2 = 1;
    int i3 = 0;
    GregorianCalendar localGregorianCalendar = m;
    String str;
    if (localGregorianCalendar != null)
    {
      Object[] arrayOfObject = new Object[3];
      Integer localInteger1 = Integer.valueOf(localGregorianCalendar.get(i2));
      arrayOfObject[0] = localInteger1;
      int i4 = localGregorianCalendar.get(i1);
      int i5;
      i5++;
      Integer localInteger2 = Integer.valueOf(i4);
      arrayOfObject[i2] = localInteger2;
      Integer localInteger3 = Integer.valueOf(localGregorianCalendar.get(5));
      arrayOfObject[i1] = localGregorianCalendar;
      str = String.format("%04d%02d%02d", arrayOfObject);
    }
    return str;
  }

  public static String e(Context paramContext)
  {
    if (d == null)
      a(paramContext);
    if ((d == null) && (bh.a("AdMobSDK", 6)))
      Log.e("AdMobSDK", "getInterstitialPublisherId returning null publisher id.  Please set the publisher id in AndroidManifest.xml or using AdManager.setPublisherId(String)");
    return d;
  }

  static String f()
  {
    Object localObject = n;
    bf localbf1 = bf.a;
    if (localObject == localbf1)
      localObject = "m";
    while (true)
    {
      return localObject;
      localObject = n;
      bf localbf2 = bf.b;
      if (localObject == localbf2)
      {
        localObject = "f";
        continue;
      }
      int i1 = 0;
    }
  }

  public static boolean f(Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = f;
    int i1;
    if (localObject2 != null)
    {
      localObject2 = g(paramContext);
      if (localObject2 == null)
        localObject2 = "emulator";
      localObject2 = Arrays.binarySearch(f, localObject2);
      if (localObject2 >= 0)
        i1 = 1;
    }
    while (true)
    {
      return i1;
      Object localObject3 = localObject1;
      continue;
      localObject3 = localObject1;
    }
  }

  public static String g(Context paramContext)
  {
    Object localObject = g;
    if (localObject == null)
    {
      localObject = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if ((localObject != null) && (!b()))
        break label110;
      g = "emulator";
      localObject = "AdMobSDK";
      Log.i((String)localObject, "To get test ads on the emulator use AdManager.setTestDevices( new String[] { AdManager.TEST_EMULATOR } )");
      localObject = bh.a("AdMobSDK", 3);
      if (localObject != 0)
      {
        localObject = "AdMobSDK";
        StringBuilder localStringBuilder1 = new StringBuilder().append("The user ID is ");
        String str2 = g;
        String str3 = str2;
        Log.d((String)localObject, str3);
      }
    }
    localObject = g;
    int i1;
    if (localObject == "emulator")
      i1 = 0;
    while (true)
    {
      return i1;
      label110: g = c(i1);
      String str1 = "AdMobSDK";
      StringBuilder localStringBuilder2 = new StringBuilder().append("To get test ads on this device use AdManager.setTestDevices( new String[] { \"");
      String str4 = g;
      String str5 = str4 + "\" } )";
      Log.i(str1, str5);
      break;
      str1 = g;
    }
  }

  static String h(Context paramContext)
  {
    Object localObject1 = null;
    Location localLocation = j(paramContext);
    if (localLocation != null)
    {
      localObject1 = new StringBuilder();
      double d1 = localLocation.getLatitude();
      Object localObject2;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(",");
      double d2 = localLocation.getLongitude();
      localObject1 = localLocation;
    }
    if (bh.a("AdMobSDK", 3))
    {
      String str = "User coordinates are " + (String)localObject1;
      Log.d("AdMobSDK", str);
    }
    return (String)localObject1;
  }

  public static String i(Context paramContext)
  {
    String str = "p";
    if (((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getOrientation() == 1)
      str = "l";
    return str;
  }

  private static Location j(Context paramContext)
  {
    long l1 = -17504L;
    int i1 = 0;
    Object localObject1 = null;
    Object localObject2 = 1;
    boolean bool = b();
    Object localObject3;
    if (bool)
    {
      i = bool;
      if (!bool)
      {
        int i2 = 4;
        bool = bh.a("AdMobSDK", i2);
        if (bool)
        {
          Log.i("AdMobSDK", "Location information is not being used for ad requests. Enable location");
          Log.i("AdMobSDK", "based ads with AdManager.setAllowUseOfLocation(true) or by setting ");
          localObject3 = "AdMobSDK";
          String str = "meta-data ADMOB_ALLOW_LOCATION_FOR_ADS to true in AndroidManifest.xml";
          Log.i((String)localObject3, str);
        }
      }
    }
    i = localObject3;
    long l2;
    long l3;
    if ((localObject3 != 0) && (paramContext != null))
    {
      localObject3 = h;
      if (localObject3 != null)
      {
        localObject3 = System.currentTimeMillis();
        l2 = k + l1;
        Object localObject5;
        localObject5 <= l2;
        if (localObject3 <= 0);
      }
      else
      {
        monitorenter;
      }
    }
    while (true)
    {
      try
      {
        localObject3 = h;
        if (localObject3 == null)
          continue;
        localObject3 = System.currentTimeMillis();
        l2 = k + l1;
        l3 <= l2;
        if (localObject3 <= 0)
          continue;
        k = System.currentTimeMillis();
        localObject3 = paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
        if (localObject3 != 0)
          break label507;
        int i3 = 3;
        localObject3 = bh.a("AdMobSDK", i3);
        if (localObject3 == 0)
          continue;
        localObject3 = "AdMobSDK";
        localObject4 = "Trying to get locations from the network.";
        Log.d((String)localObject3, (String)localObject4);
        localObject3 = (LocationManager)paramContext.getSystemService("location");
        if (localObject3 == null)
          break label497;
        localObject4 = new Criteria();
        ((Criteria)localObject4).setAccuracy(2);
        ((Criteria)localObject4).setCostAllowed(null);
        localObject4 = ((LocationManager)localObject3).getBestProvider((Criteria)localObject4, true);
        int i4 = localObject2;
        if ((localObject4 != 0) || (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0))
          continue;
        i4 = 3;
        localObject3 = bh.a("AdMobSDK", i4);
        if (localObject3 == 0)
          continue;
        localObject3 = "AdMobSDK";
        localObject6 = "Trying to get locations from GPS.";
        Log.d((String)localObject3, (String)localObject6);
        localObject3 = (LocationManager)paramContext.getSystemService("location");
        if (localObject3 == null)
          break label490;
        localObject4 = new Criteria();
        ((Criteria)localObject4).setAccuracy(1);
        ((Criteria)localObject4).setCostAllowed(null);
        localObject4 = ((LocationManager)localObject3).getBestProvider((Criteria)localObject4, true);
        localObject6 = localObject2;
        if (localObject6 != null)
          continue;
        if (!bh.a("AdMobSDK", 3))
          continue;
        Log.d("AdMobSDK", "Cannot access user's location.  Permissions are not set.");
        return h;
        if (localObject4 == 0)
        {
          if (!bh.a("AdMobSDK", 3))
            continue;
          Log.d("AdMobSDK", "No location providers are available.  Ads will not be geotargeted.");
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      if (bh.a("AdMobSDK", 3))
        Log.d("AdMobSDK", "Location provider setup successfully.");
      al localal = new al((LocationManager)localObject3);
      Looper localLooper = paramContext.getMainLooper();
      ((LocationManager)localObject3).requestLocationUpdates((String)localObject4, 0L, null, localal, localLooper);
      continue;
      label490: Object localObject6 = localObject2;
      continue;
      label497: Object localObject4 = i1;
      localObject6 = localObject2;
      continue;
      label507: localObject4 = i1;
      localObject3 = i1;
      localObject6 = localObject1;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ak
 * JD-Core Version:    0.6.0
 */