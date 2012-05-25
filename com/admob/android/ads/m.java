package com.admob.android.ads;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class m
  implements b
{
  private final String a;
  private final String b;
  private final String c;
  private String d;
  private aj e;
  private HashSet f;
  private int g;

  public m(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = null;
    HashSet localHashSet = new HashSet();
    this.f = localHashSet;
    this.g = null;
  }

  private String a(String paramString, Map paramMap, boolean paramBoolean)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    int i;
    try
    {
      localStringBuilder1.append("rt=1&ex=1");
      Object localObject1 = localStringBuilder1.append("&a=");
      String str2 = this.a;
      ((StringBuilder)localObject1).append(str2);
      localObject1 = localStringBuilder1.append("&p=");
      String str3 = URLEncoder.encode(paramString, "UTF-8");
      ((StringBuilder)localObject1).append(str3);
      localObject1 = localStringBuilder1.append("&o=");
      String str4 = this.d;
      ((StringBuilder)localObject1).append(str4);
      localStringBuilder1.append("&v=").append("20101109-ANDROID-3312276cc1406347");
      localObject1 = System.currentTimeMillis();
      StringBuilder localStringBuilder2 = localStringBuilder1.append("&z").append("=");
      Object localObject2;
      long l2 = localObject2 / 1000L;
      StringBuilder localStringBuilder3 = localStringBuilder2.append(l2).append(".");
      long l1;
      localObject2 %= 1000L;
      localStringBuilder3.append(l1);
      localObject1 = localStringBuilder1.append("&h%5BHTTP_HOST%5D=");
      String str5 = URLEncoder.encode(this.c, "UTF-8");
      ((StringBuilder)localObject1).append(str5);
      localObject1 = localStringBuilder1.append("&h%5BHTTP_REFERER%5D=http%3A%2F%2F");
      String str6 = this.b;
      ((StringBuilder)localObject1).append(str6);
      if (paramBoolean)
      {
        localObject1 = "&startvisit=1";
        localStringBuilder1.append((String)localObject1);
      }
      if (paramMap != null)
      {
        localObject1 = paramMap.keySet();
        if (localObject1 != null)
        {
          localObject1 = ((Set)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            String str7 = (String)((Iterator)localObject1).next();
            StringBuilder localStringBuilder4 = localStringBuilder1.append("&").append(str7).append("=");
            String str8 = URLEncoder.encode((String)paramMap.get(str7));
            localStringBuilder4.append(str8);
          }
        }
      }
    }
    catch (UnsupportedEncodingException i)
    {
      i = 0;
    }
    while (true)
    {
      return i;
      String str1 = i.toString();
    }
  }

  private void b(n paramn)
  {
    this.f.remove(paramn);
  }

  public final void a(n paramn)
  {
    boolean bool = bh.a("AdMobSDK", 2);
    if (bool)
    {
      StringBuilder localStringBuilder = new StringBuilder().append("Analytics event ");
      String str1 = paramn.d();
      String str2 = str1 + " has been recorded.";
      Log.v("AdMobSDK", str2);
      int i = this.f.size();
      if (i > 0)
      {
        String str3 = "Pending Analytics requests: " + i;
        Log.v("AdMobSDK", i);
      }
    }
    b(paramn);
  }

  public final void a(n paramn, Exception paramException)
  {
    if (bh.a("AdMobSDK", 5))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("analytics request failed for ");
      String str1 = paramn.d();
      String str2 = str1;
      Log.w("AdMobSDK", str2, paramException);
    }
    b(paramn);
  }

  public final void a(String paramString, Map paramMap)
  {
    int i = 1;
    String str1 = this.c;
    if (str1 == null);
    while (true)
    {
      return;
      if (paramString != null)
      {
        int j = this.g;
        j++;
        this.g = j;
        j = this.g;
        if (j == i)
          j = i;
        while (true)
        {
          String str2 = a(paramString, paramMap, j);
          if (str2 == null)
            break label196;
          if (this.f != null)
          {
            String str3 = this.d;
            m localm = this;
            n localn = a.a("http://r.admob.com/ad_source.php", "AnalyticsData", str3, localm, 5000, str2);
            this.f.add(localn);
            localn.f();
          }
          if (!bh.a("AdMobSDK", 3))
            break;
          StringBuilder localStringBuilder = new StringBuilder().append("Analytics event ");
          String str4 = this.c;
          String str5 = str4 + "/" + paramString + " data:" + str2 + " has been recorded.";
          Log.d("AdMobSDK", str5);
          break;
          Object localObject = null;
        }
        label196: if (!bh.a("AdMobSDK", 6))
          continue;
        Log.e("AdMobSDK", "Could not create analytics URL.  Analytics data not tracked.");
        continue;
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.m
 * JD-Core Version:    0.6.0
 */