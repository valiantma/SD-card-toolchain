package com.rafoid.multimountsdcard.widget;

import android.content.Intent;
import com.android.vending.licensing.p;
import com.android.vending.licensing.v;

final class b
  implements p
{
  private b(MultiMountSDCardConfigure paramMultiMountSDCardConfigure, byte paramByte)
  {
  }

  public final void a()
  {
    if (this.a.isFinishing());
    while (true)
    {
      return;
      MultiMountSDCardConfigure localMultiMountSDCardConfigure = this.a;
      this.a.getString(2131099653);
      MultiMountSDCardConfigure.d(localMultiMountSDCardConfigure);
    }
  }

  public final void a(v paramv)
  {
    if (this.a.isFinishing());
    while (true)
    {
      return;
      String str = this.a.getString(2131099654);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramv;
      String.format(str, arrayOfObject);
      MultiMountSDCardConfigure.d(this.a);
    }
  }

  public final void b()
  {
    int i = 0;
    if (this.a.isFinishing());
    while (true)
    {
      return;
      MultiMountSDCardConfigure localMultiMountSDCardConfigure1 = this.a;
      Intent localIntent = MultiMountSDCardConfigure.e(this.a);
      localMultiMountSDCardConfigure1.setResult(i, localIntent);
      MultiMountSDCardConfigure localMultiMountSDCardConfigure2 = this.a;
      this.a.getString(2131099652);
      MultiMountSDCardConfigure.d(localMultiMountSDCardConfigure2);
      this.a.showDialog(i);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.b
 * JD-Core Version:    0.6.0
 */