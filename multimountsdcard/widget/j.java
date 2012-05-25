package com.rafoid.multimountsdcard.widget;

import android.app.Dialog;

final class j
  implements Runnable
{
  j(MultiMountSDCardConfigure paramMultiMountSDCardConfigure)
  {
  }

  public final void run()
  {
    MultiMountSDCardConfigure localMultiMountSDCardConfigure = this.a;
    String str = MultiMountSDCardConfigure.a(this.a);
    MultiMountSDCardConfigure.a(localMultiMountSDCardConfigure, str).show();
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.j
 * JD-Core Version:    0.6.0
 */