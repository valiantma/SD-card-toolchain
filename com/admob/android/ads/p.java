package com.admob.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public final class p extends RelativeLayout
{
  private int a;
  private int b;
  private ImageView c;
  private float d;

  public p(Context paramContext, View paramView, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    super(paramContext);
    this.b = paramInt1;
    this.a = paramInt2;
    setClickable(true);
    setFocusable(true);
    int i = getResources().getDisplayMetrics().density;
    this.d = i;
    ImageView localImageView1 = new ImageView(paramContext);
    this.c = localImageView1;
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(paramBitmap);
    float f1 = paramInt1;
    int j = this.d;
    int k = (int)(f1 * j);
    float f2 = paramInt2;
    int m = this.d;
    int n = (int)(f2 * m);
    localBitmapDrawable.setBounds(0, 0, k, n);
    this.c.setImageDrawable(localBitmapDrawable);
    this.c.setVisibility(4);
    float f3 = paramInt1;
    int i1 = this.d;
    int i2 = (int)(f3 * i1);
    float f4 = paramInt2;
    int i3 = this.d;
    int i4 = (int)(f4 * i3);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i2, i4);
    localLayoutParams.addRule(13);
    addView(paramView, localLayoutParams);
    ImageView localImageView2 = this.c;
    addView(localImageView2, localLayoutParams);
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean == true)
      this.c.setVisibility(0);
    while (true)
    {
      return;
      this.c.setVisibility(4);
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    int m = paramMotionEvent.getAction();
    if (bh.a("AdMobSDK", i))
    {
      StringBuilder localStringBuilder1 = new StringBuilder().append("dispatchTouchEvent: action=").append(m).append(" x=");
      float f1 = paramMotionEvent.getX();
      StringBuilder localStringBuilder2 = localStringBuilder1.append(f1).append(" y=");
      float f2 = paramMotionEvent.getY();
      String str = f2;
      Log.v("AdMobSDK", str);
    }
    if (m == 0)
      a(j);
    while (true)
    {
      return super.dispatchTouchEvent(paramMotionEvent);
      if (m == i)
      {
        float f3 = this.b;
        int n = this.d;
        int i1 = (int)(f3 * n);
        float f4 = this.a;
        int i2 = this.d;
        int i3 = (int)(f4 * i2);
        Rect localRect = new Rect(k, k, i1, i3);
        int i4 = (int)paramMotionEvent.getX();
        int i5 = (int)paramMotionEvent.getY();
        boolean bool = localRect.contains(i4, i5);
        a(bool);
        continue;
      }
      if (m == j)
      {
        a(k);
        continue;
      }
      if (m != 3)
        continue;
      a(k);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.p
 * JD-Core Version:    0.6.0
 */