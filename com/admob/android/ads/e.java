package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  implements bp
{
  private static final int a = Color.rgb(102, 102, 102);
  private static final Rect b = new Rect(0, 0, 0, 0);
  private static final PointF c;
  private static final PointF d;
  private static final PointF e;
  private static final Matrix f;
  private static final RectF g;
  private static float h;
  private static Handler i;
  private cg A;
  private double B;
  private double C;
  private ad D;
  private ch E;
  private boolean F;
  private ag G;
  private String j;
  private boolean k;
  private boolean l;
  private Vector m;
  private Rect n;
  private long o;
  private int p;
  private int q;
  private WeakReference r;
  private f s;
  private int t;
  private int u;
  private int v;
  private JSONObject w;
  private ai x;
  private int y;
  private Vector z;

  static
  {
    PointF localPointF = new PointF(null, null);
    c = localPointF;
    d = localPointF;
    e = new PointF(1056964608, 1056964608);
    f = new Matrix();
    g = new RectF(null, null, null, null);
    h = -1082130432;
    i = null;
  }

  protected e()
  {
    Vector localVector1 = new Vector();
    this.m = localVector1;
    this.o = 0L;
    a(null);
    this.j = null;
    this.n = null;
    this.p = -1;
    this.q = -1;
    this.A = null;
    this.u = -1;
    this.t = -1;
    this.v = -16777216;
    ai localai = new ai(this);
    this.x = localai;
    this.y = null;
    Vector localVector2 = new Vector();
    this.z = localVector2;
    this.B = -4616189618054758400L;
    this.C = -4616189618054758400L;
    ad localad = new ad();
    this.D = localad;
    ch localch = ch.c;
    this.E = localch;
    h = 1084227584;
    this.F = null;
    this.G = null;
  }

  private static float a(JSONObject paramJSONObject, String paramString, float paramFloat)
  {
    double d1 = paramFloat;
    return (float)paramJSONObject.optDouble(paramString, d1);
  }

  public static int a(int paramInt, double paramDouble)
  {
    double d1 = paramInt;
    if (paramDouble > 0L)
      d1 *= paramDouble;
    return (int)d1;
  }

  private static int a(JSONObject paramJSONObject, String paramString, int paramInt)
  {
    long l1 = 4643176031446892544L;
    if (paramJSONObject != null)
    {
      boolean bool = paramJSONObject.has(paramString);
      if (!bool);
    }
    while (true)
    {
      try
      {
        Object localObject = paramJSONObject.getJSONArray(paramString);
        int i2 = (int)(((JSONArray)localObject).getDouble(0) * l1);
        int i3 = (int)(((JSONArray)localObject).getDouble(1) * l1);
        int i4 = (int)(((JSONArray)localObject).getDouble(2) * l1);
        localObject = Color.argb((int)(((JSONArray)localObject).getDouble(3) * l1), i2, i3, i4);
        return localObject;
      }
      catch (Exception i1)
      {
        i1 = paramInt;
        continue;
      }
      int i1 = paramInt;
    }
  }

  private static Matrix a(JSONArray paramJSONArray)
  {
    int i1 = 0;
    float[] arrayOfFloat = b(paramJSONArray);
    Matrix localMatrix;
    if ((arrayOfFloat != null) && (arrayOfFloat.length == 9))
    {
      localMatrix = new Matrix();
      localMatrix.setValues(arrayOfFloat);
    }
    return localMatrix;
  }

  private static Matrix a(JSONObject paramJSONObject, String paramString, Matrix paramMatrix)
  {
    Object localObject = b(paramJSONObject, paramString);
    Matrix localMatrix;
    if ((localObject != null) && (localObject.length == 9))
    {
      localMatrix = new Matrix();
      localMatrix.setValues(localObject);
    }
    for (localObject = localMatrix; ; localObject = paramMatrix)
      return localObject;
  }

  private static PointF a(RectF paramRectF, PointF paramPointF)
  {
    float f1 = paramRectF.width();
    float f2 = paramRectF.height();
    int i1 = paramRectF.left;
    int i2 = paramPointF.x;
    float f3 = f1 * i2 + i1;
    int i3 = paramRectF.top;
    int i4 = paramPointF.y;
    float f4 = f2 * i4 + i3;
    return new PointF(f3, f4);
  }

  private static PointF a(JSONObject paramJSONObject, String paramString, PointF paramPointF)
  {
    if (paramJSONObject != null)
    {
      boolean bool = paramJSONObject.has(paramString);
      if (!bool);
    }
    while (true)
    {
      try
      {
        PointF localPointF1 = e(paramJSONObject.getJSONArray(paramString));
        return localPointF1;
      }
      catch (JSONException localPointF2)
      {
        localPointF2 = paramPointF;
        continue;
      }
      PointF localPointF2 = paramPointF;
    }
  }

  private static Rect a(JSONObject paramJSONObject, String paramString, Rect paramRect)
  {
    if (paramJSONObject != null)
    {
      boolean bool = paramJSONObject.has(paramString);
      if (!bool);
    }
    while (true)
    {
      try
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray(paramString);
        int i2 = (int)localJSONArray.getDouble(0);
        int i3 = (int)localJSONArray.getDouble(1);
        int i4 = (int)localJSONArray.getDouble(2);
        int i1 = (int)localJSONArray.getDouble(3);
        int i5 = i4 + i2;
        i1 += i3;
        Rect localRect2 = new Rect(i2, i3, i5, i1);
        Object localObject = localRect2;
        return localObject;
      }
      catch (JSONException localRect1)
      {
        localRect1 = paramRect;
        continue;
      }
      Rect localRect1 = paramRect;
    }
  }

  private static RectF a(JSONObject paramJSONObject, String paramString, RectF paramRectF)
  {
    if (paramJSONObject != null)
    {
      boolean bool = paramJSONObject.has(paramString);
      if (!bool);
    }
    while (true)
    {
      try
      {
        RectF localRectF1 = d(paramJSONObject.getJSONArray(paramString));
        return localRectF1;
      }
      catch (JSONException localRectF2)
      {
        localRectF2 = paramRectF;
        continue;
      }
      RectF localRectF2 = paramRectF;
    }
  }

  private View a(JSONObject paramJSONObject, Rect paramRect)
  {
    int i1 = 0;
    Object localObject1 = this.s;
    float f1;
    int i5;
    if (localObject1 != null)
    {
      localObject1 = a(paramJSONObject, "ia", 1056964608);
      f1 = a(paramJSONObject, "epy", 1054867456);
      int i3 = this.v;
      i5 = a(paramJSONObject, "bc", i3);
    }
    while (true)
    {
      try
      {
        int i4 = paramRect.width();
        int i6 = paramRect.height();
        Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
        Bitmap localBitmap = Bitmap.createBitmap(i4, i6, localConfig);
        if (localBitmap != null)
          continue;
        localObject1 = i1;
        return localObject1;
        this.z.add(localBitmap);
        Canvas localCanvas = new Canvas(localBitmap);
        int i2 = (int)(localObject1 * 1132396544);
        a(localCanvas, paramRect, i5, i2, f1);
        Context localContext = this.s.getContext();
        View localView = new View(f1);
        BitmapDrawable localBitmapDrawable = new BitmapDrawable(localBitmap);
        localView.setBackgroundDrawable(f1);
        continue;
      }
      catch (Throwable localObject2)
      {
        localObject2 = i1;
        continue;
      }
      Object localObject2 = i1;
    }
  }

  private static Animation a(int paramInt, String paramString1, String paramString2, float[] paramArrayOfFloat, JSONArray paramJSONArray1, String[] paramArrayOfString, long paramLong, View paramView, Rect paramRect, JSONObject paramJSONObject, JSONArray paramJSONArray2)
  {
    paramJSONArray2 = null;
    int i1 = paramInt + 1;
    int i2 = paramArrayOfFloat[paramInt];
    paramArrayOfFloat = paramArrayOfFloat[i1];
    if ((paramString1 == null) || (paramString2 == null))
    {
      String str1 = "AdMobSDK";
      int i3 = 6;
      if (!bh.a(str1, i3))
        break label826;
      StringBuilder localStringBuilder1 = new StringBuilder().append("Could not read keyframe animation: keyPath(");
      String str2 = paramString1;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(str2);
      String str3 = ") or valueType(";
      paramString1 = str3 + paramString2 + ") is null.";
      String str4 = "AdMobSDK";
      String str5 = paramString1;
      Log.e(str4, str5);
    }
    label826: for (paramString1 = paramJSONArray2; ; paramString1 = paramJSONArray2)
      while (true)
      {
        if (paramString1 != null)
        {
          int i4 = (int)((float)paramLong * i2);
          float f1 = paramArrayOfFloat - i2;
          int i5 = (float)paramLong;
          long l1 = (int)(paramArrayOfFloat * i5);
          String str6 = paramString1;
          long l2 = paramLong;
          str6.setDuration(l2);
          String str7 = paramArrayOfString[paramInt];
          long l3 = i4;
          long l4 = paramLong;
          paramInt = a(str7, l3, l1, l4);
          if (paramInt != null)
            paramString1.setInterpolator(paramInt);
        }
        return paramString1;
        try
        {
          if (("position".equals(paramString1)) && ("P".equals(paramString2)))
          {
            JSONArray localJSONArray1 = paramJSONArray1;
            int i6 = paramInt;
            paramString1 = e(localJSONArray1.getJSONArray(i6));
            JSONArray localJSONArray2 = paramJSONArray1;
            int i7 = i1;
            PointF localPointF1 = e(localJSONArray2.getJSONArray(i7));
            String str8 = paramString1;
            PointF localPointF2 = localPointF1;
            Object localObject1 = ???;
            View localView1 = paramView;
            paramString1 = a(str8, localPointF2, localObject1, localView1);
            continue;
          }
          if (("opacity".equals(paramString1)) && ("F".equals(paramString2)))
          {
            JSONArray localJSONArray3 = paramJSONArray1;
            int i8 = paramInt;
            paramString1 = (float)localJSONArray3.getDouble(i8);
            JSONArray localJSONArray4 = paramJSONArray1;
            int i9 = i1;
            int i10 = (float)localJSONArray4.getDouble(i9);
            paramString1 = a(paramString1, i10);
            continue;
          }
          if (("bounds".equals(paramString1)) && ("R".equals(paramString2)))
          {
            JSONArray localJSONArray5 = paramJSONArray1;
            int i11 = paramInt;
            paramString1 = d(localJSONArray5.getJSONArray(i11));
            JSONArray localJSONArray6 = paramJSONArray1;
            int i12 = i1;
            RectF localRectF1 = d(localJSONArray6.getJSONArray(i12));
            String str9 = paramString1;
            RectF localRectF2 = localRectF1;
            Object localObject2 = ???;
            View localView2 = paramView;
            paramString1 = a(str9, localRectF2, localObject2, localView2);
            continue;
          }
          if (("zPosition".equals(paramString1)) && ("F".equals(paramString2)))
          {
            JSONArray localJSONArray7 = paramJSONArray1;
            int i13 = paramInt;
            paramString1 = (float)localJSONArray7.getDouble(i13);
            JSONArray localJSONArray8 = paramJSONArray1;
            int i14 = i1;
            int i15 = (float)localJSONArray8.getDouble(i14);
            int i16 = paramString1;
            int i17 = i15;
            Object localObject3 = ???;
            paramString1 = a(i16, i17, localObject3);
            continue;
          }
          if (("backgroundColor".equals(paramString1)) && ("C".equals(paramString2)))
          {
            JSONArray localJSONArray9 = paramJSONArray1;
            int i18 = paramInt;
            paramString1 = c(localJSONArray9.getJSONArray(i18));
            JSONArray localJSONArray10 = paramJSONArray1;
            int i19 = i1;
            int i20 = c(localJSONArray10.getJSONArray(i19));
            int i21 = paramString1;
            int i22 = i20;
            Object localObject4 = ???;
            paramString1 = a(i21, i22, localObject4);
            continue;
          }
          if (("transform".equals(paramString1)) && ("AT".equals(paramString2)))
          {
            if (paramJSONObject != null)
            {
              JSONArray localJSONArray11 = paramJSONArray1;
              int i23 = paramInt;
              a(localJSONArray11.getJSONArray(i23));
              JSONArray localJSONArray12 = paramJSONArray1;
              int i24 = i1;
              a(localJSONArray12.getJSONArray(i24));
              JSONObject localJSONObject1 = paramJSONObject;
              int i25 = paramInt;
              paramString1 = localJSONObject1.getJSONArray(i25);
              JSONObject localJSONObject2 = paramJSONObject;
              int i26 = i1;
              JSONArray localJSONArray13 = localJSONObject2.getJSONArray(i26);
              Object localObject5 = ???;
              View localView3 = paramView;
              Rect localRect = paramRect;
              String str10 = paramString1;
              JSONArray localJSONArray14 = localJSONArray13;
              paramString1 = a(localObject5, localView3, localRect, str10, localJSONArray14);
              continue;
            }
          }
          else
          {
            String str11 = "AdMobSDK";
            int i27 = 6;
            if (bh.a(str11, i27))
            {
              StringBuilder localStringBuilder3 = new StringBuilder().append("Could not read keyframe animation: could not interpret keyPath(");
              String str12 = paramString1;
              StringBuilder localStringBuilder4 = localStringBuilder3.append(str12);
              String str13 = ") and valueType(";
              paramString1 = str13 + paramString2 + ") combination.";
              String str14 = "AdMobSDK";
              String str15 = paramString1;
              Log.e(str14, str15);
            }
          }
          paramString1 = paramJSONArray2;
        }
        catch (JSONException paramString1)
        {
        }
      }
  }

  private static Animation a(View paramView, Rect paramRect, JSONObject paramJSONObject, JSONArray paramJSONArray1, JSONArray paramJSONArray2)
  {
    boolean bool1 = null;
    int i1 = 0;
    int i2 = 1;
    Object localObject1 = paramJSONObject.optString("tt", i1);
    boolean bool2;
    if (localObject1 != null)
    {
      bool2 = "t".equals(localObject1);
      if (bool2)
      {
        localObject1 = e(paramJSONArray1);
        PointF localPointF1 = e(paramJSONArray2);
        localObject1 = a((PointF)localObject1, localPointF1, paramView, paramRect);
      }
    }
    while (true)
    {
      return localObject1;
      bool2 = "r".equals(localObject1);
      Object localObject2;
      if (bool2)
      {
        localObject2 = b(paramJSONArray1);
        float[] arrayOfFloat1 = b(paramJSONArray2);
        if ((localObject2 != null) && (arrayOfFloat1 != null))
        {
          localObject1 = Arrays.equals(localObject2, arrayOfFloat1);
          if (localObject1 == 0)
          {
            localObject1 = aw.b(paramView);
            PointF localPointF2 = a(new RectF(paramRect), (PointF)localObject1);
            int i3 = localPointF2.x;
            int i4 = localPointF2.y;
            localObject1 = new ap(localObject2, arrayOfFloat1, i3, i4, null, bool1);
            continue;
          }
        }
      }
      else
      {
        localObject2 = "sc".equals(localObject1);
        if (localObject2 != 0)
        {
          float[] arrayOfFloat2 = b(paramJSONArray1);
          float[] arrayOfFloat3 = b(paramJSONArray2);
          PointF localPointF3 = aw.b(paramView);
          int i5 = arrayOfFloat2[bool1];
          int i6 = arrayOfFloat3[bool1];
          int i7 = arrayOfFloat2[i2];
          int i8 = arrayOfFloat3[i2];
          int i9 = localPointF3.x;
          int i10 = localPointF3.y;
          int i11 = i2;
          localObject1 = new ScaleAnimation(i5, i6, i7, i8, i2, bool1, i11, i10);
          continue;
        }
        localObject2 = "sk".equals(localObject1);
        if (localObject2 != 0)
        {
          localObject1 = b(paramJSONArray1);
          localObject2 = b(paramJSONArray2);
          if ((localObject1 != null) && (localObject2 != null) && (!Arrays.equals(localObject1, localObject2)))
          {
            PointF localPointF4 = aw.b(paramView);
            a(new RectF(paramRect), localPointF4);
            localObject1 = new ar(localObject1, localObject2);
            continue;
          }
        }
        else
        {
          "p".equals(localObject1);
          localObject1 = i1;
          continue;
        }
        localObject1 = i1;
        continue;
      }
      localObject1 = i1;
    }
  }

  private static AnimationSet a(JSONArray paramJSONArray, JSONObject paramJSONObject, View paramView, Rect paramRect)
  {
    AnimationSet localAnimationSet = new AnimationSet(null);
    int i1 = 0;
    int i4 = i1;
    int i2 = paramJSONArray.length();
    if (i4 < i2)
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i4);
      Object localObject1 = null;
      Object localObject3 = localJSONObject.optString("t", null);
      int i5 = (int)(a(localJSONObject, "d", 1048576000) * 4652007308841189376L);
      boolean bool = "B".equals(localObject3);
      Object localObject4;
      Object localObject5;
      label193: long l1;
      if (bool)
      {
        localObject1 = null;
        localObject3 = localJSONObject.optString("kp", null);
        localObject4 = localJSONObject.optString("vt", null);
        if ((localObject3 == null) || (localObject4 == null))
        {
          if (!bh.a("AdMobSDK", 6))
            break label813;
          localObject3 = new StringBuilder().append("Could not read basic animation: keyPath(").append((String)localObject3).append(") or valueType(").append((String)localObject4);
          localObject4 = ") is null.";
          localObject3 = (String)localObject4;
          Log.e("AdMobSDK", (String)localObject3);
          localObject5 = localObject1;
          if (localObject5 != 0)
          {
            localObject1 = localJSONObject.optString("tf", null);
            l1 = 65535L;
            localObject1 = a((String)localObject1, l1, 65535L, 65535L);
            if (localObject1 == null)
              localObject1 = null;
            if (localObject1 != null)
              localObject5.setInterpolator((Interpolator)localObject1);
          }
          localObject1 = localObject5;
        }
      }
      while (true)
      {
        if (localObject1 != null)
        {
          l1 = i5;
          ((Animation)localObject1).setDuration(l1);
          a(localJSONObject, (Animation)localObject1, localAnimationSet);
          localAnimationSet.addAnimation((Animation)localObject1);
          ((Animation)localObject1).getDuration();
        }
        int i3 = i4 + 1;
        i4 = i3;
        break;
        if (("position".equals(localObject3)) && ("P".equals(localObject4)))
        {
          localObject3 = c;
          localObject2 = a(localJSONObject, "fv", (PointF)localObject3);
          localObject4 = d;
          localObject3 = a(localJSONObject, "tv", (PointF)localObject4);
          localObject2 = a((PointF)localObject2, (PointF)localObject3, paramView, paramRect);
          localObject5 = localObject2;
          break label193;
        }
        if (("opacity".equals(localObject3)) && ("F".equals(localObject4)))
        {
          localObject2 = a(localJSONObject, "fv", null);
          localObject4 = null;
          localObject3 = a(localJSONObject, "tv", localObject4);
          localObject2 = a(localObject2, localObject3);
          localObject5 = localObject2;
          break label193;
        }
        if (("transform".equals(localObject3)) && ("AT".equals(localObject4)))
        {
          localObject3 = f;
          a(localJSONObject, "fv", (Matrix)localObject3);
          localObject3 = f;
          a(localJSONObject, "fv", (Matrix)localObject3);
          localObject2 = localJSONObject.getJSONArray("tfv");
          localObject3 = localJSONObject.getJSONArray("ttv");
          localObject2 = a(paramView, paramRect, localJSONObject, (JSONArray)localObject2, (JSONArray)localObject3);
          localObject5 = localObject2;
          break label193;
        }
        if (("bounds".equals(localObject3)) && ("R".equals(localObject4)))
        {
          localObject3 = g;
          localObject2 = a(localJSONObject, "fv", (RectF)localObject3);
          localObject4 = g;
          localObject3 = a(localJSONObject, "tv", (RectF)localObject4);
          localObject4 = null;
          localObject2 = a((RectF)localObject2, (RectF)localObject3, (View)localObject4, paramRect);
          localObject5 = localObject2;
          break label193;
        }
        if (("zPosition".equals(localObject3)) && ("F".equals(localObject4)))
        {
          localObject2 = a(localJSONObject, "fv", null);
          localObject4 = null;
          localObject3 = a(localJSONObject, "tv", localObject4);
          localObject2 = a(localObject2, localObject3, paramView);
          localObject5 = localObject2;
          break label193;
        }
        int i6;
        if (("backgroundColor".equals(localObject3)) && ("C".equals(localObject4)))
        {
          localObject2 = a(localJSONObject, "fv", 0);
          i6 = 0;
          localObject3 = a(localJSONObject, "tv", i6);
          localObject2 = a(localObject2, localObject3, paramView);
          localObject5 = localObject2;
          break label193;
        }
        if (bh.a("AdMobSDK", 6))
        {
          localObject3 = new StringBuilder().append("Could not read basic animation: could not interpret keyPath(").append((String)localObject3).append(") and valueType(").append(i6);
          str = ") combination.";
          localObject3 = str;
          Log.e("AdMobSDK", (String)localObject3);
        }
        label813: localObject5 = localObject2;
        break label193;
        String str = "K";
        localObject3 = str.equals(localObject3);
        if (localObject3 == 0)
          continue;
        long l2 = i5;
        Object localObject2 = a(localJSONObject, paramView, paramRect, l2);
      }
    }
    if (paramJSONObject != null)
      a(paramJSONObject, localAnimationSet, null);
    return (AnimationSet)(AnimationSet)(AnimationSet)(AnimationSet)localAnimationSet;
  }

  private static AnimationSet a(JSONObject paramJSONObject, View paramView, Rect paramRect, long paramLong)
  {
    JSONObject localJSONObject1 = paramJSONObject;
    String str1 = "vt";
    String str2 = localJSONObject1.getString(str1);
    JSONObject localJSONObject2 = paramJSONObject;
    String str3 = "kt";
    float[] arrayOfFloat = b(localJSONObject2, str3);
    JSONObject localJSONObject3 = paramJSONObject;
    String str4 = "vs";
    JSONArray localJSONArray1 = localJSONObject3.getJSONArray(str4);
    JSONObject localJSONObject4 = paramJSONObject;
    String str5 = "tfs";
    String[] arrayOfString = a(localJSONObject4, str5);
    JSONObject localJSONObject5 = paramJSONObject;
    String str6 = "ttvs";
    JSONArray localJSONArray2 = localJSONObject5.optJSONArray(str6);
    int i2 = arrayOfFloat.length;
    int i1 = localJSONArray1.length();
    int i3 = arrayOfString.length;
    int i4;
    if (i2 == i1)
    {
      i4 = i3 + 1;
      if (i1 == i4);
    }
    else
    {
      double d1 = arrayOfFloat[null] < 0L;
      if (i4 == 0)
      {
        i4 = i2 - 1;
        d1 = arrayOfFloat[i4] < 4607182418800017408L;
        if (i4 == 0)
        {
          paramJSONObject = bh.a("AdMobSDK", 6);
          if (paramJSONObject != 0)
          {
            paramJSONObject = "AdMobSDK";
            StringBuilder localStringBuilder1 = new StringBuilder().append("keyframe animations were invalid: numKeyTimes=");
            int i5 = i2;
            StringBuilder localStringBuilder2 = localStringBuilder1.append(i5).append(" numKeyValues=");
            int i6 = i1;
            StringBuilder localStringBuilder3 = localStringBuilder2.append(i6).append(" numKeyFunctions=");
            int i7 = i3;
            StringBuilder localStringBuilder4 = localStringBuilder3.append(i7).append(" keyTimes[0]=");
            int i8 = arrayOfFloat[null];
            StringBuilder localStringBuilder5 = localStringBuilder4.append(i8).append(" keyTimes[");
            int i9 = i2 - 1;
            StringBuilder localStringBuilder6 = localStringBuilder5.append(i9).append("]=");
            int i10 = i2 - 1;
            int i11 = arrayOfFloat[i10];
            String str8 = i11;
            Log.e(paramJSONObject, str8);
          }
          paramJSONObject = null;
        }
      }
    }
    while (true)
    {
      return paramJSONObject;
      AnimationSet localAnimationSet1 = new AnimationSet(null);
      JSONObject localJSONObject6 = paramJSONObject;
      String str9 = "kp";
      String str7 = localJSONObject6.getString(str9);
      int i12 = c(paramJSONObject);
      for (i1 = 0; ; i1++)
      {
        i4 = i2 - 1;
        if (i1 >= i4)
          break;
        long l1 = paramLong;
        View localView = paramView;
        Rect localRect = paramRect;
        JSONObject localJSONObject7 = paramJSONObject;
        Animation localAnimation1 = a(i1, str7, str2, arrayOfFloat, localJSONArray1, arrayOfString, l1, localView, localRect, localJSONObject7, localJSONArray2);
        if (localAnimation1 == null)
          continue;
        Animation localAnimation2 = localAnimation1;
        int i13 = i12;
        localAnimation2.setRepeatCount(i13);
        localAnimationSet1.addAnimation(localAnimation1);
      }
      String str10 = paramJSONObject.optString("fm", "r");
      AnimationSet localAnimationSet2 = localAnimationSet1;
      a(str10, localAnimationSet2);
      paramJSONObject = localAnimationSet1;
    }
  }

  private static Interpolator a(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = 65535L;
    paramLong3 = null;
    boolean bool1 = "i".equals(paramString);
    long l2;
    if (bool1)
    {
      paramLong3 = new AccelerateInterpolator();
      l2 = paramLong3;
    }
    while (true)
    {
      long l6;
      long l7;
      long l8;
      if (l2 != null)
      {
        paramLong3 = paramLong1 < l1;
        if (paramLong3 != 0)
        {
          paramLong3 = ??? < l1;
          if (paramLong3 != 0)
          {
            paramLong3 = paramLong2 < l1;
            if (paramLong3 != 0)
            {
              l6 = paramLong1;
              l7 = ???;
              l8 = paramLong2;
            }
          }
        }
      }
      for (paramLong3 = new ax(l2, l6, l7, l8); ; paramLong3 = l5)
      {
        return paramLong3;
        boolean bool2 = "o".equals(paramString);
        if (bool2)
        {
          paramLong3 = new DecelerateInterpolator();
          long l3 = paramLong3;
          break;
        }
        boolean bool3 = "io".equals(paramString);
        if (bool3)
        {
          paramLong3 = new AccelerateDecelerateInterpolator();
          long l4 = paramLong3;
          break;
        }
        boolean bool4 = "l".equals(paramString);
        if (!bool4)
          break label199;
        paramLong3 = new LinearInterpolator();
        l5 = paramLong3;
        break;
      }
      label199: long l5 = paramLong3;
    }
  }

  private static an a(float paramFloat1, float paramFloat2, View paramView)
  {
    int i1 = 0;
    an localan;
    if (paramFloat1 != paramFloat2)
      localan = new an(paramFloat1, paramFloat2, paramView);
    return localan;
  }

  private static as a(RectF paramRectF1, RectF paramRectF2, View paramView, Rect paramRect)
  {
    int i1 = 0;
    as localas;
    if (!paramRectF1.equals(paramRectF2))
    {
      PointF localPointF1 = aw.b(paramView);
      PointF localPointF2 = a(paramRectF1, localPointF1);
      float f1 = paramRect.width();
      float f2 = paramRect.height();
      float f3 = paramRectF1.width() / f1;
      float f4 = paramRectF1.height() / f2;
      float f5 = paramRectF2.width() / f1;
      float f6 = paramRectF2.height() / f2;
      int i2 = localPointF2.x;
      int i3 = localPointF2.y;
      localas = new as(f3, f5, f4, f6, i2, i3);
    }
    return localas;
  }

  private static at a(PointF paramPointF1, PointF paramPointF2, View paramView, Rect paramRect)
  {
    int i1 = 0;
    at localat;
    if (!paramPointF1.equals(paramPointF2))
    {
      PointF localPointF = aw.b(paramView);
      float f2 = paramRect.width();
      int i2 = localPointF.x;
      float f3 = f2 * i2;
      float f4 = paramRect.left;
      float f5 = f3 + f4;
      float f6 = paramRect.height();
      float f1 = localPointF.y * f6;
      float f7 = paramRect.top;
      f1 += f7;
      float f8 = paramPointF1.x - f5;
      paramPointF1.x = f8;
      float f9 = paramPointF1.y - f1;
      paramPointF1.y = f9;
      float f10 = paramPointF2.x - f5;
      paramPointF2.x = f10;
      f1 = paramPointF2.y - f1;
      paramPointF2.y = f1;
      int i3 = paramPointF1.x;
      int i4 = paramPointF2.x;
      int i5 = paramPointF1.y;
      int i6 = paramPointF2.y;
      localat = new at(i3, i4, i5, i6);
    }
    return localat;
  }

  private static au a(int paramInt1, int paramInt2, View paramView)
  {
    int i1 = 0;
    au localau;
    if (paramInt1 != paramInt2)
      localau = new au(paramInt1, paramInt2, paramView);
    return localau;
  }

  private static av a(float paramFloat1, float paramFloat2)
  {
    int i1 = 0;
    av localav;
    if (paramFloat1 != paramFloat2)
      localav = new av(paramFloat1, paramFloat2);
    return localav;
  }

  public static e a(h paramh, Context paramContext, JSONObject paramJSONObject, int paramInt1, int paramInt2, int paramInt3, f paramf, ch paramch)
  {
    int i1 = 0;
    Object localObject1 = 1;
    float f1 = null;
    Object localObject2;
    if (paramJSONObject != null)
    {
      int i2 = paramJSONObject.length();
      if (i2 != 0);
    }
    else
    {
      localObject2 = i1;
    }
    label331: 
    while (true)
    {
      return localObject2;
      localObject2 = new e();
      ((e)localObject2).E = paramch;
      ((e)localObject2).a(paramh);
      ((e)localObject2).t = paramInt1;
      ((e)localObject2).u = paramInt2;
      ((e)localObject2).v = paramInt3;
      ((e)localObject2).s = paramf;
      Object localObject3 = ag.a(paramContext);
      ((e)localObject2).G = ((ag)localObject3);
      localObject3 = ((e)localObject2).x;
      ag localag = ((e)localObject2).G;
      ((ai)localObject3).c = localag;
      localObject3 = ((e)localObject2).E;
      ch localch = ch.b;
      if (localObject3 == localch)
      {
        localObject3 = a(paramJSONObject, "timeout", f1);
        if (localObject3 > f1)
        {
          h = localObject3;
          localObject3 = paramContext.getSharedPreferences("admob_prefs", 2).edit();
          int i3 = h;
          ((SharedPreferences.Editor)localObject3).putFloat("timeout", i3);
          ((SharedPreferences.Editor)localObject3).commit();
        }
        localObject3 = ((e)localObject2).D;
        ai localai = ((e)localObject2).x;
        ((ad)localObject3).a(paramContext, paramJSONObject, localai);
        ((e)localObject2).D.a.l = localObject1;
        localObject3 = ((e)localObject2).D.a.a;
        ci localci1 = ci.d;
        if (localObject3 != localci1)
        {
          ci localci2 = ci.c;
          if (localObject3 != localci2)
            localObject3 = null;
        }
      }
      while (true)
      {
        if (localObject3 != null)
          break label331;
        localObject2 = i1;
        break;
        ((e)localObject2).x.b();
        localObject3 = ((e)localObject2).x.a();
        if (localObject3 != 0)
          ((e)localObject2).j();
        localObject3 = localObject1;
        continue;
        localObject3 = ((e)localObject2).a(paramContext, paramJSONObject);
      }
    }
  }

  public static void a(Canvas paramCanvas, Rect paramRect, int paramInt1, int paramInt2, float paramFloat)
  {
    int i1 = (int)(paramRect.height() * paramFloat);
    int i2 = paramRect.top;
    int i3 = i1 + i2;
    int i4 = paramRect.left;
    int i5 = paramRect.top;
    int i6 = paramRect.right;
    Rect localRect1 = new Rect(i4, i5, i6, i3);
    Paint localPaint1 = new Paint();
    localPaint1.setColor(-1);
    Paint.Style localStyle1 = Paint.Style.FILL;
    localPaint1.setStyle(localStyle1);
    paramCanvas.drawRect(localRect1, localPaint1);
    int i7 = Color.red(paramInt1);
    int i8 = Color.green(paramInt1);
    int i9 = Color.blue(paramInt1);
    int i10 = Color.argb(paramInt2, i7, i8, i9);
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = i10;
    arrayOfInt[1] = paramInt1;
    GradientDrawable.Orientation localOrientation = GradientDrawable.Orientation.TOP_BOTTOM;
    GradientDrawable localGradientDrawable = new GradientDrawable(localOrientation, arrayOfInt);
    localGradientDrawable.setBounds(localRect1);
    localGradientDrawable.draw(paramCanvas);
    int i11 = paramRect.left;
    int i12 = paramRect.right;
    int i13 = paramRect.bottom;
    Rect localRect2 = new Rect(i11, i3, i12, i13);
    Paint localPaint2 = new Paint();
    localPaint2.setColor(paramInt1);
    Paint.Style localStyle2 = Paint.Style.FILL;
    localPaint2.setStyle(localStyle2);
    paramCanvas.drawRect(localRect2, localPaint2);
  }

  public static void a(Handler paramHandler)
  {
    i = paramHandler;
  }

  private static void a(Animation paramAnimation, int paramInt1, int paramInt2, float paramFloat, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      paramAnimation.setRepeatMode(2);
    paramAnimation.setRepeatCount(paramInt1);
    long l1 = paramInt2;
    paramAnimation.setStartOffset(l1);
    paramAnimation.startNow();
    paramAnimation.scaleCurrentDuration(paramFloat);
    a(paramString, paramAnimation);
  }

  private void a(h paramh)
  {
    WeakReference localWeakReference = new WeakReference(paramh);
    this.r = localWeakReference;
  }

  private void a(String paramString)
  {
    if ((paramString != null) && (!"".equals(paramString)))
      this.m.add(paramString);
  }

  private static void a(String paramString, Animation paramAnimation)
  {
    boolean bool1 = null;
    boolean bool2 = true;
    Object localObject;
    if ((paramString != null) && (paramAnimation != null))
      localObject = paramAnimation.getClass();
    try
    {
      Class[] arrayOfClass = new Class[1];
      Class localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject = ((Class)localObject).getMethod("setFillEnabled", arrayOfClass);
      if (localObject != null)
      {
        Object[] arrayOfObject = new Object[1];
        Boolean localBoolean = Boolean.valueOf(true);
        arrayOfObject[0] = localBoolean;
        ((Method)localObject).invoke(paramAnimation, arrayOfObject);
      }
      label79: if ("b".equals(paramString))
      {
        paramAnimation.setFillBefore(bool2);
        paramAnimation.setFillAfter(bool1);
      }
      while (true)
      {
        return;
        if (("fb".equals(paramString)) || ("r".equals(paramString)))
        {
          paramAnimation.setFillBefore(bool2);
          paramAnimation.setFillAfter(bool2);
          continue;
        }
        if ("f".equals(paramString))
        {
          paramAnimation.setFillBefore(bool1);
          paramAnimation.setFillAfter(bool2);
          continue;
        }
        if (!"r".equals(paramString))
          continue;
        paramAnimation.setFillBefore(bool1);
        paramAnimation.setFillAfter(bool1);
      }
    }
    catch (Exception localException)
    {
      break label79;
    }
  }

  private static void a(JSONObject paramJSONObject, Animation paramAnimation, AnimationSet paramAnimationSet)
  {
    float f1 = a(paramJSONObject, "bt", null);
    float f2 = a(paramJSONObject, "to", null);
    int i2 = c(paramJSONObject);
    boolean bool = paramJSONObject.optBoolean("ar", null);
    String str = paramJSONObject.optString("fm", "r");
    float f3 = a(paramJSONObject, "s", 1065353216);
    int i1 = (int)((f1 + null + f2) * 4652007308841189376L);
    f3 = 1065353216 / f3;
    a(paramAnimation, i2, i1, f3, str, bool);
    if (paramAnimationSet != null)
      a(paramAnimationSet, i2, i1, f3, str, bool);
  }

  private boolean a(Context paramContext, JSONObject paramJSONObject)
  {
    Rect localRect = null;
    Object localObject1 = 1;
    boolean bool1 = null;
    ai localai1 = null;
    Object localObject2 = paramJSONObject.optJSONObject("o");
    if (localObject2 != null)
    {
      Object localObject4 = this.D;
      ((ad)localObject4).a(paramContext, (JSONObject)localObject2, localai1);
      localObject2 = paramJSONObject.optString("jsonp_url", localai1);
      localObject4 = paramJSONObject.optString("tracking_url", localai1);
      this.D.a.a((String)localObject2, localObject1);
      this.D.a.a((String)localObject4, bool1);
      localObject2 = paramJSONObject.has("refreshInterval");
      Object localObject8;
      if (localObject2 != 0)
      {
        localObject2 = paramJSONObject.optDouble("refreshInterval");
        this.B = localObject8;
      }
      localObject2 = paramJSONObject.has("density");
      if (localObject2 == 0)
        break label356;
      localObject2 = paramJSONObject.optDouble("density");
      this.C = localObject8;
      label149: localObject2 = a(paramJSONObject, "d", localai1);
      if (localObject2 == null)
      {
        int i2 = 1134559232;
        localObject2 = new PointF(i2, 1111490560);
      }
      float f1 = ((PointF)localObject2).x < localRect;
      if (f1 >= 0)
      {
        f1 = ((PointF)localObject2).y < localRect;
        if (f1 >= 0)
          break label371;
      }
      localObject2 = bool1;
    }
    label356: double d1;
    label371: Object localObject3;
    while (true)
    {
      return localObject2;
      localObject2 = paramJSONObject.optString("text", localai1);
      this.j = ((String)localObject2);
      localObject2 = paramJSONObject.optString("6", localai1);
      Object localObject5 = this.D;
      String str = paramJSONObject.optString("8", localai1);
      ((ad)localObject5).a.b = str;
      localObject2 = ci.a((String)localObject2);
      localObject5 = this.D.a;
      ((ab)localObject5).a = ((ci)localObject2);
      localObject2 = paramJSONObject.optJSONArray("ac");
      if (localObject2 != null)
      {
        localObject5 = this.D;
        ((ad)localObject5).a(paramContext, (JSONArray)localObject2);
      }
      localObject2 = paramJSONObject.optJSONObject("ac");
      if (localObject2 == null)
        break;
      localObject5 = this.D;
      ((ad)localObject5).a(paramContext, (JSONObject)localObject2);
      break;
      d1 = f.c();
      this.C = d1;
      break label149;
      int i3 = (int)((PointF)localObject2).x;
      int i1 = (int)((PointF)localObject2).y;
      this.p = i3;
      this.q = i1;
      localObject3 = paramJSONObject.optString("cpm_url", localai1);
      if (localObject3 != null)
      {
        this.k = localObject1;
        a((String)localObject3);
      }
      localObject3 = paramJSONObject.optString("tracking_pixel", localai1);
      if (localObject3 != null);
      try
      {
        Object localObject6 = new URL((String)localObject3);
        label454: if (localObject3 != null)
          a((String)localObject3);
        localObject3 = paramJSONObject.optJSONObject("markup");
        localObject6 = this.D.a.a;
        ci localci = ci.b;
        if (localObject6 == localci)
        {
          boolean bool2 = this.s.getContext() instanceof Activity;
          if (!bool2)
          {
            o();
            localObject3 = bool1;
          }
        }
      }
      catch (MalformedURLException localMalformedURLException)
      {
      }
    }
    while (true)
    {
      try
      {
        while (true)
        {
          Object localObject7 = "UTF-8";
          localObject3 = URLEncoder.encode((String)localObject3, (String)localObject7);
          break label454;
          if (localObject3 == null)
          {
            localObject3 = bool1;
            break;
          }
          localObject7 = this.D;
          if (((ad)localObject7).a.c != null)
          {
            localObject7 = ((ad)localObject7).a.c.size();
            if (localObject7 > 0)
              localObject7 = localObject1;
          }
          while (true)
          {
            if (localObject7 != null)
              break label644;
            localObject3 = bh.a("AdMobSDK", 6);
            if (localObject3 != 0)
            {
              localObject3 = "AdMobSDK";
              Log.e((String)localObject3, "Bad response:  didn't get clickURLString.  erroring out.");
            }
            localObject3 = bool1;
            break;
            localObject7 = bool1;
          }
          label644: this.w = ((JSONObject)localObject3);
          try
          {
            while (true)
            {
              localObject3 = this.w.optJSONObject("$");
              localObject7 = this.s;
              if (localObject7 == null)
                break label981;
              localObject7 = ak.g(this.s.getContext());
              this.x.a((JSONObject)localObject3, (String)localObject7);
              int i6 = this.p;
              int i7 = this.q;
              localObject3 = new Rect(0, 0, i6, i7);
              localObject7 = this.w.has("ta");
              if (localObject7 != 0);
              try
              {
                localObject7 = this.w.getJSONArray("ta");
                int i8 = ((JSONArray)localObject7).getInt(0);
                int i9 = ((JSONArray)localObject7).getInt(1);
                int i10 = ((JSONArray)localObject7).getInt(2);
                localObject7 = ((JSONArray)localObject7).getInt(3);
                int i11 = i10 + i8;
                int i4;
                localObject7 += i9;
                localRect = new Rect(i8, i9, i11, i4);
                int i5 = Math.abs(localRect.width());
                if (i5 >= 44)
                {
                  i5 = Math.abs(localRect.height());
                  if (i5 >= 44)
                    localObject3 = localRect;
                }
                this.n = ((Rect)localObject3);
                localObject3 = this.w.optDouble("itid");
                if (d1 > 0L)
                {
                  long l1 = ()(d1 * 4652007308841189376L);
                  this.o = l1;
                }
                this.x.b();
                localObject3 = this.x.a();
                if (localObject3 != 0)
                  j();
                localObject3 = localObject1;
              }
              catch (JSONException localJSONException2)
              {
                while (true)
                {
                  if (!bh.a("AdMobSDK", 3))
                    continue;
                  Log.d("AdMobSDK", "could not read in the touchable area for the ad.");
                }
              }
            }
          }
          catch (JSONException localJSONException1)
          {
            while (true)
            {
              if (!bh.a("AdMobSDK", 6))
                continue;
              Log.e("AdMobSDK", "Could not read in the flex ad.", localJSONException1);
            }
          }
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
      break label454;
      label981: ai localai2 = localai1;
    }
  }

  private static String[] a(JSONObject paramJSONObject, String paramString)
  {
    int i1 = 0;
    Object localObject1 = paramJSONObject.optJSONArray(paramString);
    if (localObject1 == null)
      localObject1 = i1;
    while (true)
    {
      return localObject1;
      int i2 = ((JSONArray)localObject1).length();
      try
      {
        String[] arrayOfString = new String[i2];
        for (int i3 = 0; i3 < i2; i3++)
        {
          String str = ((JSONArray)localObject1).getString(i3);
          arrayOfString[i3] = str;
        }
        localObject1 = arrayOfString;
      }
      catch (JSONException localObject2)
      {
        Object localObject2 = i1;
      }
    }
  }

  private View b(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    try
    {
      Object localObject6 = this.s;
      if ((localObject6 != null) && (paramJSONObject != null))
      {
        JSONObject localJSONObject1 = paramJSONObject;
        String str1 = "t";
        localObject1 = localJSONObject1.getString(str1);
        localObject7 = b;
        JSONObject localJSONObject2 = paramJSONObject;
        String str2 = "f";
        Object localObject8 = localObject7;
        localObject6 = a(localJSONObject2, str2, localObject8);
        e locale1 = this;
        Object localObject9 = localObject6;
        localObject6 = locale1.a(localObject9);
        localObject7 = null;
        Object localObject10 = 1;
        Object localObject12 = 1;
        boolean bool2 = "l".equals(localObject1);
        if (!bool2)
          break label917;
        localObject1 = this.s;
        if (localObject1 == null)
          break label912;
        JSONObject localJSONObject4 = paramJSONObject;
        String str3 = "x";
        localObject1 = localJSONObject4.getString(str3);
        JSONObject localJSONObject5 = paramJSONObject;
        String str4 = "fs";
        int i5 = 1095761920;
        localObject7 = a(localJSONObject5, str4, i5);
        JSONObject localJSONObject6 = paramJSONObject;
        String str5 = "fa";
        localObject13 = localJSONObject6.optJSONArray(str5);
        Object localObject15 = 0;
        Object localObject16 = Typeface.DEFAULT;
        if (localObject13 == null)
          break label2014;
        Object localObject17 = 0;
        int i9 = localObject15;
        localObject15 = localObject17;
        int i11 = ((JSONArray)localObject13).length();
        if (localObject15 < i11)
        {
          localObject18 = ((JSONArray)localObject13).getString(localObject15);
          if ("b".equals(localObject18))
            i9 |= 1;
          while (true)
          {
            localObject15++;
            break;
            if ("i".equals(localObject18))
            {
              i9 |= 2;
              continue;
            }
            if ("m".equals(localObject18))
            {
              localObject16 = Typeface.MONOSPACE;
              continue;
            }
            if ("s".equals(localObject18))
            {
              localObject16 = Typeface.SERIF;
              continue;
            }
            localObject18 = "ss".equals(localObject18);
            if (localObject18 == 0)
              continue;
            localObject16 = Typeface.SANS_SERIF;
          }
        }
        localObject13 = Typeface.create((Typeface)localObject16, i9);
        localObject15 = this.t;
        JSONObject localJSONObject7 = paramJSONObject;
        String str6 = "fco";
        localObject16 = localJSONObject7.has(str6);
        if (localObject16 == 0)
          break label866;
        JSONObject localJSONObject8 = paramJSONObject;
        String str7 = "fco";
        int i12 = localObject15;
        localObject16 = a(localJSONObject8, str7, i12);
        if (localObject16 != localObject15)
          localObject15 = localObject16;
        JSONObject localJSONObject9 = paramJSONObject;
        String str8 = "afstfw";
        boolean bool3 = true;
        boolean bool4 = localJSONObject9.optBoolean(str8, bool3);
        JSONObject localJSONObject10 = paramJSONObject;
        String str9 = "mfs";
        int i13 = 1090519040;
        float f3 = a(localJSONObject10, str9, i13);
        JSONObject localJSONObject11 = paramJSONObject;
        String str10 = "nol";
        int i14 = 1;
        int i15 = localJSONObject11.optInt(str10, i14);
        Context localContext = this.s.getContext();
        float f4 = f.c();
        ay localay = new ay(localContext, f4);
        localay.b = bool4;
        float f5 = localay.c * f3;
        localay.a = f5;
        localay.setBackgroundColor(null);
        localay.setText((CharSequence)localObject1);
        localay.setTextColor(localObject15);
        localay.setTextSize(localObject7);
        localay.setTypeface((Typeface)localObject13);
        localay.setLines(i15);
        localObject1 = localay;
        label545: localObject7 = localObject10;
        localObject11 = localObject1;
        localObject1 = localObject12;
      }
      label866: Object localObject2;
      while (true)
      {
        if (localObject11 == null)
          break label1961;
        if (localObject7 == 0)
          break label1946;
        localObject7 = null;
        JSONObject localJSONObject12 = paramJSONObject;
        String str11 = "bgc";
        int i16 = localObject7;
        localObject1 = a(localJSONObject12, str11, i16);
        localObject11.setBackgroundColor(localObject1);
        localObject7 = e;
        JSONObject localJSONObject13 = paramJSONObject;
        String str12 = "ap";
        Object localObject19 = localObject7;
        localObject1 = a(localJSONObject13, str12, localObject19);
        localObject7 = aw.c(localObject11);
        ((aw)localObject7).b = ((PointF)localObject1);
        localObject11.setTag(localObject7);
        localObject1 = null;
        JSONObject localJSONObject14 = paramJSONObject;
        String str13 = "a";
        localObject7 = localJSONObject14.optJSONArray(str13);
        JSONObject localJSONObject15 = paramJSONObject;
        String str14 = "ag";
        localJSONObject3 = localJSONObject15.optJSONObject(str14);
        if (localObject7 != null)
          localObject1 = a((JSONArray)localObject7, localJSONObject3, localObject11, (Rect)localObject6);
        JSONObject localJSONObject16 = paramJSONObject;
        String str15 = "ut";
        String str16 = null;
        localObject7 = localJSONObject16.optString(str15, str16);
        if ((localObject11 != null) && (localObject7 != null))
        {
          localObject7 = aw.c(localObject11);
          localObject11.setTag(localObject7);
        }
        int i17 = ((Rect)localObject6).width();
        int i18 = ((Rect)localObject6).height();
        localObject7 = new RelativeLayout.LayoutParams(i17, i18);
        ((RelativeLayout.LayoutParams)localObject7).addRule(9);
        ((RelativeLayout.LayoutParams)localObject7).addRule(10);
        int i19 = ((Rect)localObject6).left;
        int i20 = ((Rect)localObject6).top;
        ((RelativeLayout.LayoutParams)localObject7).setMargins(i19, localObject6, null, null);
        localObject11.setLayoutParams((ViewGroup.LayoutParams)localObject7);
        if (localObject1 != null)
          localObject11.setAnimation((Animation)localObject1);
        JSONObject localJSONObject17 = paramJSONObject;
        String str17 = "cav";
        localObject1 = localJSONObject17.optBoolean(str17);
        if (localObject1 != 0)
        {
          localObject1 = this.s;
          if (localObject1 != null)
          {
            localObject1 = this.s;
            ((f)localObject1).a(localObject11, (RelativeLayout.LayoutParams)localObject7);
          }
        }
        localObject1 = localObject11;
        return localObject1;
        JSONObject localJSONObject18 = paramJSONObject;
        String str18 = "fc";
        int i21 = null;
        int i6 = localJSONObject18.optInt(str18, i21);
        if (i6 == 1)
        {
          i6 = this.u;
          break;
        }
        i6 = this.t;
        break;
        label912: int i1 = 0;
        break label545;
        label917: localObject13 = "bg".equals(i1);
        if (localObject13 == 0)
          break label965;
        e locale2 = this;
        JSONObject localJSONObject19 = paramJSONObject;
        Object localObject20 = localObject6;
        localObject2 = locale2.a(localJSONObject19, localObject20);
        localObject7 = null;
        Object localObject21 = null;
        localObject11 = localObject2;
        localObject2 = localObject21;
      }
      label965: Object localObject13 = "i".equals(localObject2);
      if (localObject13 != 0)
      {
        int i2 = 0;
        localObject7 = this.s;
        if (localObject7 != null)
        {
          localObject3 = null;
          JSONObject localJSONObject20 = paramJSONObject;
          String str19 = "$";
          localObject7 = localJSONObject20.getString(str19);
          if (localObject7 == null)
            break label1771;
          localObject3 = this.x;
          localObject13 = ((ai)localObject3).a;
          if (localObject13 == null)
            break label1254;
          localObject3 = (Bitmap)((ai)localObject3).a.get(localObject7);
          if (localObject3 == null)
            break label1719;
          localObject13 = this.s.getContext();
          localObject7 = new ImageView((Context)localObject13);
          localObject13 = ImageView.ScaleType.FIT_XY;
          ((ImageView)localObject7).setScaleType((ImageView.ScaleType)localObject13);
          i7 = null;
          JSONObject localJSONObject21 = paramJSONObject;
          String str20 = "b";
          int i22 = i7;
          localObject13 = localJSONObject21.optBoolean(str20, i22);
          if (localObject13 == 0)
            break label1698;
          JSONObject localJSONObject22 = paramJSONObject;
          String str21 = "bw";
          int i23 = 1056964608;
          localObject13 = a(localJSONObject22, str21, i23);
          int i8 = a;
          JSONObject localJSONObject23 = paramJSONObject;
          String str22 = "bdc";
          int i24 = i8;
          i7 = a(localJSONObject23, str22, i24);
          JSONObject localJSONObject24 = paramJSONObject;
          String str23 = "br";
          int i25 = 1087373312;
          f1 = a(localJSONObject24, str23, i25);
          float f2 = localObject13 < 1065353216;
          if (f2 < 0)
            i4 = 1065353216;
          i10 = ((Bitmap)localObject3).getWidth();
          localObject18 = ((Bitmap)localObject3).getHeight();
        }
      }
    }
    catch (JSONException localObject5)
    {
      while (true)
      {
        float f1;
        try
        {
          Object localObject18;
          int i7;
          int i4;
          int i10;
          Object localObject22 = Bitmap.Config.ARGB_8888;
          localObject22 = Bitmap.createBitmap(i10, localObject18, (Bitmap.Config)localObject22);
          if (localObject22 != null)
            continue;
          Object localObject3 = localObject7;
          localObject7 = localObject11;
          localObject11 = localObject3;
          localObject3 = localJSONObject3;
          continue;
          label1254: localObject3 = null;
          continue;
          ((Bitmap)localObject22).eraseColor(null);
          Canvas localCanvas1 = new android/graphics/Canvas;
          Canvas localCanvas2 = localCanvas1;
          Object localObject23 = localObject22;
          localCanvas2.<init>(localObject23);
          PaintFlagsDrawFilter localPaintFlagsDrawFilter = new PaintFlagsDrawFilter(null, 1);
          localCanvas1.setDrawFilter(localPaintFlagsDrawFilter);
          float f6 = f1 + i4;
          Path localPath1 = new Path();
          int i26 = i10;
          int i27 = localObject18;
          RectF localRectF1 = new RectF(null, null, i26, i27);
          Path.Direction localDirection1 = Path.Direction.CCW;
          Path localPath2 = localPath1;
          RectF localRectF2 = localRectF1;
          int i28 = f6;
          int i29 = f6;
          Path.Direction localDirection2 = localDirection1;
          localPath2.addRoundRect(localRectF2, i28, i29, localDirection2);
          Region.Op localOp1 = Region.Op.REPLACE;
          Canvas localCanvas3 = localCanvas1;
          Path localPath3 = localPath1;
          Region.Op localOp2 = localOp1;
          localCanvas3.clipPath(localPath3, localOp2);
          Paint localPaint1 = new Paint(3);
          Canvas localCanvas4 = localCanvas1;
          Object localObject24 = localObject3;
          float f7 = null;
          float f8 = null;
          Paint localPaint2 = localPaint1;
          localCanvas4.drawBitmap(localObject24, f7, f8, localPaint2);
          Region.Op localOp3 = Region.Op.REPLACE;
          Canvas localCanvas5 = localCanvas1;
          RectF localRectF3 = localRectF1;
          Region.Op localOp4 = localOp3;
          localCanvas5.clipRect(localRectF3, localOp4);
          Paint localPaint3 = new Paint(1);
          Paint localPaint4 = localPaint3;
          int i30 = i4;
          localPaint4.setStrokeWidth(i30);
          Paint localPaint5 = localPaint3;
          int i31 = i7;
          localPaint5.setColor(i31);
          Paint.Style localStyle = Paint.Style.STROKE;
          Paint localPaint6 = localPaint3;
          int i32 = i7;
          localPaint6.setStyle(i32);
          Path localPath4 = new Path();
          float f9 = i4 / 1073741824;
          RectF localRectF4 = new android/graphics/RectF;
          float f10 = i10 - i4;
          float f11 = localObject18 - i4;
          RectF localRectF5 = localRectF4;
          int i33 = i4;
          int i34 = i4;
          int i35 = i10;
          int i36 = localObject18;
          localRectF5.<init>(i33, i34, i35, i36);
          Path.Direction localDirection3 = Path.Direction.CCW;
          int i37 = i7;
          RectF localRectF6 = localRectF4;
          int i38 = f1;
          int i39 = f1;
          Object localObject25 = i4;
          i37.addRoundRect(localRectF6, i38, i39, localObject25);
          Canvas localCanvas6 = localCanvas1;
          int i40 = i7;
          Paint localPaint7 = localPaint3;
          localCanvas6.drawPath(i40, localPaint7);
          if (localObject3 == null)
            continue;
          ((Bitmap)localObject3).recycle();
          localObject3 = localObject22;
          this.z.add(localObject3);
          ((ImageView)localObject7).setImageBitmap((Bitmap)localObject3);
          localObject3 = localObject7;
          continue;
          label1698: this.z.add(localObject3);
          ((ImageView)localObject7).setImageBitmap((Bitmap)localObject3);
          localObject3 = localObject7;
          continue;
          label1719: localObject3 = bh.a("AdMobSDK", 6);
          if (localObject3 == 0)
            continue;
          localObject3 = "AdMobSDK";
          localObject7 = "couldn't find Bitmap " + (String)localObject7;
          Log.e((String)localObject3, (String)localObject7);
          localObject3 = null;
          continue;
          label1771: localObject7 = bh.a("AdMobSDK", 3);
          if (localObject7 == 0)
            continue;
          localObject7 = "AdMobSDK";
          StringBuilder localStringBuilder = new StringBuilder().append("Could not find asset name ");
          JSONObject localJSONObject25 = paramJSONObject;
          String str24 = localJSONObject25;
          Log.d((String)localObject7, str24);
          continue;
          localJSONException = localJSONException;
          if (!bh.a("AdMobSDK", 6))
            continue;
          Log.e("AdMobSDK", "exception while trying to create a flex view.", localJSONException);
          localJSONException = null;
          continue;
          if (!"P".equals(localJSONException))
            continue;
          Object localObject4 = this.s;
          if (localObject4 == null)
            continue;
          localObject7 = this.s.getContext();
          localObject4 = new View((Context)localObject7);
          localObject7 = localObject11;
          localObject11 = localObject4;
          localObject4 = localJSONObject3;
          continue;
          int i3 = 0;
          continue;
          boolean bool1 = "wv".equals(i3);
          if (!bool1)
            continue;
          localObject5 = d(paramJSONObject);
          localObject7 = localObject11;
          localObject11 = localObject5;
          localObject5 = localJSONObject3;
          continue;
          label1946: if (localObject5 == null)
            continue;
          localObject5 = null;
          localObject11.setBackgroundDrawable((Drawable)localObject5);
          continue;
          label1961: localObject5 = bh.a("AdMobSDK", 6);
          if (localObject5 == 0)
            continue;
          localObject5 = "AdMobSDK";
          Log.e((String)localObject5, "created a null view.");
          localObject5 = null;
        }
        catch (Throwable localThrowable)
        {
          JSONObject localJSONObject3;
          continue;
          Object localObject5 = localJSONObject3;
          Object localObject26 = localObject11;
          Object localObject11 = localObject7;
          Object localObject7 = localObject26;
        }
        continue;
        label2014: Object localObject14 = f1;
      }
    }
  }

  private static JSONArray b(int paramInt)
  {
    JSONArray localJSONArray = new JSONArray();
    int i1 = Color.red(paramInt);
    localJSONArray.put(i1);
    int i2 = Color.green(paramInt);
    localJSONArray.put(i2);
    int i3 = Color.blue(paramInt);
    localJSONArray.put(i3);
    int i4 = Color.alpha(paramInt);
    localJSONArray.put(i4);
    return localJSONArray;
  }

  private static float[] b(JSONArray paramJSONArray)
  {
    int i1 = paramJSONArray.length();
    try
    {
      float[] arrayOfFloat = new float[i1];
      for (int i2 = 0; i2 < i1; i2++)
      {
        float f1 = (float)paramJSONArray.getDouble(i2);
        arrayOfFloat[i2] = f1;
      }
      Object localObject = arrayOfFloat;
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localJSONException = null;
    }
  }

  private static float[] b(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    int i1;
    if (localJSONArray == null)
      i1 = 0;
    while (true)
    {
      return i1;
      float[] arrayOfFloat = b(i1);
    }
  }

  private static int c(JSONArray paramJSONArray)
  {
    int i1 = (int)(paramJSONArray.getDouble(0) * 4643176031446892544L);
    int i2 = (int)(paramJSONArray.getDouble(1) * 4643176031446892544L);
    int i3 = (int)(paramJSONArray.getDouble(2) * 4643176031446892544L);
    return Color.argb((int)(paramJSONArray.getDouble(3) * 4643176031446892544L), i1, i2, i3);
  }

  private static int c(JSONObject paramJSONObject)
  {
    int i1 = (int)a(paramJSONObject, "rc", 1065353216);
    if (i1 > 0)
      i1--;
    return i1;
  }

  private static RectF d(JSONArray paramJSONArray)
  {
    float f1 = (float)paramJSONArray.getDouble(0);
    float f2 = (float)paramJSONArray.getDouble(1);
    float f3 = (float)paramJSONArray.getDouble(2);
    float f4 = (float)paramJSONArray.getDouble(3);
    float f5 = f3 + f1;
    float f6 = f4 + f2;
    return new RectF(f1, f2, f5, f6);
  }

  private View d(JSONObject paramJSONObject)
  {
    String str1 = null;
    f localf = this.s;
    Object localObject2;
    Object localObject3;
    Object localObject1;
    if (localf != null)
    {
      String str2 = paramJSONObject.optString("u");
      localObject2 = paramJSONObject.optString("html");
      localObject3 = paramJSONObject.optString("base");
      int i1 = this.y;
      i1++;
      this.y = i1;
      Context localContext = this.s.getContext();
      localObject1 = new r(localContext, this);
      if ((str2 != null) && (!str2.equals("")))
      {
        ((com.admob.android.ads.a.a)localObject1).c = str2;
        ((r)localObject1).loadUrl(str2);
      }
    }
    while (true)
    {
      localObject3 = paramJSONObject.optJSONObject("d");
      if (localObject3 != null)
        ((r)localObject1).a = ((JSONObject)localObject3);
      localObject3 = this.s.b;
      localObject2 = new JSONObject();
      try
      {
        JSONArray localJSONArray1 = b(((AdView)localObject3).a());
        ((JSONObject)localObject2).put("ptc", localJSONArray1);
        JSONArray localJSONArray2 = b(((AdView)localObject3).b());
        ((JSONObject)localObject2).put("stc", localJSONArray2);
        JSONArray localJSONArray3 = b(((AdView)localObject3).c());
        ((JSONObject)localObject2).put("bgc", localObject3);
        label200: ((r)localObject1).b = ((JSONObject)localObject2);
        ((r)localObject1).a_();
        this.F = true;
        while (true)
        {
          return localObject1;
          if ((localObject2 != null) && (!((String)localObject2).equals("")) && (localObject3 != null) && (!((String)localObject3).equals("")))
          {
            String str3 = str1;
            String str4 = str1;
            ((r)localObject1).loadDataWithBaseURL((String)localObject3, (String)localObject2, str1, str3, str4);
            break;
          }
          a(null);
          localObject1 = str1;
          continue;
          localObject1 = str1;
        }
      }
      catch (JSONException localJSONException)
      {
        break label200;
      }
    }
  }

  private static PointF e(JSONArray paramJSONArray)
  {
    float f1 = (float)paramJSONArray.getDouble(0);
    float f2 = (float)paramJSONArray.getDouble(1);
    return new PointF(f1, f2);
  }

  private boolean m()
  {
    int i1 = this.y;
    if (i1 <= 0)
      i1 = 1;
    while (true)
    {
      return i1;
      Object localObject = null;
    }
  }

  private void n()
  {
    h localh = (h)this.r.get();
    if (localh != null)
      localh.a(this);
    if (this.G != null)
      ag.a();
  }

  private void o()
  {
    h localh = (h)this.r.get();
    if (localh != null)
      localh.a();
    if (this.G != null)
      ag.a();
  }

  public final double a()
  {
    return this.B;
  }

  public final int a(int paramInt)
  {
    double d1 = paramInt;
    if (this.C > 0L)
    {
      long l1 = this.C;
      d1 *= l1;
    }
    return (int)d1;
  }

  final Rect a(Rect paramRect)
  {
    Rect localRect = new Rect(paramRect);
    if (this.C > 0L)
    {
      int i1 = paramRect.left;
      int i2 = a(i1);
      localRect.left = i2;
      int i3 = paramRect.top;
      int i4 = a(i3);
      localRect.top = i4;
      int i5 = paramRect.right;
      int i6 = a(i5);
      localRect.right = i6;
      int i7 = paramRect.bottom;
      int i8 = a(i7);
      localRect.bottom = i8;
    }
    return localRect;
  }

  public final void a(cg paramcg)
  {
    this.A = paramcg;
  }

  public final void a(f paramf)
  {
    this.s = paramf;
  }

  public final void a(JSONObject paramJSONObject)
  {
    int i1 = 4;
    boolean bool1 = this.l;
    Object localObject1;
    if (bool1)
    {
      boolean bool2 = bh.a("AdMobSDK", i1);
      if (bool2)
      {
        localObject2 = "AdMobSDK";
        localObject1 = "Ad clicked again.  Stats on admob.com will only reflect the first click.";
        Log.i((String)localObject2, (String)localObject1);
      }
      localObject1 = null;
      localObject2 = this.s;
      if (localObject2 == null)
        break label207;
      localObject2 = this.s.getContext();
      if (!(localObject2 instanceof Activity))
        break label207;
    }
    label207: for (Object localObject2 = (Activity)localObject2; ; localObject2 = localObject1)
    {
      if (localObject2 != null)
      {
        ad localad = this.D;
        f localf = this.s;
        localad.a((Activity)localObject2, localf);
      }
      while (true)
      {
        if (this.A != null)
          this.A.e();
        return;
        this.l = true;
        localObject2 = bh.a("AdMobSDK", localObject1);
        if (localObject2 != 0)
        {
          localObject2 = "AdMobSDK";
          localObject1 = "Ad clicked.";
          Log.i((String)localObject2, (String)localObject1);
        }
        localObject2 = this.s;
        if (localObject2 == null)
          break;
        localObject2 = this.s.getContext();
        localObject1 = this.D;
        localObject2 = ak.g((Context)localObject2);
        localObject1 = ((ad)localObject1).a.c;
        ad.a((List)localObject1, paramJSONObject, (String)localObject2);
        break;
        if (!bh.a("AdMobSDK", 3))
          continue;
        Log.d("AdMobSDK", "Context null, not able to finish click.");
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
    int i1 = this.y - 1;
    this.y = i1;
    if (paramBoolean)
      if (m())
        n();
    while (true)
    {
      return;
      this.x.c();
    }
  }

  public final f b()
  {
    return this.s;
  }

  public final long c()
  {
    return this.o;
  }

  public final boolean d()
  {
    return this.k;
  }

  public final int e()
  {
    return this.p;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof e;
    String str;
    if (bool)
    {
      e locale = (e)paramObject;
      localObject = toString();
      str = paramObject.toString();
    }
    for (Object localObject = ((String)localObject).equals(str); ; localObject = null)
      return localObject;
  }

  public final int f()
  {
    return this.q;
  }

  public final Rect g()
  {
    int i1 = 0;
    if (this.n == null)
    {
      int i2 = this.p;
      int i3 = this.q;
      Rect localRect = new Rect(i1, i1, i2, i3);
      this.n = localRect;
    }
    return this.n;
  }

  final void h()
  {
    Object localObject = this.z;
    Iterator localIterator = ((Vector)localObject).iterator();
    while (true)
    {
      localObject = localIterator.hasNext();
      if (localObject == 0)
        break;
      localObject = (Bitmap)localIterator.next();
      if (localObject == null)
        continue;
      ((Bitmap)localObject).recycle();
    }
    this.z.clear();
    if (this.D != null)
      this.D.a();
  }

  public final int hashCode()
  {
    return toString().hashCode();
  }

  final void i()
  {
    Object localObject = this.s;
    if (localObject != null)
    {
      localObject = this.s.getContext();
      Iterator localIterator = this.m.iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        String str2 = ak.g((Context)localObject);
        a.a(str1, "impression_request", str2).f();
      }
    }
  }

  // ERROR //
  public final void j()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 157	com/admob/android/ads/e:D	Lcom/admob/android/ads/ad;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +42 -> 50
    //   11: aload_0
    //   12: getfield 157	com/admob/android/ads/e:D	Lcom/admob/android/ads/ad;
    //   15: invokevirtual 1339	com/admob/android/ads/ad:c	()Z
    //   18: astore_2
    //   19: iload_2
    //   20: ifeq +21 -> 41
    //   23: aload_0
    //   24: getfield 157	com/admob/android/ads/e:D	Lcom/admob/android/ads/ad;
    //   27: astore_2
    //   28: aload_0
    //   29: getfield 142	com/admob/android/ads/e:x	Lcom/admob/android/ads/ai;
    //   32: getfield 1099	com/admob/android/ads/ai:a	Ljava/util/Hashtable;
    //   35: astore_3
    //   36: aload_2
    //   37: aload_3
    //   38: invokevirtual 1342	com/admob/android/ads/ad:a	(Ljava/util/Hashtable;)V
    //   41: aload_0
    //   42: getfield 157	com/admob/android/ads/e:D	Lcom/admob/android/ads/ad;
    //   45: astore_2
    //   46: aload_2
    //   47: invokevirtual 1343	com/admob/android/ads/ad:b	()V
    //   50: aload_0
    //   51: getfield 934	com/admob/android/ads/e:w	Lorg/json/JSONObject;
    //   54: astore_2
    //   55: aload_2
    //   56: ifnull +134 -> 190
    //   59: aload_0
    //   60: getfield 934	com/admob/android/ads/e:w	Lorg/json/JSONObject;
    //   63: astore_2
    //   64: aload_0
    //   65: aload_1
    //   66: putfield 934	com/admob/android/ads/e:w	Lorg/json/JSONObject;
    //   69: ldc_w 1344
    //   72: astore_3
    //   73: aload_2
    //   74: aload_3
    //   75: invokevirtual 525	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   78: astore_2
    //   79: aload_2
    //   80: ifnull +67 -> 147
    //   83: new 1346	com/admob/android/ads/cf
    //   86: dup
    //   87: aload_0
    //   88: aload_2
    //   89: invokespecial 1348	com/admob/android/ads/cf:<init>	(Lcom/admob/android/ads/e;Lorg/json/JSONArray;)V
    //   92: astore_3
    //   93: getstatic 105	com/admob/android/ads/e:i	Landroid/os/Handler;
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +13 -> 111
    //   101: getstatic 105	com/admob/android/ads/e:i	Landroid/os/Handler;
    //   104: astore_2
    //   105: aload_2
    //   106: aload_3
    //   107: invokevirtual 1354	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   110: pop
    //   111: aload_0
    //   112: getfield 142	com/admob/android/ads/e:x	Lcom/admob/android/ads/ai;
    //   115: astore_2
    //   116: aload_2
    //   117: getfield 1357	com/admob/android/ads/ai:b	Ljava/util/HashSet;
    //   120: astore_3
    //   121: aload_3
    //   122: ifnull +24 -> 146
    //   125: aload_2
    //   126: getfield 1357	com/admob/android/ads/ai:b	Ljava/util/HashSet;
    //   129: astore_3
    //   130: aload_3
    //   131: monitorenter
    //   132: aload_2
    //   133: getfield 1357	com/admob/android/ads/ai:b	Ljava/util/HashSet;
    //   136: invokevirtual 1360	java/util/HashSet:clear	()V
    //   139: aload_2
    //   140: aconst_null
    //   141: putfield 1357	com/admob/android/ads/ai:b	Ljava/util/HashSet;
    //   144: aload_3
    //   145: monitorexit
    //   146: return
    //   147: aload_0
    //   148: invokespecial 745	com/admob/android/ads/e:o	()V
    //   151: goto -40 -> 111
    //   154: astore_2
    //   155: ldc_w 307
    //   158: iconst_3
    //   159: invokestatic 312	com/admob/android/ads/bh:a	(Ljava/lang/String;I)Z
    //   162: astore_3
    //   163: iload_3
    //   164: ifeq -53 -> 111
    //   167: ldc_w 307
    //   170: astore_3
    //   171: aload_3
    //   172: ldc_w 1362
    //   175: aload_2
    //   176: invokestatic 1364	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   179: pop
    //   180: goto -69 -> 111
    //   183: astore 4
    //   185: aload_3
    //   186: monitorexit
    //   187: aload 4
    //   189: athrow
    //   190: aload_0
    //   191: invokespecial 793	com/admob/android/ads/e:m	()Z
    //   194: ifeq -48 -> 146
    //   197: aload_0
    //   198: invokespecial 795	com/admob/android/ads/e:n	()V
    //   201: goto -55 -> 146
    //
    // Exception table:
    //   from	to	target	type
    //   69	111	154	org/json/JSONException
    //   147	151	154	org/json/JSONException
    //   132	146	183	finally
  }

  public final void k()
  {
    this.w = null;
    if (bh.a("AdMobSDK", 4))
      Log.i("AdMobSDK", "assetsDidFailToLoad()");
    o();
  }

  public final boolean l()
  {
    return this.F;
  }

  public final String toString()
  {
    String str = this.j;
    if (str == null)
      str = "";
    return str;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.e
 * JD-Core Version:    0.6.0
 */