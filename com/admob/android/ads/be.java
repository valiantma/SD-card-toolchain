package com.admob.android.ads;

public enum be
{
  private String d;

  static
  {
    be[] arrayOfbe = new be[3];
    be localbe1 = a;
    arrayOfbe[0] = localbe1;
    be localbe2 = b;
    arrayOfbe[1] = localbe2;
    be localbe3 = c;
    arrayOfbe[2] = localbe3;
    e = arrayOfbe;
  }

  private be(String arg3)
  {
    Object localObject;
    this.d = localObject;
  }

  public static be a(int paramInt)
  {
    Object localObject1 = c;
    be[] arrayOfbe = values();
    int i = arrayOfbe.length;
    Object localObject2 = null;
    Object localObject3 = localObject1;
    localObject1 = localObject2;
    while (localObject1 < i)
    {
      be localbe = arrayOfbe[localObject1];
      if (localbe.ordinal() == paramInt)
        localObject3 = localbe;
      localObject1++;
    }
    return (be)localObject3;
  }

  public final String toString()
  {
    return this.d;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.be
 * JD-Core Version:    0.6.0
 */