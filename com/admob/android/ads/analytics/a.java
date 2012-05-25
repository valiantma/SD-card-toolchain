package com.admob.android.ads.analytics;

import android.util.Log;
import com.admob.android.ads.b;
import com.admob.android.ads.bh;
import com.admob.android.ads.n;

final class a
  implements b
{
  public final void a(n paramn)
  {
    if (bh.a("AdMobSDK", 3))
      Log.d("AdMobSDK", "Recorded install from an AdMob ad.");
  }

  public final void a(n paramn, Exception paramException)
  {
    if (bh.a("AdMobSDK", 3))
      Log.d("AdMobSDK", "Failed to record install from an AdMob ad.", paramException);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.analytics.a
 * JD-Core Version:    0.6.0
 */