package com.android.vending.licensing;

import android.util.Log;
import java.security.PublicKey;
import java.util.Set;

final class k
  implements Runnable
{
  k(f paramf, int paramInt, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    Log.i("LicenseChecker", "Received response.");
    Set localSet = s.b(this.a.a);
    a locala1 = f.a(this.a);
    if (localSet.contains(locala1))
    {
      f.b(this.a);
      a locala2 = f.a(this.a);
      PublicKey localPublicKey = s.c(this.a.a);
      int i = this.b;
      String str1 = this.c;
      String str2 = this.d;
      locala2.a(localPublicKey, i, str1, str2);
      s locals = this.a.a;
      a locala3 = f.a(this.a);
      s.b(locals, locala3);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.k
 * JD-Core Version:    0.6.0
 */