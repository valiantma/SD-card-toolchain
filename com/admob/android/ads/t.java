package com.admob.android.ads;

import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;

final class t
  implements Runnable
{
  private WeakReference a;
  private WeakReference b;

  public t(f paramf, AdView paramAdView)
  {
    WeakReference localWeakReference1 = new WeakReference(paramf);
    this.b = localWeakReference1;
    WeakReference localWeakReference2 = new WeakReference(paramAdView);
    this.a = localWeakReference2;
  }

  public final void run()
  {
    int i = 1073741824;
    try
    {
      AdView localAdView = (AdView)this.a.get();
      WeakReference localWeakReference = this.b;
      this = (f)localWeakReference.get();
      if ((localAdView != null) && (this != null))
      {
        f localf = AdView.a(localAdView);
        if (localf != null)
        {
          int j = 8;
          localf.setVisibility(j);
        }
        setVisibility(null);
        float f1 = localAdView.getWidth() / i;
        float f2 = localAdView.getHeight() / i;
        float f3 = localAdView.getWidth();
        float f4 = -1093874483 * i;
        ap localap = new ap(1119092736, null, f1, f2, f4, null);
        localap.setDuration(700L);
        localap.setFillAfter(true);
        DecelerateInterpolator localDecelerateInterpolator = new DecelerateInterpolator();
        localap.setInterpolator(i);
        v localv = new v(localf, localAdView, this);
        localap.setAnimationListener(i);
        localAdView.startAnimation(localap);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 6))
          continue;
        StringBuilder localStringBuilder = new StringBuilder().append("exception caught in SwapViews.run(), ");
        String str1 = localException.getMessage();
        String str2 = localException;
        Log.e("AdMobSDK", localException);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.t
 * JD-Core Version:    0.6.0
 */