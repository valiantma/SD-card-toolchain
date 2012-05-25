package com.admob.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.util.Collections;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends RelativeLayout
  implements Animation.AnimationListener, cg, cn, g
{
  private static float i = -1082130432;
  private static bk j = null;
  protected e a;
  final AdView b;
  protected ProgressBar c;
  private Vector d;
  private View e;
  private long f = 65535L;
  private boolean g;
  private View h;

  public f(Context paramContext, AdView paramAdView)
  {
    super(paramContext);
    this.b = paramAdView;
    setId(1);
    b(paramContext);
    this.e = null;
    a(null);
  }

  public static float a(Context paramContext)
  {
    b(paramContext);
    return i;
  }

  private static Vector a(int paramInt1, int paramInt2, int paramInt3, long paramLong, Vector paramVector)
  {
    paramVector = 1;
    int k = 0;
    int m = -1;
    int n = 2;
    if (??? == 0);
    for (Object localObject1 = new Vector(); ; localObject1 = ???)
    {
      float f1 = (float)paramLong / 1148846080;
      Object[] arrayOfObject1;
      if ((paramInt2 != m) && (paramInt3 != m))
      {
        arrayOfObject1 = new Object[4];
        Integer localInteger1 = Integer.valueOf(paramInt1);
        arrayOfObject1[k] = localInteger1;
        Integer localInteger2 = Integer.valueOf(paramInt2);
        arrayOfObject1[paramVector] = localInteger2;
        Integer localInteger3 = Integer.valueOf(paramInt3);
        arrayOfObject1[n] = localInteger3;
        localObject2 = Float.valueOf(f1);
        arrayOfObject1[3] = localObject2;
      }
      Object[] arrayOfObject2;
      for (Object localObject2 = String.format("{%d,%d,%d,%f}", arrayOfObject1); ; localObject2 = String.format("{%d,%f}", arrayOfObject2))
      {
        ((Vector)localObject1).add(localObject2);
        if (bh.a("AdMobSDK", n))
        {
          String str = "recordEvent:" + (String)localObject2;
          Log.v("AdMobSDK", (String)localObject2);
        }
        return localObject1;
        arrayOfObject2 = new Object[n];
        Integer localInteger4 = Integer.valueOf(paramInt1);
        arrayOfObject2[k] = localInteger4;
        localObject2 = Float.valueOf(localObject2);
        arrayOfObject2[paramVector] = localObject2;
      }
    }
  }

  private Vector a(KeyEvent paramKeyEvent, Vector paramVector)
  {
    int k = -1;
    int m = 1;
    int n = paramKeyEvent.getAction();
    long l1 = paramKeyEvent.getEventTime();
    long l2 = this.f;
    Object localObject;
    long l3 = localObject - l2;
    int i2;
    Vector localVector3;
    if ((n == 0) || (n == m))
      if (n == m)
      {
        n = m;
        i2 = k;
        localVector3 = paramVector;
      }
    Vector localVector2;
    for (Vector localVector1 = a(n, k, i2, l3, localVector3); ; localVector2 = paramVector)
    {
      return localVector1;
      int i1 = 0;
      break;
    }
  }

  private Vector a(MotionEvent paramMotionEvent, Vector paramVector)
  {
    int k = 1;
    int m = paramMotionEvent.getAction();
    long l1 = paramMotionEvent.getEventTime();
    long l2 = this.f;
    Object localObject;
    l2 = localObject - l2;
    int i1;
    int i2;
    Vector localVector3;
    if ((m == 0) || (m == k))
      if (m == k)
      {
        m = k;
        i1 = (int)paramMotionEvent.getX();
        i2 = (int)paramMotionEvent.getY();
        localVector3 = paramVector;
      }
    Vector localVector2;
    for (Vector localVector1 = a(m, i1, i2, l2, localVector3); ; localVector2 = paramVector)
    {
      return localVector1;
      int n = 0;
      break;
    }
  }

  private static void a(View paramView, JSONObject paramJSONObject)
  {
    boolean bool = paramView instanceof g;
    Object localObject;
    JSONObject localJSONObject;
    if (bool)
    {
      localObject = (g)paramView;
      localJSONObject = ((g)localObject).j();
      localObject = ((g)localObject).i();
      if ((localJSONObject == null) || (localObject == null));
    }
    try
    {
      paramJSONObject.put((String)localObject, localJSONObject);
      label43: int k = paramView instanceof ViewGroup;
      if (k != 0)
      {
        paramView = (ViewGroup)paramView;
        for (k = 0; ; k++)
        {
          int m = paramView.getChildCount();
          if (k >= m)
            break;
          a(paramView.getChildAt(k), paramJSONObject);
        }
      }
    }
    catch (Exception localException)
    {
      break label43;
    }
  }

  private static void b(Context paramContext)
  {
    if (i < null)
      i = paramContext.getResources().getDisplayMetrics().density;
  }

  public static float c()
  {
    return i;
  }

  private boolean k()
  {
    Object localObject1 = this.a;
    int k;
    if (localObject1 != null)
    {
      localObject1 = this.a.l();
      if (localObject1 != 0);
    }
    else
    {
      k = 1;
    }
    while (true)
    {
      return k;
      Object localObject2 = null;
    }
  }

  private boolean l()
  {
    Object localObject1 = this.a;
    int k;
    if (localObject1 != null)
    {
      localObject1 = SystemClock.uptimeMillis();
      long l1 = this.f;
      Object localObject3;
      long l2;
      localObject3 -= l1;
      long l3 = this.a.c();
      Object localObject4;
      l2 <= localObject4;
      if (localObject1 > 0)
        k = 1;
    }
    while (true)
    {
      return k;
      Object localObject2 = null;
    }
  }

  private void m()
  {
    Object localObject1 = this.a;
    JSONObject localJSONObject;
    if (localObject1 != null)
    {
      localObject1 = isPressed();
      if (localObject1 != 0)
      {
        setPressed(null);
        boolean bool = this.g;
        if (!bool)
        {
          this.g = true;
          localJSONObject = n();
          View localView = this.h;
          if (localView == null)
            break label206;
          int k = 1;
          if (k == null)
            break label211;
          AnimationSet localAnimationSet = new AnimationSet(true);
          float f1 = this.h.getWidth() / 1073741824;
          float f2 = this.h.getHeight() / 1073741824;
          ScaleAnimation localScaleAnimation1 = new ScaleAnimation(1065353216, 1067030938, 1065353216, 1067030938, f1, f2);
          localScaleAnimation1.setDuration(200L);
          localAnimationSet.addAnimation(localScaleAnimation1);
          ScaleAnimation localScaleAnimation2 = new ScaleAnimation(1067030938, 981668463, 1067030938, 981668463, f1, f2);
          localScaleAnimation2.setDuration(299L);
          localScaleAnimation2.setStartOffset(200L);
          localScaleAnimation2.setAnimationListener(this);
          localAnimationSet.addAnimation(localScaleAnimation2);
          bn localbn = new bn(localJSONObject, this);
          postDelayed(localbn, 500L);
          this.h.startAnimation(localAnimationSet);
        }
      }
    }
    while (true)
    {
      return;
      label206: Object localObject2 = null;
      break;
      label211: this.a.a(localJSONObject);
      if (this.b == null)
        continue;
      this.b.performClick();
    }
  }

  // ERROR //
  private JSONObject n()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: new 155	org/json/JSONObject
    //   5: dup
    //   6: invokespecial 281	org/json/JSONObject:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: aload_2
    //   12: invokestatic 170	com/admob/android/ads/f:a	(Landroid/view/View;Lorg/json/JSONObject;)V
    //   15: new 155	org/json/JSONObject
    //   18: dup
    //   19: invokespecial 281	org/json/JSONObject:<init>	()V
    //   22: astore_3
    //   23: ldc_w 283
    //   26: astore_1
    //   27: aload_3
    //   28: aload_1
    //   29: aload_2
    //   30: invokevirtual 159	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   33: pop
    //   34: aload_3
    //   35: astore_1
    //   36: aload_1
    //   37: areturn
    //   38: astore 4
    //   40: aload_1
    //   41: astore_2
    //   42: aload 4
    //   44: astore_1
    //   45: ldc 94
    //   47: ldc_w 285
    //   50: aload_1
    //   51: invokestatic 289	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   54: pop
    //   55: aload_2
    //   56: astore_1
    //   57: goto -21 -> 36
    //   60: astore_1
    //   61: aload_3
    //   62: astore_2
    //   63: goto -18 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   2	23	38	java/lang/Exception
    //   23	34	60	java/lang/Exception
  }

  public final void a()
  {
    Context localContext = getContext();
    Drawable localDrawable1 = localContext.getResources().getDrawable(17301602);
    setBackgroundDrawable(localDrawable1);
    Drawable localDrawable2 = localContext.getResources().getDrawable(17301602);
    localDrawable2.setAlpha(128);
    View localView1 = new View(localContext);
    this.e = localView1;
    this.e.setBackgroundDrawable(localDrawable2);
    this.e.setVisibility(4);
    View localView2 = this.e;
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    addView(localView2, localLayoutParams);
  }

  public final void a(View paramView, RelativeLayout.LayoutParams paramLayoutParams)
  {
    if (paramView != null)
    {
      View localView = this.h;
      if (paramView != localView)
      {
        this.h = paramView;
        Context localContext = getContext();
        ProgressBar localProgressBar = new ProgressBar(localContext);
        this.c = localProgressBar;
        this.c.setIndeterminate(true);
        this.c.setId(2);
        if (paramLayoutParams != null)
          this.c.setLayoutParams(paramLayoutParams);
        this.c.setVisibility(4);
        bm localbm = new bm(this);
        post(localbm);
      }
    }
  }

  public final void a(e parame)
  {
    boolean bool1 = true;
    boolean bool2 = null;
    this.a = parame;
    if (parame == null)
    {
      setFocusable(bool2);
      setClickable(bool2);
    }
    while (true)
    {
      return;
      parame.a(this);
      setFocusable(bool1);
      setClickable(bool1);
    }
  }

  public final e b()
  {
    return this.a;
  }

  public final void d()
  {
    if (this.a != null)
    {
      this.a.h();
      this.a = null;
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int k = 2;
    int m = 1;
    boolean bool1 = null;
    boolean bool2 = k();
    int n;
    Object localObject;
    if (bool2)
    {
      n = paramMotionEvent.getAction();
      boolean bool4 = bh.a("AdMobSDK", k);
      if (bool4)
      {
        localObject = "AdMobSDK";
        StringBuilder localStringBuilder1 = new StringBuilder().append("dispatchTouchEvent: action=").append(n).append(" x=");
        float f1 = paramMotionEvent.getX();
        StringBuilder localStringBuilder2 = localStringBuilder1.append(f1).append(" y=");
        float f2 = paramMotionEvent.getY();
        String str = f2;
        Log.v((String)localObject, str);
      }
      localObject = l();
      if (localObject != 0)
      {
        localObject = this.a;
        if (localObject == null)
          break label299;
        localObject = this.a.g();
        localObject = this.a.a((Rect)localObject);
        int i2 = (int)paramMotionEvent.getX();
        int i3 = (int)paramMotionEvent.getY();
        localObject = ((Rect)localObject).contains(i2, i3);
        if (localObject != 0)
          break label299;
        localObject = bool1;
      }
    }
    while (true)
    {
      if (localObject != null)
      {
        Vector localVector1 = this.d;
        Vector localVector2 = a(paramMotionEvent, localVector1);
        this.d = localVector2;
      }
      if ((n == 0) || (n == k))
      {
        setPressed(localObject);
        n = m;
      }
      while (true)
      {
        return n;
        if (n == m)
        {
          bool3 = isPressed();
          if ((bool3) && (localObject != null))
            m();
          setPressed(bool1);
          break;
        }
        if (bool3 != true)
          break;
        setPressed(bool1);
        break;
        boolean bool3 = super.dispatchTouchEvent(paramMotionEvent);
      }
      label299: int i1 = m;
    }
  }

  public final boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    int k = 1;
    if (k())
    {
      if (bh.a("AdMobSDK", 2))
      {
        StringBuilder localStringBuilder = new StringBuilder().append("dispatchTrackballEvent: action=");
        int m = paramMotionEvent.getAction();
        String str = m;
        Log.v("AdMobSDK", str);
      }
      if (l())
      {
        Vector localVector1 = this.d;
        Vector localVector2 = a(paramMotionEvent, localVector1);
        this.d = localVector2;
        if (paramMotionEvent.getAction() != 0)
          break label103;
        setPressed(k);
      }
    }
    while (true)
    {
      return super.onTrackballEvent(paramMotionEvent);
      label103: if (paramMotionEvent.getAction() != k)
        continue;
      if (hasFocus())
        m();
      setPressed(null);
    }
  }

  public final void e()
  {
    bo localbo = new bo(this);
    post(localbo);
  }

  protected final void f()
  {
    int k = 0;
    this.g = k;
    if (this.c != null)
      this.c.setVisibility(4);
    if (this.h != null)
      this.h.setVisibility(k);
  }

  public final void g()
  {
    Vector localVector = new Vector();
    for (int k = 0; ; k++)
    {
      int m = getChildCount();
      if (k >= m)
        break;
      View localView1 = getChildAt(k);
      localVector.add(localView1);
    }
    if (j == null)
      j = new bk();
    bk localbk = j;
    Collections.sort(localVector, localbk);
    int n = localVector.size() - 1;
    while (n >= 0)
    {
      View localView2 = (View)localVector.elementAt(n);
      if (indexOfChild(localView2) != n)
      {
        View localView3 = (View)localVector.elementAt(n);
        bringChildToFront(localView3);
      }
      n += -1;
    }
    if (this.e != null)
      this.e.bringToFront();
  }

  public final long h()
  {
    long l1 = 0L;
    long l2 = SystemClock.uptimeMillis();
    long l3 = this.f;
    Object localObject;
    long l4;
    localObject -= l3;
    if ((this.f < l1) || (l4 < l1) || (l4 > -27008L))
      l4 = l1;
    return l4;
  }

  public final String i()
  {
    return "container";
  }

  public final JSONObject j()
  {
    int k = 0;
    JSONObject localJSONObject;
    if (this.d != null)
      localJSONObject = new JSONObject();
    try
    {
      Vector localVector = this.d;
      JSONArray localJSONArray = new JSONArray(localVector);
      localJSONObject.put("touches", localJSONArray);
      label40: return localJSONObject;
    }
    catch (Exception localException)
    {
      break label40;
    }
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    int k = 3;
    if ((isPressed()) || (isFocused()))
    {
      int m = getWidth() - k;
      int n = getHeight() - k;
      paramCanvas.clipRect(k, k, m, n);
    }
    super.onDraw(paramCanvas);
    if (this.f == 65535L)
    {
      long l = SystemClock.uptimeMillis();
      Object localObject;
      this.f = localObject;
      if (this.a != null)
        this.a.i();
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (k())
    {
      if (bh.a("AdMobSDK", 2))
      {
        String str = "onKeyDown: keyCode=" + paramInt;
        Log.v("AdMobSDK", str);
      }
      if ((paramInt == 66) || (paramInt == 23))
      {
        Vector localVector1 = this.d;
        Vector localVector2 = a(paramKeyEvent, localVector1);
        this.d = localVector2;
        setPressed(true);
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (k())
    {
      if (bh.a("AdMobSDK", 2))
      {
        String str = "onKeyUp: keyCode=" + paramInt;
        Log.v("AdMobSDK", str);
      }
      if ((l()) && ((paramInt == 66) || (paramInt == 23)))
      {
        Vector localVector1 = this.d;
        Vector localVector2 = a(paramKeyEvent, localVector1);
        this.d = localVector2;
        m();
      }
      setPressed(null);
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public final void setPressed(boolean paramBoolean)
  {
    if ((!k()) || ((this.g) && (paramBoolean)))
      return;
    if (isPressed() != paramBoolean)
      if (this.e != null)
      {
        if (!paramBoolean)
          break label65;
        this.e.bringToFront();
        this.e.setVisibility(0);
      }
    while (true)
    {
      super.setPressed(paramBoolean);
      invalidate();
      break;
      break;
      label65: this.e.setVisibility(4);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.f
 * JD-Core Version:    0.6.0
 */