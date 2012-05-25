package com.admob.android.ads;

import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;

public final class as extends ScaleAnimation
{
  public as(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if ((paramFloat >= 0L) || (paramFloat <= 4607182418800017408L))
      super.applyTransformation(paramFloat, paramTransformation);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.as
 * JD-Core Version:    0.6.0
 */