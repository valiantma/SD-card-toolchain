package com.admob.android.ads;

import android.util.Log;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

final class cf
  implements Runnable
{
  private WeakReference a;
  private JSONArray b;

  public cf(e parame, JSONArray paramJSONArray)
  {
    WeakReference localWeakReference = new WeakReference(parame);
    this.a = localWeakReference;
    this.b = paramJSONArray;
  }

  public final void run()
  {
    try
    {
      e locale = (e)this.a.get();
      if (locale != null)
      {
        JSONArray localJSONArray = this.b;
        e.a(locale, localJSONArray);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (bh.a("AdMobSDK", 6))
        {
          StringBuilder localStringBuilder = new StringBuilder().append("exception caught in Ad$ViewAdd.run(), ");
          String str1 = localException.getMessage();
          String str2 = str1;
          Log.e("AdMobSDK", str2);
          localException.printStackTrace();
        }
        this = (e)this.a.get();
        if (this == null)
          continue;
        e.a(this);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.cf
 * JD-Core Version:    0.6.0
 */