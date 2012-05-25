package com.admob.android.ads;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

final class ac extends Thread
{
  private WeakReference a;

  public ac(AdView paramAdView)
  {
    WeakReference localWeakReference = new WeakReference(paramAdView);
    this.a = localWeakReference;
  }

  public final void run()
  {
    WeakReference localWeakReference = this.a;
    this = (AdView)localWeakReference.get();
    if (this != null);
    try
    {
      Context localContext = getContext();
      f localf = new f(localContext, this);
      float f1 = getMeasuredWidth();
      float f2 = f.c();
      int i = (int)(f1 / f2);
      Object localObject1 = AdView.c(this);
      String str1 = AdView.d(this);
      String str2 = AdView.e(this);
      int j = a();
      int k = b();
      int m = c();
      ch localch = d();
      u localu = e();
      localObject1 = k.a((h)localObject1, localContext, str1, str2, j, k, m, localf, i, localch, null, localu);
      if (localObject1 == null)
        AdView.f(this);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (bh.a("AdMobSDK", 6))
          Log.e("AdMobSDK", "Unhandled exception requesting a fresh ad.", localException);
        AdView.f(this);
        AdView.g(this);
        AdView.h(this);
      }
    }
    finally
    {
      AdView.g(this);
      AdView.h(this);
    }
    throw localObject2;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ac
 * JD-Core Version:    0.6.0
 */