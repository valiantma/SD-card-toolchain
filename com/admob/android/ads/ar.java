package com.admob.android.ads;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class ar extends Animation
{
  private float[] a;
  private float[] b;

  public ar(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    this.a = paramArrayOfFloat1;
    this.b = paramArrayOfFloat2;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    int i = 0;
    double d = paramFloat;
    long l = 0L;
    d <= l;
    int j;
    if (j >= 0)
    {
      d = paramFloat;
      l = 4607182418800017408L;
      d <= l;
      if (j <= 0);
    }
    else
    {
      int k = Transformation.TYPE_IDENTITY;
      paramTransformation.setTransformationType(k);
    }
    while (true)
    {
      return;
      Matrix localMatrix = paramTransformation.getMatrix();
      float[] arrayOfFloat = new float[this.a.length];
      for (int m = i; ; m++)
      {
        int n = this.a.length;
        if (m >= n)
          break;
        int i1 = this.a[m];
        int i2 = this.b[m];
        int i3 = this.a[m];
        float f1 = (i2 - i3) * paramFloat;
        float f2 = i1 + f1;
        arrayOfFloat[m] = f2;
      }
      int i4 = this.a[i];
      int i5 = this.a[1];
      localMatrix.setSkew(i4, i5);
      int i6 = Transformation.TYPE_MATRIX;
      paramTransformation.setTransformationType(localMatrix);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ar
 * JD-Core Version:    0.6.0
 */