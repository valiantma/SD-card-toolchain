package com.admob.android.ads;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab
  implements i
{
  public ci a;
  public String b;
  public Vector c;
  public String d;
  public be e;
  public boolean f;
  public Point g;
  public x h;
  public String i;
  public String j;
  public Bundle k;
  public boolean l;
  private boolean m;
  private Point n;
  private String o;

  public ab()
  {
    ci localci = ci.a;
    this.a = localci;
    this.b = "";
    Vector localVector = new Vector();
    this.c = localVector;
    this.d = null;
    be localbe = be.c;
    this.e = localbe;
    this.m = null;
    Point localPoint1 = new Point(4, 4);
    this.g = localPoint1;
    this.f = null;
    Point localPoint2 = new Point(0, 0);
    this.n = localPoint2;
    this.h = null;
    this.i = null;
    this.j = null;
    this.o = null;
    Bundle localBundle = new Bundle();
    this.k = localBundle;
    this.l = null;
  }

  private static Point a(int[] paramArrayOfInt)
  {
    int i1;
    if (paramArrayOfInt != null)
    {
      i1 = paramArrayOfInt.length;
      if (i1 != 2);
    }
    else
    {
      i1 = 0;
    }
    while (true)
    {
      return i1;
      int i2 = paramArrayOfInt[null];
      int i3 = paramArrayOfInt[1];
      Point localPoint = new Point(i2, i3);
    }
  }

  public static boolean a(byte paramByte)
  {
    byte b1 = 1;
    if (paramByte == b1);
    while (true)
    {
      return b1;
      Object localObject = null;
    }
  }

  private static int[] a(Point paramPoint)
  {
    int i1;
    if (paramPoint == null)
      i1 = 0;
    while (true)
    {
      return i1;
      int[] arrayOfInt = new int[2];
      int i2 = paramPoint.x;
      arrayOfInt[0] = i2;
      int i3 = paramPoint.y;
      arrayOfInt[1] = i3;
    }
  }

  public final Bundle a()
  {
    boolean bool1 = true;
    Object localObject1 = null;
    Bundle localBundle = new Bundle();
    Object localObject2 = this.a.toString();
    localBundle.putString("a", (String)localObject2);
    localObject2 = this.b;
    localBundle.putString("t", (String)localObject2);
    localObject2 = ae.a(this.c);
    localBundle.putParcelableArrayList("c", (ArrayList)localObject2);
    localObject2 = this.d;
    localBundle.putString("u", (String)localObject2);
    localObject2 = this.e.ordinal();
    localBundle.putInt("or", localObject2);
    String str = "tr";
    boolean bool2 = this.m;
    label135: boolean bool3;
    if (bool2)
    {
      bool2 = bool1;
      localBundle.putByte(str, bool2);
      str = "sc";
      bool2 = this.f;
      if (!bool2)
        break label284;
      bool2 = bool1;
      localBundle.putByte(str, bool2);
      Object localObject3 = a(this.g);
      localBundle.putIntArray("cbo", localObject3);
      localObject3 = a(this.n);
      localBundle.putIntArray("cs", localObject3);
      localObject3 = ae.a(this.h);
      localBundle.putBundle("mi", (Bundle)localObject3);
      localObject3 = this.i;
      localBundle.putString("su", (String)localObject3);
      localObject3 = this.j;
      localBundle.putString("si", (String)localObject3);
      localObject3 = this.o;
      localBundle.putString("json", (String)localObject3);
      localObject3 = this.k;
      localBundle.putBundle("$", (Bundle)localObject3);
      str = "int";
      bool3 = this.l;
      if (!bool3)
        break label290;
      bool3 = bool1;
    }
    while (true)
    {
      localBundle.putByte(str, bool3);
      return localBundle;
      Object localObject4 = localObject1;
      break;
      label284: localObject4 = localObject1;
      break label135;
      label290: localObject4 = localObject1;
    }
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (!"".equals(paramString)))
    {
      Vector localVector = this.c;
      q localq = new q(paramString, paramBoolean);
      localVector.add(localq);
    }
  }

  public final void a(JSONObject paramJSONObject, ai paramai, String paramString)
  {
    int i1 = 2;
    Object localObject1 = 1;
    Object localObject2 = 0;
    Object localObject3 = ci.a(paramJSONObject.optString("a"));
    this.a = ((ci)localObject3);
    localObject3 = paramJSONObject.optString("au");
    a((String)localObject3, localObject1);
    localObject3 = paramJSONObject.optString("tu");
    a((String)localObject3, localObject2);
    localObject3 = paramJSONObject.optJSONObject("stats");
    Object localObject4;
    if (localObject3 != null)
    {
      localObject4 = ((JSONObject)localObject3).optString("url");
      this.i = ((String)localObject4);
      localObject4 = "id";
      localObject3 = ((JSONObject)localObject3).optString((String)localObject4);
      this.j = ((String)localObject3);
    }
    localObject3 = paramJSONObject.optString("or");
    if (localObject3 != null)
    {
      localObject4 = ((String)localObject3).equals("");
      if (localObject4 == 0)
      {
        localObject4 = "l";
        localObject3 = ((String)localObject4).equals(localObject3);
        if (localObject3 == 0)
          break label700;
        localObject3 = be.b;
        this.e = ((be)localObject3);
      }
    }
    while (true)
    {
      localObject3 = paramJSONObject.opt("t");
      if (localObject3 != null)
      {
        localObject3 = localObject1;
        label178: this.m = localObject3;
        localObject3 = paramJSONObject.optString("title");
        this.b = ((String)localObject3);
        localObject3 = this.a;
        localObject4 = ci.c;
        if (localObject3 != localObject4)
          break label721;
        localObject3 = new x();
        this.h = ((x)localObject3);
        localObject3 = paramJSONObject.optJSONObject("$");
        if (paramai == null);
      }
      try
      {
        paramai.a((JSONObject)localObject3, paramString);
        label250: localObject3 = this.h;
        localObject4 = paramJSONObject.optString("u");
        ((x)localObject3).a = ((String)localObject4);
        localObject3 = this.h;
        localObject4 = paramJSONObject.optString("title");
        ((x)localObject3).b = ((String)localObject4);
        localObject3 = this.h;
        localObject4 = paramJSONObject.optInt("mc", i1);
        ((x)localObject3).c = localObject4;
        localObject3 = this.h;
        localObject4 = paramJSONObject.optInt("msm", localObject2);
        ((x)localObject3).d = localObject4;
        localObject3 = this.h;
        localObject4 = paramJSONObject.optString("stats");
        ((x)localObject3).e = ((String)localObject4);
        localObject3 = this.h;
        localObject4 = paramJSONObject.optString("splash");
        ((x)localObject3).f = ((String)localObject4);
        localObject3 = this.h;
        long l1 = 4609434218613702656L;
        localObject4 = paramJSONObject.optDouble("splash_duration", l1);
        Object localObject5;
        ((x)localObject3).g = localObject5;
        localObject3 = this.h;
        localObject4 = paramJSONObject.optString("skip_down");
        ((x)localObject3).h = ((String)localObject4);
        localObject3 = this.h;
        localObject4 = paramJSONObject.optString("skip_up");
        ((x)localObject3).i = ((String)localObject4);
        localObject3 = this.h;
        localObject4 = paramJSONObject.optBoolean("no_splash_skip");
        ((x)localObject3).j = localObject4;
        localObject3 = this.h;
        localObject4 = paramJSONObject.optString("replay_down");
        ((x)localObject3).k = ((String)localObject4);
        localObject3 = this.h;
        localObject4 = paramJSONObject.optString("replay_up");
        ((x)localObject3).l = ((String)localObject4);
        localObject3 = paramJSONObject.optJSONArray("buttons");
        if (localObject3 != null)
        {
          localObject4 = ((JSONArray)localObject3).length();
          Object localObject6 = localObject2;
          while (true)
            if (localObject6 < localObject4)
            {
              JSONObject localJSONObject1 = ((JSONArray)localObject3).optJSONObject(localObject6);
              z localz = new z();
              String str1 = localJSONObject1.optString("$");
              localz.a = str1;
              String str2 = localJSONObject1.optString("h");
              localz.b = str2;
              String str3 = localJSONObject1.optString("x");
              localz.c = str3;
              String str4 = localJSONObject1.optString("analytics_page_name");
              localz.e = str4;
              ab localab = localz.d;
              JSONObject localJSONObject2 = localJSONObject1.optJSONObject("o");
              localab.a(localJSONObject2, paramai, paramString);
              String str5 = localJSONObject1.optJSONObject("o").toString();
              localz.f = str5;
              this.h.m.add(localz);
              localObject6++;
              continue;
              label700: localObject3 = be.a;
              this.e = ((be)localObject3);
              break;
              localObject3 = localObject2;
              break label178;
            }
        }
        label721: localObject3 = paramJSONObject.optInt("sc", localObject2);
        if (localObject3 != 0);
        for (localObject3 = localObject1; ; localObject3 = localObject2)
        {
          this.f = localObject3;
          localObject3 = paramJSONObject.optJSONArray("co");
          if ((localObject3 != null) && (((JSONArray)localObject3).length() >= i1))
          {
            int i2 = ((JSONArray)localObject3).optInt(localObject2);
            int i3 = ((JSONArray)localObject3).optInt(localObject1);
            Point localPoint = new Point(i2, localObject3);
            this.g = localPoint;
          }
          String str6 = paramJSONObject.toString();
          this.o = str6;
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        break label250;
      }
    }
  }

  public final boolean a(Bundle paramBundle)
  {
    int i1 = 4;
    boolean bool1 = null;
    if (paramBundle == null)
    {
      boolean bool2 = bool1;
      return bool2;
    }
    Object localObject = ci.a(paramBundle.getString("a"));
    this.a = ((ci)localObject);
    localObject = paramBundle.getString("t");
    this.b = ((String)localObject);
    localObject = new Vector();
    this.c = ((Vector)localObject);
    localObject = paramBundle.getParcelableArrayList("c");
    if (localObject != null)
    {
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (true)
      {
        localObject = localIterator.hasNext();
        if (localObject == 0)
          break;
        localObject = (Bundle)localIterator.next();
        if (localObject == null)
          continue;
        q localq = new q();
        String str = ((Bundle)localObject).getString("u");
        localq.a = str;
        localObject = ((Bundle)localObject).getBoolean("p", bool1);
        localq.b = localObject;
        localObject = this.c;
        ((Vector)localObject).add(localq);
      }
    }
    localObject = paramBundle.getString("u");
    this.d = ((String)localObject);
    localObject = be.a(paramBundle.getInt("or"));
    this.e = ((be)localObject);
    localObject = a(paramBundle.getByte("tr"));
    this.m = localObject;
    localObject = a(paramBundle.getByte("sc"));
    this.f = localObject;
    localObject = a(paramBundle.getIntArray("cbo"));
    this.g = ((Point)localObject);
    localObject = this.g;
    if (localObject == null)
    {
      localObject = new Point(i1, i1);
      this.g = ((Point)localObject);
    }
    localObject = a(paramBundle.getIntArray("cs"));
    this.n = ((Point)localObject);
    localObject = new x();
    Bundle localBundle = paramBundle.getBundle("mi");
    if (((x)localObject).a(localBundle));
    int i2;
    for (this.h = ((x)localObject); ; this.h = i2)
    {
      localObject = paramBundle.getString("su");
      this.i = ((String)localObject);
      localObject = paramBundle.getString("si");
      this.j = ((String)localObject);
      localObject = paramBundle.getString("json");
      this.o = ((String)localObject);
      localObject = paramBundle.getBundle("$");
      this.k = ((Bundle)localObject);
      localObject = a(paramBundle.getByte("int"));
      this.l = localObject;
      i2 = 1;
      break;
      i2 = 0;
    }
  }

  public final Hashtable b()
  {
    Object localObject = this.k.keySet();
    Hashtable localHashtable = new Hashtable();
    Iterator localIterator = ((Set)localObject).iterator();
    while (true)
    {
      localObject = localIterator.hasNext();
      if (localObject == 0)
        break;
      localObject = (String)localIterator.next();
      Parcelable localParcelable = this.k.getParcelable((String)localObject);
      if (!(localParcelable instanceof Bitmap))
        continue;
      Bitmap localBitmap = (Bitmap)localParcelable;
      localHashtable.put(localObject, localParcelable);
    }
    return (Hashtable)localHashtable;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ab
 * JD-Core Version:    0.6.0
 */