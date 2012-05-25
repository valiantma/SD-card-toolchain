package com.admob.android.ads;

import android.content.Context;
import android.util.Log;
import org.json.JSONObject;
import org.json.JSONTokener;

final class l
{
  private static boolean a;

  static
  {
    boolean bool = a;
  }

  public static void a(Context paramContext)
  {
    boolean bool1;
    a = bool1;
    if (!bool1)
    {
      bool1 = a;
      boolean bool2 = ak.b();
      if (!bool2);
    }
    try
    {
      Object localObject = k.a(paramContext);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("http://api.admob.com/v1/pubcode/android_sdk_emulator_notice");
      localStringBuilder.append("?");
      localStringBuilder.append((String)localObject);
      localObject = localStringBuilder.toString();
      String str1 = ak.g(paramContext);
      localObject = a.a((String)localObject, "developer_message", str1);
      if (((n)localObject).a())
      {
        localObject = ((n)localObject).c();
        if (localObject != null)
        {
          String str2 = new String(localObject);
          JSONTokener localJSONTokener = new JSONTokener(str2);
          localObject = new JSONObject(localJSONTokener).getString("data");
          if ((localObject != null) && (!((String)localObject).equals("")))
            Log.w("AdMobSDK", (String)localObject);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 2))
          continue;
        Log.v("AdMobSDK", "Unhandled exception retrieving developer message.", localException);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.l
 * JD-Core Version:    0.6.0
 */