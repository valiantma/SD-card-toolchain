package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ad
  implements bp
{
  public ab a;
  private Vector b;
  private ai c;
  private PopupWindow d;

  public ad()
  {
    ab localab = new ab();
    this.a = localab;
    Vector localVector = new Vector();
    this.b = localVector;
    ai localai = new ai(this);
    this.c = localai;
    this.d = null;
  }

  private static Bundle a(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    Iterator localIterator;
    Object localObject2;
    if (paramJSONObject != null)
    {
      localIterator = paramJSONObject.keys();
      boolean bool = localIterator.hasNext();
      if (!bool)
        break label83;
      localObject1 = new Bundle();
      localObject2 = localObject1;
    }
    while (true)
    {
      localObject1 = localIterator.hasNext();
      if (localObject1 != 0)
      {
        localObject1 = (String)localIterator.next();
        Object localObject3 = paramJSONObject.opt((String)localObject1);
        if ((localObject1 == null) || (localObject3 == null))
          continue;
        a(localObject2, (String)localObject1, localObject3);
        continue;
      }
      localObject1 = localObject2;
      return localObject1;
      label83: localObject2 = localObject1;
    }
  }

  private void a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Iterator localIterator = this.b.iterator();
    while (true)
    {
      if (localIterator.hasNext())
      {
        this = (Intent)localIterator.next();
        if (localPackageManager.resolveActivity(this, 65536) == null)
          continue;
      }
      try
      {
        paramContext.startActivity(this);
        while (true)
        {
          return;
          if (bh.a("AdMobSDK", 6))
          {
            Log.e("AdMobSDK", "Could not find a resolving intent on ad click");
            continue;
          }
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  private void a(Context paramContext, String paramString)
  {
    Intent localIntent = b(paramContext, paramString);
    a(localIntent);
  }

  private void a(Intent paramIntent)
  {
    if (paramIntent != null)
      this.b.add(paramIntent);
  }

  private static void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    int i = 6;
    int j = 0;
    if ((paramString == null) || (paramObject == null));
    while (true)
    {
      return;
      boolean bool1 = paramObject instanceof String;
      if (bool1)
      {
        String str1 = (String)paramObject;
        paramBundle.putString(paramString, paramObject);
        continue;
      }
      bool1 = paramObject instanceof Integer;
      if (bool1)
      {
        int k = ((Integer)paramObject).intValue();
        paramBundle.putInt(paramString, k);
        continue;
      }
      bool1 = paramObject instanceof Boolean;
      if (bool1)
      {
        boolean bool2 = ((Boolean)paramObject).booleanValue();
        paramBundle.putBoolean(paramString, bool2);
        continue;
      }
      bool1 = paramObject instanceof Double;
      if (bool1)
      {
        double d1 = ((Double)paramObject).doubleValue();
        Object localObject2;
        paramBundle.putDouble(paramString, localObject2);
        continue;
      }
      bool1 = paramObject instanceof Long;
      if (bool1)
      {
        long l1 = ((Long)paramObject).longValue();
        Object localObject3;
        paramBundle.putLong(paramString, localObject3);
        continue;
      }
      bool1 = paramObject instanceof JSONObject;
      if (bool1)
      {
        Bundle localBundle = a((JSONObject)paramObject);
        paramBundle.putBundle(paramString, localBundle);
        continue;
      }
      bool1 = paramObject instanceof JSONArray;
      if (!bool1)
        continue;
      paramObject = (JSONArray)paramObject;
      if ((paramString == null) || (paramObject == null))
        continue;
      Object localObject1 = new Vector();
      int m = paramObject.length();
      int n = j;
      while (n < m)
        try
        {
          Object localObject6 = paramObject.get(n);
          ((Vector)localObject1).add(localObject6);
          n++;
        }
        catch (JSONException str2)
        {
          boolean bool4 = bh.a("AdMobSDK", i);
          if (!bool4)
            break;
          String str2 = "AdMobSDK";
          Log.e(str2, "couldn't read bundle array while adding extras");
        }
      if (m == 0)
        continue;
      m = 0;
      Object localObject4;
      try
      {
        localObject4 = ((Vector)localObject1).get(m);
        i1 = localObject4 instanceof String;
        if (i1 == 0)
          break label369;
        String[] arrayOfString1 = new String[null];
        String[] arrayOfString2 = (String[])((Vector)localObject1).toArray(arrayOfString1);
        paramBundle.putStringArray(paramString, localObject1);
      }
      catch (ArrayStoreException localArrayStoreException)
      {
      }
      if (!bh.a("AdMobSDK", i))
        continue;
      Log.e("AdMobSDK", "Couldn't read in array when making extras");
      continue;
      label369: int i1 = localObject4 instanceof Integer;
      if (i1 != 0)
      {
        localObject4 = new Integer[null];
        localObject1 = (Integer[])((Vector)localObject1).toArray(localObject4);
        localObject4 = new int[localObject1.length];
        for (i1 = j; ; i1++)
        {
          int i2 = localObject1.length;
          if (i1 >= i2)
            break;
          int i3 = localObject1[i1].intValue();
          localObject4[i1] = i3;
        }
        paramBundle.putIntArray(paramString, localObject4);
        continue;
      }
      i1 = localObject4 instanceof Boolean;
      if (i1 != 0)
      {
        localObject4 = new Boolean[null];
        localObject1 = (Boolean[])((Vector)localObject1).toArray(localObject4);
        localObject4 = new boolean[localObject1.length];
        for (i1 = j; ; i1++)
        {
          int i4 = localObject4.length;
          if (i1 >= i4)
            break;
          boolean bool5 = localObject1[i1].booleanValue();
          localObject4[i1] = bool5;
        }
        paramBundle.putBooleanArray(paramString, localObject4);
        continue;
      }
      i1 = localObject4 instanceof Double;
      if (i1 != 0)
      {
        localObject4 = new Double[null];
        localObject1 = (Double[])((Vector)localObject1).toArray(localObject4);
        localObject4 = new double[localObject1.length];
        for (i1 = j; ; i1++)
        {
          int i5 = localObject4.length;
          if (i1 >= i5)
            break;
          double d2 = localObject1[i1].doubleValue();
          Object localObject7;
          localObject4[i1] = localObject7;
        }
        paramBundle.putDoubleArray(paramString, localObject4);
        continue;
      }
      boolean bool3 = localObject4 instanceof Long;
      if (!bool3)
        continue;
      Object localObject5 = new Long[null];
      localObject1 = (Long[])((Vector)localObject1).toArray(localObject5);
      localObject5 = localObject1.length;
      for (i1 = j; ; i1++)
      {
        int i6 = localObject5.length;
        if (i1 >= i6)
          break;
        long l2 = localObject1[i1].longValue();
        Object localObject8;
        localObject5[i1] = localObject8;
      }
      paramBundle.putLongArray(paramString, localObject5);
    }
  }

  private void a(String paramString)
  {
    this.a.d = paramString;
  }

  public static void a(List paramList, JSONObject paramJSONObject, String paramString)
  {
    if (paramList == null)
      return;
    Iterator localIterator = paramList.iterator();
    while (true)
    {
      boolean bool = localIterator.hasNext();
      if (!bool)
        break;
      paramList = (q)localIterator.next();
      d locald = new d();
      JSONObject localJSONObject = null;
      if (paramList.b)
        localJSONObject = paramJSONObject;
      a.a(paramList.a, "click_time_tracking", paramString, localJSONObject, locald).f();
    }
  }

  private static Intent b(Context paramContext)
  {
    return new Intent(paramContext, AdMobActivity.class);
  }

  private Intent b(Context paramContext, String paramString)
  {
    int i = 0;
    ci localci = this.a.a;
    Object localObject;
    if (localci != null)
    {
      int[] arrayOfInt = am.a;
      int j = localci.ordinal();
      switch (arrayOfInt[localci])
      {
      default:
        localObject = new Intent();
        ((Intent)localObject).setAction("android.intent.action.VIEW");
        Uri localUri = Uri.parse(paramString);
        ((Intent)localObject).setData(localUri);
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      return localObject;
      a(paramString);
      continue;
      localObject = b(paramContext);
      continue;
      localObject = this.a.h;
      if (localObject == null)
        break;
      localObject = this.a.h.b();
      if (localObject != 0)
        break;
      localObject = b(paramContext);
    }
  }

  public final void a()
  {
    if (this.d != null)
    {
      this.d.dismiss();
      this.d = null;
    }
  }

  public final void a(Activity paramActivity, View paramView)
  {
    int i = 1;
    int j = 0;
    Object localObject = this.a.a;
    ci localci = ci.b;
    if (localObject == localci)
    {
      localObject = this.a.d;
      String str = this.a.b;
      PopupWindow localPopupWindow1 = new PopupWindow(paramActivity);
      this.d = localPopupWindow1;
      Rect localRect = new Rect();
      paramView.getWindowVisibleDisplayFrame(localRect);
      double d1 = f.c();
      RelativeLayout localRelativeLayout = new RelativeLayout(paramActivity);
      localRelativeLayout.setGravity(17);
      s locals = new s(paramActivity, str, this);
      locals.setBackgroundColor(-1);
      locals.setId(i);
      int k = e.a(320, d1);
      int m = e.a(295, d1);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(k, m);
      localLayoutParams.addRule(13);
      localRelativeLayout.addView(locals, localLayoutParams);
      localObject = (String)localObject + "#sdk";
      locals.c = ((String)localObject);
      locals.loadUrl("http://mm.admob.com/static/android/canvas.html");
      this.d.setBackgroundDrawable(null);
      this.d.setFocusable(i);
      this.d.setClippingEnabled(j);
      localObject = this.d;
      int n = localRect.width();
      ((PopupWindow)localObject).setWidth(n);
      localObject = this.d;
      int i1 = localRect.height();
      ((PopupWindow)localObject).setHeight(i1);
      this.d.setContentView(localRelativeLayout);
      localObject = paramView.getRootView();
      PopupWindow localPopupWindow2 = this.d;
      int i2 = localRect.left;
      int i3 = localRect.top;
      localPopupWindow2.showAtLocation((View)localObject, j, i2, i3);
      localObject = localRelativeLayout.getLayoutParams();
      if ((localObject instanceof WindowManager.LayoutParams))
      {
        WindowManager.LayoutParams localLayoutParams1 = (WindowManager.LayoutParams)localObject;
        int i4 = localLayoutParams1.flags | 0x6;
        localLayoutParams1.flags = i4;
        localLayoutParams1.dimAmount = 1056964608;
        ((WindowManager)paramActivity.getSystemService("window")).updateViewLayout(localRelativeLayout, (ViewGroup.LayoutParams)localObject);
      }
    }
    while (true)
    {
      return;
      if (!this.c.a())
      {
        ai localai = this.c;
        WeakReference localWeakReference = new WeakReference(paramActivity);
        localai.d = localWeakReference;
        this.c.b();
        continue;
      }
      a(paramActivity);
    }
  }

  public final void a(Context paramContext, JSONArray paramJSONArray)
  {
    int i = 0;
    while (true)
    {
      int j = paramJSONArray.length();
      if (i < j)
        try
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          a(paramContext, localJSONObject);
          i++;
        }
        catch (JSONException localJSONException)
        {
          while (true)
          {
            if (!bh.a("AdMobSDK", 6))
              continue;
            StringBuilder localStringBuilder = new StringBuilder().append("Could not form an intent from ad action response: ");
            String str1 = paramJSONArray.toString();
            String str2 = str1;
            Log.e("AdMobSDK", str2);
          }
        }
    }
  }

  public final void a(Context paramContext, JSONObject paramJSONObject)
  {
    String str1 = null;
    if (paramJSONObject != null)
    {
      localObject1 = paramJSONObject.optString("u");
      if (localObject1 != null)
      {
        boolean bool = ((String)localObject1).equals("");
        if (!bool)
          a(paramContext, (String)localObject1);
      }
    }
    else
    {
      return;
    }
    Object localObject1 = paramJSONObject.optString("a", "android.intent.action.VIEW");
    String str2 = paramJSONObject.optString("d", str1);
    Object localObject2 = this.a.d;
    if (localObject2 == null)
      a(str2);
    localObject2 = paramJSONObject.optInt("f", 0);
    Bundle localBundle = a(paramJSONObject.optJSONObject("b"));
    Object localObject3 = this.a.a;
    if (localObject3 != null)
    {
      localObject3 = am.a;
      int j = this.a.a.ordinal();
      int i = localObject3[j];
      switch (i)
      {
      default:
        Uri localUri = Uri.parse(str2);
        Intent localIntent = new Intent((String)localObject1, str2);
        if (localObject2 != 0)
          localIntent.addFlags(localObject2);
        if (localBundle != null)
          localIntent.putExtras(localBundle);
        localObject1 = localIntent;
      case 1:
      }
    }
    while (true)
    {
      a((Intent)localObject1);
      break;
      localObject1 = b(paramContext, str2);
      continue;
      localObject1 = str1;
    }
  }

  public final void a(Context paramContext, JSONObject paramJSONObject, ai paramai)
  {
    if (paramai == null);
    for (Object localObject1 = this.c; ; localObject1 = paramai)
    {
      Object localObject2 = this.a;
      Object localObject4 = ak.g(paramContext);
      ((ab)localObject2).a(paramJSONObject, (ai)localObject1, (String)localObject4);
      localObject1 = this.a;
      localObject2 = paramJSONObject.optString("u");
      ((ab)localObject1).d = ((String)localObject2);
      localObject1 = paramJSONObject.optJSONArray("ua");
      localObject2 = paramJSONObject.optJSONObject("ac");
      localObject4 = paramJSONObject.optJSONArray("ac");
      if (localObject4 != null)
        a(paramContext, (JSONArray)localObject4);
      while (true)
      {
        return;
        if (localObject2 != null)
        {
          a(paramContext, (JSONObject)localObject2);
          continue;
        }
        if (localObject1 != null)
          for (Object localObject3 = 0; ; localObject3++)
          {
            localObject4 = ((JSONArray)localObject1).length();
            if (localObject3 >= localObject4)
              break;
            localObject4 = ((JSONArray)localObject1).optString(localObject3);
            if (localObject4 == null)
              continue;
            a(paramContext, (String)localObject4);
          }
        if ((this.a.d == null) || (this.a.d.length() <= 0))
          continue;
        String str = this.a.d;
        a(paramContext, str);
      }
    }
  }

  public final void a(Hashtable paramHashtable)
  {
    if (this.a != null)
    {
      ab localab = this.a;
      if (paramHashtable != null)
      {
        Iterator localIterator = paramHashtable.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          Bundle localBundle = localab.k;
          Parcelable localParcelable = (Parcelable)paramHashtable.get(str);
          localBundle.putParcelable(str, localParcelable);
        }
      }
    }
  }

  public final void b()
  {
    Object localObject = this.a;
    if (localObject != null)
    {
      localObject = c();
      if (localObject != 0)
      {
        localObject = null;
        if (this.b.size() > 0)
          localObject = (Intent)this.b.firstElement();
        if (localObject != null)
        {
          Bundle localBundle = this.a.a();
          ((Intent)localObject).putExtra("o", localBundle);
        }
      }
    }
  }

  public final boolean c()
  {
    Object localObject1 = this.a;
    label70: int i;
    if (localObject1 != null)
    {
      localObject1 = this.a.a;
      ci localci1 = ci.c;
      if (localObject1 == localci1)
      {
        localObject1 = this.a.h;
        if (localObject1 != null)
        {
          localObject1 = this.a.h.b();
          if (localObject1 == 0)
            break label70;
        }
      }
      localObject1 = this.a.a;
      ci localci2 = ci.d;
      if (localObject1 == localci2)
        i = 1;
    }
    while (true)
    {
      return i;
      Object localObject2 = null;
    }
  }

  public final void j()
  {
    Object localObject = this.c.a;
    a((Hashtable)localObject);
    b();
    localObject = this.c;
    if (((ai)localObject).d != null);
    for (localObject = (Context)((ai)localObject).d.get(); ; localObject = null)
    {
      if (localObject != null)
        a((Context)localObject);
      return;
    }
  }

  public final void k()
  {
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ad
 * JD-Core Version:    0.6.0
 */