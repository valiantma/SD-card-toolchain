package com.admob.android.ads;

final class u
{
  public static final u a = new u(320, 48);
  private int b;
  private int c;

  static
  {
    u localu1 = new u(320, 270);
    u localu2 = new u(748, 110);
    u localu3 = new u(488, 80);
  }

  private u(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = String.valueOf(this.b);
    localStringBuilder.append(str1);
    localStringBuilder.append("x");
    String str2 = String.valueOf(this.c);
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.u
 * JD-Core Version:    0.6.0
 */