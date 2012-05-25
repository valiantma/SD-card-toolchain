package com.android.vending.licensing;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public final class l
  implements q
{
  private long a;
  private long b;
  private long c;
  private long d;
  private long e = 0L;
  private t f;
  private d g;

  public l(Context paramContext, g paramg)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.android.vending.licensing.ServerManagedPolicy", 0);
    d locald1 = new d(localSharedPreferences, paramg);
    this.g = locald1;
    d locald2 = this.g;
    String str = t.c.toString();
    t localt = t.valueOf(locald2.b("lastResponse", str));
    this.f = localt;
    long l1 = Long.parseLong(this.g.b("validityTimestamp", "0"));
    Object localObject1;
    this.a = localObject1;
    long l2 = Long.parseLong(this.g.b("retryUntil", "0"));
    Object localObject2;
    this.b = localObject2;
    long l3 = Long.parseLong(this.g.b("maxRetries", "0"));
    Object localObject3;
    this.c = localObject3;
    long l4 = Long.parseLong(this.g.b("retryCount", "0"));
    Object localObject4;
    this.d = localObject4;
  }

  private void a(long paramLong)
  {
    this.d = paramLong;
    d locald = this.g;
    String str = Long.toString(paramLong);
    locald.a("retryCount", str);
  }

  private void a(String paramString)
  {
    try
    {
      Long localLong1 = Long.valueOf(Long.parseLong(paramString));
      str = paramString;
      long l = localLong1.longValue();
      Object localObject;
      this.a = localObject;
      this.g.a("validityTimestamp", str);
      return;
    }
    catch (NumberFormatException localLong2)
    {
      while (true)
      {
        Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
        Long localLong2 = Long.valueOf(System.currentTimeMillis() + -5536L);
        String str = Long.toString(localLong2.longValue());
      }
    }
  }

  private void b(String paramString)
  {
    try
    {
      Long localLong1 = Long.valueOf(Long.parseLong(paramString));
      str = paramString;
      long l = localLong1.longValue();
      Object localObject2;
      this.b = localObject2;
      this.g.a("retryUntil", str);
      return;
    }
    catch (NumberFormatException localObject1)
    {
      while (true)
      {
        Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
        Long localLong2 = Long.valueOf(0L);
        String str = "0";
        Object localObject1 = localLong2;
      }
    }
  }

  private void c(String paramString)
  {
    try
    {
      Long localLong1 = Long.valueOf(Long.parseLong(paramString));
      str = paramString;
      long l = localLong1.longValue();
      Object localObject2;
      this.c = localObject2;
      this.g.a("maxRetries", str);
      return;
    }
    catch (NumberFormatException localObject1)
    {
      while (true)
      {
        Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
        Long localLong2 = Long.valueOf(0L);
        String str = "0";
        Object localObject1 = localLong2;
      }
    }
  }

  private static Map d(String paramString)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      String str1 = "?" + paramString;
      Iterator localIterator = URLEncodedUtils.parse(new URI(str1), "UTF-8").iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          return localHashMap;
        NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
        String str2 = localNameValuePair.getName();
        String str3 = localNameValuePair.getValue();
        localHashMap.put(str2, str3);
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      while (true)
        Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
    }
  }

  public final void a(t paramt, u paramu)
  {
    t localt1 = t.c;
    if (paramt != localt1)
    {
      a(0L);
      t localt2 = t.a;
      if (paramt != localt2)
        break label165;
      Map localMap = d(paramu.g);
      this.f = paramt;
      String str1 = (String)localMap.get("VT");
      a(str1);
      String str2 = (String)localMap.get("GT");
      b(str2);
      String str3 = (String)localMap.get("GR");
      c(str3);
    }
    while (true)
    {
      long l1 = System.currentTimeMillis();
      Object localObject;
      this.e = localObject;
      this.f = paramt;
      d locald = this.g;
      String str4 = paramt.toString();
      locald.a("lastResponse", str4);
      this.g.a();
      return;
      long l2 = this.d + 1L;
      a(l2);
      break;
      label165: t localt3 = t.b;
      if (paramt != localt3)
        continue;
      a("0");
      b("0");
      c("0");
    }
  }

  public final boolean a()
  {
    return true;
    long l1 = 1;
    long l2 = 0;
    long l3 = System.currentTimeMillis();
    t localt1 = this.f;
    t localt2 = t.a;
    long l5;
    if (localt1 == localt2)
    {
      long l4 = this.a;
      Object localObject;
      localObject <= l4;
      if (l3 > 0)
        break label135;
      l3 = l1;
    }
    while (true)
    {
      return l3;
      t localt3 = this.f;
      t localt4 = t.c;
      if (localt3 == localt4)
      {
        long l6 = this.e + -5536L;
        if (l5 < l6)
        {
          long l7 = this.b;
          l5 <= l7;
          if (l3 > 0)
          {
            l5 = this.d;
            long l8 = this.c;
            l5 <= l8;
            if (l3 > 0)
            {
              l3 = l2;
              continue;
            }
          }
          l3 = l1;
          continue;
        }
      }
      label135: l3 = l2;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.l
 * JD-Core Version:    0.6.0
 */