package com.admob.android.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public final class bl
{
  ViewGroup a = null;
  boolean b = null;
  private RelativeLayout c = null;
  private RelativeLayout d = null;
  private Button e = null;
  private WeakReference f;

  public final void a()
  {
    bd.b(this.c);
    bd.b(this.d);
    this.b = null;
  }

  public final void a(Context paramContext, String paramString, x paramx, float paramFloat, bd parambd, ab paramab, WeakReference paramWeakReference)
  {
    WeakReference localWeakReference = paramWeakReference;
    this.f = localWeakReference;
    int i = (int)(1134559232 * paramFloat);
    int j = (int)(1107820544 * paramFloat);
    Object localObject1 = new Rect(0, 0, i, j);
    int m = ((Rect)localObject1).width();
    int i2 = ((Rect)localObject1).height();
    Bitmap.Config localConfig1 = Bitmap.Config.ARGB_8888;
    Object localObject3 = Bitmap.createBitmap(m, i2, localConfig1);
    int i3;
    if (localObject3 != null)
    {
      Canvas localCanvas1 = new Canvas((Bitmap)localObject3);
      e.a(localCanvas1, (Rect)localObject1, -16777216, 127, 1056964608);
      localObject1 = new Paint();
      ((Paint)localObject1).setColor(-7829368);
      float[] arrayOfFloat1 = new float[8];
      arrayOfFloat1[0] = 0;
      arrayOfFloat1[1] = 0;
      float f1 = 1134559232 * paramFloat;
      arrayOfFloat1[2] = f1;
      arrayOfFloat1[3] = 0;
      arrayOfFloat1[4] = 0;
      float f2 = 1107820544 * paramFloat - 1065353216;
      arrayOfFloat1[5] = f2;
      float f3 = 1134559232 * paramFloat;
      arrayOfFloat1[6] = f3;
      float f4 = 1107820544 * paramFloat;
      i3 = 1065353216;
      float f5 = f4 - i3;
      arrayOfFloat1[7] = f5;
      localCanvas1.drawLines(arrayOfFloat1, (Paint)localObject1);
      localObject1 = new android/widget/RelativeLayout;
      Object localObject5 = localObject1;
      Context localContext1 = paramContext;
      localObject5.<init>(localContext1);
      this.c = ((RelativeLayout)localObject1);
      localObject1 = new BitmapDrawable((Bitmap)localObject3);
      ((BitmapDrawable)localObject1).setAlpha(200);
      localObject3 = this.c;
      ((RelativeLayout)localObject3).setBackgroundDrawable((Drawable)localObject1);
    }
    localObject1 = new android/widget/TextView;
    Object localObject6 = localObject1;
    Context localContext2 = paramContext;
    localObject6.<init>(localContext2);
    localObject3 = paramx.b;
    ((TextView)localObject1).setText((CharSequence)localObject3);
    localObject3 = new RelativeLayout.LayoutParams(-1, -1);
    ((TextView)localObject1).setTextSize(1096810496);
    Typeface localTypeface = Typeface.DEFAULT_BOLD;
    ((TextView)localObject1).setTypeface(localTypeface);
    ((TextView)localObject1).setTextColor(-1);
    int i4 = (int)(1077936128 * paramFloat);
    ((TextView)localObject1).setPadding(i4, 0, 0, 0);
    ((RelativeLayout.LayoutParams)localObject3).addRule(9);
    ((RelativeLayout.LayoutParams)localObject3).addRule(15);
    this.c.addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
    localObject1 = new android/widget/TextView;
    Object localObject7 = localObject1;
    Context localContext3 = paramContext;
    localObject7.<init>(localContext3);
    localObject3 = af.a("Ads by AdMob");
    ((TextView)localObject1).setText((CharSequence)localObject3);
    localObject3 = new RelativeLayout.LayoutParams(-1, -1);
    ((TextView)localObject1).setTextSize(1093664768);
    ((TextView)localObject1).setTextColor(-1);
    int i5 = (int)(1077936128 * paramFloat);
    ((TextView)localObject1).setPadding(0, 0, i5, 0);
    ((RelativeLayout.LayoutParams)localObject3).addRule(11);
    ((RelativeLayout.LayoutParams)localObject3).addRule(15);
    this.c.addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
    int i6 = (int)(1107820544 * paramFloat);
    localObject1 = new RelativeLayout.LayoutParams(-1, i6);
    ((RelativeLayout.LayoutParams)localObject1).addRule(10);
    this.c.setVisibility(4);
    localObject3 = this.c;
    bd localbd1 = parambd;
    Object localObject8 = localObject3;
    Object localObject9 = localObject1;
    localbd1.addView(localObject8, localObject9);
    int i7 = (int)(1134559232 * paramFloat);
    int i8 = (int)(1112014848 * paramFloat);
    localObject1 = new Rect(0, 0, i7, i8);
    localObject3 = ((Rect)localObject1).width();
    int i9 = ((Rect)localObject1).height();
    Bitmap.Config localConfig2 = Bitmap.Config.ARGB_8888;
    localObject3 = Bitmap.createBitmap(localObject3, i9, localConfig2);
    if (localObject3 != null)
    {
      Canvas localCanvas2 = new Canvas((Bitmap)localObject3);
      e.a(localCanvas2, (Rect)localObject1, -16777216, 127, 1056964608);
      localObject1 = new Paint();
      ((Paint)localObject1).setColor(-7829368);
      float[] arrayOfFloat2 = new float[8];
      arrayOfFloat2[0] = 0;
      arrayOfFloat2[1] = 0;
      float f6 = 1134559232 * paramFloat;
      arrayOfFloat2[2] = f6;
      arrayOfFloat2[3] = 0;
      arrayOfFloat2[4] = 0;
      float f7 = 1112014848 * paramFloat - 1065353216;
      arrayOfFloat2[5] = f7;
      float f8 = 1134559232 * paramFloat;
      arrayOfFloat2[6] = f8;
      float f9 = 1112014848 * paramFloat;
      i3 = 1065353216;
      float f10 = f9 - i3;
      arrayOfFloat2[7] = f10;
      localCanvas2.drawLines(arrayOfFloat2, (Paint)localObject1);
      localObject1 = new android/widget/RelativeLayout;
      Object localObject10 = localObject1;
      Context localContext4 = paramContext;
      localObject10.<init>(localContext4);
      this.d = ((RelativeLayout)localObject1);
      localObject1 = new BitmapDrawable((Bitmap)localObject3);
      ((BitmapDrawable)localObject1).setAlpha(200);
      localObject3 = this.d;
      ((RelativeLayout)localObject3).setBackgroundDrawable((Drawable)localObject1);
    }
    localObject1 = paramab.h.m;
    if (localObject1 != null)
    {
      LinearLayout localLinearLayout1 = new android/widget/LinearLayout;
      LinearLayout localLinearLayout2 = localLinearLayout1;
      Context localContext5 = paramContext;
      localLinearLayout2.<init>(localContext5);
      localLinearLayout1.setOrientation(0);
      int n = -1;
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(n, -1);
      Iterator localIterator = ((Vector)localObject1).iterator();
      localObject1 = localIterator.hasNext();
      if (localObject1 != 0)
      {
        z localz1 = (z)localIterator.next();
        int k = (int)(1115684864 * paramFloat);
        LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(k, -1);
        Button localButton1 = new android/widget/Button;
        Button localButton2 = localButton1;
        Context localContext6 = paramContext;
        localButton2.<init>(localContext6);
        Object localObject2 = paramab.b();
        String str1 = localz1.b;
        Bitmap localBitmap1 = (Bitmap)((Hashtable)localObject2).get(str1);
        localObject2 = paramab.b();
        str1 = localz1.a;
        Bitmap localBitmap2 = (Bitmap)((Hashtable)localObject2).get(str1);
        localObject2 = new android/graphics/drawable/BitmapDrawable;
        Object localObject11 = localObject2;
        Bitmap localBitmap3 = localBitmap2;
        localObject11.<init>(localBitmap3);
        int i10 = (int)(1105199104 * paramFloat);
        int i11 = (int)(1105199104 * paramFloat);
        ((BitmapDrawable)localObject2).setBounds(0, 0, i10, i11);
        localButton1.setCompoundDrawables(null, (Drawable)localObject2, null, null);
        localButton1.setBackgroundDrawable(null);
        localButton1.setBackgroundColor(0);
        localButton1.setTextSize(1094713344);
        localButton1.setTextColor(-1);
        localObject2 = localz1.c;
        localButton1.setText((CharSequence)localObject2);
        int i1 = (int)(1073741824 * paramFloat);
        int i12 = (int)(1073741824 * paramFloat);
        localButton1.setPadding(0, i1, 0, i12);
        localObject2 = new com/admob/android/ads/by;
        Object localObject4 = this.f;
        Object localObject12 = localObject2;
        bd localbd2 = parambd;
        z localz2 = localz1;
        Object localObject13 = localObject4;
        localObject12.<init>(localbd2, localz2, localObject13);
        localButton1.setOnClickListener((View.OnClickListener)localObject2);
        int i13 = (int)(1115684864 * paramFloat);
        int i14 = (int)(1112014848 * paramFloat);
        localObject4 = paramContext;
        localObject2 = new p((Context)localObject4, localButton1, i13, i14, localBitmap1);
        localLinearLayout1.addView((View)localObject2, localLayoutParams2);
        localObject2 = new android/widget/ImageView;
        Object localObject14 = localObject2;
        Context localContext7 = paramContext;
        localObject14.<init>(localContext7);
        int i15 = (int)(1107820544 * paramFloat);
        Bitmap.Config localConfig3 = Bitmap.Config.ARGB_8888;
        localObject4 = Bitmap.createBitmap(1, i15, localConfig3);
        if (localObject4 == null)
          localObject2 = null;
        while (true)
        {
          localLinearLayout1.addView((View)localObject2, localLayoutParams1);
          break;
          Canvas localCanvas3 = new Canvas((Bitmap)localObject4);
          Paint localPaint = new Paint();
          localPaint.setColor(-7829368);
          float[] arrayOfFloat3 = new float[4];
          arrayOfFloat3[0] = 0;
          arrayOfFloat3[1] = 0;
          arrayOfFloat3[2] = 0;
          float f11 = 1107820544 * paramFloat;
          arrayOfFloat3[3] = f11;
          localCanvas3.drawLines(arrayOfFloat3, localPaint);
          BitmapDrawable localBitmapDrawable = new BitmapDrawable((Bitmap)localObject4);
          ((ImageView)localObject2).setBackgroundDrawable(localBitmapDrawable);
        }
      }
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams3.addRule(15);
      this.d.addView(localLinearLayout1, localLayoutParams3);
    }
    Button localButton3 = new android/widget/Button;
    Button localButton4 = localButton3;
    Context localContext8 = paramContext;
    localButton4.<init>(localContext8);
    this.e = localButton3;
    Button localButton5 = this.e;
    cc localcc1 = new com/admob/android/ads/cc;
    cc localcc2 = localcc1;
    bd localbd3 = parambd;
    boolean bool = null;
    localcc2.<init>(localbd3, bool);
    localButton5.setOnClickListener(localcc1);
    this.e.setBackgroundResource(17301509);
    this.e.setTextSize(1, 1095761920);
    Button localButton6 = this.e;
    String str2 = paramString;
    localButton6.setText(str2);
    int i16 = (int)(1113063424 * paramFloat);
    int i17 = (int)(1108344832 * paramFloat);
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(i16, i17);
    localLayoutParams4.addRule(11);
    localLayoutParams4.addRule(15);
    int i18 = (int)(1073741824 * paramFloat);
    localLayoutParams4.setMargins(null, null, i18, null);
    RelativeLayout localRelativeLayout1 = this.d;
    Button localButton7 = this.e;
    localRelativeLayout1.addView(localButton7, localLayoutParams4);
    int i19 = (int)(1112014848 * paramFloat);
    RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-1, i19);
    localLayoutParams5.addRule(12);
    this.d.setVisibility(4);
    RelativeLayout localRelativeLayout2 = this.d;
    bd localbd4 = parambd;
    RelativeLayout localRelativeLayout3 = localRelativeLayout2;
    RelativeLayout.LayoutParams localLayoutParams6 = localLayoutParams5;
    localbd4.addView(localRelativeLayout3, localLayoutParams6);
    cb localcb1 = new com/admob/android/ads/cb;
    cb localcb2 = localcb1;
    bd localbd5 = parambd;
    localcb2.<init>(localbd5);
    bd localbd6 = parambd;
    cb localcb3 = localcb1;
    localbd6.setOnTouchListener(localcb3);
  }

  public final void b()
  {
    this.d.bringToFront();
    this.c.bringToFront();
    bd.a(this.d);
    bd.a(this.c);
    this.b = true;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bl
 * JD-Core Version:    0.6.0
 */