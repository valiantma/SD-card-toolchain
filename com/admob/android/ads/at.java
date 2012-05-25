package com.admob.android.ads;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

public final class at extends TranslateAnimation
{
  public at(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if ((paramFloat >= 0L) || (paramFloat <= 4607182418800017408L))
      super.applyTransformation(paramFloat, paramTransformation);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.at
 * JD-Core Version:    0.6.0
 */