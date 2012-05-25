package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class b extends Binder
  implements ILicensingService
{
  public b()
  {
    attachInterface(this, "com.android.vending.licensing.ILicensingService");
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
      while (true)
      {
        return bool2;
        paramParcel2.writeString("com.android.vending.licensing.ILicensingService");
        bool2 = bool1;
      }
    case 1:
    }
    Object localObject1 = "com.android.vending.licensing.ILicensingService";
    paramParcel1.enforceInterface((String)localObject1);
    long l = paramParcel1.readLong();
    String str = paramParcel1.readString();
    IBinder localIBinder = paramParcel1.readStrongBinder();
    if (localIBinder == null)
      localObject1 = null;
    while (true)
    {
      Object localObject2;
      a(localObject2, str, (e)localObject1);
      localObject1 = bool1;
      break;
      localObject1 = localIBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
      if ((localObject1 != null) && ((localObject1 instanceof e)))
      {
        localObject1 = (e)localObject1;
        continue;
      }
      localObject1 = new c(localIBinder);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.b
 * JD-Core Version:    0.6.0
 */