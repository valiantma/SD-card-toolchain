package com.admob.android.ads;

import android.view.animation.Interpolator;

public final class ax
  implements Interpolator
{
  private Interpolator a;
  private float b;
  private float c;

  public ax(Interpolator paramInterpolator, long paramLong1, long paramLong2, long paramLong3)
  {
    this.a = paramInterpolator;
    float f1 = (float)paramLong1;
    float f2 = (float)paramLong2;
    float f3 = f1 / f2;
    this.b = f3;
    float f4 = (float)???;
    float f5 = (float)paramLong2;
    float f6 = f4 / f5;
    this.c = f6;
  }

  public final float getInterpolation(float paramFloat)
  {
    int i = this.b;
    float f1 = paramFloat < i;
    int j;
    if (f1 <= 0)
      j = -1082130432;
    while (true)
    {
      return j;
      int k = this.b;
      int n = this.c;
      k += n;
      float f2 = paramFloat < f2;
      if (f2 <= 0)
      {
        Object localObject = this.a;
        int i1 = this.b;
        float f3 = paramFloat - i1;
        int i2 = this.c;
        float f4 = f3 / i2;
        localObject = ((Interpolator)localObject).getInterpolation(f4);
        continue;
      }
      int m = 1073741824;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ax
 * JD-Core Version:    0.6.0
 */