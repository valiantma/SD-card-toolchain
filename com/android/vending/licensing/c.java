package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;

final class c
  implements e
{
  private IBinder a;

  c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(int paramInt, String paramString1, String paramString2)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
      localParcel.writeInt(paramInt);
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
      this.a.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.c
 * JD-Core Version:    0.6.0
 */