package com.admob.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;

public abstract class bc extends RelativeLayout
{
  protected Handler a;
  protected float b;
  protected ab c;

  public bc(Context paramContext)
  {
    super(paramContext);
    Handler localHandler = new Handler();
    this.a = localHandler;
    int i = getResources().getDisplayMetrics().density;
    this.b = i;
  }

  public final void a(ab paramab)
  {
    this.c = paramab;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bc
 * JD-Core Version:    0.6.0
 */