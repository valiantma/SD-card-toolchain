package com.admob.android.ads;

import java.lang.ref.WeakReference;

final class ck
  implements Runnable
{
  private WeakReference a;

  public ck(bd parambd)
  {
    WeakReference localWeakReference = new WeakReference(parambd);
    this.a = localWeakReference;
  }

  public final void run()
  {
    this = (bd)this.a.get();
    if (this != null)
    {
      bd.a(this);
      d();
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ck
 * JD-Core Version:    0.6.0
 */