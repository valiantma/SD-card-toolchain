package com.admob.android.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;

final class k
{
  private static String a = "http://r.admob.com/ad_source.php";
  private static int b;
  private static long c;
  private static String d = null;
  private static boolean e;
  private static boolean f;

  static
  {
    boolean bool1 = e;
    boolean bool2 = f;
  }

  static e a(h paramh, Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, f paramf, int paramInt4, ch paramch, bv parambv, u paramu)
  {
    int i = paramContext.checkCallingOrSelfPermission("android.permission.INTERNET");
    int j = -1;
    String str1;
    if (i == j)
    {
      str1 = "Cannot request an ad without Internet permissions!  Open manifest.xml and just before the final </manifest> tag add:  <uses-permission android:name=\"android.permission.INTERNET\" />";
      ak.a(str1);
    }
    f = str1;
    Object localObject2;
    if (str1 == 0)
    {
      boolean bool1 = f;
      bool1 = true;
      localObject2 = paramContext.getPackageManager();
      Object localObject3 = new Intent(paramContext, AdMobActivity.class);
      localObject2 = ((PackageManager)localObject2).resolveActivity((Intent)localObject3, 65536);
      if (localObject2 != null)
      {
        localObject3 = ((ResolveInfo)localObject2).activityInfo;
        if (localObject3 != null)
        {
          String str5 = ((ResolveInfo)localObject2).activityInfo.name;
          localObject3 = "com.admob.android.ads.AdMobActivity".equals(str5);
          if (localObject3 != 0)
            break label186;
        }
      }
      boolean bool2 = bh.a("AdMobSDK", 6);
      if (bool2)
      {
        str2 = "AdMobSDK";
        Log.e(str2, "could not find com.admob.android.ads.AdMobActivity, please make sure it is registered in AndroidManifest.xml");
      }
      String str2 = null;
    }
    while (true)
    {
      boolean bool3 = e;
      e = bool3;
      if (bool3)
        break;
      paramh = bh.a("AdMobSDK", 6);
      if (paramh != 0)
      {
        paramh = "AdMobSDK";
        Log.e(paramh, "com.admob.android.ads.AdMobActivity must be registered in your AndroidManifest.xml file.");
      }
      paramh = null;
      return paramh;
      label186: int k = ((ResolveInfo)localObject2).activityInfo.theme;
      if (k != 16973831)
      {
        k = 6;
        boolean bool4 = bh.a("AdMobSDK", k);
        if (bool4)
        {
          localObject1 = "AdMobSDK";
          String str3 = "The activity Theme for com.admob.android.ads.AdMobActivity is not @android:style/Theme.NoTitleBar.Fullscreen, please change in AndroidManifest.xml";
          Log.e((String)localObject1, str3);
        }
        localObject1 = null;
      }
      int m = ((ResolveInfo)localObject2).activityInfo.configChanges & 0x80;
      if (m == 0)
      {
        m = 6;
        localObject1 = bh.a("AdMobSDK", m);
        if (localObject1 != 0)
        {
          localObject1 = "AdMobSDK";
          String str4 = "The android:configChanges value of the com.admob.android.ads.AdMobActivity must include orientation";
          Log.e((String)localObject1, str4);
        }
        localObject1 = null;
      }
      int n = ((ResolveInfo)localObject2).activityInfo.configChanges & 0x10;
      if (n == 0)
      {
        n = 6;
        localObject1 = bh.a("AdMobSDK", n);
        if (localObject1 != 0)
        {
          localObject1 = "AdMobSDK";
          localObject4 = "The android:configChanges value of the com.admob.android.ads.AdMobActivity must include keyboard";
          Log.e((String)localObject1, (String)localObject4);
        }
        localObject1 = null;
      }
      if ((((ResolveInfo)localObject2).activityInfo.configChanges & 0x20) != 0)
        continue;
      Object localObject1 = bh.a("AdMobSDK", 6);
      if (localObject1 != 0)
      {
        localObject1 = "AdMobSDK";
        Log.e((String)localObject1, "The android:configChanges value of the com.admob.android.ads.AdMobActivity must include keyboardHidden");
      }
      localObject1 = null;
    }
    af.a(paramContext);
    int i1 = null;
    long l1 = SystemClock.uptimeMillis();
    Context localContext1 = paramContext;
    String str6 = paramString1;
    Object localObject4 = paramString2;
    int i2 = paramInt4;
    ch localch1 = paramch;
    Object localObject5 = parambv;
    u localu = paramu;
    localObject5 = a(localContext1, str6, (String)localObject4, i2, localch1, (bv)localObject5, localu);
    String str7 = a;
    localObject4 = ak.g(paramContext);
    paramString1 = a.a(str7, null, (String)localObject4, null, 3000, (String)localObject5);
    paramInt4 = 3;
    String str8 = "AdMobSDK";
    int i3 = paramInt4;
    paramString2 = bh.a(str8, i3);
    if (paramString2 != 0)
    {
      paramString2 = "AdMobSDK";
      StringBuilder localStringBuilder1 = new StringBuilder();
      String str9 = "Requesting an ad with POST params:  ";
      StringBuilder localStringBuilder2 = localStringBuilder1.append(str9);
      Object localObject6 = localObject5;
      paramInt4 = localObject6;
      String str10 = paramString2;
      int i4 = paramInt4;
      Log.d(str10, i4);
    }
    paramString2 = null;
    paramInt4 = paramString1.a();
    if (paramInt4 != 0)
    {
      paramString1 = paramString1.c();
      paramString2 = new java/lang/String;
      String str11 = paramString2;
      String str12 = paramString1;
      str11.<init>(str12);
    }
    for (paramString1 = paramString2; ; paramString1 = paramString2)
    {
      if (paramInt4 != 0)
      {
        String str13 = "AdMobSDK";
        int i5 = 3;
        paramString2 = bh.a(str13, i5);
        if (paramString2 != 0)
        {
          paramString2 = "AdMobSDK";
          String str14 = paramString2;
          String str15 = "Ad response: ";
          Log.d(str14, str15);
        }
        paramString2 = paramString1.equals("");
        if (paramString2 == 0)
        {
          paramString2 = new org/json/JSONTokener;
          String str16 = paramString2;
          String str17 = paramString1;
          str16.<init>(str17);
        }
      }
      while (true)
      {
        try
        {
          localObject4 = new org/json/JSONObject;
          Object localObject7 = localObject4;
          String str18 = paramString2;
          localObject7.<init>(str18);
          String str19 = "AdMobSDK";
          int i6 = 3;
          if (!bh.a(str19, i6))
            continue;
          Object localObject8 = localObject4;
          int i7 = 4;
          String str20 = localObject8.toString(i7);
          String str21 = "AdMobSDK";
          String str22 = str20;
          Log.d(str21, str22);
          h localh1 = paramh;
          Context localContext2 = paramContext;
          int i8 = paramInt1;
          int i9 = paramInt2;
          int i10 = paramInt3;
          f localf = paramf;
          ch localch2 = paramch;
          paramh = e.a(localh1, localContext2, (JSONObject)localObject4, i8, i9, i10, localf, localch2);
          paramContext = bh.a("AdMobSDK", 4);
          if (paramContext == 0)
            break;
          Object localObject9;
          paramContext = SystemClock.uptimeMillis() - localObject9;
          if (paramh != 0)
            break;
          StringBuilder localStringBuilder3 = new StringBuilder().append("No fill.  Server replied that no ads are available (");
          long l2 = paramContext;
          String str23 = l2 + "ms)";
          String str24 = "AdMobSDK";
          Context localContext3 = paramContext;
          Log.i(str24, localContext3);
        }
        catch (org.json.JSONException paramh)
        {
          String str25 = "AdMobSDK";
          int i11 = 5;
          paramContext = bh.a(str25, i11);
          if (paramContext != 0)
          {
            paramContext = "AdMobSDK";
            StringBuilder localStringBuilder4 = new StringBuilder().append("Problem decoding ad response.  Cannot display ad: \"");
            String str26 = paramString1;
            String str27 = str26 + "\"";
            Context localContext4 = paramContext;
            String str28 = paramString1;
            h localh2 = paramh;
            Log.w(localContext4, str28, localh2);
          }
        }
        paramh = i1;
      }
    }
  }

  static e a(h paramh, Context paramContext, String paramString1, String paramString2, bv parambv)
  {
    ch localch = ch.b;
    h localh = paramh;
    Context localContext = paramContext;
    String str1 = paramString1;
    String str2 = paramString2;
    bv localbv = parambv;
    return a(localh, localContext, str1, str2, -1, -1, -1, null, -1, localch, localbv, null);
  }

  static String a(Context paramContext)
  {
    Context localContext = paramContext;
    String str = null;
    ch localch = null;
    bv localbv = null;
    u localu = null;
    return a(localContext, null, str, 0, localch, localbv, localu);
  }

  private static String a(Context paramContext, String paramString1, String paramString2, int paramInt, ch paramch, bv parambv, u paramu)
  {
    long l1 = 1000L;
    int i = 65536;
    int j = 3;
    boolean bool = bh.a("AdMobSDK", j);
    if (bool)
    {
      localObject3 = "AdMobSDK";
      localObject1 = "Ad request:";
      Log.d((String)localObject3, (String)localObject1);
    }
    ak.a(paramContext);
    Object localObject3 = new StringBuilder();
    Object localObject1 = System.currentTimeMillis();
    Object localObject4 = ((StringBuilder)localObject3).append("z").append("=");
    Object localObject5;
    long l3 = localObject5 / l1;
    localObject4 = ((StringBuilder)localObject4).append(l3).append(".");
    long l2;
    localObject5 %= l1;
    ((StringBuilder)localObject4).append(l2);
    if (paramch == null);
    Object localObject2;
    for (localObject1 = ch.c; ; localObject2 = paramch)
    {
      localObject4 = ((ch)localObject1).toString();
      a((StringBuilder)localObject3, "ad_type", (String)localObject4);
      Object localObject6 = bx.a;
      localObject1 = ((ch)localObject1).ordinal();
      int k = localObject6[localObject1];
      switch (k)
      {
      default:
      case 1:
      case 2:
      }
      while (true)
      {
        a((StringBuilder)localObject3, "rt", "0");
        localObject2 = null;
        localObject6 = ch.b;
        if (paramch == localObject6)
          localObject2 = ak.e(paramContext);
        if (localObject2 == null)
          localObject2 = ak.d(paramContext);
        if (localObject2 != null)
          break;
        throw new IllegalStateException("Publisher ID is not set!  To serve ads you must set your publisher ID assigned from www.admob.com.  Either add it to AndroidManifest.xml under the <application> tag or call AdManager.setPublisherId().");
        if (parambv == null)
          continue;
        localObject2 = "event";
        localObject6 = String.valueOf(parambv.ordinal());
        a((StringBuilder)localObject3, (String)localObject2, (String)localObject6);
        continue;
        if (paramu == null)
          continue;
        localObject2 = "dim";
        localObject6 = paramu.toString();
        a((StringBuilder)localObject3, (String)localObject2, (String)localObject6);
      }
      a((StringBuilder)localObject3, "s", (String)localObject2);
      localObject6 = af.a();
      a((StringBuilder)localObject3, "l", (String)localObject6);
      a((StringBuilder)localObject3, "f", "jsonp");
      a((StringBuilder)localObject3, "client_sdk", "1");
      a((StringBuilder)localObject3, "ex", "1");
      a((StringBuilder)localObject3, "v", "20101109-ANDROID-3312276cc1406347");
      localObject6 = ak.g(paramContext);
      a((StringBuilder)localObject3, "isu", (String)localObject6);
      localObject2 = "so";
      localObject6 = ak.i(paramContext);
      a((StringBuilder)localObject3, (String)localObject2, (String)localObject6);
      if (paramInt > 0)
      {
        localObject2 = "screen_width";
        localObject6 = String.valueOf(paramInt);
        a((StringBuilder)localObject3, (String)localObject2, (String)localObject6);
      }
      localObject6 = ak.h(paramContext);
      a((StringBuilder)localObject3, "d[coord]", (String)localObject6);
      localObject6 = ak.c();
      a((StringBuilder)localObject3, "d[coord_timestamp]", (String)localObject6);
      localObject6 = ak.d();
      a((StringBuilder)localObject3, "d[pc]", (String)localObject6);
      localObject6 = ak.e();
      a((StringBuilder)localObject3, "d[dob]", (String)localObject6);
      localObject6 = ak.f();
      a((StringBuilder)localObject3, "d[gender]", (String)localObject6);
      a((StringBuilder)localObject3, "k", paramString1);
      a((StringBuilder)localObject3, "search", paramString2);
      localObject6 = String.valueOf(f.c());
      a((StringBuilder)localObject3, "density", (String)localObject6);
      localObject2 = ak.f(paramContext);
      Object localObject7;
      if (localObject2 != 0)
      {
        int m = 4;
        localObject2 = bh.a("AdMobSDK", m);
        if (localObject2 != 0)
        {
          localObject2 = "AdMobSDK";
          localObject7 = "Making ad request in test mode";
          Log.i((String)localObject2, (String)localObject7);
        }
        a((StringBuilder)localObject3, "m", "test");
        localObject2 = ak.a();
        localObject7 = ch.b;
        if (paramch == localObject7)
        {
          localObject7 = ci.a.toString().equals(localObject2);
          if (localObject7 != 0)
            localObject2 = "video_int";
        }
        localObject7 = "test_action";
        a((StringBuilder)localObject3, (String)localObject7, (String)localObject2);
      }
      localObject2 = d;
      if (localObject2 == null)
      {
        localObject2 = new StringBuilder();
        localObject7 = paramContext.getPackageManager();
        Uri localUri1 = Uri.parse("geo:0,0?q=donuts");
        localObject4 = new Intent("android.intent.action.VIEW", localUri1);
        localObject4 = ((PackageManager)localObject7).queryIntentActivities((Intent)localObject4, i);
        if (localObject4 != null)
        {
          localObject4 = ((List)localObject4).size();
          if (localObject4 != 0);
        }
        else
        {
          localObject4 = "m";
          ((StringBuilder)localObject2).append((String)localObject4);
        }
        Uri localUri2 = Uri.parse("market://search?q=pname:com.admob");
        localObject4 = new Intent("android.intent.action.VIEW", localUri2);
        localObject4 = ((PackageManager)localObject7).queryIntentActivities((Intent)localObject4, i);
        if ((localObject4 == null) || (((List)localObject4).size() == 0))
        {
          if (((StringBuilder)localObject2).length() > 0)
            ((StringBuilder)localObject2).append(",");
          ((StringBuilder)localObject2).append("a");
        }
        Uri localUri3 = Uri.parse("tel://6509313940");
        Intent localIntent = new Intent("android.intent.action.VIEW", localUri3);
        localObject7 = ((PackageManager)localObject7).queryIntentActivities(localIntent, i);
        if ((localObject7 == null) || (((List)localObject7).size() == 0))
        {
          if (((StringBuilder)localObject2).length() > 0)
            ((StringBuilder)localObject2).append(",");
          ((StringBuilder)localObject2).append("t");
        }
        localObject2 = ((StringBuilder)localObject2).toString();
        d = (String)localObject2;
      }
      localObject2 = d;
      if ((localObject2 != null) && (((String)localObject2).length() > 0))
        a((StringBuilder)localObject3, "ic", (String)localObject2);
      String str1 = String.valueOf(ak.a(new ah(paramContext)).ordinal());
      a((StringBuilder)localObject3, "audio", str1);
      int n = b;
      localObject2++;
      b = n;
      if (n == 1)
      {
        c = System.currentTimeMillis();
        String str2 = ak.b(paramContext);
        a((StringBuilder)localObject3, "pub_data[identifier]", str2);
        String str3 = String.valueOf(ak.c(paramContext));
        a((StringBuilder)localObject3, "pub_data[version]", str3);
      }
      while (true)
      {
        return ((StringBuilder)localObject3).toString();
        String str4 = String.valueOf(b);
        a((StringBuilder)localObject3, "stats[reqs]", str4);
        long l4 = System.currentTimeMillis();
        long l5 = c;
        Object localObject8;
        String str5 = String.valueOf((localObject8 - l5) / l1);
        a((StringBuilder)localObject3, "stats[time]", str5);
      }
    }
  }

  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      int i = paramString2.length();
      if (i <= 0);
    }
    try
    {
      Object localObject = paramStringBuilder.append("&");
      String str1 = URLEncoder.encode(paramString1, "UTF-8");
      localObject = ((StringBuilder)localObject).append(str1).append("=");
      String str2 = URLEncoder.encode(paramString2, "UTF-8");
      ((StringBuilder)localObject).append(str2);
      localObject = bh.a("AdMobSDK", 3);
      if (localObject != 0)
      {
        localObject = "AdMobSDK";
        String str3 = "    " + paramString1 + ": " + paramString2;
        Log.d((String)localObject, str3);
      }
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 6))
          continue;
        Log.e("AdMobSDK", "UTF-8 encoding is not supported on this device.  Ad requests are impossible.", localUnsupportedEncodingException);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.k
 * JD-Core Version:    0.6.0
 */