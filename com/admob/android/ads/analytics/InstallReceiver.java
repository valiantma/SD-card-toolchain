package com.admob.android.ads.analytics;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.admob.android.ads.ak;
import com.admob.android.ads.bh;
import com.admob.android.ads.n;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;

public class InstallReceiver extends BroadcastReceiver
{
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject4;
    if (paramString1 != null)
      try
      {
        String[] arrayOfString = paramString1.split("&");
        localObject4 = localObject1;
        int i = arrayOfString.length;
        if (localObject2 < i)
        {
          Object localObject5 = arrayOfString[localObject2];
          boolean bool = ((String)localObject5).startsWith("admob_");
          String str1;
          if (bool)
          {
            int j = "admob_".length();
            localObject5 = ((String)localObject5).substring(j).split("=");
            str1 = URLEncoder.encode(localObject5[null], "UTF-8");
            localObject5 = URLEncoder.encode(localObject5[1], "UTF-8");
            if (localObject4 != null)
              break label137;
            localObject4 = new StringBuilder(128);
          }
          while (true)
          {
            ((StringBuilder)localObject4).append(str1).append("=").append((String)localObject5);
            localObject2++;
            break;
            label137: ((StringBuilder)localObject4).append("&");
          }
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        if (bh.a("AdMobSDK", 6))
          Log.e("AdMobSDK", "Could not create install URL.  Install not tracked.", localUnsupportedEncodingException);
      }
    String str2;
    for (Object localObject3 = localObject1; ; localObject3 = str2)
    {
      return localObject3;
      if (localObject4 == null)
        break;
      localObject3 = URLEncoder.encode(paramString2, "UTF-8");
      ((StringBuilder)localObject4).append("&").append("isu").append("=").append((String)localObject3);
      localObject3 = URLEncoder.encode(paramString3, "UTF-8");
      ((StringBuilder)localObject4).append("&").append("app_id").append("=").append((String)localObject3);
      localObject3 = new StringBuilder().append("http://a.admob.com/f0?");
      str2 = ((StringBuilder)localObject4).toString();
    }
  }

  private static void a(Context paramContext, Intent paramIntent)
  {
    int i = 5;
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      if (localObject1 != null)
      {
        Object localObject2 = new ComponentName(paramContext, InstallReceiver.class);
        int j = 128;
        localObject2 = ((PackageManager)localObject1).getReceiverInfo((ComponentName)localObject2, j);
        if (localObject2 != null)
        {
          localObject1 = ((PackageItemInfo)localObject2).metaData;
          if (localObject1 != null)
          {
            localObject1 = ((PackageItemInfo)localObject2).metaData.keySet();
            if (localObject1 != null)
            {
              Iterator localIterator = ((Set)localObject1).iterator();
              while (true)
              {
                localObject1 = localIterator.hasNext();
                if (localObject1 == 0)
                  break;
                localObject1 = (String)localIterator.next();
                String str3 = null;
                try
                {
                  str3 = ((PackageItemInfo)localObject2).metaData.getString((String)localObject1);
                  localObject1 = str3.equals("com.google.android.apps.analytics.AnalyticsReceiver");
                  if (localObject1 != 0)
                    continue;
                  ((BroadcastReceiver)Class.forName(str3).newInstance()).onReceive(paramContext, paramIntent);
                  localObject1 = bh.a("AdMobSDK", 3);
                  if (localObject1 == 0)
                    continue;
                  localObject1 = "AdMobSDK";
                  String str4 = "Successfully forwarded install notification to " + str3;
                  Log.d((String)localObject1, str4);
                }
                catch (Exception localException1)
                {
                  str3 = "Could not forward Market's INSTALL_REFERRER intent to " + str3;
                  Log.w("AdMobSDK", str3, localException1);
                }
              }
            }
          }
        }
      }
    }
    catch (Exception localException2)
    {
      if (bh.a("AdMobSDK", i))
        Log.w("AdMobSDK", "Unhandled exception while forwarding install intents.  Possibly lost some install information.", localException2);
    }
    while (true)
    {
      return;
      try
      {
        ((BroadcastReceiver)Class.forName("com.google.android.apps.analytics.AnalyticsReceiver").newInstance()).onReceive(paramContext, paramIntent);
        boolean bool1 = bh.a("AdMobSDK", 3);
        if (!bool1)
          continue;
        String str1 = "AdMobSDK";
        Log.d(str1, "Successfully forwarded install notification to com.google.android.apps.analytics.AnalyticsReceiver");
      }
      catch (ClassNotFoundException str2)
      {
        boolean bool2 = bh.a("AdMobSDK", 2);
        if (!bool2)
          continue;
        String str2 = "AdMobSDK";
        Log.v(str2, "Google Analytics not installed.");
      }
      catch (Exception localException3)
      {
      }
      if (!bh.a("AdMobSDK", 5))
        continue;
      Log.w("AdMobSDK", "Exception from the Google Analytics install receiver.", localException3);
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      Object localObject = paramIntent.getStringExtra("referrer");
      String str1 = ak.g(paramContext);
      String str2 = ak.b(paramContext);
      localObject = a((String)localObject, str1, str2);
      if (localObject != null)
      {
        if (bh.a("AdMobSDK", 2))
        {
          String str3 = "Processing install from an AdMob ad (" + (String)localObject + ").";
          Log.v("AdMobSDK", str3);
        }
        localObject = com.admob.android.ads.a.a((String)localObject, "Conversion", str1);
        a locala = new a();
        ((n)localObject).a(str1);
        ((n)localObject).a();
      }
      a(paramContext, paramIntent);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 6))
          continue;
        Log.e("AdMobSDK", "Unhandled exception processing Market install.", localException);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.analytics.InstallReceiver
 * JD-Core Version:    0.6.0
 */