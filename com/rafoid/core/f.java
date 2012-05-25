package com.rafoid.core;

import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;

final class f
  implements Runnable
{
  f(LongToast paramLongToast)
  {
  }

  public final void run()
  {
    int i = 5;
    long l1 = LongToast.a(this.a);
    Object localObject1;
    int j = (int)((SystemClock.uptimeMillis() - localObject1) / 1000L);
    int k = j / 60;
    j %= 60;
    if (j < i)
    {
      TextView localTextView = this.a.a;
      StringBuilder localStringBuilder = new StringBuilder();
      int m = i - j;
      String str = m;
      localTextView.setText(str);
    }
    if (j >= i)
    {
      this.a.a.setVisibility(8);
      this.a.b.setVisibility(0);
      LongToast localLongToast = this.a;
      Boolean localBoolean = Boolean.valueOf(true);
      LongToast.a(localLongToast, localBoolean);
      Handler localHandler1 = LongToast.b(this.a);
      Runnable localRunnable = LongToast.c(this.a);
      localHandler1.removeCallbacks(localRunnable);
    }
    while (true)
    {
      return;
      Handler localHandler2 = LongToast.b(this.a);
      int n = k * 60;
      int i1 = j + k;
      j++;
      long l2 = j * 1000;
      Object localObject2;
      long l3 = localObject1 + localObject2;
      localHandler2.postAtTime(this, localObject1);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.core.f
 * JD-Core Version:    0.6.0
 */