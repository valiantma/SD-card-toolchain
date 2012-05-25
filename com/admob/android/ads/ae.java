package com.admob.android.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public final class ae
  implements h
{
  private WeakReference a;

  public ae()
  {
  }

  public ae(AdView paramAdView)
  {
    WeakReference localWeakReference = new WeakReference(paramAdView);
    this.a = localWeakReference;
  }

  public static Bundle a(i parami)
  {
    int i;
    if (parami == null)
      i = 0;
    while (true)
    {
      return i;
      Bundle localBundle = parami.a();
    }
  }

  public static ArrayList a(Vector paramVector)
  {
    int i = 0;
    Object localObject;
    if (paramVector == null)
      localObject = i;
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      Iterator localIterator = paramVector.iterator();
      while (localIterator.hasNext())
      {
        paramVector = (i)localIterator.next();
        if (paramVector == null)
        {
          ((ArrayList)localObject).add(i);
          continue;
        }
        Bundle localBundle = paramVector.a();
        ((ArrayList)localObject).add(localBundle);
      }
    }
  }

  public final void a()
  {
    this = (AdView)this.a.get();
    if (this != null)
      AdView.f(this);
  }

  public final void a(e parame)
  {
    this = (AdView)this.a.get();
    if (this != null)
      monitorenter;
    try
    {
      if (AdView.a(this) != null)
      {
        e locale = AdView.a(this).b();
        if (parame.equals(locale))
        {
          if (bh.a("AdMobSDK", 3))
            Log.d("AdMobSDK", "Received the same ad we already had.  Discarding it.");
          return;
        }
      }
      if (bh.a("AdMobSDK", 4))
      {
        StringBuilder localStringBuilder = new StringBuilder().append("Ad returned (");
        long l1 = SystemClock.uptimeMillis();
        long l2 = AdView.i(this);
        Object localObject1;
        Object localObject2;
        long l3 = localObject1 - localObject2;
        String str = l3 + " ms):  " + parame;
        Log.i("AdMobSDK", str);
      }
      getContext();
      f localf = parame.b();
      a(parame, localf);
    }
    finally
    {
      monitorexit;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ae
 * JD-Core Version:    0.6.0
 */