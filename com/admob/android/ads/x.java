package com.admob.android.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public final class x
  implements i
{
  public String a;
  public String b;
  public int c;
  public int d;
  public String e;
  public String f;
  public double g;
  public String h;
  public String i;
  public boolean j = null;
  public String k;
  public String l;
  public Vector m;

  public x()
  {
    Vector localVector = new Vector();
    this.m = localVector;
  }

  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    String str1 = this.a;
    localBundle.putString("u", str1);
    str1 = this.b;
    localBundle.putString("t", str1);
    int n = this.c;
    localBundle.putInt("c", n);
    n = this.d;
    localBundle.putInt("msm", n);
    String str2 = this.e;
    localBundle.putString("s", str2);
    str2 = this.f;
    localBundle.putString("sin", str2);
    long l1 = this.g;
    localBundle.putDouble("sd", l1);
    str2 = this.h;
    localBundle.putString("skd", str2);
    str2 = this.i;
    localBundle.putString("sku", str2);
    String str3 = "nosk";
    boolean bool = this.j;
    if (bool)
      bool = true;
    while (true)
    {
      localBundle.putByte(str3, bool);
      String str4 = this.k;
      localBundle.putString("rd", bool);
      String str5 = this.l;
      localBundle.putString("ru", bool);
      ArrayList localArrayList = ae.a(this.m);
      localBundle.putParcelableArrayList("b", bool);
      return localBundle;
      Object localObject = null;
    }
  }

  public final boolean a(Bundle paramBundle)
  {
    Object localObject1 = 1;
    Object localObject2 = null;
    Object localObject3;
    if (paramBundle == null)
      localObject3 = localObject2;
    while (true)
    {
      return localObject3;
      localObject3 = paramBundle.getString("u");
      this.a = ((String)localObject3);
      localObject3 = paramBundle.getString("t");
      this.b = ((String)localObject3);
      localObject3 = paramBundle.getInt("c");
      this.c = localObject3;
      localObject3 = paramBundle.getInt("msm");
      this.d = localObject3;
      localObject3 = paramBundle.getString("s");
      this.e = ((String)localObject3);
      localObject3 = paramBundle.getString("sin");
      this.f = ((String)localObject3);
      localObject3 = paramBundle.getDouble("sd");
      Object localObject4;
      this.g = localObject4;
      localObject3 = paramBundle.getString("skd");
      this.h = ((String)localObject3);
      localObject3 = paramBundle.getString("sku");
      this.i = ((String)localObject3);
      localObject3 = ab.a(paramBundle.getByte("nosk"));
      this.j = localObject3;
      localObject3 = paramBundle.getString("rd");
      this.k = ((String)localObject3);
      localObject3 = paramBundle.getString("ru");
      this.l = ((String)localObject3);
      this.m = null;
      localObject3 = paramBundle.getParcelableArrayList("b");
      if (localObject3 != null)
      {
        Vector localVector = new Vector();
        Iterator localIterator = ((ArrayList)localObject3).iterator();
        label399: 
        while (true)
        {
          localObject3 = localIterator.hasNext();
          if (localObject3 == 0)
            break;
          localObject3 = (Bundle)localIterator.next();
          if (localObject3 == null)
            continue;
          z localz = new z();
          if (localObject3 == null)
            localObject3 = localObject2;
          while (true)
          {
            if (localObject3 == null)
              break label399;
            localVector.add(localz);
            break;
            String str1 = ((Bundle)localObject3).getString("ad");
            localz.a = str1;
            String str2 = ((Bundle)localObject3).getString("au");
            localz.b = str2;
            String str3 = ((Bundle)localObject3).getString("t");
            localz.c = str3;
            ab localab = localz.d;
            Bundle localBundle = ((Bundle)localObject3).getBundle("oi");
            if (!localab.a(localBundle))
            {
              localObject3 = localObject2;
              continue;
            }
            String str4 = ((Bundle)localObject3).getString("ap");
            localz.e = str4;
            localObject3 = ((Bundle)localObject3).getString("json");
            localz.f = ((String)localObject3);
            localObject3 = localObject1;
          }
        }
        this.m = localVector;
      }
      localObject3 = localObject1;
    }
  }

  public final boolean b()
  {
    int n = this.c;
    if (n != 0)
    {
      Object localObject1 = this.m;
      if (localObject1 != null)
      {
        localObject1 = this.m.size();
        if (localObject1 != 0)
          break label34;
      }
    }
    int i1 = 1;
    while (true)
    {
      return i1;
      label34: Object localObject2 = null;
    }
  }

  public final boolean c()
  {
    Object localObject1 = this.f;
    int n;
    if (localObject1 != null)
    {
      localObject1 = this.f.length();
      if (localObject1 > 0)
      {
        double d1 = this.g < 0L;
        if (localObject1 > 0)
          n = 1;
      }
    }
    while (true)
    {
      return n;
      Object localObject2 = null;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.x
 * JD-Core Version:    0.6.0
 */