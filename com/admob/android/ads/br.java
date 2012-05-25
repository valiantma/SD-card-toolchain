package com.admob.android.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Timer;

public final class br
{
  private static Handler a = null;
  private static Timer b = null;
  private static bg c = null;
  private bv d;
  private WeakReference e;
  private boolean f;
  private e g;
  private String h;
  private String i;
  private bh j;
  private long k;

  final void a()
  {
    if (a != null)
    {
      Handler localHandler = a;
      bj localbj = new bj(this);
      localHandler.post(localbj);
    }
  }

  final void b()
  {
    int m = 0;
    if (b != null)
    {
      b.cancel();
      b = m;
    }
    if ((this.k != 65535L) && (bh.a("AdMobSDK", 2)))
    {
      long l1 = SystemClock.uptimeMillis();
      long l2 = this.k;
      Object localObject;
      long l3 = localObject - l2;
      String str = "total request time: " + l3;
      Log.v("AdMobSDK", str);
    }
    this.f = true;
    c = m;
    if ((bq)this.e.get() != null);
  }

  final void c()
  {
    if (a != null)
    {
      Handler localHandler = a;
      bi localbi = new bi(this);
      localHandler.post(localbi);
    }
  }

  final void d()
  {
    c = null;
    if ((bq)this.e.get() != null);
  }

  final bv e()
  {
    return this.d;
  }

  public final String f()
  {
    return this.i;
  }

  public final String g()
  {
    return this.h;
  }

  final bh h()
  {
    return this.j;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.br
 * JD-Core Version:    0.6.0
 */