package com.admob.android.ads;

import android.graphics.Color;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class au extends Animation
{
  private int[] a;
  private int[] b;
  private View c;

  public au(int paramInt1, int paramInt2, View paramView)
  {
    this.c = paramView;
    int[] arrayOfInt1 = new int[4];
    this.a = arrayOfInt1;
    int[] arrayOfInt2 = new int[4];
    this.b = arrayOfInt2;
    int[] arrayOfInt3 = this.a;
    int i = Color.alpha(paramInt1);
    arrayOfInt3[0] = i;
    int[] arrayOfInt4 = this.a;
    int j = Color.red(paramInt1);
    arrayOfInt4[1] = j;
    int[] arrayOfInt5 = this.a;
    int k = Color.green(paramInt1);
    arrayOfInt5[2] = k;
    int[] arrayOfInt6 = this.a;
    int m = Color.blue(paramInt1);
    arrayOfInt6[3] = m;
    int[] arrayOfInt7 = this.b;
    int n = Color.alpha(paramInt2);
    arrayOfInt7[0] = n;
    int[] arrayOfInt8 = this.b;
    int i1 = Color.red(paramInt2);
    arrayOfInt8[1] = i1;
    int[] arrayOfInt9 = this.b;
    int i2 = Color.green(paramInt2);
    arrayOfInt9[2] = i2;
    int[] arrayOfInt10 = this.b;
    int i3 = Color.blue(paramInt2);
    arrayOfInt10[3] = i3;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    int i = 4;
    int j = 0;
    int k = Transformation.TYPE_IDENTITY;
    paramTransformation.setTransformationType(k);
    double d = paramFloat < 0L;
    if (k >= 0)
    {
      d = paramFloat < 4607182418800017408L;
      if (k <= 0)
        break label43;
    }
    while (true)
    {
      return;
      label43: int[] arrayOfInt = new int[i];
      for (int m = j; m < i; m++)
      {
        float f1 = this.a[m];
        int n = this.b[m];
        int i1 = this.a[m];
        float f2 = (n - i1) * paramFloat;
        int i2 = (int)(f1 + f2);
        arrayOfInt[m] = i2;
      }
      int i3 = arrayOfInt[j];
      int i4 = arrayOfInt[1];
      int i5 = arrayOfInt[2];
      int i6 = arrayOfInt[3];
      int i7 = Color.argb(i3, i4, i5, arrayOfInt);
      this.c.setBackgroundColor(arrayOfInt);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.au
 * JD-Core Version:    0.6.0
 */