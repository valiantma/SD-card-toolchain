package com.admob.android.ads;

import java.lang.ref.WeakReference;

final class bg extends Thread
{
  private br a;
  private WeakReference b;
  private boolean c;

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/admob/android/ads/bg:b	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 22	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 24	android/content/Context
    //   10: astore_1
    //   11: aload_1
    //   12: ifnull +107 -> 119
    //   15: aload_0
    //   16: getfield 26	com/admob/android/ads/bg:a	Lcom/admob/android/ads/br;
    //   19: invokevirtual 32	com/admob/android/ads/br:h	()Lcom/admob/android/ads/bh;
    //   22: astore_2
    //   23: aload_0
    //   24: getfield 26	com/admob/android/ads/bg:a	Lcom/admob/android/ads/br;
    //   27: invokevirtual 36	com/admob/android/ads/br:f	()Ljava/lang/String;
    //   30: astore_3
    //   31: aload_0
    //   32: getfield 26	com/admob/android/ads/bg:a	Lcom/admob/android/ads/br;
    //   35: invokevirtual 39	com/admob/android/ads/br:g	()Ljava/lang/String;
    //   38: astore 4
    //   40: aload_0
    //   41: getfield 26	com/admob/android/ads/bg:a	Lcom/admob/android/ads/br;
    //   44: invokevirtual 43	com/admob/android/ads/br:e	()Lcom/admob/android/ads/bv;
    //   47: astore 5
    //   49: aload_2
    //   50: aload_1
    //   51: aload_3
    //   52: aload 4
    //   54: aload 5
    //   56: invokestatic 48	com/admob/android/ads/k:a	(Lcom/admob/android/ads/h;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/admob/android/ads/bv;)Lcom/admob/android/ads/e;
    //   59: astore_1
    //   60: aload_0
    //   61: getfield 50	com/admob/android/ads/bg:c	Z
    //   64: ifne +16 -> 80
    //   67: aload_1
    //   68: ifnonnull +12 -> 80
    //   71: aload_0
    //   72: getfield 26	com/admob/android/ads/bg:a	Lcom/admob/android/ads/br;
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual 52	com/admob/android/ads/br:c	()V
    //   80: return
    //   81: astore_1
    //   82: ldc 54
    //   84: bipush 6
    //   86: invokestatic 59	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   89: ifeq +12 -> 101
    //   92: ldc 54
    //   94: ldc 61
    //   96: aload_1
    //   97: invokestatic 66	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   100: pop
    //   101: aload_0
    //   102: getfield 50	com/admob/android/ads/bg:c	Z
    //   105: ifne -25 -> 80
    //   108: aload_0
    //   109: getfield 26	com/admob/android/ads/bg:a	Lcom/admob/android/ads/br;
    //   112: invokevirtual 52	com/admob/android/ads/br:c	()V
    //   115: goto -35 -> 80
    //   118: athrow
    //   119: aload_0
    //   120: getfield 50	com/admob/android/ads/bg:c	Z
    //   123: ifne -43 -> 80
    //   126: aload_0
    //   127: getfield 26	com/admob/android/ads/bg:a	Lcom/admob/android/ads/br;
    //   130: invokevirtual 52	com/admob/android/ads/br:c	()V
    //   133: goto -53 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   15	80	81	java/lang/Exception
    //   15	80	118	finally
    //   82	115	118	finally
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bg
 * JD-Core Version:    0.6.0
 */