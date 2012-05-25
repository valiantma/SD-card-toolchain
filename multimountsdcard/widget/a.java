package com.rafoid.multimountsdcard.widget;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public final class a
{
  private final String a = "/dev/block/vold/179:1";
  private final String b = "/dev/block/vold/179:9";
  private final String c = "/dev/block/vold/179:32";
  private final String d = "/dev/block/vold/179:3";
  private final String e = "/dev/block/vold/179:0";
  private final String f = "/sys/devices/platform/s3c-usbgadget/gadget/lun%d/file";
  private final String g = "/sys/devices/platform/msm_hsusb/gadget/lun%d/file";
  private final String h = "/sys/devices/platform/s3c6410-usbgadget/gadget/lun%d/file";
  private final String i = "/sys/devices/platform/usb_mass_storage/lun%d/file";
  private final String j = "cat %s > %s";
  private final String k = "cat %s";
  private boolean l;
  private boolean m;
  private Context n;
  private String o;
  private String p;
  private ArrayList q;
  private ArrayList r;
  private ArrayList s;
  private ArrayList t;
  private ArrayList u;

  a(Context paramContext)
  {
    this.m = i2;
    this.p = "all";
    ArrayList localArrayList1 = new ArrayList();
    this.q = localArrayList1;
    ArrayList localArrayList2 = new ArrayList();
    this.r = localArrayList2;
    ArrayList localArrayList3 = new ArrayList();
    this.s = localArrayList3;
    ArrayList localArrayList4 = new ArrayList();
    this.t = localArrayList4;
    ArrayList localArrayList5 = new ArrayList();
    this.u = localArrayList5;
    this.n = paramContext;
    this.l = i2;
    this.q.clear();
    this.s.clear();
    this.t.clear();
    this.u.clear();
    d("/sys/devices/platform/s3c-usbgadget/gadget/lun%d/file");
    d("/sys/devices/platform/msm_hsusb/gadget/lun%d/file");
    d("/sys/devices/platform/s3c6410-usbgadget/gadget/lun%d/file");
    d("/sys/devices/platform/usb_mass_storage/lun%d/file");
    g();
    if ((this.l) && (this.q.size() > i1))
    {
      this.s.clear();
      String str1 = (String)this.q.get(i2);
      ArrayList localArrayList6 = this.q;
      String str2 = (String)this.q.get(i1);
      localArrayList6.set(i2, str2);
      this.q.set(i1, str1);
    }
    f();
  }

  private static void a(String paramString, ArrayList paramArrayList)
  {
    int i1 = 0;
    for (int i2 = i1; ; i2++)
    {
      int i3 = paramArrayList.size();
      if (i2 >= i3)
        return;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[i1] = paramString;
      Object localObject = paramArrayList.get(i2);
      arrayOfObject[1] = localObject;
      com.rafoid.core.a.a(String.format("cat %s > %s", arrayOfObject));
    }
  }

  private static boolean a(ArrayList paramArrayList)
  {
    boolean bool1 = true;
    int i1 = 0;
    int i2 = i1;
    int i3 = i1;
    int i4 = paramArrayList.size();
    if (i2 >= i4)
      return i3;
    Object[] arrayOfObject = new Object[bool1];
    Object localObject = paramArrayList.get(i2);
    arrayOfObject[i1] = localObject;
    String str = com.rafoid.core.a.a(String.format("cat %s", arrayOfObject));
    if (i3 == 0)
    {
      bool2 = str.equals("");
      if (!bool2);
    }
    for (boolean bool2 = i1; ; bool2 = bool1)
    {
      i2++;
      break;
    }
  }

  private static boolean b(String paramString)
  {
    return new File(paramString).exists();
  }

  private void c(String paramString)
  {
    if (b(paramString))
      this.q.add(paramString);
  }

  private void d(String paramString)
  {
    int i1 = 2;
    int i2 = 0;
    int i3 = 1;
    for (int i4 = i2; ; i4++)
    {
      if (i4 > i1)
        return;
      Object localObject = new Object[i3];
      Integer localInteger = Integer.valueOf(i4);
      localObject[i2] = localInteger;
      localObject = String.format(paramString, localObject);
      if (!b((String)localObject))
        continue;
      if (i4 == 0)
        this.s.add(localObject);
      if (i4 == i3)
        this.t.add(localObject);
      if (i4 != i1)
        continue;
      this.l = i3;
      this.u.add(localObject);
    }
  }

  private void f()
  {
    File localFile = this.n.getDir("data", 3);
    String str1 = "empty";
    Object localObject = new File(localFile, str1).getAbsolutePath();
    this.o = ((String)localObject);
    while (true)
    {
      String str3;
      try
      {
        str1 = this.o;
        localObject = new FileWriter(str1);
        str1 = "\n";
        ((FileWriter)localObject).write(str1);
        ((FileWriter)localObject).flush();
        ((FileWriter)localObject).close();
        String str2 = 0;
        str1 = str2;
        int i1 = this.q.size();
        if (str1 >= i1)
          return;
      }
      catch (IOException str3)
      {
        localIOException1.printStackTrace();
        continue;
        StringBuilder localStringBuilder = new StringBuilder("SD");
        String str5 = Integer.toString(str1);
        String str6 = str5;
        str3 = new File(localFile, str6).getAbsolutePath();
      }
      try
      {
        this.r.add(str3);
        FileWriter localFileWriter = new FileWriter(str3);
        String str7 = (String)this.q.get(str1);
        localFileWriter.write(str3);
        localFileWriter.flush();
        localFileWriter.close();
        String str4 = str1 + 1;
        str1 = str4;
      }
      catch (IOException localIOException2)
      {
        while (true)
          localIOException2.printStackTrace();
      }
    }
  }

  private void g()
  {
    Object localObject1 = null;
    Object localObject2 = com.rafoid.core.a.a("df /mnt/sdcard/").split("\n");
    Object localObject3 = "";
    while (true)
    {
      int i1 = localObject2.length;
      label28: Object localObject4;
      if (localObject1 >= i1)
      {
        localObject2 = localObject3;
        localObject3 = ((String)localObject2).length();
        if (localObject3 == 0)
        {
          localObject2 = this.n.getDir("data", 3);
          localObject3 = this.n.getResources().openRawResource(2131034112);
          localObject4 = "sdcard";
          localObject2 = new File((File)localObject2, (String)localObject4).getAbsolutePath();
          localObject1 = new File((String)localObject2);
        }
      }
      try
      {
        localObject4 = new FileOutputStream((File)localObject1);
        localObject1 = new byte[1024];
        while (true)
        {
          int i2 = ((InputStream)localObject3).read(localObject1);
          String str;
          if (i2 <= 0)
          {
            ((OutputStream)localObject4).close();
            ((InputStream)localObject3).close();
            localObject2 = com.rafoid.core.a.a("sh " + (String)localObject2).trim();
            if ((this.l) || (((String)localObject2).length() <= 0))
              break label237;
            c((String)localObject2);
            return;
            localObject4 = localObject2[localObject1];
            str = "vold";
            localObject4 = ((String)localObject4).contains(str);
            if (localObject4 != 0)
            {
              localObject2 = localObject2[localObject1].trim();
              break label28;
            }
            localObject1++;
            break;
          }
          int i3 = null;
          ((OutputStream)localObject4).write(localObject1, i3, str);
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        while (true)
          localFileNotFoundException.printStackTrace();
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          localIOException.printStackTrace();
          continue;
          label237: c("/dev/block/vold/179:3");
          c("/dev/block/vold/179:9");
          c("/dev/block/vold/179:1");
          c("/dev/block/vold/179:32");
          if (this.q.size() != 0)
            continue;
          c("/dev/block/vold/179:0");
        }
      }
    }
  }

  public final void a(String paramString)
  {
    this.p = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  public final boolean a()
  {
    Object localObject = com.rafoid.core.a.a("cat /sys/class/power_supply/usb/online");
    String str = com.rafoid.core.a.a("cat /sys/class/power_supply/ac/online");
    if ((!this.m) && ((!((String)localObject).equals("1")) || (!str.equals("0"))))
    {
      localObject = ((String)localObject).length();
      if (localObject != 0)
      {
        localObject = str.length();
        if (localObject != 0)
          localObject = null;
      }
    }
    while (true)
    {
      return localObject;
      int i1 = 1;
    }
  }

  public final boolean b()
  {
    int i1 = 1;
    int i2 = this.q.size();
    if (i2 > i1)
      i2 = i1;
    while (true)
    {
      return i2;
      Object localObject = null;
    }
  }

  public final void c()
  {
    int i1 = 1;
    int i2 = 0;
    int i3 = this.r.size();
    if (i2 >= i3)
      return;
    if (!this.l)
    {
      if ((i2 == 0) && ((this.p.equals("internal_external")) || (this.p.equals("internal"))))
      {
        String str1 = (String)this.r.get(i2);
        ArrayList localArrayList1 = this.s;
        a(str1, localArrayList1);
      }
      if ((i2 == i1) && ((this.p.equals("internal_external")) || (this.p.equals("external"))))
      {
        String str2 = (String)this.r.get(i2);
        ArrayList localArrayList2 = this.t;
        a(str2, localArrayList2);
      }
    }
    while (true)
    {
      i2 += 1;
      break;
      if ((i2 == 0) && ((this.p.equals("internal_external")) || (this.p.equals("internal"))))
      {
        String str3 = (String)this.r.get(i2);
        ArrayList localArrayList3 = this.t;
        a(str3, localArrayList3);
      }
      if ((i2 != i1) || ((!this.p.equals("internal_external")) && (!this.p.equals("external"))))
        continue;
      String str4 = (String)this.r.get(i2);
      ArrayList localArrayList4 = this.u;
      a(str4, localArrayList4);
    }
  }

  public final void d()
  {
    int i1 = 1;
    Object localObject = null;
    int i2 = this.q.size();
    if (localObject >= i2)
      return;
    if (!this.l)
    {
      if (localObject == null)
      {
        String str1 = this.o;
        ArrayList localArrayList1 = this.s;
        a(str1, localArrayList1);
      }
      if (localObject == i1)
      {
        String str2 = this.o;
        ArrayList localArrayList2 = this.t;
        a(str2, localArrayList2);
      }
    }
    while (true)
    {
      localObject++;
      break;
      if (localObject == null)
      {
        String str3 = this.o;
        ArrayList localArrayList3 = this.t;
        a(str3, localArrayList3);
      }
      if (localObject != i1)
        continue;
      String str4 = this.o;
      ArrayList localArrayList4 = this.u;
      a(str4, localArrayList4);
    }
  }

  public final boolean e()
  {
    Object localObject1 = 1;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject4 = localObject2;
    int i1 = this.q.size();
    if (localObject3 >= i1)
      return localObject4;
    if (!this.l)
      if (localObject3 == null)
      {
        if (localObject4 == null)
        {
          localObject4 = a(this.s);
          if (localObject4 == 0)
            localObject4 = localObject2;
        }
      }
      else
        label60: if (localObject3 == localObject1)
        {
          if (localObject4 != null)
            break label99;
          localObject4 = a(this.t);
          if (localObject4 != 0)
            break label99;
          localObject4 = localObject2;
        }
    while (true)
    {
      localObject3++;
      break;
      localObject4 = localObject1;
      break label60;
      label99: localObject4 = localObject1;
      continue;
      if (localObject3 == null)
      {
        if (localObject4 != null)
          break label161;
        localObject4 = a(this.t);
        if (localObject4 != 0)
          break label161;
        localObject4 = localObject2;
      }
      while (true)
      {
        if (localObject3 != localObject1)
          break label165;
        if (localObject4 != null)
          break label167;
        localObject4 = a(this.u);
        if (localObject4 != 0)
          break label167;
        localObject4 = localObject2;
        break;
        label161: localObject4 = localObject1;
      }
      label165: continue;
      label167: localObject4 = localObject1;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.a
 * JD-Core Version:    0.6.0
 */