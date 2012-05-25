package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admob.android.ads.a.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;

public class AdMobActivity extends Activity
{
  private ab a;
  private Vector b;

  public void finish()
  {
    if ((this.a != null) && (this.a.l))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("admob_activity", true);
      setResult(-1, localIntent);
    }
    super.finish();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((bb)localIterator.next()).a(paramConfiguration);
    super.onConfigurationChanged(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    int i = -1;
    int j = -1;
    int k = 2;
    JSONObject localJSONObject = null;
    int m = 0;
    super.onCreate(paramBundle);
    Object localObject1 = new Vector();
    this.b = ((Vector)localObject1);
    localObject1 = getIntent().getBundleExtra("o");
    Object localObject3 = new ab();
    localObject1 = ((ab)localObject3).a((Bundle)localObject1);
    if (localObject1 != 0)
    {
      this.a = ((ab)localObject3);
      localObject1 = this.a;
      if (localObject1 != null)
        break label114;
      if (bh.a("AdMobSDK", 6))
        Log.e("AdMobSDK", "Unable to get openerInfo from intent");
    }
    while (true)
    {
      return;
      this.a = localJSONObject;
      break;
      label114: localObject1 = this.a.c;
      localObject3 = ak.g(this);
      ad.a((List)localObject1, localJSONObject, (String)localObject3);
      localObject1 = this.a.a;
      localObject3 = new WeakReference(this);
      Object localObject4 = cj.a;
      localObject1 = ((ci)localObject1).ordinal();
      int n = localObject4[localObject1];
      Object localObject2;
      switch (n)
      {
      default:
        localObject2 = localJSONObject;
        if (localObject2 == null)
          break;
        int[] arrayOfInt = cj.b;
        int i1 = this.a.e.ordinal();
        switch (arrayOfInt[i1])
        {
        default:
          if (bh.a("AdMobSDK", k))
            Log.v("AdMobSDK", "Setting target orientation to sensor");
          setRequestedOrientation(4);
        case 1:
        case 2:
        }
      case 1:
      case 2:
        while (true)
        {
          label204: setContentView((View)localObject2);
          break;
          setTheme(16973831);
          localObject2 = getApplicationContext();
          localObject4 = this.a.d;
          boolean bool = this.a.f;
          Point localPoint = this.a.g;
          float f = f.a(this);
          RelativeLayout localRelativeLayout = new RelativeLayout((Context)localObject2);
          localRelativeLayout.setGravity(17);
          a locala = new a((Context)localObject2, bool, (WeakReference)localObject3);
          locala.setBackgroundColor(m);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i, i);
          localRelativeLayout.addView(locala, (ViewGroup.LayoutParams)localObject3);
          if (bool)
          {
            ImageButton localImageButton = new ImageButton((Context)localObject2);
            localImageButton.setImageResource(17301527);
            localImageButton.setBackgroundDrawable(localJSONObject);
            localImageButton.setPadding(m, m, m, m);
            localImageButton.setOnClickListener(locala);
            localObject2 = new RelativeLayout.LayoutParams(j, j);
            int i2 = localPoint.x;
            double d1 = f;
            int i3 = e.a(i2, localJSONObject);
            int i4 = localPoint.y;
            double d2 = f;
            int i5 = e.a(localPoint, localJSONObject);
            ((RelativeLayout.LayoutParams)localObject2).setMargins(i3, localPoint, m, m);
            localRelativeLayout.addView(localImageButton, (ViewGroup.LayoutParams)localObject2);
          }
          locala.c = ((String)localObject4);
          locala.loadUrl((String)localObject4);
          localObject2 = localRelativeLayout;
          break label204;
          localObject2 = this.a;
          Context localContext = getApplicationContext();
          bd localbd = new bd(localContext, (WeakReference)localObject3);
          localbd.a((ab)localObject2);
          this.b.add(localbd);
          localObject2 = localbd;
          break label204;
          if (bh.a("AdMobSDK", k))
            Log.v("AdMobSDK", "Setting target orientation to landscape");
          setRequestedOrientation(m);
          continue;
          if (bh.a("AdMobSDK", k))
            Log.v("AdMobSDK", "Setting target orientation to portrait");
          setRequestedOrientation(1);
        }
      }
      finish();
    }
  }

  protected void onDestroy()
  {
    this.b.clear();
    super.onDestroy();
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.AdMobActivity
 * JD-Core Version:    0.6.0
 */