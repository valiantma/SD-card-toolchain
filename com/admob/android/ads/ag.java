package com.admob.android.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.PriorityQueue;

public final class ag
{
  private static ag a = null;
  private File b;
  private long c = 0L;
  private long d = 524288L;
  private PriorityQueue e = null;
  private Hashtable f = null;

  private ag(Context paramContext)
  {
    File localFile1 = paramContext.getCacheDir();
    File localFile2 = new File(localFile1, "admob_img_cache");
    if (!localFile2.exists())
      localFile2.mkdir();
    while (true)
    {
      this.b = localFile2;
      File localFile3 = this.b;
      a(localFile3);
      return;
      if (localFile2.isDirectory())
        continue;
      localFile2.delete();
      localFile2.mkdir();
    }
  }

  public static ag a(Context paramContext)
  {
    if (a == null)
      a = new ag(paramContext);
    return a;
  }

  public static void a()
  {
    ag localag = a;
    new aq(localag).start();
  }

  private void a(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    Object localObject1 = new ao();
    Object localObject2 = new PriorityQueue(20, (Comparator)localObject1);
    this.e = ((PriorityQueue)localObject2);
    localObject2 = new Hashtable();
    this.f = ((Hashtable)localObject2);
    int i = arrayOfFile.length;
    Object localObject3 = null;
    while (localObject3 < i)
    {
      localObject1 = arrayOfFile[localObject3];
      if ((localObject1 != null) && (((File)localObject1).canRead()))
      {
        this.e.add(localObject1);
        Hashtable localHashtable = this.f;
        String str = ((File)localObject1).getName();
        localHashtable.put(str, localObject1);
        long l1 = this.c;
        long l2 = ((File)localObject1).length();
        Object localObject4;
        long l3 = l1 + localObject4;
        this.c = l3;
      }
      localObject3++;
    }
  }

  /** @deprecated */
  private void b()
  {
    monitorenter;
    try
    {
      long l1 = this.c;
      long l2 = this.d;
      l1 <= l2;
      int i;
      if (i > 0)
      {
        int j = this.e.size();
        if (j > 0)
        {
          File localFile = (File)this.e.peek();
          if (bh.a("AdMobSDK", 2))
          {
            StringBuilder localStringBuilder1 = new StringBuilder().append("cache: evicting bitmap ");
            String str1 = localFile.getName();
            StringBuilder localStringBuilder2 = localStringBuilder1.append(str1).append(" totalBytes ");
            long l3 = this.c;
            String str2 = l3;
            Log.v("AdMobSDK", str2);
          }
          b(localFile);
          localFile.delete();
        }
      }
    }
    finally
    {
      monitorexit;
    }
  }

  /** @deprecated */
  private void b(File paramFile)
  {
    monitorenter;
    if (paramFile != null);
    try
    {
      boolean bool = this.e.remove(paramFile);
      Object localObject1 = this.f;
      String str1 = paramFile.getName();
      localObject1 = ((Hashtable)localObject1).remove(str1);
      if (localObject1 != null)
      {
        int i = 1;
        if ((bool & i))
        {
          long l1 = this.c;
          long l2 = paramFile.length();
          Object localObject3;
          long l3 = l1 - localObject3;
          this.c = l3;
          if (bh.a("AdMobSDK", 2))
          {
            StringBuilder localStringBuilder1 = new StringBuilder().append("Cache: removed file ");
            String str2 = paramFile.getName();
            StringBuilder localStringBuilder2 = localStringBuilder1.append(str2).append(" totalBytes ");
            long l4 = this.c;
            String str3 = l4;
            Log.v("AdMobSDK", str3);
          }
        }
        return;
      }
      Object localObject2 = null;
    }
    finally
    {
      monitorexit;
    }
  }

  /** @deprecated */
  private void c(File paramFile)
  {
    monitorenter;
    if (paramFile != null);
    try
    {
      if (!this.e.contains(paramFile))
      {
        Hashtable localHashtable1 = this.f;
        String str1 = paramFile.getName();
        if (localHashtable1.get(str1) == null);
      }
      else
      {
        if (bh.a("AdMobSDK", 2))
          Log.v("AdMobSDK", "Cache: trying to add a file that's already in index");
        b(paramFile);
      }
      this.e.add(paramFile);
      Hashtable localHashtable2 = this.f;
      String str2 = paramFile.getName();
      localHashtable2.put(str2, paramFile);
      long l1 = this.c;
      long l2 = paramFile.length();
      Object localObject1;
      long l3 = l1 + localObject1;
      this.c = l3;
      if (bh.a("AdMobSDK", 2))
      {
        StringBuilder localStringBuilder1 = new StringBuilder().append("cache: added file: ");
        String str3 = paramFile.getName();
        StringBuilder localStringBuilder2 = localStringBuilder1.append(str3).append(" totalBytes ");
        long l4 = this.c;
        String str4 = l4;
        Log.v("AdMobSDK", str4);
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject2 = finally;
      monitorexit;
    }
    throw localObject2;
  }

  /** @deprecated */
  public final Bitmap a(String paramString)
  {
    monitorenter;
    try
    {
      Object localObject1 = (File)this.f.get(paramString);
      if (localObject1 != null)
      {
        Bitmap localBitmap = BitmapFactory.decodeFile(((File)localObject1).getAbsolutePath());
        if (localBitmap != null)
        {
          this.e.remove(localObject1);
          long l1 = System.currentTimeMillis();
          Object localObject2;
          ((File)localObject1).setLastModified(localObject2);
          this.e.add(localObject1);
          if (bh.a("AdMobSDK", 2))
          {
            StringBuilder localStringBuilder1 = new StringBuilder().append("cache: found bitmap ");
            String str = ((File)localObject1).getName();
            StringBuilder localStringBuilder2 = localStringBuilder1.append(str).append(" totalBytes ");
            long l2 = this.c;
            StringBuilder localStringBuilder3 = localStringBuilder2.append(l2).append(" new modified ");
            long l3 = ((File)localObject1).lastModified();
            Object localObject3;
            localObject1 = localObject3;
            Log.v("AdMobSDK", (String)localObject1);
          }
          localObject1 = localBitmap;
          return localObject1;
        }
      }
      int i = 0;
    }
    finally
    {
      monitorexit;
    }
  }

  /** @deprecated */
  // ERROR //
  public final void a(String paramString, Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 57	com/admob/android/ads/ag:b	Ljava/io/File;
    //   6: astore_3
    //   7: new 43	java/io/File
    //   10: dup
    //   11: aload_3
    //   12: aload_1
    //   13: invokespecial 48	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   16: astore 4
    //   18: aload_0
    //   19: getfield 35	com/admob/android/ads/ag:f	Ljava/util/Hashtable;
    //   22: aload_1
    //   23: invokevirtual 167	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   26: checkcast 43	java/io/File
    //   29: astore_3
    //   30: aload_3
    //   31: ifnull +63 -> 94
    //   34: ldc 123
    //   36: iconst_2
    //   37: invokestatic 128	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   40: ifeq +49 -> 89
    //   43: new 130	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   50: ldc 191
    //   52: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: astore 5
    //   57: aload 4
    //   59: invokevirtual 105	java/io/File:getName	()Ljava/lang/String;
    //   62: astore 6
    //   64: aload 5
    //   66: aload 6
    //   68: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc 201
    //   73: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: astore 7
    //   81: ldc 123
    //   83: aload 7
    //   85: invokestatic 151	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   88: pop
    //   89: aload_0
    //   90: aload_3
    //   91: invokespecial 153	com/admob/android/ads/ag:b	(Ljava/io/File;)V
    //   94: aload 4
    //   96: invokevirtual 52	java/io/File:exists	()Z
    //   99: ifeq +9 -> 108
    //   102: aload 4
    //   104: invokevirtual 66	java/io/File:delete	()Z
    //   107: pop
    //   108: new 203	java/io/FileOutputStream
    //   111: dup
    //   112: aload 4
    //   114: invokespecial 205	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   117: astore 8
    //   119: getstatic 211	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   122: astore 9
    //   124: aload_2
    //   125: aload 9
    //   127: bipush 100
    //   129: aload 8
    //   131: invokevirtual 217	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   134: pop
    //   135: aload_0
    //   136: aload 4
    //   138: invokespecial 219	com/admob/android/ads/ag:c	(Ljava/io/File;)V
    //   141: ldc 123
    //   143: iconst_2
    //   144: invokestatic 128	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   147: ifeq +85 -> 232
    //   150: new 130	java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   157: ldc 221
    //   159: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: astore 10
    //   164: aload 4
    //   166: invokevirtual 105	java/io/File:getName	()Ljava/lang/String;
    //   169: astore 11
    //   171: aload 10
    //   173: aload 11
    //   175: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc 139
    //   180: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: astore 12
    //   185: aload_0
    //   186: getfield 31	com/admob/android/ads/ag:c	J
    //   189: lstore 13
    //   191: aload 12
    //   193: lload 13
    //   195: invokevirtual 142	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   198: ldc 223
    //   200: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: astore 15
    //   205: aload 4
    //   207: invokevirtual 196	java/io/File:lastModified	()J
    //   210: astore 16
    //   212: aload 15
    //   214: lload 17
    //   216: invokevirtual 142	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   219: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: astore 19
    //   224: ldc 123
    //   226: aload 4
    //   228: invokestatic 151	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   231: pop
    //   232: aload_0
    //   233: monitorexit
    //   234: return
    //   235: astore 20
    //   237: aload_0
    //   238: monitorexit
    //   239: aload 20
    //   241: athrow
    //   242: astore 21
    //   244: goto -12 -> 232
    //
    // Exception table:
    //   from	to	target	type
    //   2	108	235	finally
    //   108	232	235	finally
    //   108	232	242	java/io/FileNotFoundException
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ag
 * JD-Core Version:    0.6.0
 */