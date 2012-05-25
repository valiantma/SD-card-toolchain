package com.admob.android.ads;

import android.util.Log;
import java.lang.ref.WeakReference;

final class y
  implements Runnable
{
  boolean a;
  private WeakReference b;

  public y(AdView paramAdView)
  {
    WeakReference localWeakReference = new WeakReference(paramAdView);
    this.b = localWeakReference;
  }

  public final void run()
  {
    try
    {
      AdView localAdView = (AdView)this.b.get();
      boolean bool1 = this.a;
      if ((!bool1) && (localAdView != null))
      {
        boolean bool2 = bh.a("AdMobSDK", 3);
        if (bool2)
        {
          int i = AdView.k(localAdView) / 1000;
          if (bh.a("AdMobSDK", 3))
          {
            String str1 = "Requesting a fresh ad because a request interval passed (" + i + " seconds).";
            Log.d("AdMobSDK", i);
          }
        }
        AdView.l(localAdView);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 6))
          continue;
        StringBuilder localStringBuilder = new StringBuilder().append("exception caught in RefreshHandler.run(), ");
        String str2 = localException.getMessage();
        String str3 = localException;
        Log.e("AdMobSDK", localException);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.y
 * JD-Core Version:    0.6.0
 */