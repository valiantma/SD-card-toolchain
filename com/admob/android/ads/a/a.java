package com.admob.android.ads.a;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.admob.android.ads.ba;
import com.admob.android.ads.bh;
import com.admob.android.ads.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class a extends WebView
  implements View.OnClickListener
{
  private boolean a;
  private WeakReference b;
  public String c;
  protected ba d;

  public a(Context paramContext, boolean paramBoolean, WeakReference paramWeakReference)
  {
    super(paramContext);
    this.a = paramBoolean;
    this.b = paramWeakReference;
    WebSettings localWebSettings = getSettings();
    localWebSettings.setLoadsImagesAutomatically(true);
    localWebSettings.setPluginsEnabled(true);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    localWebSettings.setSaveFormData(null);
    localWebSettings.setSavePassword(null);
    String str = o.i();
    localWebSettings.setUserAgentString(str);
    ba localba1 = a(paramWeakReference);
    this.d = localba1;
    ba localba2 = this.d;
    setWebViewClient(localba2);
  }

  private String a(Object paramObject)
  {
    String str1;
    if (paramObject == null)
      str1 = "{}";
    while (true)
    {
      return str1;
      boolean bool1 = paramObject instanceof Integer;
      if (!bool1)
      {
        bool1 = paramObject instanceof Double;
        if (!bool1);
      }
      else
      {
        String str2 = paramObject.toString();
        continue;
      }
      boolean bool2 = paramObject instanceof String;
      if (bool2)
      {
        String str4 = (String)paramObject;
        String str3 = "'" + paramObject + "'";
        continue;
      }
      boolean bool3 = paramObject instanceof Map;
      if (bool3)
      {
        Map localMap = (Map)paramObject;
        Object localObject1 = "{";
        Iterator localIterator = paramObject.entrySet().iterator();
        for (Object localObject3 = localObject1; ; localObject3 = localObject1)
        {
          localObject1 = localIterator.hasNext();
          if (localObject1 == 0)
            break;
          localObject1 = (Map.Entry)localIterator.next();
          Object localObject4 = ((Map.Entry)localObject1).getKey();
          localObject1 = ((Map.Entry)localObject1).getValue();
          String str5 = a(localObject4);
          localObject1 = a(localObject1);
          localObject1 = str5 + ":" + (String)localObject1;
          localObject1 = ((String)localObject3).concat((String)localObject1);
          localObject3 = localIterator.hasNext();
          if (localObject3 == 0)
            continue;
          localObject3 = ",";
          localObject1 = ((String)localObject1).concat((String)localObject3);
        }
        localObject1 = ((String)localObject3).concat("}");
        continue;
      }
      boolean bool4 = paramObject instanceof JSONObject;
      if (bool4)
      {
        localObject2 = ((JSONObject)paramObject).toString();
        continue;
      }
      Object localObject2 = bh.a("AdMobSDK", 5);
      if (localObject2 != 0)
      {
        localObject2 = "AdMobSDK";
        String str6 = "Unable to create JSON from object: " + paramObject;
        Log.w((String)localObject2, str6);
      }
      localObject2 = "";
    }
  }

  protected ba a(WeakReference paramWeakReference)
  {
    return new ba(this, paramWeakReference);
  }

  public void a()
  {
    if (this.b != null)
    {
      this = (Activity)this.b.get();
      if (this != null)
        finish();
    }
  }

  public final void a(String paramString, Object[] paramArrayOfObject)
  {
    Object localObject1 = Arrays.asList(paramArrayOfObject);
    String str1 = "";
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      String str2 = a(localObject2);
      str1 = str1.concat(str2);
      if (!((Iterator)localObject1).hasNext())
        continue;
      str1 = str1.concat(",");
    }
    localObject1 = new StringBuilder();
    String str3 = "javascript:admob.".concat(paramString);
    localObject1 = str3 + "(" + str1 + ");";
    if (bh.a("AdMobSDK", 3))
    {
      String str4 = "Sending url to webView: " + (String)localObject1;
      Log.w("AdMobSDK", (String)localObject1);
    }
  }

  public void loadUrl(String paramString)
  {
    boolean bool = this.a;
    if (bool);
    for (String str = paramString + "#sdk_close"; ; str = paramString)
    {
      super.loadUrl(str);
      return;
    }
  }

  public void onClick(View paramView)
  {
    a();
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.a.a
 * JD-Core Version:    0.6.0
 */