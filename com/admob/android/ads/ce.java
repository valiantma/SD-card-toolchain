package com.admob.android.ads;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;

public final class ce
  implements View.OnClickListener
{
  private WeakReference a;

  public ce(bd parambd)
  {
    WeakReference localWeakReference = new WeakReference(parambd);
    this.a = localWeakReference;
  }

  public final void onClick(View paramView)
  {
    this = (bd)this.a.get();
    if (this == null);
    while (true)
    {
      return;
      this.f.a("replay", null);
      if (this.d != null)
        bd.b(this.d);
      bd.b(this);
      this.h = true;
      Context localContext = getContext();
      bd.a(this, localContext);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ce
 * JD-Core Version:    0.6.0
 */