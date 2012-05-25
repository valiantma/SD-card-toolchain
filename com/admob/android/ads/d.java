package com.admob.android.ads;

import android.util.Log;
import java.net.URL;

final class d
  implements b
{
  public final void a(n paramn)
  {
    if (bh.a("AdMobSDK", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("Click processed at ");
      URL localURL = paramn.e();
      String str = localURL;
      Log.d("AdMobSDK", str);
    }
  }

  public final void a(n paramn, Exception paramException)
  {
    if (bh.a("AdMobSDK", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("Click processing failed at ");
      URL localURL = paramn.e();
      String str = localURL;
      Log.d("AdMobSDK", str, paramException);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.d
 * JD-Core Version:    0.6.0
 */