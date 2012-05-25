package com.android.vending.licensing;

import I;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import android.text.TextUtils.StringSplitter;
import android.util.Log;
import com.android.vending.licensing.a.b;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Iterator;
import java.util.regex.Pattern;

final class a
{
  private final q a;
  private final p b;
  private final int c;
  private final String d;
  private final String e;
  private final h f;

  a(q paramq, h paramh, p paramp, int paramInt, String paramString1, String paramString2)
  {
    this.a = paramq;
    this.f = paramh;
    this.b = paramp;
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
  }

  private void a(t paramt, u paramu)
  {
    this.a.a(paramt, paramu);
    if (this.a.a())
      this.b.a();
    while (true)
    {
      return;
      this.b.b();
    }
  }

  private void a(v paramv)
  {
    this.b.a(paramv);
  }

  private void d()
  {
    this.b.b();
  }

  public final p a()
  {
    return this.b;
  }

  public final void a(PublicKey paramPublicKey, int paramInt, String paramString1, String paramString2)
  {
    int i = 2;
    int k = 1;
    Object localObject2 = null;
    String str1;
    if ((paramInt == 0) || (paramInt == k) || (paramInt == i))
      try
      {
        localObject2 = Signature.getInstance("SHA1withRSA");
        ((Signature)localObject2).initVerify(paramPublicKey);
        localObject1 = paramString1.getBytes();
        ((Signature)localObject2).update(localObject1);
        localObject1 = b.a(paramString2);
        localObject2 = ((Signature)localObject2).verify(localObject1);
        if (localObject2 == 0)
        {
          Log.e("LicenseValidator", "Signature verification failed.");
          d();
          return;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new RuntimeException(localNoSuchAlgorithmException);
      }
      catch (InvalidKeyException localInvalidKeyException)
      {
        while (true)
        {
          v localv1 = v.d;
          a(localv1);
        }
      }
      catch (SignatureException localSignatureException)
      {
        throw new RuntimeException(localSignatureException);
      }
      catch (com.android.vending.licensing.a.a locala)
      {
        while (true)
        {
          Log.e("LicenseValidator", "Could not Base64-decode signature.");
          d();
          continue;
          try
          {
            localObject2 = new TextUtils.SimpleStringSplitter(':');
            ((TextUtils.StringSplitter)localObject2).setString(paramString1);
            localObject1 = ((TextUtils.StringSplitter)localObject2).iterator();
            localObject2 = ((Iterator)localObject1).hasNext();
            if (localObject2 != 0)
              break;
            throw new IllegalArgumentException("Blank response.");
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            Log.e("LicenseValidator", "Could not parse response.");
            d();
          }
        }
        localObject2 = (String)((Iterator)localObject1).next();
        str1 = "";
        if (!((Iterator)localObject1).hasNext());
      }
    u localu;
    for (Object localObject1 = (String)((Iterator)localObject1).next(); ; localObject1 = localu)
    {
      str1 = Pattern.quote("|");
      localObject2 = TextUtils.split((String)localObject2, str1);
      int j = localObject2.length;
      if (j < 6)
        throw new IllegalArgumentException("Wrong number of fields.");
      localu = new u();
      localu.g = ((String)localObject1);
      int n = Integer.parseInt(localObject2[null]);
      localu.a = ((I)localObject1);
      int i1 = Integer.parseInt(localObject2[1]);
      localu.b = ((I)localObject1);
      Object localObject4 = localObject2[2];
      localu.c = ((String)localObject1);
      Object localObject5 = localObject2[3];
      localu.d = ((String)localObject1);
      Object localObject6 = localObject2[4];
      localu.e = ((String)localObject1);
      localObject2 = Long.parseLong(localObject2[5]);
      Object localObject7;
      localu.f = localObject7;
      int m = localu.a;
      if (m != paramInt)
      {
        Log.e("LicenseValidator", "Response codes don't match.");
        d();
        break;
      }
      m = localu.b;
      int i2 = this.c;
      if (m != i2)
      {
        Log.e("LicenseValidator", "Nonce doesn't match.");
        d();
        break;
      }
      Object localObject3 = localu.c;
      String str2 = this.d;
      localObject3 = ((String)localObject3).equals(str2);
      if (localObject3 == 0)
      {
        Log.e("LicenseValidator", "Package name doesn't match.");
        d();
        break;
      }
      localObject3 = localu.d;
      String str3 = this.e;
      localObject3 = ((String)localObject3).equals(str3);
      if (localObject3 == 0)
      {
        Log.e("LicenseValidator", "Version codes don't match.");
        d();
        break;
      }
      localObject3 = TextUtils.isEmpty(localu.e);
      if (localObject3 != 0)
      {
        Log.e("LicenseValidator", "User identifier is empty.");
        d();
        break;
      }
      localObject3 = localu;
      switch (paramInt)
      {
      default:
        Log.e("LicenseValidator", "Unknown response code for license check.");
        d();
        break;
      case 0:
      case 2:
        t localt1 = this.f.a();
        a(localt1, (u)localObject3);
        break;
      case 1:
        t localt2 = t.b;
        a(localt2, (u)localObject3);
        break;
      case 257:
        Log.w("LicenseValidator", "Error contacting licensing server.");
        t localt3 = t.c;
        a(localt3, (u)localObject3);
        break;
      case 4:
        Log.w("LicenseValidator", "An error has occurred on the licensing server.");
        t localt4 = t.c;
        a(localt4, (u)localObject3);
        break;
      case 5:
        Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
        t localt5 = t.c;
        a(localt5, (u)localObject3);
        break;
      case 258:
        v localv2 = v.a;
        a(localv2);
        break;
      case 259:
        v localv3 = v.b;
        a(localv3);
        break;
      case 3:
        v localv4 = v.c;
        a(localv4);
        break;
      }
    }
  }

  public final int b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.a
 * JD-Core Version:    0.6.0
 */