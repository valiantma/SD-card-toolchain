package com.android.vending.licensing;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

public final class d
{
  private final SharedPreferences a;
  private final g b;
  private SharedPreferences.Editor c;

  public d(SharedPreferences paramSharedPreferences, g paramg)
  {
    this.a = paramSharedPreferences;
    this.b = paramg;
    this.c = null;
  }

  public final void a()
  {
    if (this.c != null)
    {
      this.c.commit();
      this.c = null;
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    if (this.c == null)
    {
      SharedPreferences.Editor localEditor = this.a.edit();
      this.c = localEditor;
    }
    String str = this.b.a(paramString2);
    this.c.putString(paramString1, str);
  }

  public final String b(String paramString1, String paramString2)
  {
    String str1 = this.a.getString(paramString1, null);
    if (str1 != null);
    while (true)
    {
      try
      {
        str1 = this.b.b(str1);
        return str1;
      }
      catch (n str2)
      {
        str2 = "PreferenceObfuscator";
        String str3 = "Validation error while reading preference: " + paramString1;
        Log.w(str2, str3);
      }
      String str2 = paramString2;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.d
 * JD-Core Version:    0.6.0
 */