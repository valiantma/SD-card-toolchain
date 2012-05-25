package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class r extends Binder
  implements e
{
  public r()
  {
    attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default:
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    }
    while (true)
    {
      return bool2;
      paramParcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
      int i = paramParcel1.readInt();
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      a(i, str1, str2);
      i = bool1;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.r
 * JD-Core Version:    0.6.0
 */