package com.admob.android.ads;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import org.json.JSONObject;

public final class ai
  implements b
{
  public Hashtable a;
  public HashSet b;
  public ag c;
  public WeakReference d;
  private bp e;

  public ai(bp parambp)
  {
    Hashtable localHashtable = new Hashtable();
    this.a = localHashtable;
    HashSet localHashSet = new HashSet();
    this.b = localHashSet;
    this.c = null;
    this.e = parambp;
    this.d = null;
  }

  private void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    n localn = a.a(paramString1, paramString2, paramString3, this);
    if (paramBoolean)
    {
      Boolean localBoolean = Boolean.valueOf(true);
      localn.a(localBoolean);
    }
    this.b.add(localn);
  }

  // ERROR //
  public final void a(n paramn)
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_2
    //   2: aload_1
    //   3: invokeinterface 64 1 0
    //   8: astore_3
    //   9: aload_1
    //   10: invokeinterface 67 1 0
    //   15: astore 4
    //   17: aload 4
    //   19: ifnull +228 -> 247
    //   22: aconst_null
    //   23: astore 5
    //   25: iconst_0
    //   26: istore 6
    //   28: aload 4
    //   30: arraylength
    //   31: istore 7
    //   33: aload 4
    //   35: iload 6
    //   37: iload 7
    //   39: invokestatic 73	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   42: astore 4
    //   44: aload 4
    //   46: astore 5
    //   48: aload 5
    //   50: ifnull +148 -> 198
    //   53: aload_1
    //   54: invokeinterface 77 1 0
    //   59: astore 4
    //   61: aload 4
    //   63: instanceof 45
    //   66: ifeq +32 -> 98
    //   69: aload 4
    //   71: checkcast 45	java/lang/Boolean
    //   74: invokevirtual 81	java/lang/Boolean:booleanValue	()Z
    //   77: astore 4
    //   79: iload 4
    //   81: ifeq +17 -> 98
    //   84: aload_0
    //   85: getfield 33	com/admob/android/ads/ai:c	Lcom/admob/android/ads/ag;
    //   88: astore 4
    //   90: aload 4
    //   92: aload_3
    //   93: aload 5
    //   95: invokevirtual 86	com/admob/android/ads/ag:a	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   98: aload_0
    //   99: getfield 26	com/admob/android/ads/ai:a	Ljava/util/Hashtable;
    //   102: aload_3
    //   103: aload 5
    //   105: invokevirtual 90	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: aload_0
    //   110: getfield 31	com/admob/android/ads/ai:b	Ljava/util/HashSet;
    //   113: astore 4
    //   115: aload 4
    //   117: ifnull +47 -> 164
    //   120: aload_0
    //   121: getfield 31	com/admob/android/ads/ai:b	Ljava/util/HashSet;
    //   124: astore 4
    //   126: aload 4
    //   128: monitorenter
    //   129: aload_0
    //   130: getfield 31	com/admob/android/ads/ai:b	Ljava/util/HashSet;
    //   133: aload_1
    //   134: invokevirtual 93	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   137: pop
    //   138: aload 4
    //   140: monitorexit
    //   141: aload_0
    //   142: invokevirtual 95	com/admob/android/ads/ai:a	()Z
    //   145: ifeq +19 -> 164
    //   148: aload_0
    //   149: getfield 35	com/admob/android/ads/ai:e	Lcom/admob/android/ads/bp;
    //   152: ifnull +12 -> 164
    //   155: aload_0
    //   156: getfield 35	com/admob/android/ads/ai:e	Lcom/admob/android/ads/bp;
    //   159: invokeinterface 100 1 0
    //   164: return
    //   165: astore 4
    //   167: ldc 102
    //   169: bipush 6
    //   171: invokestatic 107	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   174: ifeq -126 -> 48
    //   177: ldc 102
    //   179: ldc 109
    //   181: aload 4
    //   183: invokestatic 114	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   186: pop
    //   187: goto -139 -> 48
    //   190: astore 8
    //   192: aload 4
    //   194: monitorexit
    //   195: aload 8
    //   197: athrow
    //   198: ldc 102
    //   200: iload_2
    //   201: invokestatic 107	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   204: ifeq +36 -> 240
    //   207: new 116	java/lang/StringBuilder
    //   210: dup
    //   211: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   214: ldc 119
    //   216: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: aload_3
    //   220: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: ldc 125
    //   225: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: astore 9
    //   233: ldc 102
    //   235: aload_3
    //   236: invokestatic 131	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   239: pop
    //   240: aload_0
    //   241: invokevirtual 133	com/admob/android/ads/ai:c	()V
    //   244: goto -80 -> 164
    //   247: ldc 102
    //   249: iload_2
    //   250: invokestatic 107	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   253: ifeq +36 -> 289
    //   256: new 116	java/lang/StringBuilder
    //   259: dup
    //   260: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   263: ldc 119
    //   265: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: aload_3
    //   269: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: ldc 135
    //   274: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: astore 10
    //   282: ldc 102
    //   284: aload_3
    //   285: invokestatic 131	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   288: pop
    //   289: aload_0
    //   290: invokevirtual 133	com/admob/android/ads/ai:c	()V
    //   293: goto -129 -> 164
    //
    // Exception table:
    //   from	to	target	type
    //   28	44	165	java/lang/Throwable
    //   129	141	190	finally
  }

  public final void a(n paramn, Exception paramException)
  {
    int i = 3;
    int j = 0;
    Object localObject2;
    Object localObject1;
    if (paramException != null)
    {
      boolean bool = bh.a("AdMobSDK", i);
      if (bool)
      {
        if (paramn == null)
          break label224;
        localObject2 = paramn.d();
        localObject1 = paramn.e();
        if (localObject1 == null)
          break label214;
        String str1 = ((URL)localObject1).toString();
        localObject1 = localObject2;
        localObject2 = str1;
      }
    }
    while (true)
    {
      String str2 = "Failed downloading assets for ad: " + (String)localObject1 + " " + (String)localObject2;
      Log.d("AdMobSDK", (String)localObject2, paramException);
      do
      {
        c();
        return;
        localObject2 = bh.a("AdMobSDK", localObject1);
      }
      while (localObject2 == 0);
      if (paramn != null)
      {
        localObject2 = paramn.d();
        localObject1 = paramn.e();
        if (localObject1 != null)
        {
          String str3 = ((URL)localObject1).toString();
          localObject1 = localObject2;
          localObject2 = str3;
        }
      }
      while (true)
      {
        String str4 = "Failed downloading assets for ad: " + (String)localObject1 + " " + (String)localObject2;
        Log.d("AdMobSDK", (String)localObject2);
        break;
        localObject1 = localObject2;
        localObject2 = j;
        continue;
        localObject2 = j;
        localObject1 = j;
      }
      label214: localObject1 = localObject2;
      localObject2 = j;
      continue;
      label224: localObject2 = j;
      localObject1 = j;
    }
  }

  public final void a(JSONObject paramJSONObject, String paramString)
  {
    Object localObject1 = 1;
    Object localObject2 = null;
    Object localObject3 = this.b;
    if (localObject3 != null)
    {
      HashSet localHashSet = this.b;
      monitorenter;
      if (paramJSONObject != null)
        while (true)
        {
          Object localObject5;
          try
          {
            Iterator localIterator = paramJSONObject.keys();
            localObject3 = localIterator.hasNext();
            if (localObject3 == 0)
              break;
            localObject3 = (String)localIterator.next();
            localObject4 = paramJSONObject.getJSONObject((String)localObject3);
            localObject5 = ((JSONObject)localObject4).getString("u");
            localObject4 = ((JSONObject)localObject4).optInt("c", 0);
            if (localObject4 == localObject1)
            {
              localObject4 = localObject1;
              if (localObject4 == null)
                break label180;
              localObject4 = this.c;
              if (localObject4 == null)
                break label180;
              localObject4 = this.c.a((String)localObject3);
              if (localObject4 == null)
                break label163;
              localObject5 = this.a;
              ((Hashtable)localObject5).put(localObject3, localObject4);
              continue;
            }
          }
          finally
          {
            monitorexit;
          }
          Object localObject4 = localObject2;
          continue;
          label163: boolean bool1 = true;
          a((String)localObject5, (String)localObject3, paramString, bool1);
          continue;
          label180: boolean bool2 = null;
          a((String)localObject5, (String)localObject3, paramString, bool2);
        }
      monitorexit;
    }
  }

  public final boolean a()
  {
    Object localObject1 = this.b;
    int i;
    if (localObject1 != null)
    {
      localObject1 = this.b.size();
      if (localObject1 != 0);
    }
    else
    {
      i = 1;
    }
    while (true)
    {
      return i;
      Object localObject2 = null;
    }
  }

  public final void b()
  {
    ??? = this.b;
    if (??? != null)
    {
      synchronized (this.b)
      {
        Iterator localIterator = this.b.iterator();
        if (localIterator.hasNext())
          ((n)localIterator.next()).f();
      }
      monitorexit;
    }
  }

  public final void c()
  {
    if (this.b != null)
    {
      synchronized (this.b)
      {
        Iterator localIterator = this.b.iterator();
        if (localIterator.hasNext())
          ((n)localIterator.next()).b();
      }
      this.b.clear();
      this.b = null;
      monitorexit;
    }
    d();
    if (this.e != null)
      this.e.k();
  }

  public final void d()
  {
    if (this.a != null)
    {
      this.a.clear();
      this.a = null;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ai
 * JD-Core Version:    0.6.0
 */