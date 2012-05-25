package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class AdView extends RelativeLayout
{
  private static Boolean a;
  private static Handler s = null;
  private f b;
  private int c;
  private boolean d;
  private y e;
  private int f;
  private int g;
  private int h;
  private String i;
  private String j;
  private cm k;
  private boolean l;
  private boolean m = true;
  private boolean n;
  private long o;
  private ae p;
  private ch q;
  private u r;

  public AdView(Activity paramActivity)
  {
    this(paramActivity, null, 0);
  }

  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, localu);
  }

  private AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, u paramu)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject3 = a;
    if (localObject3 == null)
    {
      boolean bool3 = isInEditMode();
      localObject3 = new Boolean(bool3);
      a = (Boolean)localObject3;
    }
    localObject3 = s;
    if (localObject3 == null)
    {
      localObject3 = a.booleanValue();
      if (localObject3 == 0)
      {
        localObject3 = new Handler();
        s = (Handler)localObject3;
        e.a((Handler)localObject3);
      }
    }
    this.r = paramu;
    localObject3 = u.a;
    if (paramu != localObject3)
    {
      localObject3 = ch.a;
      this.q = ((ch)localObject3);
    }
    setDescendantFocusability(262144);
    setClickable(true);
    setLongClickable(bool2);
    int i4 = 17;
    setGravity(i4);
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject1;
    if (paramAttributeSet != null)
    {
      localObject4 = new StringBuilder().append("http://schemas.android.com/apk/res/");
      localObject5 = paramContext.getPackageName();
      localObject4 = (String)localObject5;
      localObject5 = paramAttributeSet.getAttributeBooleanValue((String)localObject4, "testing", bool2);
      if (localObject5 != 0)
      {
        localObject5 = bh.a("AdMobSDK", i2);
        if (localObject5 != 0)
        {
          localObject5 = "AdMobSDK";
          localObject6 = "AdView's \"testing\" XML attribute has been deprecated and will be ignored.  Please delete it from your XML layout and use AdManager.setTestDevices instead.";
          Log.w((String)localObject5, (String)localObject6);
        }
      }
      localObject5 = paramAttributeSet.getAttributeUnsignedIntValue((String)localObject4, "backgroundColor", i1);
      localObject6 = paramAttributeSet.getAttributeUnsignedIntValue((String)localObject4, "textColor", localObject2);
      if (localObject6 >= 0)
      {
        boolean bool1 = bh.a("AdMobSDK", i2);
        if (bool1)
        {
          localObject1 = "AdMobSDK";
          Log.w((String)localObject1, "Calling the deprecated method setTextColor!  Please use setPrimaryTextColor and setSecondaryTextColor instead.");
        }
        b(localObject6);
        c(localObject6);
      }
      localObject6 = paramAttributeSet.getAttributeUnsignedIntValue((String)localObject4, "primaryTextColor", localObject2);
      localObject1 = paramAttributeSet.getAttributeUnsignedIntValue((String)localObject4, "secondaryTextColor", localObject2);
      String str = paramAttributeSet.getAttributeValue((String)localObject4, "keywords");
      this.i = str;
      int i5 = paramAttributeSet.getAttributeIntValue((String)localObject4, "refreshInterval", bool2);
      a(i5);
      localObject4 = paramAttributeSet.getAttributeBooleanValue((String)localObject4, "isGoneWithoutAd", bool2);
      if (localObject4 != 0)
      {
        localObject4 = bh.a("AdMobSDK", i2);
        if (localObject4 != 0)
        {
          localObject4 = "AdMobSDK";
          Log.w((String)localObject4, "Deprecated method setGoneWithoutAd was called.  See JavaDoc for instructions to remove.");
        }
      }
      localObject4 = localObject1;
      Object localObject7 = localObject6;
      localObject6 = localObject5;
      localObject5 = localObject7;
    }
    while (true)
    {
      setBackgroundColor(localObject6);
      b(localObject5);
      c(localObject4);
      this.b = null;
      this.p = null;
      if (a.booleanValue())
      {
        TextView localTextView = new TextView(paramContext, paramAttributeSet, paramInt);
        int i6 = this.f;
        localTextView.setBackgroundColor(i6);
        int i7 = this.g;
        localTextView.setTextColor(i7);
        localTextView.setPadding(i3, i3, i3, i3);
        localTextView.setTextSize(1098907648);
        localTextView.setGravity(16);
        localTextView.setText("Ads by AdMob");
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(localObject2, localObject2);
        addView(localTextView, localLayoutParams);
      }
      while (true)
      {
        return;
        f();
      }
      localObject4 = localObject2;
      localObject5 = localObject2;
      localObject6 = localObject1;
    }
  }

  private void a(int paramInt)
  {
    int i1 = 600;
    int i2 = 13;
    int i3 = 5;
    int i4 = paramInt * 1000;
    int i5;
    if (this.c != i4)
      if (paramInt > 0)
      {
        if (paramInt >= i2)
          break label154;
        boolean bool1 = bh.a("AdMobSDK", i3);
        if (bool1)
        {
          String str1 = "AdMobSDK";
          String str3 = "AdView.setRequestInterval(" + paramInt + ") seconds must be >= " + i2;
          Log.w(str1, str3);
        }
        i5 = 13000;
      }
    while (true)
    {
      this.c = i5;
      if (paramInt <= 0)
        g();
      if (bh.a("AdMobSDK", 4))
      {
        String str4 = "Requesting fresh ads every " + paramInt + " seconds.";
        Log.i("AdMobSDK", str4);
      }
      return;
      label154: if (paramInt <= i1)
        continue;
      boolean bool2 = bh.a("AdMobSDK", i3);
      if (bool2)
      {
        String str2 = "AdMobSDK";
        String str5 = "AdView.setRequestInterval(" + paramInt + ") seconds must be <= " + i1;
        Log.w(str2, str5);
      }
      int i6 = 600000;
    }
  }

  private void a(f paramf)
  {
    this.b = paramf;
    if (this.l)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(null, 1065353216);
      localAlphaAnimation.setDuration(233L);
      localAlphaAnimation.startNow();
      localAlphaAnimation.setFillAfter(true);
      AccelerateInterpolator localAccelerateInterpolator = new AccelerateInterpolator();
      localAlphaAnimation.setInterpolator(localAccelerateInterpolator);
      startAnimation(localAlphaAnimation);
    }
  }

  private void a(boolean paramBoolean)
  {
    monitorenter;
    if (paramBoolean);
    try
    {
      int i1 = this.c;
      if (i1 > 0)
      {
        int i2 = getVisibility();
        if (i2 == 0)
        {
          i2 = this.c;
          g();
          Object localObject1 = this.b;
          if (localObject1 != null)
          {
            localObject1 = this.b.b();
            if (localObject1 != null)
            {
              localObject1 = ((e)localObject1).d();
              if (localObject1 != 0)
              {
                long l1 = this.b.h() < 120L;
                if (localObject1 < 0)
                {
                  localObject1 = bh.a("AdMobSDK", 3);
                  if (localObject1 != 0)
                  {
                    localObject1 = "AdMobSDK";
                    Log.d((String)localObject1, "Cannot refresh CPM ads.  Ignoring request to refresh the ad.");
                  }
                  localObject1 = null;
                  if (localObject1 != null)
                  {
                    y localy1 = new y(this);
                    this.e = localy1;
                    Handler localHandler = s;
                    y localy2 = this.e;
                    long l2 = i2;
                    localHandler.postDelayed(localy2, l2);
                    if (bh.a("AdMobSDK", 3))
                    {
                      String str = "Ad refresh scheduled for " + i2 + " from now.";
                      Log.d("AdMobSDK", i2);
                    }
                  }
                }
              }
            }
          }
        }
      }
      do
      {
        return;
        int i3 = 1;
        break;
      }
      while ((paramBoolean) && (this.c != 0));
      g();
    }
    finally
    {
      monitorexit;
    }
  }

  private void b(int paramInt)
  {
    int i1 = 0xFF000000 | paramInt;
    this.g = i1;
  }

  private void c(int paramInt)
  {
    int i1 = 0xFF000000 | paramInt;
    this.h = i1;
  }

  private void f()
  {
    int i1 = 5;
    l.a(getContext());
    if ((!this.m) && (super.getVisibility() != 0))
      if (bh.a("AdMobSDK", i1))
        Log.w("AdMobSDK", "Cannot requestFreshAd() when the AdView is not visible.  Call AdView.setVisibility(View.VISIBLE) first.");
    while (true)
    {
      return;
      if (this.n)
      {
        if (!bh.a("AdMobSDK", i1))
          continue;
        Log.w("AdMobSDK", "Ignoring requestFreshAd() because we are requesting an ad right now already.");
        continue;
      }
      this.n = true;
      long l1 = SystemClock.uptimeMillis();
      Object localObject;
      this.o = localObject;
      new ac(this).start();
    }
  }

  private void g()
  {
    if (this.e != null)
    {
      this.e.a = true;
      this.e = null;
      if (bh.a("AdMobSDK", 2))
        Log.v("AdMobSDK", "Cancelled an ad refresh scheduled for the future.");
    }
  }

  public final int a()
  {
    return this.g;
  }

  final void a(e parame, f paramf)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    int i1 = super.getVisibility();
    double d1 = parame.a();
    Object localObject2;
    if (localObject2 >= 0L)
    {
      this.d = bool1;
      int i2 = (int)localObject2;
      a(i2);
      a(bool1);
    }
    while (true)
    {
      boolean bool2 = this.m;
      if (bool2)
        this.m = localObject1;
      paramf.a(parame);
      paramf.setVisibility(i1);
      paramf.setGravity(17);
      parame.a(paramf);
      int i3 = parame.e();
      int i4 = parame.a(i3);
      int i5 = parame.f();
      int i6 = parame.a(i5);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i4, i6);
      paramf.setLayoutParams(localLayoutParams);
      Handler localHandler = s;
      w localw = new w(this, paramf, i1, bool2);
      localHandler.post(localw);
      return;
      this.d = localObject1;
    }
  }

  public final int b()
  {
    return this.h;
  }

  public final int c()
  {
    return this.f;
  }

  final ch d()
  {
    return this.q;
  }

  final u e()
  {
    return this.r;
  }

  protected void onAttachedToWindow()
  {
    this.l = true;
    a(true);
    super.onAttachedToWindow();
  }

  protected void onDetachedFromWindow()
  {
    this.l = null;
    a(null);
    super.onDetachedFromWindow();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 3;
    super.onMeasure(paramInt1, paramInt2);
    int i2 = getMeasuredWidth();
    int i3 = getMeasuredHeight();
    if (bh.a("AdMobSDK", i1))
    {
      String str = "AdView size is " + i2 + " by " + i3;
      Log.d("AdMobSDK", i3);
    }
    if (!a.booleanValue())
    {
      float f1 = i2;
      float f2 = f.c();
      if ((int)(i2 / f2) > 1134231552)
        break label132;
      if (bh.a("AdMobSDK", i1))
        Log.d("AdMobSDK", "We need to have a minimum width of 320 device independent pixels to show an ad.");
    }
    try
    {
      this.b.setVisibility(8);
      while (true)
      {
        label131: return;
        try
        {
          label132: int i4 = this.b.getVisibility();
          f localf1 = this.b;
          int i5 = super.getVisibility();
          localf1.setVisibility(i5);
          if ((i4 == 0) || (this.b.getVisibility() != 0))
            continue;
          f localf2 = this.b;
          a(localf2);
        }
        catch (NullPointerException localNullPointerException1)
        {
        }
      }
    }
    catch (NullPointerException localNullPointerException2)
    {
      break label131;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    a(paramBoolean);
  }

  protected void onWindowVisibilityChanged(int paramInt)
  {
    int i1;
    if (paramInt == 0)
      i1 = 1;
    while (true)
    {
      a(i1);
      return;
      Object localObject = null;
    }
  }

  public void setBackgroundColor(int paramInt)
  {
    int i1 = 0xFF000000 | paramInt;
    this.f = i1;
    invalidate();
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (paramBoolean)
      setVisibility(0);
    while (true)
    {
      return;
      setVisibility(8);
    }
  }

  public void setVisibility(int paramInt)
  {
    int i1 = 0;
    int i2 = super.getVisibility();
    if (i2 != paramInt)
      monitorenter;
    while (true)
    {
      try
      {
        i2 = getChildCount();
        int i3 = i1;
        if (i3 >= i2)
          continue;
        getChildAt(i3).setVisibility(paramInt);
        i3++;
        continue;
        super.setVisibility(paramInt);
        invalidate();
        monitorexit;
        if (paramInt == 0)
        {
          i2 = 1;
          a(i2);
          return;
        }
      }
      finally
      {
        monitorexit;
      }
      i2 = i1;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.AdView
 * JD-Core Version:    0.6.0
 */