package com.admob.android.ads;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import java.util.Date;

final class al
  implements LocationListener
{
  al(LocationManager paramLocationManager)
  {
  }

  public final void onLocationChanged(Location paramLocation)
  {
    ak.a(paramLocation);
    ak.a(System.currentTimeMillis());
    this.a.removeUpdates(this);
    if (bh.a("AdMobSDK", 3))
    {
      StringBuilder localStringBuilder1 = new StringBuilder().append("Acquired location ");
      double d1 = ak.g().getLatitude();
      Object localObject1;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(localObject1).append(",");
      double d2 = ak.g().getLongitude();
      Object localObject2;
      StringBuilder localStringBuilder3 = localStringBuilder2.append(localObject2).append(" at ");
      long l = ak.h();
      Object localObject3;
      String str1 = new Date(localObject3).toString();
      String str2 = str1 + ".";
      Log.d("AdMobSDK", str2);
    }
  }

  public final void onProviderDisabled(String paramString)
  {
  }

  public final void onProviderEnabled(String paramString)
  {
  }

  public final void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.al
 * JD-Core Version:    0.6.0
 */