package com.admob.android.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.TextView;

public final class ay extends TextView
{
  public float a = -1082130432;
  public boolean b = null;
  public float c;

  public ay(Context paramContext, float paramFloat)
  {
    super(paramContext);
    setGravity(80);
    this.c = paramFloat;
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    boolean bool = this.b;
    if (bool)
    {
      int i = getMeasuredWidth();
      Typeface localTypeface = getTypeface();
      float f1 = getTextSize();
      CharSequence localCharSequence = getText();
      TextPaint localTextPaint1 = getPaint();
      TextPaint localTextPaint2 = new TextPaint(localTextPaint1);
      if (localCharSequence != null)
      {
        int j = f1;
        float f2;
        while (true)
        {
          int k = this.a;
          if (j < k)
            break;
          localTextPaint2.setTypeface(localTypeface);
          localTextPaint2.setTextSize(j);
          int m = localCharSequence.length();
          float f3 = localTextPaint2.measureText(localCharSequence, 0, m);
          float f4 = i;
          if (f3 <= f4)
            break;
          j -= 1056964608;
        }
        if (f1 != f2)
        {
          int n = this.c;
          float f5 = f2 / n;
          setTextSize(f5);
        }
      }
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ay
 * JD-Core Version:    0.6.0
 */