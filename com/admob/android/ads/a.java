package com.admob.android.ads;

import org.json.JSONObject;

public final class a
{
  private static boolean a;

  static
  {
    boolean bool = a;
  }

  public static n a(String paramString1, String paramString2, b paramb)
  {
    Object localObject = paramString1;
    String str1 = paramString2;
    b localb = paramb;
    String str2 = null;
    localObject = a((String)localObject, null, str1, localb, 5000, str2);
    if (localObject != null)
      ((n)localObject).g();
    return (n)localObject;
  }

  public static n a(String paramString1, String paramString2, String paramString3)
  {
    return a(paramString1, paramString2, paramString3, null);
  }

  public static n a(String paramString1, String paramString2, String paramString3, b paramb)
  {
    String str1 = paramString1;
    String str2 = paramString2;
    String str3 = paramString3;
    b localb = paramb;
    return a(str1, str2, str3, localb, 5000, null);
  }

  public static n a(String paramString1, String paramString2, String paramString3, b paramb, int paramInt, String paramString4)
  {
    String str1 = paramString1;
    String str2 = paramString2;
    String str3 = paramString3;
    b localb = paramb;
    int i = paramInt;
    String str4 = paramString4;
    return new c(str1, str2, str3, localb, i, str4);
  }

  public static n a(String paramString1, String paramString2, String paramString3, JSONObject paramJSONObject, b paramb)
  {
    int i = 5000;
    if (paramJSONObject == null);
    for (String str1 = null; ; str1 = paramJSONObject.toString())
    {
      String str2 = paramString1;
      String str3 = paramString2;
      String str4 = paramString3;
      b localb = paramb;
      n localn = a(str2, str3, str4, localb, i, str1);
      localn.a("application/json");
      return localn;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.a
 * JD-Core Version:    0.6.0
 */