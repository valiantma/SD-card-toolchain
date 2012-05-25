package com.admob.android.ads;

import android.app.Activity;
import android.view.KeyEvent;
import com.admob.android.ads.a.a;
import java.lang.ref.WeakReference;

public final class s extends a
{
  String a;
  boolean b = true;
  private ad e;

  public s(Activity paramActivity, String paramString, ad paramad)
  {
    super(paramActivity, null, localWeakReference);
    this.a = paramString;
    this.e = paramad;
  }

  protected final ba a(WeakReference paramWeakReference)
  {
    return new bt(this, this, paramWeakReference);
  }

  public final void a()
  {
    if (this.e != null)
      this.e.a();
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 4;
    if (paramInt == i)
    {
      a();
      i = 1;
    }
    while (true)
    {
      return i;
      boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.s
 * JD-Core Version:    0.6.0
 */