package com.admob.android.ads;

import java.util.TimerTask;

final class bs extends TimerTask
{
  bs(bu parambu)
  {
  }

  public final void run()
  {
    if (!this.a.b)
    {
      this.a.b = true;
      if (this.a.d != null)
        this.a.d.a(null);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bs
 * JD-Core Version:    0.6.0
 */