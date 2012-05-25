package com.android.vending.licensing;

import android.util.Log;

final class j
  implements Runnable
{
  j(f paramf)
  {
  }

  public final void run()
  {
    Log.i("LicenseChecker", "Check timed out.");
    s locals1 = this.a.a;
    a locala1 = f.a(this.a);
    s.a(locals1, locala1);
    s locals2 = this.a.a;
    a locala2 = f.a(this.a);
    s.b(locals2, locala2);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.j
 * JD-Core Version:    0.6.0
 */