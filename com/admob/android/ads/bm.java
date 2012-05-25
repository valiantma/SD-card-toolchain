package com.admob.android.ads;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;

final class bm
  implements Runnable
{
  private WeakReference a;

  public bm(f paramf)
  {
    WeakReference localWeakReference = new WeakReference(paramf);
    this.a = localWeakReference;
  }

  public final void run()
  {
    try
    {
      Object localObject = this.a;
      this = (f)((WeakReference)localObject).get();
      if (this != null)
      {
        localObject = this.c;
        addView((View)localObject);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!bh.a("AdMobSDK", 6))
          continue;
        StringBuilder localStringBuilder = new StringBuilder().append("exception caught in AdContainer post run(), ");
        String str1 = localException.getMessage();
        String str2 = localException;
        Log.e("AdMobSDK", localException);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bm
 * JD-Core Version:    0.6.0
 */