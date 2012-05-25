package com.admob.android.ads;

import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class o
  implements n
{
  private static Executor m = null;
  private static String n;
  protected String a;
  protected int b;
  protected Exception c;
  protected Map d;
  protected int e;
  protected int f;
  protected String g;
  protected b h;
  protected URL i;
  protected byte[] j;
  protected boolean k;
  protected String l;
  private String o;
  private Object p;

  protected o(String paramString1, String paramString2, b paramb, int paramInt, String paramString3)
  {
    this.c = i1;
    this.o = paramString1;
    this.g = paramString2;
    this.h = paramb;
    this.b = paramInt;
    this.d = i1;
    this.k = true;
    this.e = null;
    this.f = 3;
    if (paramString3 != null)
      this.l = paramString3;
    for (this.a = "application/x-www-form-urlencoded"; ; this.a = i1)
    {
      return;
      this.l = i1;
    }
  }

  public static String i()
  {
    Object localObject1 = n;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = new StringBuffer();
      localObject2 = Build.VERSION.RELEASE;
      int i1 = ((String)localObject2).length();
      if (i1 <= 0)
        break label220;
      ((StringBuffer)localObject1).append((String)localObject2);
      ((StringBuffer)localObject1).append("; ");
      localObject2 = Locale.getDefault();
      String str1 = ((Locale)localObject2).getLanguage();
      if (str1 == null)
        break label232;
      String str2 = str1.toLowerCase();
      ((StringBuffer)localObject1).append(str1);
      localObject2 = ((Locale)localObject2).getCountry();
      if (localObject2 != null)
      {
        ((StringBuffer)localObject1).append("-");
        localObject2 = ((String)localObject2).toLowerCase();
        ((StringBuffer)localObject1).append((String)localObject2);
      }
    }
    while (true)
    {
      localObject2 = Build.MODEL;
      if (((String)localObject2).length() > 0)
      {
        ((StringBuffer)localObject1).append("; ");
        ((StringBuffer)localObject1).append((String)localObject2);
      }
      localObject2 = Build.ID;
      if (((String)localObject2).length() > 0)
      {
        ((StringBuffer)localObject1).append(" Build/");
        ((StringBuffer)localObject1).append((String)localObject2);
      }
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localObject1;
      arrayOfObject[1] = "20101109";
      n = String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2 (AdMob-ANDROID-%s)", arrayOfObject);
      if (bh.a("AdMobSDK", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder().append("Phone's user-agent is:  ");
        String str3 = n;
        String str4 = str3;
        Log.d("AdMobSDK", str4);
      }
      return n;
      label220: localObject2 = "1.0";
      ((StringBuffer)localObject1).append((String)localObject2);
      break;
      label232: localObject2 = "en";
      ((StringBuffer)localObject1).append((String)localObject2);
    }
  }

  public final void a(b paramb)
  {
    this.h = paramb;
  }

  public final void a(Object paramObject)
  {
    this.p = paramObject;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final byte[] c()
  {
    return this.j;
  }

  public final String d()
  {
    return this.o;
  }

  public final URL e()
  {
    return this.i;
  }

  public final void f()
  {
    if (m == null)
      m = Executors.newCachedThreadPool();
    m.execute(this);
  }

  public final void g()
  {
    this.f = 1;
  }

  public final Object h()
  {
    return this.p;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.o
 * JD-Core Version:    0.6.0
 */