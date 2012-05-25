package com.admob.android.ads;

import android.util.Log;
import android.webkit.WebView;
import com.admob.android.ads.a.a;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

public final class bu extends ba
{
  boolean b;
  boolean c;
  e d;
  private Timer e;
  private TimerTask f;

  public bu(a parama, e parame)
  {
    super(parama);
    this.d = parame;
    this.b = null;
    this.c = null;
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
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
      this.c = true;
      super.onPageFinished(paramWebView, paramString);
      if ((locala instanceof r))
        ((r)locala).a_();
      if (bh.a("AdMobSDK", 3))
        Log.d("AdMobSDK", "startResponseTimer()");
      bs localbs = new bs(this);
      this.f = localbs;
      Timer localTimer1 = new Timer();
      this.e = localTimer1;
      Timer localTimer2 = this.e;
      TimerTask localTimerTask = this.f;
      localTimer2.schedule(localTimerTask, 10000L);
    }
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Object localObject1 = 1;
    int i = 2;
    boolean bool1 = bh.a("AdMobSDK", i);
    Object localObject3;
    Object localObject2;
    if (bool1)
    {
      localObject3 = "AdMobSDK";
      localObject2 = "shouldOverrideUrlLoading, url: " + paramString;
      Log.v((String)localObject3, (String)localObject2);
    }
    try
    {
      localObject3 = new URI(paramString);
      localObject2 = ((URI)localObject3).getScheme();
      localObject2 = "admob".equals(localObject2);
      if (localObject2 != 0)
      {
        localObject2 = ((URI)localObject3).getHost();
        if ("ready".equals(localObject2))
          if (this.b)
            localObject3 = localObject1;
        while (true)
        {
          return localObject3;
          this.b = true;
          if (bh.a("AdMobSDK", 3))
            Log.d("AdMobSDK", "cancelResponseTimer()");
          if (this.e != null)
            this.e.cancel();
          localObject3 = ((URI)localObject3).getQuery();
          if (localObject3 != null)
          {
            localObject3 = a((String)localObject3);
            if (localObject3 != null)
            {
              localObject3 = (String)((Hashtable)localObject3).get("success");
              boolean bool2;
              if (localObject3 != null)
              {
                localObject3 = "true".equalsIgnoreCase((String)localObject3);
                if (localObject3 != 0)
                {
                  localObject3 = this.d;
                  if (localObject3 != null)
                  {
                    localObject3 = this.d;
                    ((e)localObject3).a(true);
                  }
                  localObject3 = localObject1;
                  continue;
                }
              }
            }
          }
          localObject3 = this.d;
          if (localObject3 != null)
          {
            localObject3 = this.d;
            ((e)localObject3).a(null);
          }
          localObject3 = localObject1;
          continue;
          if (!"movie".equals(localObject2))
            break;
          localObject3 = ((URI)localObject3).getQuery();
          if (localObject3 != null)
          {
            localObject3 = a((String)localObject3);
            if (localObject3 != null)
            {
              localObject3 = (String)((Hashtable)localObject3).get("action");
              if ((localObject3 != null) && (!"play".equalsIgnoreCase((String)localObject3)) && (!"pause".equalsIgnoreCase((String)localObject3)) && (!"stop".equalsIgnoreCase((String)localObject3)) && (!"remove".equalsIgnoreCase((String)localObject3)) && (!"replay".equalsIgnoreCase((String)localObject3)) && (bh.a("AdMobSDK", 5)))
              {
                localObject3 = "Unknown actionString, admob://movie?action=" + (String)localObject3;
                Log.w("AdMobSDK", (String)localObject3);
              }
            }
          }
          localObject3 = localObject1;
        }
      }
    }
    catch (URISyntaxException bool2)
    {
      while (true)
      {
        Log.w("AdMobSDK", "Bad link URL in AdMob web view.", localURISyntaxException);
        bool2 = super.shouldOverrideUrlLoading(paramWebView, paramString);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bu
 * JD-Core Version:    0.6.0
 */