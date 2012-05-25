package com.android.vending.licensing;

import android.os.Handler;
import android.util.Log;

final class f extends r
{
  private final a b;
  private Runnable c;

  public f(s params, a parama)
  {
    this.b = parama;
    j localj = new j(this);
    this.c = localj;
    Log.i("LicenseChecker", "Start monitoring timeout.");
    Handler localHandler = s.a(this.a);
    Runnable localRunnable = this.c;
    localHandler.postDelayed(localRunnable, 10000L);
  }

  public final void a(int paramInt, String paramString1, String paramString2)
  {
    Handler localHandler = s.a(this.a);
    k localk = new k(this, paramInt, paramString1, paramString2);
    localHandler.post(localk);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.f
 * JD-Core Version:    0.6.0
 */