package com.admob.android.ads;

import java.lang.ref.WeakReference;

final class bo
  implements Runnable
{
  private WeakReference a;

  public bo(f paramf)
  {
    WeakReference localWeakReference = new WeakReference(paramf);
    this.a = localWeakReference;
  }

  public final void run()
  {
    try
    {
      this = (f)this.a.get();
      if (this != null)
        f();
      label19: return;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bo
 * JD-Core Version:    0.6.0
 */