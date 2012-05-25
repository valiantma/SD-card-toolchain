package com.admob.android.ads;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class an extends Animation
{
  private View a;
  private float b;
  private float c;

  public an(float paramFloat1, float paramFloat2, View paramView)
  {
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.a = paramView;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    int i = Transformation.TYPE_IDENTITY;
    paramTransformation.setTransformationType(i);
    double d = paramFloat < 0L;
    if (i >= 0)
    {
      d = paramFloat < 4607182418800017408L;
      if (i <= 0)
        break label34;
    }
    while (true)
    {
      return;
      label34: int j = this.b;
      int k = this.c;
      int m = this.b;
      float f2 = (k - m) * paramFloat;
      float f1;
      j += f2;
      View localView = this.a;
      if (localView != null)
      {
        aw localaw = aw.c(localView);
        localaw.a = f1;
        localView.setTag(localaw);
      }
      this = this.a.getParent();
      if (!(this instanceof cn))
        continue;
      ((cn)this).g();
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.an
 * JD-Core Version:    0.6.0
 */