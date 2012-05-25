package com.rafoid.multimountsdcard.widget;

import android.content.res.Resources;
import com.rafoid.core.a;

final class h
  implements Runnable
{
  h(MultiMountSDCardConfigure paramMultiMountSDCardConfigure)
  {
  }

  public final void run()
  {
    if (!a.a())
    {
      MultiMountSDCardConfigure localMultiMountSDCardConfigure = this.a;
      String str1 = this.a.getResources().getString(2131099675);
      String str2 = this.a.getResources().getString(2131099648);
      Boolean localBoolean = Boolean.valueOf(true);
      a.a(localMultiMountSDCardConfigure, 2130837504, str1, str2, localBoolean, MultiMountSDCardConfigure.class);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.h
 * JD-Core Version:    0.6.0
 */