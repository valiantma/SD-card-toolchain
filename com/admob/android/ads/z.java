package com.admob.android.ads;

import android.os.Bundle;

public final class z
  implements i
{
  public String a;
  public String b;
  public String c;
  public ab d;
  public String e;
  public String f;

  public z()
  {
    ab localab = new ab();
    this.d = localab;
  }

  public final Bundle a()
  {
    Bundle localBundle1 = new Bundle();
    String str1 = this.a;
    localBundle1.putString("ad", str1);
    String str2 = this.b;
    localBundle1.putString("au", str2);
    String str3 = this.c;
    localBundle1.putString("t", str3);
    Bundle localBundle2 = ae.a(this.d);
    localBundle1.putBundle("oi", localBundle2);
    String str4 = this.e;
    localBundle1.putString("ap", str4);
    String str5 = this.f;
    localBundle1.putString("json", str5);
    return localBundle1;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.z
 * JD-Core Version:    0.6.0
 */