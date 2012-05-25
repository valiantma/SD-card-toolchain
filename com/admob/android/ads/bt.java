package com.admob.android.ads;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

public final class bt extends ba
{
  public bt(s params1, s params2, WeakReference paramWeakReference)
  {
    super(params2, paramWeakReference);
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (("http://mm.admob.com/static/android/canvas.html".equals(paramString)) && (this.b.b))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("javascript:cb('");
      String str1 = this.b.c;
      localStringBuilder.append(str1);
      localStringBuilder.append("','");
      String str2 = this.b.a;
      localStringBuilder.append(str2);
      localStringBuilder.append("')");
      this.b.b = null;
      s locals = this.b;
      String str3 = localStringBuilder.toString();
      locals.loadUrl(str3);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.bt
 * JD-Core Version:    0.6.0
 */