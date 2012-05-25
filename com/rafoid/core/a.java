package com.rafoid.core;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Timer;

public final class a
{
  private static Timer a;

  public static String a(String paramString)
  {
    String str = new b().a.a(paramString).a;
    if (str == null)
      str = "";
    return str;
  }

  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, Boolean paramBoolean, Class paramClass)
  {
    int i = null;
    int j = 1;
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if ((localSharedPreferences.getBoolean("shownotification", j)) || (paramBoolean.booleanValue()))
    {
      Intent localIntent = new Intent(paramContext, paramClass);
      PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, i, localIntent, i);
      long l1 = System.currentTimeMillis();
      Object localObject;
      Notification localNotification = new Notification(paramInt, paramString1, localObject);
      i.setLatestEventInfo(paramContext, paramString2, paramString1, localPendingIntent);
      paramContext = (NotificationManager)paramContext.getSystemService("notification");
      paramContext.cancel(j);
      paramContext.notify(j, i);
      if (localSharedPreferences.getBoolean("hidenotification", j))
      {
        int k = Integer.decode(localSharedPreferences.getString("hideafter", "10")).intValue() * 1000;
        if (a == null)
          a = new Timer();
        Timer localTimer = a;
        d locald = new d(paramContext);
        long l2 = k;
        localTimer.schedule(locald, l2);
      }
    }
  }

  // ERROR //
  public static boolean a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: aconst_null
    //   3: astore_1
    //   4: iconst_1
    //   5: istore_2
    //   6: invokestatic 136	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   9: astore_3
    //   10: ldc 138
    //   12: astore 4
    //   14: aload_3
    //   15: aload 4
    //   17: invokevirtual 142	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual 148	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   25: astore 5
    //   27: new 150	java/io/DataOutputStream
    //   30: dup
    //   31: aload 5
    //   33: invokespecial 153	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   36: astore 4
    //   38: aload 4
    //   40: ldc 155
    //   42: invokevirtual 159	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   45: aload 4
    //   47: invokevirtual 162	java/io/DataOutputStream:flush	()V
    //   50: aload_3
    //   51: invokevirtual 165	java/lang/Process:waitFor	()I
    //   54: pop
    //   55: aload_3
    //   56: invokevirtual 168	java/lang/Process:exitValue	()I
    //   59: astore 5
    //   61: iload 5
    //   63: ifeq +5 -> 68
    //   66: aload_1
    //   67: astore_2
    //   68: aload 4
    //   70: invokevirtual 171	java/io/DataOutputStream:close	()V
    //   73: aload_3
    //   74: invokevirtual 174	java/lang/Process:destroy	()V
    //   77: aload_2
    //   78: ireturn
    //   79: astore_2
    //   80: aload_0
    //   81: astore_2
    //   82: aload_0
    //   83: astore_3
    //   84: iload_2
    //   85: ifeq +89 -> 174
    //   88: aload_2
    //   89: invokevirtual 171	java/io/DataOutputStream:close	()V
    //   92: aload_3
    //   93: invokevirtual 174	java/lang/Process:destroy	()V
    //   96: aload_1
    //   97: astore_2
    //   98: goto -21 -> 77
    //   101: astore_2
    //   102: aload_1
    //   103: astore_2
    //   104: goto -27 -> 77
    //   107: astore_2
    //   108: aload_0
    //   109: astore_3
    //   110: aload_0
    //   111: astore 4
    //   113: iload_3
    //   114: ifeq +12 -> 126
    //   117: aload_3
    //   118: invokevirtual 171	java/io/DataOutputStream:close	()V
    //   121: aload 4
    //   123: invokevirtual 174	java/lang/Process:destroy	()V
    //   126: aload_2
    //   127: athrow
    //   128: astore 6
    //   130: goto -53 -> 77
    //   133: astore 7
    //   135: goto -9 -> 126
    //   138: astore_2
    //   139: aload_3
    //   140: astore 4
    //   142: aload_0
    //   143: astore_3
    //   144: goto -31 -> 113
    //   147: astore_2
    //   148: aload 4
    //   150: astore 8
    //   152: aload_3
    //   153: astore 4
    //   155: aload 8
    //   157: astore_3
    //   158: goto -45 -> 113
    //   161: astore_2
    //   162: aload_0
    //   163: astore_2
    //   164: goto -80 -> 84
    //   167: astore_2
    //   168: aload 4
    //   170: astore_2
    //   171: goto -87 -> 84
    //   174: aload_1
    //   175: astore_2
    //   176: goto -99 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   6	21	79	java/lang/Exception
    //   88	96	101	java/lang/Exception
    //   6	21	107	finally
    //   68	77	128	java/lang/Exception
    //   117	126	133	java/lang/Exception
    //   21	38	138	finally
    //   38	61	147	finally
    //   21	38	161	java/lang/Exception
    //   38	61	167	java/lang/Exception
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.core.a
 * JD-Core Version:    0.6.0
 */