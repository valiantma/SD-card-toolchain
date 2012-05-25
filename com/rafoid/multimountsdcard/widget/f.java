package com.rafoid.multimountsdcard.widget;

import android.app.ProgressDialog;

final class f
  implements Runnable
{
  f(MultiMountSDCardConfigure paramMultiMountSDCardConfigure)
  {
  }

  public final void run()
  {
    MultiMountSDCardConfigure.b(this.a).dismiss();
    if (MultiMountSDCardConfigure.a(this.a).length() > 0)
    {
      MultiMountSDCardConfigure localMultiMountSDCardConfigure = this.a;
      Runnable localRunnable = MultiMountSDCardConfigure.c(this.a);
      localMultiMountSDCardConfigure.runOnUiThread(localRunnable);
    }
    while (true)
    {
      return;
      this.a.a();
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.f
 * JD-Core Version:    0.6.0
 */