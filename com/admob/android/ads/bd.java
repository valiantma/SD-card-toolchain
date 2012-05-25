package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.VideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public final class bd extends bc
  implements bb
{
  ViewGroup d;
  VideoView e;
  m f;
  int g;
  boolean h;
  boolean i = null;
  boolean j = null;
  bl k;
  private long l;
  private Button m;
  private Runnable n;
  private boolean o;
  private ck p;
  private WeakReference q;
  private MediaController r;

  public bd(Context paramContext, WeakReference paramWeakReference)
  {
    super(paramContext);
    this.q = paramWeakReference;
    ca localca = new ca(this);
    this.n = localca;
    this.h = null;
    this.i = null;
    this.j = null;
  }

  private void a(Context paramContext)
  {
    x localx = this.c.h;
    VideoView localVideoView1 = new VideoView(paramContext);
    this.e = localVideoView1;
    cl localcl = new cl(this);
    this.e.setOnPreparedListener(localcl);
    this.e.setOnCompletionListener(localcl);
    VideoView localVideoView2 = this.e;
    String str = localx.a;
    localVideoView2.setVideoPath(str);
    this.e.setBackgroundDrawable(null);
    this.e.setOnErrorListener(localcl);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(13);
    VideoView localVideoView3 = this.e;
    addView(localVideoView3, localLayoutParams);
    if (this.k != null)
      this.k.b();
  }

  public static void a(View paramView)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(null, 1065353216);
    localAlphaAnimation.setDuration(1000L);
    localAlphaAnimation.setFillAfter(true);
    paramView.startAnimation(localAlphaAnimation);
    paramView.invalidate();
  }

  public static void b(View paramView)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1065353216, null);
    localAlphaAnimation.setDuration(1000L);
    localAlphaAnimation.setFillAfter(true);
    paramView.startAnimation(localAlphaAnimation);
    paramView.invalidate();
  }

  private void b(boolean paramBoolean)
  {
    this.o = paramBoolean;
    if (!paramBoolean)
      g();
  }

  private void g()
  {
    if (this.p != null)
    {
      Handler localHandler = this.a;
      ck localck = this.p;
      localHandler.removeCallbacks(localck);
      this.p = null;
    }
  }

  private void h()
  {
    int i1 = -1;
    boolean bool = this.c.h.c();
    if (bool)
    {
      Object localObject1 = getContext();
      Object localObject2 = new RelativeLayout((Context)localObject1);
      this.d = ((ViewGroup)localObject2);
      localObject2 = new ImageView((Context)localObject1);
      localObject1 = this.c.b();
      if (localObject1 != null)
      {
        String str = this.c.h.f;
        localObject1 = (Bitmap)((Hashtable)localObject1).get(str);
        if (localObject1 != null)
        {
          BitmapDrawable localBitmapDrawable = new BitmapDrawable((Bitmap)localObject1);
          int i2 = getResources().getDisplayMetrics().density;
          ((ImageView)localObject2).setImageDrawable(localBitmapDrawable);
          int i3 = ((Bitmap)localObject1).getWidth();
          double d1 = i2;
          int i4 = e.a(i3, d1);
          int i5 = ((Bitmap)localObject1).getHeight();
          double d2 = i2;
          int i6 = e.a(localObject1, d2);
          RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(i4, localObject1);
          localLayoutParams1.addRule(13);
          this.d.addView((View)localObject2, localLayoutParams1);
          this.d.setBackgroundColor(0);
          this.d.setVisibility(4);
          RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(i1, i1);
          ViewGroup localViewGroup = this.d;
          addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
        }
      }
      long l1 = System.currentTimeMillis();
      Object localObject3;
      this.l = localObject3;
    }
  }

  public final void a()
  {
    boolean bool = this.h;
    if (bool)
    {
      Handler localHandler1 = this.a;
      bz localbz = new bz(this);
      localHandler1.post(localbz);
    }
    while (true)
    {
      return;
      cd localcd = new cd(this);
      long l1 = System.currentTimeMillis();
      long l2 = this.l;
      Object localObject;
      long l3;
      localObject -= l2;
      l2 = (int)(this.c.h.g * 4652007308841189376L);
      if (l2 > l3)
      {
        Handler localHandler2 = this.a;
        long l4 = l2 - l3;
        localHandler2.postDelayed(localcd, l3);
        continue;
      }
      this.a.post(localcd);
    }
  }

  public final void a(Configuration paramConfiguration)
  {
    int i1 = paramConfiguration.orientation;
    this.g = i1;
    if ((this.k != null) && (e()))
      if ((this.g == 2) && (this.k.b))
        this.k.a();
    while (true)
    {
      return;
      if ((!this.k.b) && (this.g == 1))
      {
        this.k.b();
        continue;
        Handler localHandler = this.a;
        Runnable localRunnable = this.n;
        localHandler.removeCallbacks(localRunnable);
        continue;
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
    int i1 = -1;
    int i2 = -1;
    int i3 = 134;
    int i4 = 0;
    int i5 = 1124466688;
    Object localObject1 = this.a;
    Object localObject3 = this.n;
    ((Handler)localObject1).removeCallbacks((Runnable)localObject3);
    localObject1 = this.d;
    if (localObject1 == null)
      h();
    localObject1 = this.d;
    if (localObject1 != null)
    {
      localObject1 = this.d;
      a((View)localObject1);
    }
    localObject1 = this.k;
    if (localObject1 != null)
    {
      bl localbl = this.k;
      localObject3 = getContext();
      ab localab = this.c;
      int i7 = this.b;
      localObject1 = localbl.a;
      Object localObject2;
      if (localObject1 == null)
      {
        RelativeLayout localRelativeLayout = new RelativeLayout((Context)localObject3);
        Button localButton = new Button((Context)localObject3);
        localButton.setTextColor(i1);
        localObject1 = new ce(this);
        localButton.setOnClickListener((View.OnClickListener)localObject1);
        localObject1 = localab.b();
        String str1 = localab.h.l;
        localObject1 = (Bitmap)((Hashtable)localObject1).get(str1);
        BitmapDrawable localBitmapDrawable = new BitmapDrawable((Bitmap)localObject1);
        int i6 = (int)(i5 * i7);
        int i8 = (int)(i5 * i7);
        localBitmapDrawable.setBounds(i4, i4, i6, i8);
        i6 = (int)(i5 * i7);
        localButton.setWidth(i6);
        localButton.setHeight(i3);
        localButton.setBackgroundDrawable(localBitmapDrawable);
        int i9 = (int)(i5 * i7);
        int i10 = (int)(i5 * i7);
        localObject2 = new RelativeLayout.LayoutParams(i9, i10);
        ((RelativeLayout.LayoutParams)localObject2).addRule(13);
        localRelativeLayout.addView(localButton, (ViewGroup.LayoutParams)localObject2);
        localObject2 = new ce(this);
        localRelativeLayout.setOnClickListener((View.OnClickListener)localObject2);
        localObject2 = new TextView((Context)localObject3);
        ((TextView)localObject2).setTextColor(i1);
        Typeface localTypeface = Typeface.DEFAULT_BOLD;
        ((TextView)localObject2).setTypeface(localTypeface);
        ((TextView)localObject2).setText("Replay");
        int i11 = (int)(1096810496 * i7);
        ((TextView)localObject2).setPadding(i4, i4, i4, i11);
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i2, i2);
        localLayoutParams.addRule(12);
        localLayoutParams.addRule(14);
        localRelativeLayout.addView((View)localObject2, localLayoutParams);
        localObject2 = localab.b();
        String str2 = localab.h.k;
        Bitmap localBitmap = (Bitmap)((Hashtable)localObject2).get(localab);
        int i12 = i3;
        localObject2 = new p((Context)localObject3, localRelativeLayout, i3, localab, localBitmap);
        localbl.a = ((ViewGroup)localObject2);
        localObject2 = localbl.a;
        ce localce = new ce(this);
        ((ViewGroup)localObject2).setOnClickListener((View.OnClickListener)localObject3);
        localbl.a.setVisibility(4);
        int i13 = (int)(i5 * i7);
        int i14 = (int)(i5 * i7);
        localObject2 = new RelativeLayout.LayoutParams(localObject3, i14);
        ((RelativeLayout.LayoutParams)localObject2).addRule(13);
        ViewGroup localViewGroup = localbl.a;
        addView((View)localObject3, (ViewGroup.LayoutParams)localObject2);
      }
      if (paramBoolean)
      {
        localObject2 = this.k;
        if (((bl)localObject2).a != null)
        {
          ((bl)localObject2).a.bringToFront();
          a(((bl)localObject2).a);
        }
      }
      if (!this.k.b)
        this.k.b();
    }
    if ((this.o) && (this.p == null))
    {
      ck localck1 = new ck(this);
      this.p = localck1;
      Handler localHandler = this.a;
      ck localck2 = this.p;
      localHandler.postDelayed(localck2, 7500L);
    }
  }

  public final void b()
  {
    Object localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      b((View)localObject);
    }
    localObject = this.m;
    if (localObject != null)
    {
      localObject = this.m;
      b((View)localObject);
    }
    localObject = this.k;
    if (localObject != null)
    {
      boolean bool = this.k.b;
      if (!bool)
      {
        localbl = this.k;
        localbl.b();
      }
    }
    bl localbl = this.k;
    if (localbl != null)
    {
      localbl = this.k;
      if (localbl.a != null)
        b(localbl.a);
    }
    invalidate();
    if ((this.g == 2) && (this.k != null) && (this.k.b))
    {
      Handler localHandler1 = this.a;
      Runnable localRunnable = this.n;
      localHandler1.postDelayed(localRunnable, 3000L);
    }
    Handler localHandler2 = this.a;
    bz localbz = new bz(this);
    localHandler2.postDelayed(localbz, 1000L);
  }

  public final void c()
  {
    f();
    HashMap localHashMap = null;
    if (this.i)
    {
      localHashMap = new HashMap();
      localHashMap.put("event", "completed");
    }
    this.f.a("done", localHashMap);
    d();
  }

  final void d()
  {
    if (this.q != null)
    {
      this = (Activity)this.q.get();
      if (this != null)
        finish();
    }
  }

  final boolean e()
  {
    Object localObject1 = this.e;
    int i1;
    if (localObject1 != null)
    {
      localObject1 = this.e.isPlaying();
      if (localObject1 != 0)
        i1 = 1;
    }
    while (true)
    {
      return i1;
      Object localObject2 = null;
    }
  }

  final void f()
  {
    if (this.e != null)
    {
      this.e.stopPlayback();
      this.e.setVisibility(4);
      VideoView localVideoView = this.e;
      removeView(localVideoView);
      this.e = null;
    }
  }

  protected final void onAttachedToWindow()
  {
    Map localMap = null;
    int i1 = 6;
    int i2 = 2;
    Context localContext2 = 1;
    Context localContext3 = 0;
    this.p = localMap;
    ab localab1 = this.c;
    if (localab1 == null)
      if (bh.a("AdMobSDK", i1))
        Log.e("AdMobSDK", "openerInfo is null");
    x localx;
    while (true)
    {
      return;
      boolean bool1 = this.c.l;
      b(bool1);
      localObject1 = this.c;
      localx = ((ab)localObject1).h;
      if (localx != null)
        break;
      if (!bh.a("AdMobSDK", i1))
        continue;
      Log.e("AdMobSDK", "movieInfo is null");
    }
    Context localContext1 = getContext();
    Object localObject1 = ak.i(localContext1);
    String str1 = "l";
    if (localObject1 == str1)
    {
      this.g = i2;
      label130: str1 = this.c.j;
      String str2 = ak.d(localContext1);
      String str3 = this.c.i;
      String str4 = ak.g(localContext1);
      localObject1 = new m(str1, str2, str3, str4);
      this.f = ((m)localObject1);
      localObject1 = this.f;
      str1 = "video";
      ((m)localObject1).a(str1, localMap);
      a(localContext1);
      boolean bool2 = this.c.l;
      if (!bool2)
        break label610;
    }
    Object localObject4;
    label610: for (Object localObject2 = "Skip"; ; localObject4 = "Done")
    {
      str1 = af.a((String)localObject2);
      localObject2 = localx.c();
      if (localObject2 != 0)
      {
        h();
        localObject2 = this.d;
        if (localObject2 != null)
        {
          localObject2 = this.d;
          a((View)localObject2);
        }
        boolean bool3 = localx.j;
        if (bool3)
        {
          boolean bool4 = localx.c();
          if (bool4);
        }
        else
        {
          Object localObject3 = new Button(localContext1);
          this.m = ((Button)localObject3);
          localObject3 = this.m;
          cc localcc = new cc(this, localContext2);
          ((Button)localObject3).setOnClickListener(localcc);
          this.m.setBackgroundResource(17301509);
          this.m.setTextSize(1095761920);
          this.m.setText(str1);
          this.m.setVisibility(4);
          int i5 = this.b;
          int i6 = (int)(1113063424 * i5);
          int i7 = this.b;
          int i8 = (int)(1108344832 * i7);
          localObject3 = new RelativeLayout.LayoutParams(i6, i8);
          ((RelativeLayout.LayoutParams)localObject3).addRule(11);
          ((RelativeLayout.LayoutParams)localObject3).addRule(12);
          int i9 = this.b;
          int i10 = (int)(1073741824 * i9);
          int i11 = this.b;
          int i12 = (int)(1090519040 * i11);
          ((RelativeLayout.LayoutParams)localObject3).setMargins(localContext3, localContext3, i10, i12);
          Button localButton = this.m;
          addView(localButton, (ViewGroup.LayoutParams)localObject3);
          localObject3 = this.m;
          a((View)localObject3);
        }
      }
      int i3 = localx.c;
      if (i3 != i2)
        break label618;
      localObject4 = localx.m;
      if (localObject4 == null)
        break label618;
      localObject4 = localx.m.size();
      if (localObject4 <= 0)
        break label618;
      bl localbl1 = new bl();
      this.k = localbl1;
      bl localbl2 = this.k;
      int i13 = this.b;
      ab localab2 = this.c;
      WeakReference localWeakReference = this.q;
      bd localbd = this;
      localbl2.a(localContext1, str1, localx, i13, localbd, localab2, localWeakReference);
      break;
      this.g = localContext2;
      break label130;
    }
    label618: int i4 = localx.c;
    if (i4 == 0);
    for (localContext1 = localContext2; ; localContext1 = localContext3)
    {
      Activity localActivity = (Activity)this.q.get();
      if ((localActivity == null) || (this.e == null))
        break;
      MediaController localMediaController1 = new MediaController(localActivity, localContext1);
      this.r = localMediaController1;
      MediaController localMediaController2 = this.r;
      VideoView localVideoView1 = this.e;
      localActivity.setAnchorView(localContext1);
      VideoView localVideoView2 = this.e;
      MediaController localMediaController3 = this.r;
      localActivity.setMediaController(localContext1);
      break;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bd
 * JD-Core Version:    0.6.0
 */