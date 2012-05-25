package com.admob.android.ads;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class bw
  implements Animation.AnimationListener
{
  bw(AdView paramAdView, f paramf)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AdView localAdView1 = this.b;
    f localf = this.a;
    AdView localAdView2 = this.b;
    t localt = new t(localf, localAdView2);
    localAdView1.post(localt);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bw
 * JD-Core Version:    0.6.0
 */