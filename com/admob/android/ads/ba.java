package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.admob.android.ads.a.a;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;

public class ba extends WebViewClient
{
  protected WeakReference a;
  private WeakReference b;
  private az c;
  private Map d;

  public ba(a parama)
  {
    this(parama, null);
  }

  public ba(a parama, WeakReference paramWeakReference)
  {
    WeakReference localWeakReference = new WeakReference(parama);
    this.a = localWeakReference;
    this.b = paramWeakReference;
    paramWeakReference.get();
    az localaz1 = new az();
    this.c = localaz1;
    this.d = null;
    az localaz2 = this.c;
    parama.addJavascriptInterface(localaz2, "JsProxy");
  }

  public static Hashtable a(String paramString)
  {
    int i = 0;
    Hashtable localHashtable;
    if (paramString != null)
    {
      localHashtable = new Hashtable();
      Object localObject = "&";
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, (String)localObject);
      while (true)
      {
        localObject = localStringTokenizer.hasMoreTokens();
        if (localObject == 0)
          break;
        localObject = localStringTokenizer.nextToken();
        int j = ((String)localObject).indexOf('=');
        int k = -1;
        if (j == k)
          continue;
        String str = ((String)localObject).substring(0, j);
        j++;
        localObject = ((String)localObject).substring(j);
        if ((str == null) || (localObject == null))
          continue;
        localHashtable.put(str, localObject);
      }
    }
    return (Hashtable)localHashtable;
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    a locala = (a)this.a.get();
    if (locala == null);
    while (true)
    {
      return;
      if (paramString != null)
      {
        String str1 = locala.c;
        if (paramString.equals(str1));
      }
      else
      {
        if (!bh.a("AdMobSDK", 4))
          continue;
        String str2 = "Unexpected page loaded, urlThatFinished: " + paramString;
        Log.i("AdMobSDK", str2);
        continue;
      }
      if (this.d == null)
      {
        HashMap localHashMap = new HashMap();
        this.d = localHashMap;
        Context localContext = locala.getContext();
        this.d.put("sdkVersion", "20101109-ANDROID-3312276cc1406347");
        Map localMap1 = this.d;
        String str3 = o.i();
        localMap1.put("ua", str3);
        Map localMap2 = this.d;
        String str4 = ak.i(localContext);
        localMap2.put("portrait", str4);
        Map localMap3 = this.d;
        String str5 = String.valueOf(locala.getWidth());
        localMap3.put("width", str5);
        Map localMap4 = this.d;
        String str6 = String.valueOf(locala.getHeight());
        localMap4.put("height", str6);
        Map localMap5 = this.d;
        String str7 = ak.g(localContext);
        localMap5.put("isu", str7);
      }
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = "loaded";
      Map localMap6 = this.d;
      arrayOfObject[1] = localMap6;
      locala.a("onEvent", arrayOfObject);
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = 1;
    int i = 2;
    boolean bool = bh.a("AdMobSDK", i);
    Object localObject3;
    Object localObject6;
    if (bool)
    {
      localObject4 = "AdMobSDK";
      localObject3 = new StringBuilder();
      localObject6 = "shouldOverrideUrlLoading, url: ";
      localObject3 = (String)localObject6 + paramString;
      Log.v((String)localObject4, (String)localObject3);
    }
    Object localObject4 = (a)this.a.get();
    if (localObject4 == null)
      localObject4 = localObject1;
    while (true)
    {
      return localObject4;
      localObject3 = ((a)localObject4).getContext();
      try
      {
        localObject6 = new URI(paramString);
        Object localObject7 = ((URI)localObject6).getScheme();
        localObject7 = "admob".equals(localObject7);
        if (localObject7 != 0)
        {
          localObject7 = ((URI)localObject6).getHost();
          if ("launch".equals(localObject7))
          {
            localObject4 = ((URI)localObject6).getQuery();
            if (localObject4 != null)
            {
              localObject4 = a((String)localObject4);
              String str1;
              String str2;
              String str3;
              Object localObject5;
              if (localObject4 != null)
              {
                localObject4 = (String)((Hashtable)localObject4).get("url");
                if (localObject4 != null)
                {
                  if (!(localObject3 instanceof Activity))
                    localObject3 = (Context)this.b.get();
                  if (localObject3 != null)
                  {
                    localObject4 = Uri.parse((String)localObject4);
                    Intent localIntent = new Intent("android.intent.action.VIEW", (Uri)localObject4);
                    ((Context)localObject3).startActivity(localIntent);
                  }
                  localObject4 = localObject2;
                  continue;
                }
              }
            }
          }
          else
          {
            localObject3 = "open".equals(localObject7);
            if (localObject3 != 0)
            {
              localObject3 = ((URI)localObject6).getQuery();
              if (localObject3 != null)
              {
                localObject3 = a((String)localObject3);
                if (localObject3 != null)
                {
                  this = (String)((Hashtable)localObject3).get("vars");
                  if (this != null)
                  {
                    str1 = "javascript: JsProxy.setDataAndOpen(" + this + ")";
                    ((a)localObject4).loadUrl(str1);
                    localObject4 = localObject2;
                    continue;
                  }
                }
              }
            }
            else if ("closecanvas".equals(localObject7))
            {
              if (paramWebView == localObject4)
              {
                ((a)localObject4).a();
                localObject4 = localObject2;
                continue;
              }
            }
            else
            {
              localObject4 = "log".equals(localObject7);
              if (localObject4 != 0)
              {
                localObject4 = ((URI)localObject6).getQuery();
                if (localObject4 != null)
                {
                  localObject4 = a((String)localObject4);
                  if (localObject4 != null)
                  {
                    this = (String)((Hashtable)localObject4).get("string");
                    if (this != null)
                    {
                      localObject4 = bh.a("AdMobSDK", 3);
                      if (localObject4 != 0)
                      {
                        localObject4 = "AdMobSDK";
                        str2 = "<AdMob:WebView>: " + this;
                        Log.d((String)localObject4, str2);
                      }
                      localObject4 = localObject2;
                      continue;
                    }
                  }
                }
              }
              else
              {
                localObject4 = bh.a("AdMobSDK", 3);
                if (localObject4 != 0)
                {
                  localObject4 = "AdMobSDK";
                  str3 = "Received message from JS but didn't know how to handle: " + paramString;
                  Log.d((String)localObject4, str3);
                }
                localObject4 = localObject2;
              }
            }
          }
        }
      }
      catch (URISyntaxException localObject5)
      {
        Log.w("AdMobSDK", "Bad link URL in AdMob web view.", localURISyntaxException);
        localObject5 = localObject1;
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ba
 * JD-Core Version:    0.6.0
 */