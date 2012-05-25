package com.rafoid.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.admob.android.ads.AdView;

public class LongToast extends Activity
{
  TextView a;
  TextView b;
  private final int c = 5;
  private Boolean d;
  private long e = 0L;
  private TextView f;
  private ImageView g;
  private Handler h;
  private Runnable i;

  public LongToast()
  {
    Handler localHandler = new Handler();
    this.h = localHandler;
    f localf = new f(this);
    this.i = localf;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    Boolean localBoolean = Boolean.valueOf(null);
    this.d = localBoolean;
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131230722);
    AdView localAdView = new AdView(this);
    localLinearLayout.addView(localAdView);
    TextView localTextView1 = (TextView)findViewById(2131230727);
    this.a = localTextView1;
    TextView localTextView2 = (TextView)findViewById(2131230726);
    this.b = localTextView2;
    TextView localTextView3 = (TextView)findViewById(2131230725);
    this.f = localTextView3;
    ImageView localImageView1 = (ImageView)findViewById(2131230724);
    this.g = localImageView1;
    Intent localIntent = getIntent();
    TextView localTextView4 = this.f;
    String str = localIntent.getStringExtra("MSG");
    localTextView4.setText(str);
    ImageView localImageView2 = this.g;
    int j = localIntent.getIntExtra("ICON", 2130837506);
    localImageView2.setImageResource(j);
    if (this.e == 0L)
    {
      long l = SystemClock.uptimeMillis();
      Object localObject;
      this.e = localObject;
      Handler localHandler1 = this.h;
      Runnable localRunnable1 = this.i;
      localHandler1.removeCallbacks(localRunnable1);
      Handler localHandler2 = this.h;
      Runnable localRunnable2 = this.i;
      localHandler2.postDelayed(localRunnable2, 100L);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return null;
  }

  public void onStart()
  {
    super.onStart();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.d.booleanValue())
      finish();
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.core.LongToast
 * JD-Core Version:    0.6.0
 */