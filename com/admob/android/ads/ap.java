package com.admob.android.ads;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class ap extends Animation
{
  private final float[] a;
  private final float[] b;
  private final float c;
  private final float d;
  private final float e;
  private final boolean f;
  private Camera g;

  public ap(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean)
  {
  }

  public ap(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    this.a = paramArrayOfFloat1;
    this.b = paramArrayOfFloat2;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramFloat3;
    this.f = paramBoolean;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    int i = 3;
    int j = 0;
    float f1 = null;
    double d1 = paramFloat;
    long l = 0L;
    d1 <= l;
    int k;
    if (k >= 0)
    {
      d1 = paramFloat;
      l = 4607182418800017408L;
      d1 <= l;
      if (k <= 0);
    }
    else
    {
      int n = Transformation.TYPE_IDENTITY;
      paramTransformation.setTransformationType(n);
      return;
    }
    float[] arrayOfFloat1 = this.a;
    float[] arrayOfFloat2 = this.b;
    float[] arrayOfFloat3 = new float[i];
    for (int i2 = j; i2 < i; i2++)
    {
      int i3 = arrayOfFloat1[i2];
      int i4 = arrayOfFloat2[i2];
      int i5 = arrayOfFloat1[i2];
      float f3 = (i4 - i5) * paramFloat;
      float f2;
      i3 += f3;
      arrayOfFloat3[i2] = f2;
    }
    int m = this.c;
    int i1 = this.d;
    Camera localCamera = this.g;
    Matrix localMatrix = paramTransformation.getMatrix();
    localCamera.save();
    if (this.f)
    {
      float f4 = this.e * paramFloat;
      localCamera.translate(f1, f1, f4);
    }
    while (true)
    {
      int i6 = arrayOfFloat3[j];
      localCamera.rotateX(i6);
      int i7 = arrayOfFloat3[1];
      localCamera.rotateY(i7);
      int i8 = arrayOfFloat3[2];
      localCamera.rotateZ(arrayOfFloat3);
      localCamera.getMatrix(localMatrix);
      localCamera.restore();
      int i9 = -m;
      int i10 = -i1;
      localMatrix.preTranslate(arrayOfFloat3, localCamera);
      localMatrix.postTranslate(m, i1);
      int i11 = Transformation.TYPE_MATRIX;
      paramTransformation.setTransformationType(m);
      break;
      int i12 = this.e;
      float f5 = 1065353216 - paramFloat;
      float f6 = i12 * f5;
      localCamera.translate(f1, f1, f6);
    }
  }

  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    Camera localCamera = new Camera();
    this.g = localCamera;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ap
 * JD-Core Version:    0.6.0
 */