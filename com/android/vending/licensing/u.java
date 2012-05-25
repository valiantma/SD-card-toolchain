package com.android.vending.licensing;

import android.text.TextUtils;

final class u
{
  public int a;
  public int b;
  public String c;
  public String d;
  public String e;
  public long f;
  public String g;

  public final String toString()
  {
    Object[] arrayOfObject = new Object[6];
    Integer localInteger1 = Integer.valueOf(this.a);
    arrayOfObject[0] = localInteger1;
    Integer localInteger2 = Integer.valueOf(this.b);
    arrayOfObject[1] = localInteger2;
    String str1 = this.c;
    arrayOfObject[2] = str1;
    String str2 = this.d;
    arrayOfObject[3] = str2;
    String str3 = this.e;
    arrayOfObject[4] = str3;
    Long localLong = Long.valueOf(this.f);
    arrayOfObject[5] = localLong;
    return TextUtils.join("|", arrayOfObject);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.u
 * JD-Core Version:    0.6.0
 */