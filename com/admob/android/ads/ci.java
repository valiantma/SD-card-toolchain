package com.admob.android.ads;

public enum ci
{
  private String k;

  static
  {
    a = new ci("CLICK_TO_BROWSER", 3, "url");
    h = new ci("CLICK_TO_CALL", 4, "call");
    i = new ci("CLICK_TO_MUSIC", 5, "itunes");
    b = new ci("CLICK_TO_CANVAS", 6, "canvas");
    j = new ci("CLICK_TO_CONTACT", 7, "contact");
    c = new ci("CLICK_TO_INTERACTIVE_VIDEO", 8, "movie");
    d = new ci("CLICK_TO_FULLSCREEN_BROWSER", 9, "screen");
    ci[] arrayOfci = new ci[10];
    ci localci1 = e;
    arrayOfci[0] = localci1;
    ci localci2 = f;
    arrayOfci[1] = localci2;
    ci localci3 = g;
    arrayOfci[2] = localci3;
    ci localci4 = a;
    arrayOfci[3] = localci4;
    ci localci5 = h;
    arrayOfci[4] = localci5;
    ci localci6 = i;
    arrayOfci[5] = localci6;
    ci localci7 = b;
    arrayOfci[6] = localci7;
    ci localci8 = j;
    arrayOfci[7] = localci8;
    ci localci9 = c;
    arrayOfci[8] = localci9;
    ci localci10 = d;
    arrayOfci[9] = localci10;
    l = arrayOfci;
  }

  private ci(String arg3)
  {
    Object localObject;
    this.k = localObject;
  }

  public static ci a(String paramString)
  {
    int m = 0;
    ci[] arrayOfci = values();
    int n = arrayOfci.length;
    Object localObject2 = null;
    while (true)
    {
      Object localObject1;
      if (localObject2 < n)
      {
        ci localci = arrayOfci[localObject2];
        if (localci.toString().equals(paramString))
          localObject1 = localci;
      }
      else
      {
        return localObject1;
      }
      localObject2++;
    }
  }

  public final String toString()
  {
    return this.k;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ci
 * JD-Core Version:    0.6.0
 */