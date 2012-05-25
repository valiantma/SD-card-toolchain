package com.rafoid.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class c
{
  private String a = "sh";

  public c(b paramb, String paramString)
  {
    this.a = paramString;
  }

  private static String a(InputStream paramInputStream)
  {
    int i = 0;
    Object localObject1 = new DataInputStream(paramInputStream);
    try
    {
      int j = ((DataInputStream)localObject1).available();
      if (j > 0)
      {
        String str1 = ((DataInputStream)localObject1).readLine();
        localObject4 = new StringBuffer(str1);
        try
        {
          while (true)
          {
            if (((DataInputStream)localObject1).available() <= 0)
            {
              ((DataInputStream)localObject1).close();
              localObject1 = localObject4;
              if (localObject1 == 0)
                break;
              localObject1 = ((StringBuffer)localObject1).toString();
              return localObject1;
            }
            StringBuffer localStringBuffer = ((StringBuffer)localObject4).append("\n");
            String str2 = ((DataInputStream)localObject1).readLine();
            localStringBuffer.append(str2);
          }
        }
        catch (Exception localObject2)
        {
          while (true)
            Object localObject2 = localObject4;
        }
      }
    }
    catch (Exception localObject3)
    {
      while (true)
      {
        Object localObject3 = i;
        continue;
        localObject3 = i;
        continue;
        Object localObject4 = i;
      }
    }
  }

  private Process b(String paramString)
  {
    try
    {
      Object localObject = Runtime.getRuntime();
      String str1 = this.a;
      localObject = ((Runtime)localObject).exec(str1);
      OutputStream localOutputStream = ((Process)localObject).getOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localOutputStream);
      String str2 = "exec " + paramString + "\n";
      localDataOutputStream.writeBytes(str2);
      localDataOutputStream.flush();
      return localObject;
    }
    catch (Exception i)
    {
      while (true)
        int i = 0;
    }
  }

  // ERROR //
  public final e a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 95	com/rafoid/core/c:b	(Ljava/lang/String;)Ljava/lang/Process;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnull +124 -> 133
    //   12: aload_3
    //   13: invokevirtual 98	java/lang/Process:waitFor	()I
    //   16: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   19: astore 4
    //   21: aload_3
    //   22: invokevirtual 108	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   25: invokestatic 110	com/rafoid/core/c:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   28: astore 5
    //   30: aload_3
    //   31: invokevirtual 113	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   34: invokestatic 110	com/rafoid/core/c:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   37: astore_3
    //   38: aload 5
    //   40: astore 6
    //   42: aload 4
    //   44: astore 5
    //   46: aload 6
    //   48: astore 4
    //   50: aload_0
    //   51: getfield 12	com/rafoid/core/c:b	Lcom/rafoid/core/b;
    //   54: astore 7
    //   56: new 115	com/rafoid/core/e
    //   59: dup
    //   60: aload 7
    //   62: aload 5
    //   64: aload 4
    //   66: aload_3
    //   67: invokespecial 118	com/rafoid/core/e:<init>	(Lcom/rafoid/core/b;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    //   70: areturn
    //   71: astore_3
    //   72: aload_2
    //   73: astore_3
    //   74: aload_2
    //   75: astore 4
    //   77: aload 4
    //   79: astore 5
    //   81: aload_3
    //   82: astore 4
    //   84: aload_2
    //   85: astore_3
    //   86: goto -36 -> 50
    //   89: astore_3
    //   90: aload_2
    //   91: astore_3
    //   92: aload_2
    //   93: astore 4
    //   95: aload 4
    //   97: astore 5
    //   99: aload_3
    //   100: astore 4
    //   102: aload_2
    //   103: astore_3
    //   104: goto -54 -> 50
    //   107: astore_3
    //   108: aload_2
    //   109: astore_3
    //   110: goto -15 -> 95
    //   113: astore_3
    //   114: aload 5
    //   116: astore_3
    //   117: goto -22 -> 95
    //   120: astore_3
    //   121: aload_2
    //   122: astore_3
    //   123: goto -46 -> 77
    //   126: astore_3
    //   127: aload 5
    //   129: astore_3
    //   130: goto -53 -> 77
    //   133: aload_2
    //   134: astore_3
    //   135: aload_2
    //   136: astore 4
    //   138: aload_2
    //   139: astore 5
    //   141: goto -91 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   12	21	71	java/lang/InterruptedException
    //   12	21	89	java/lang/NullPointerException
    //   21	30	107	java/lang/NullPointerException
    //   30	38	113	java/lang/NullPointerException
    //   21	30	120	java/lang/InterruptedException
    //   30	38	126	java/lang/InterruptedException
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.core.c
 * JD-Core Version:    0.6.0
 */