package com.admob.android.ads;

import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;

public final class cc
  implements View.OnClickListener
{
  private WeakReference a;
  private boolean b;

  public cc(bd parambd, boolean paramBoolean)
  {
    WeakReference localWeakReference = new WeakReference(parambd);
    this.a = localWeakReference;
    this.b = paramBoolean;
  }

  public final void onClick(View paramView)
  {
    bd localbd = (bd)this.a.get();
    if (localbd == null);
    while (true)
    {
      return;
      if (this.b)
        localbd.f.a("skip", null);
      localbd.c();
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.cc
 * JD-Core Version:    0.6.0
 */