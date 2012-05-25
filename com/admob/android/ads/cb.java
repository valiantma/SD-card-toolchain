package com.admob.android.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.lang.ref.WeakReference;

public final class cb
  implements View.OnTouchListener
{
  private WeakReference a;

  public cb(bd parambd)
  {
    WeakReference localWeakReference = new WeakReference(parambd);
    this.a = localWeakReference;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    Object localObject1 = null;
    Object localObject2 = this.a;
    this = (bd)((WeakReference)localObject2).get();
    if (this == null);
    for (localObject2 = localObject1; ; localObject2 = localObject1)
    {
      return localObject2;
      bd.b(this);
      bd.a(this, paramMotionEvent);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.cb
 * JD-Core Version:    0.6.0
 */