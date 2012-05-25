package com.admob.android.ads;

import java.lang.ref.WeakReference;

final class bj
  implements Runnable
{
  private WeakReference a;

  public bj(br parambr)
  {
    WeakReference localWeakReference = new WeakReference(parambr);
    this.a = localWeakReference;
  }

  public final void run()
  {
    this = (br)this.a.get();
    if (this != null)
      b();
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bj
 * JD-Core Version:    0.6.0
 */