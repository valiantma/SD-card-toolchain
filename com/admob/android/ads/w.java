package com.admob.android.ads;

import android.util.Log;
import java.lang.ref.WeakReference;

final class w
  implements Runnable
{
  private WeakReference a;
  private WeakReference b;
  private int c;
  private boolean d;

  public w(AdView paramAdView, f paramf, int paramInt, boolean paramBoolean)
  {
    WeakReference localWeakReference1 = new WeakReference(paramAdView);
    this.a = localWeakReference1;
    WeakReference localWeakReference2 = new WeakReference(paramf);
    this.b = localWeakReference2;
    this.c = paramInt;
    this.d = paramBoolean;
  }

  public final void run()
  {
    try
    {
      AdView localAdView = (AdView)this.a.get();
      localf = (f)this.b.get();
      if ((localAdView != null) && (localf != null))
      {
        localAdView.addView(localf);
        AdView.j(localAdView);
        if (this.c != 0)
          break label90;
        if (!this.d)
          break label59;
        AdView.a(localAdView, localf);
      }
      while (true)
      {
        return;
        label59: AdView.b(localAdView, localf);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        f localf;
        if (!bh.a("AdMobSDK", 6))
          continue;
        Log.e("AdMobSDK", "Unhandled exception placing AdContainer into AdView.", localException);
        continue;
        label90: AdView.c(localException, localf);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.w
 * JD-Core Version:    0.6.0
 */