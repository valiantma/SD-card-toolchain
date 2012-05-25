package com.admob.android.ads;

import android.util.Log;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class bn extends Thread
{
  private JSONObject a;
  private WeakReference b;

  public bn(JSONObject paramJSONObject, f paramf)
  {
    this.a = paramJSONObject;
    WeakReference localWeakReference = new WeakReference(paramf);
    this.b = localWeakReference;
  }

  public final void run()
  {
    try
    {
      Object localObject = (f)this.b.get();
      if ((localObject != null) && (((f)localObject).a != null))
      {
        e locale = ((f)localObject).a;
        JSONObject localJSONObject = this.a;
        locale.a(localJSONObject);
        if (((f)localObject).b != null)
        {
          localObject = ((f)localObject).b;
          ((AdView)localObject).performClick();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 6))
          continue;
        Log.e("AdMobSDK", "exception caught in AdClickThread.run(), ", localException);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bn
 * JD-Core Version:    0.6.0
 */