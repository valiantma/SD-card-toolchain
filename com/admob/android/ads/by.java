package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class by
  implements View.OnClickListener
{
  private WeakReference a;
  private WeakReference b;
  private WeakReference c;

  public by(bd parambd, z paramz, WeakReference paramWeakReference)
  {
    WeakReference localWeakReference1 = new WeakReference(parambd);
    this.a = localWeakReference1;
    WeakReference localWeakReference2 = new WeakReference(paramz);
    this.b = localWeakReference2;
    this.c = paramWeakReference;
  }

  public final void onClick(View paramView)
  {
    Object localObject1 = null;
    bd localbd = (bd)this.a.get();
    if (localbd == null);
    Object localObject2;
    do
    {
      return;
      bd.b(localbd);
      localObject2 = (z)this.b.get();
    }
    while (localObject2 == null);
    Context localContext = localbd.getContext();
    boolean bool = localbd.j;
    Object localObject3;
    if (!bool)
    {
      localbd.j = true;
      localObject3 = new HashMap();
      ((Map)localObject3).put("event", "interaction");
    }
    while (true)
    {
      while (true)
      {
        m localm = localbd.f;
        String str = ((z)localObject2).e;
        localm.a(str, (Map)localObject3);
        localObject3 = localbd.e();
        if (localObject3 != 0)
          localbd.f();
        localbd.a(localObject3);
        localObject3 = new ad();
        try
        {
          localObject2 = ((z)localObject2).f;
          JSONObject localJSONObject = new JSONObject((String)localObject2);
          localObject2 = null;
          ((ad)localObject3).a(localContext, localJSONObject, (ai)localObject2);
          ((ad)localObject3).b();
          if (this.c == null)
            break;
          this = (Activity)this.c.get();
          if (this == null)
            break;
          ((ad)localObject3).a(this, localbd);
        }
        catch (JSONException localJSONException)
        {
          while (true)
          {
            if (!bh.a("AdMobSDK", 6))
              continue;
            Log.e("AdMobSDK", "Could not create JSONObject from button click", localJSONException);
          }
        }
      }
      localObject3 = localObject1;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.by
 * JD-Core Version:    0.6.0
 */