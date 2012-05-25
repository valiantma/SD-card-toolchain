package com.admob.android.ads;

import android.util.Log;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

final class c extends o
{
  private HttpURLConnection m;
  private URL n;

  public c(String paramString1, String paramString2, String paramString3, b paramb, int paramInt, String paramString4)
  {
  }

  private void j()
  {
    if (this.m != null)
    {
      this.m.disconnect();
      this.m = null;
    }
  }

  // ERROR //
  public final boolean a()
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aload_0
    //   7: getfield 22	com/admob/android/ads/c:n	Ljava/net/URL;
    //   10: astore 4
    //   12: aload 4
    //   14: ifnonnull +1227 -> 1241
    //   17: aload_0
    //   18: getfield 50	com/admob/android/ads/c:h	Lcom/admob/android/ads/b;
    //   21: astore 4
    //   23: aload 4
    //   25: ifnull +30 -> 55
    //   28: aload_0
    //   29: getfield 50	com/admob/android/ads/c:h	Lcom/admob/android/ads/b;
    //   32: astore 4
    //   34: new 46	java/lang/Exception
    //   37: dup
    //   38: ldc 52
    //   40: invokespecial 53	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   43: astore 5
    //   45: aload 4
    //   47: aload_0
    //   48: aload 5
    //   50: invokeinterface 58 3 0
    //   55: aload_3
    //   56: astore 4
    //   58: aload 4
    //   60: ifnonnull +32 -> 92
    //   63: aload_0
    //   64: getfield 50	com/admob/android/ads/c:h	Lcom/admob/android/ads/b;
    //   67: ifnull +25 -> 92
    //   70: aload_0
    //   71: getfield 50	com/admob/android/ads/c:h	Lcom/admob/android/ads/b;
    //   74: astore 6
    //   76: aload_0
    //   77: getfield 35	com/admob/android/ads/c:c	Ljava/lang/Exception;
    //   80: astore 7
    //   82: aload 6
    //   84: aload_0
    //   85: aload 7
    //   87: invokeinterface 58 3 0
    //   92: aload 4
    //   94: ireturn
    //   95: sipush 302
    //   98: istore 8
    //   100: iload 9
    //   102: iload 8
    //   104: if_icmpne +1112 -> 1216
    //   107: aload_0
    //   108: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   111: ldc 60
    //   113: invokevirtual 64	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   116: astore 9
    //   118: iconst_3
    //   119: istore 10
    //   121: ldc 66
    //   123: iload 10
    //   125: invokestatic 71	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   128: astore 8
    //   130: iload 8
    //   132: ifeq +37 -> 169
    //   135: ldc 66
    //   137: astore 8
    //   139: new 73	java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   146: ldc 77
    //   148: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 9
    //   153: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: astore 10
    //   161: aload 8
    //   163: aload 10
    //   165: invokestatic 91	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   168: pop
    //   169: new 17	java/net/URL
    //   172: dup
    //   173: aload 9
    //   175: invokespecial 20	java/net/URL:<init>	(Ljava/lang/String;)V
    //   178: astore 8
    //   180: aload_0
    //   181: aload 8
    //   183: putfield 22	com/admob/android/ads/c:n	Ljava/net/URL;
    //   186: aload_0
    //   187: invokespecial 93	com/admob/android/ads/c:j	()V
    //   190: aload_0
    //   191: getfield 31	com/admob/android/ads/c:e	I
    //   194: istore 4
    //   196: aload_0
    //   197: getfield 96	com/admob/android/ads/c:f	I
    //   200: istore 9
    //   202: iload 4
    //   204: iload 9
    //   206: if_icmpge +1028 -> 1234
    //   209: aload 11
    //   211: ifnonnull +1023 -> 1234
    //   214: ldc 66
    //   216: iload_1
    //   217: invokestatic 71	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   220: astore 4
    //   222: iload 4
    //   224: ifeq +67 -> 291
    //   227: ldc 66
    //   229: astore 4
    //   231: new 73	java/lang/StringBuilder
    //   234: dup
    //   235: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   238: ldc 98
    //   240: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: astore 9
    //   245: aload_0
    //   246: getfield 31	com/admob/android/ads/c:e	I
    //   249: istore 8
    //   251: aload 9
    //   253: iload 8
    //   255: invokevirtual 101	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   258: ldc 103
    //   260: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: astore 9
    //   265: aload_0
    //   266: getfield 22	com/admob/android/ads/c:n	Ljava/net/URL;
    //   269: astore 8
    //   271: aload 9
    //   273: aload 8
    //   275: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   278: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   281: astore 9
    //   283: aload 4
    //   285: aload 9
    //   287: invokestatic 109	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   290: pop
    //   291: aconst_null
    //   292: istore 8
    //   294: aload_0
    //   295: invokespecial 93	com/admob/android/ads/c:j	()V
    //   298: aload_0
    //   299: getfield 22	com/admob/android/ads/c:n	Ljava/net/URL;
    //   302: invokevirtual 113	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   305: checkcast 39	java/net/HttpURLConnection
    //   308: astore 4
    //   310: aload_0
    //   311: aload 4
    //   313: putfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   316: aload_0
    //   317: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   320: iconst_1
    //   321: invokevirtual 117	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   324: aload_0
    //   325: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   328: astore 4
    //   330: iconst_1
    //   331: istore 9
    //   333: aload 4
    //   335: iload 9
    //   337: invokevirtual 120	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   340: aload_0
    //   341: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   344: astore 4
    //   346: aload 4
    //   348: ifnull +875 -> 1223
    //   351: aload_0
    //   352: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   355: astore 4
    //   357: ldc 122
    //   359: astore 9
    //   361: invokestatic 124	com/admob/android/ads/c:i	()Ljava/lang/String;
    //   364: astore 10
    //   366: aload 4
    //   368: aload 9
    //   370: aload 10
    //   372: invokevirtual 128	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   375: aload_0
    //   376: getfield 132	com/admob/android/ads/c:g	Ljava/lang/String;
    //   379: astore 4
    //   381: aload 4
    //   383: ifnull +28 -> 411
    //   386: aload_0
    //   387: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   390: astore 4
    //   392: ldc 134
    //   394: astore 9
    //   396: aload_0
    //   397: getfield 132	com/admob/android/ads/c:g	Ljava/lang/String;
    //   400: astore 10
    //   402: aload 4
    //   404: aload 9
    //   406: aload 10
    //   408: invokevirtual 128	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   411: aload_0
    //   412: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   415: astore 4
    //   417: aload_0
    //   418: getfield 137	com/admob/android/ads/c:b	I
    //   421: istore 9
    //   423: aload 4
    //   425: iload 9
    //   427: invokevirtual 141	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   430: aload_0
    //   431: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   434: astore 4
    //   436: aload_0
    //   437: getfield 137	com/admob/android/ads/c:b	I
    //   440: istore 9
    //   442: aload 4
    //   444: iload 9
    //   446: invokevirtual 144	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   449: aload_0
    //   450: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   453: astore 4
    //   455: aconst_null
    //   456: astore 9
    //   458: aload 4
    //   460: aload 9
    //   462: invokevirtual 117	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   465: aload_0
    //   466: getfield 147	com/admob/android/ads/c:d	Ljava/util/Map;
    //   469: astore 4
    //   471: aload 4
    //   473: ifnull +256 -> 729
    //   476: aload_0
    //   477: getfield 147	com/admob/android/ads/c:d	Ljava/util/Map;
    //   480: invokeinterface 153 1 0
    //   485: astore 4
    //   487: aload 4
    //   489: invokeinterface 159 1 0
    //   494: astore 10
    //   496: aload 10
    //   498: invokeinterface 164 1 0
    //   503: astore 4
    //   505: iload 4
    //   507: ifeq +222 -> 729
    //   510: aload 10
    //   512: invokeinterface 168 1 0
    //   517: checkcast 170	java/lang/String
    //   520: astore 4
    //   522: aload 4
    //   524: ifnull -28 -> 496
    //   527: aload_0
    //   528: getfield 147	com/admob/android/ads/c:d	Ljava/util/Map;
    //   531: aload 4
    //   533: invokeinterface 174 2 0
    //   538: checkcast 170	java/lang/String
    //   541: astore 9
    //   543: aload 9
    //   545: ifnull -49 -> 496
    //   548: aload_0
    //   549: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   552: aload 4
    //   554: aload 9
    //   556: invokevirtual 177	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   559: goto -63 -> 496
    //   562: astore 4
    //   564: aload 8
    //   566: astore 9
    //   568: iconst_3
    //   569: istore 8
    //   571: ldc 66
    //   573: iload 8
    //   575: invokestatic 71	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   578: astore 11
    //   580: iload 11
    //   582: ifeq +67 -> 649
    //   585: ldc 66
    //   587: astore 11
    //   589: new 73	java/lang/StringBuilder
    //   592: dup
    //   593: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   596: ldc 179
    //   598: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: astore 8
    //   603: aload_0
    //   604: getfield 31	com/admob/android/ads/c:e	I
    //   607: istore 10
    //   609: aload 8
    //   611: iload 10
    //   613: invokevirtual 101	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   616: ldc 181
    //   618: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: astore 8
    //   623: aload_0
    //   624: getfield 22	com/admob/android/ads/c:n	Ljava/net/URL;
    //   627: astore 10
    //   629: aload 8
    //   631: aload 10
    //   633: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   636: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   639: astore 8
    //   641: aload 11
    //   643: aload 8
    //   645: invokestatic 91	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   648: pop
    //   649: iconst_2
    //   650: istore 8
    //   652: ldc 66
    //   654: iload 8
    //   656: invokestatic 71	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   659: astore 11
    //   661: iload 11
    //   663: ifeq +21 -> 684
    //   666: ldc 66
    //   668: astore 11
    //   670: ldc 183
    //   672: astore 8
    //   674: aload 11
    //   676: aload 8
    //   678: aload 4
    //   680: invokestatic 186	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   683: pop
    //   684: aload_0
    //   685: aload 4
    //   687: putfield 35	com/admob/android/ads/c:c	Ljava/lang/Exception;
    //   690: iload 9
    //   692: ifeq +8 -> 700
    //   695: aload 9
    //   697: invokevirtual 191	java/io/BufferedWriter:close	()V
    //   700: aload_0
    //   701: invokespecial 93	com/admob/android/ads/c:j	()V
    //   704: aload_3
    //   705: astore 4
    //   707: aload_0
    //   708: getfield 31	com/admob/android/ads/c:e	I
    //   711: istore 9
    //   713: iinc 9 1
    //   716: aload_0
    //   717: iload 9
    //   719: putfield 31	com/admob/android/ads/c:e	I
    //   722: aload 4
    //   724: astore 11
    //   726: goto -536 -> 190
    //   729: aload_0
    //   730: getfield 194	com/admob/android/ads/c:l	Ljava/lang/String;
    //   733: astore 4
    //   735: aload 4
    //   737: ifnull +349 -> 1086
    //   740: aload_0
    //   741: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   744: ldc 196
    //   746: invokevirtual 199	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   749: aload_0
    //   750: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   753: iconst_1
    //   754: invokevirtual 202	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   757: aload_0
    //   758: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   761: astore 4
    //   763: aload_0
    //   764: getfield 204	com/admob/android/ads/c:a	Ljava/lang/String;
    //   767: astore 10
    //   769: aload 4
    //   771: ldc 206
    //   773: aload 10
    //   775: invokevirtual 128	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   778: aload_0
    //   779: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   782: astore 4
    //   784: aload_0
    //   785: getfield 194	com/admob/android/ads/c:l	Ljava/lang/String;
    //   788: invokevirtual 210	java/lang/String:length	()I
    //   791: invokestatic 215	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   794: astore 10
    //   796: aload 4
    //   798: ldc 217
    //   800: aload 10
    //   802: invokevirtual 128	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   805: aload_0
    //   806: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   809: invokevirtual 221	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   812: astore 4
    //   814: new 223	java/io/OutputStreamWriter
    //   817: dup
    //   818: aload 4
    //   820: invokespecial 226	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   823: astore 10
    //   825: sipush 4096
    //   828: istore 4
    //   830: new 188	java/io/BufferedWriter
    //   833: dup
    //   834: aload 10
    //   836: iload 4
    //   838: invokespecial 229	java/io/BufferedWriter:<init>	(Ljava/io/Writer;I)V
    //   841: astore 9
    //   843: aload_0
    //   844: getfield 194	com/admob/android/ads/c:l	Ljava/lang/String;
    //   847: astore 4
    //   849: aload 9
    //   851: aload 4
    //   853: invokevirtual 232	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   856: aload 9
    //   858: invokevirtual 191	java/io/BufferedWriter:close	()V
    //   861: aconst_null
    //   862: astore 4
    //   864: aload_0
    //   865: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   868: invokevirtual 235	java/net/HttpURLConnection:getResponseCode	()I
    //   871: astore 9
    //   873: iconst_2
    //   874: istore 10
    //   876: ldc 66
    //   878: iload 10
    //   880: invokestatic 71	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   883: astore 8
    //   885: iload 8
    //   887: ifeq +61 -> 948
    //   890: aload_0
    //   891: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   894: astore 8
    //   896: ldc 237
    //   898: astore 10
    //   900: aload 8
    //   902: aload 10
    //   904: invokevirtual 64	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   907: astore 8
    //   909: aload 8
    //   911: ifnull +37 -> 948
    //   914: ldc 66
    //   916: astore 10
    //   918: new 73	java/lang/StringBuilder
    //   921: dup
    //   922: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   925: ldc 239
    //   927: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   930: aload 8
    //   932: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   935: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   938: astore 8
    //   940: aload 10
    //   942: aload 8
    //   944: invokestatic 109	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   947: pop
    //   948: sipush 200
    //   951: istore 8
    //   953: iload 9
    //   955: iload 8
    //   957: if_icmplt -862 -> 95
    //   960: sipush 300
    //   963: istore 8
    //   965: iload 9
    //   967: iload 8
    //   969: if_icmpge -874 -> 95
    //   972: aload_0
    //   973: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   976: invokevirtual 243	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   979: astore 9
    //   981: aload_0
    //   982: aload 9
    //   984: putfield 25	com/admob/android/ads/c:i	Ljava/net/URL;
    //   987: aload_0
    //   988: getfield 247	com/admob/android/ads/c:k	Z
    //   991: istore 9
    //   993: iload 9
    //   995: ifeq +122 -> 1117
    //   998: aload_0
    //   999: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   1002: invokevirtual 251	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   1005: astore 11
    //   1007: new 253	java/io/BufferedInputStream
    //   1010: dup
    //   1011: aload 11
    //   1013: sipush 4096
    //   1016: invokespecial 256	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   1019: astore 9
    //   1021: sipush 4096
    //   1024: newarray byte
    //   1026: astore 11
    //   1028: sipush 4096
    //   1031: istore 10
    //   1033: new 258	java/io/ByteArrayOutputStream
    //   1036: dup
    //   1037: iload 10
    //   1039: invokespecial 260	java/io/ByteArrayOutputStream:<init>	(I)V
    //   1042: astore 8
    //   1044: aload 9
    //   1046: aload 11
    //   1048: invokevirtual 264	java/io/BufferedInputStream:read	([B)I
    //   1051: astore 10
    //   1053: iload 10
    //   1055: bipush 255
    //   1057: if_icmpeq +47 -> 1104
    //   1060: aload 8
    //   1062: aload 11
    //   1064: iconst_0
    //   1065: iload 10
    //   1067: invokevirtual 267	java/io/ByteArrayOutputStream:write	([BII)V
    //   1070: goto -26 -> 1044
    //   1073: astore 12
    //   1075: aload 4
    //   1077: astore 9
    //   1079: aload 12
    //   1081: astore 4
    //   1083: goto -515 -> 568
    //   1086: aload_0
    //   1087: getfield 27	com/admob/android/ads/c:m	Ljava/net/HttpURLConnection;
    //   1090: astore 4
    //   1092: aload 4
    //   1094: invokevirtual 270	java/net/HttpURLConnection:connect	()V
    //   1097: aload 8
    //   1099: astore 4
    //   1101: goto -237 -> 864
    //   1104: aload 8
    //   1106: invokevirtual 274	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   1109: astore 9
    //   1111: aload_0
    //   1112: aload 9
    //   1114: putfield 277	com/admob/android/ads/c:j	[B
    //   1117: aload_0
    //   1118: getfield 50	com/admob/android/ads/c:h	Lcom/admob/android/ads/b;
    //   1121: astore 9
    //   1123: aload 9
    //   1125: ifnull +17 -> 1142
    //   1128: aload_0
    //   1129: getfield 50	com/admob/android/ads/c:h	Lcom/admob/android/ads/b;
    //   1132: astore 9
    //   1134: aload 9
    //   1136: aload_0
    //   1137: invokeinterface 280 2 0
    //   1142: iload_2
    //   1143: istore 9
    //   1145: aload_0
    //   1146: invokespecial 93	com/admob/android/ads/c:j	()V
    //   1149: aload_0
    //   1150: invokespecial 93	com/admob/android/ads/c:j	()V
    //   1153: aload 9
    //   1155: astore 4
    //   1157: goto -450 -> 707
    //   1160: astore 4
    //   1162: aload 8
    //   1164: astore 9
    //   1166: iload 9
    //   1168: ifeq +8 -> 1176
    //   1171: aload 9
    //   1173: invokevirtual 191	java/io/BufferedWriter:close	()V
    //   1176: aload_0
    //   1177: invokespecial 93	com/admob/android/ads/c:j	()V
    //   1180: aload 4
    //   1182: athrow
    //   1183: astore 4
    //   1185: goto -485 -> 700
    //   1188: astore 13
    //   1190: goto -14 -> 1176
    //   1193: astore 4
    //   1195: goto -29 -> 1166
    //   1198: astore 14
    //   1200: aload 4
    //   1202: astore 9
    //   1204: aload 14
    //   1206: astore 4
    //   1208: goto -42 -> 1166
    //   1211: astore 4
    //   1213: goto -645 -> 568
    //   1216: aload 11
    //   1218: astore 9
    //   1220: goto -75 -> 1145
    //   1223: aload 8
    //   1225: astore 4
    //   1227: aload 11
    //   1229: astore 9
    //   1231: goto -86 -> 1145
    //   1234: aload 11
    //   1236: astore 4
    //   1238: goto -1180 -> 58
    //   1241: aload_3
    //   1242: astore 11
    //   1244: goto -1054 -> 190
    //
    // Exception table:
    //   from	to	target	type
    //   294	559	562	java/lang/Exception
    //   729	843	562	java/lang/Exception
    //   1086	1097	562	java/lang/Exception
    //   107	186	1073	java/lang/Exception
    //   864	1070	1073	java/lang/Exception
    //   1104	1149	1073	java/lang/Exception
    //   294	559	1160	finally
    //   729	843	1160	finally
    //   1086	1097	1160	finally
    //   695	700	1183	java/lang/Exception
    //   1171	1176	1188	java/lang/Exception
    //   568	690	1193	finally
    //   843	861	1193	finally
    //   107	186	1198	finally
    //   864	1070	1198	finally
    //   1104	1149	1198	finally
    //   843	861	1211	java/lang/Exception
  }

  public final void b()
  {
    j();
    this.h = null;
  }

  public final void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException1)
    {
      while (true)
      {
        if (bh.a("AdMobSDK", 6))
        {
          StringBuilder localStringBuilder = new StringBuilder().append("exception caught in AdMobURLConnector.run(), ");
          String str1 = localException1.getMessage();
          String str2 = localException1;
          Log.e("AdMobSDK", localException1);
        }
        if (this.h == null)
          continue;
        b localb = this.h;
        Exception localException2 = this.c;
        localb.a(this, localException2);
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.c
 * JD-Core Version:    0.6.0
 */