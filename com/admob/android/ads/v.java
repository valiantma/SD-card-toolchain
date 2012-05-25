package com.admob.android.ads;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class v
  implements Animation.AnimationListener
{
  v(f paramf1, AdView paramAdView, f paramf2)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (this.a != null)
    {
      AdView localAdView1 = this.b;
      f localf1 = this.a;
      localAdView1.removeView(localf1);
    }
    AdView localAdView2 = this.b;
    f localf2 = this.c;
    AdView.c(localAdView2, localf2);
    if (this.a != null)
      this.a.d();
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.v
 * JD-Core Version:    0.6.0
 */