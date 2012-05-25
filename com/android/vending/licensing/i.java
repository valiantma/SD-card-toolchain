package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;

final class i
  implements ILicensingService
{
  private IBinder a;

  i(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(long paramLong, String paramString, e parame)
  {
    e parame = null;
    Parcel localParcel = Parcel.obtain();
    try
    {
      Object localObject1 = "com.android.vending.licensing.ILicensingService";
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeLong(paramLong);
      localParcel.writeString(???);
      if (paramString != null)
      {
        localObject1 = paramString.asBinder();
        localParcel.writeStrongBinder((IBinder)localObject1);
        this.a.transact(1, localParcel, null, 1);
        return;
      }
      localObject1 = parame;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.i
 * JD-Core Version:    0.6.0
 */