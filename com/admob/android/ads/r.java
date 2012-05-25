package com.admob.android.ads;

import android.content.Context;
import com.admob.android.ads.a.a;
import org.json.JSONObject;

public final class r extends a
{
  public JSONObject a = null;
  public JSONObject b = null;
  private boolean e = null;

  public r(Context paramContext, e parame)
  {
    super(paramContext, null, null);
    bu localbu = new bu(this, parame);
    this.d = localbu;
    ba localba = this.d;
    setWebViewClient(localba);
  }

  public final void a_()
  {
    boolean bool1 = true;
    boolean bool2 = this.d instanceof bu;
    Object localObject1;
    if (bool2)
    {
      bool2 = ((bu)this.d).c;
      if (bool2)
      {
        bool2 = this.e;
        if (!bool2)
        {
          this.e = bool1;
          localObject1 = this.a;
          if (localObject1 != null)
            break label92;
          localObject1 = "null";
          localObject2 = this.b;
          if (localObject2 != null)
            break label100;
        }
      }
    }
    label92: label100: for (Object localObject2 = "null"; ; localObject2 = this.b)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localObject1;
      arrayOfObject[bool1] = localObject2;
      a("init", arrayOfObject);
      return;
      localObject1 = this.a;
      break;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.r
 * JD-Core Version:    0.6.0
 */