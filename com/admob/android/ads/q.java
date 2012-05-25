package com.admob.android.ads;

import android.os.Bundle;

public final class q
  implements i
{
  public String a;
  public boolean b;

  public q()
  {
    this.a = null;
    this.b = null;
  }

  public q(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }

  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    String str = this.a;
    localBundle.putString("u", str);
    boolean bool = this.b;
    localBundle.putBoolean("p", bool);
    return localBundle;
  }

  public final boolean equals(Object paramObject)
  {
    Object localObject1 = 1;
    Object localObject2 = null;
    boolean bool1 = paramObject instanceof q;
    Object localObject3;
    Object localObject4;
    if (bool1)
    {
      paramObject = (q)paramObject;
      localObject3 = this.a;
      if (localObject3 == null)
      {
        localObject3 = paramObject.a;
        if (localObject3 != null)
        {
          localObject3 = localObject1;
          localObject4 = this.a;
          if (localObject4 == null)
            break label134;
          localObject4 = this.a;
          String str = paramObject.a;
          localObject4 = ((String)localObject4).equals(str);
          if (localObject4 != 0)
            break label134;
          localObject4 = localObject1;
          label85: boolean bool2 = this.b;
          boolean bool3 = paramObject.b;
          if (bool2 == bool3)
            break label140;
          bool2 = localObject1;
          label107: if ((localObject3 != null) || (localObject4 != null) || (bool2 != null))
            break label146;
          localObject3 = localObject1;
        }
      }
    }
    while (true)
    {
      return localObject3;
      localObject3 = localObject2;
      break;
      label134: localObject4 = localObject2;
      break label85;
      label140: Object localObject5 = localObject2;
      break label107;
      label146: localObject3 = localObject2;
      continue;
      localObject3 = localObject2;
    }
  }

  public final int hashCode()
  {
    Object localObject = this.a;
    if (localObject != null);
    for (localObject = this.a.hashCode(); ; localObject = super.hashCode())
      return localObject;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.q
 * JD-Core Version:    0.6.0
 */