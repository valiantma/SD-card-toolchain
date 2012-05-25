package com.admob.android.ads;

import android.widget.VideoView;
import java.lang.ref.WeakReference;

final class bz
  implements Runnable
{
  private WeakReference a;

  public bz(bd parambd)
  {
    WeakReference localWeakReference = new WeakReference(parambd);
    this.a = localWeakReference;
  }

  public final void run()
  {
    this = (bd)this.a.get();
    if (this == null);
    while (true)
    {
      return;
      if (this.e != null)
      {
        this.e.setVisibility(0);
        this.e.requestLayout();
        this.e.requestFocus();
        this.e.start();
        continue;
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bz
 * JD-Core Version:    0.6.0
 */