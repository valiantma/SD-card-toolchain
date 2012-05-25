package com.admob.android.ads;

import android.view.animation.AlphaAnimation;
import android.view.animation.Transformation;

public final class av extends AlphaAnimation
{
  public av(float paramFloat1, float paramFloat2)
  {
    super(paramFloat1, paramFloat2);
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if ((paramFloat >= 0L) || (paramFloat <= 4607182418800017408L))
      super.applyTransformation(paramFloat, paramTransformation);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.av
 * JD-Core Version:    0.6.0
 */