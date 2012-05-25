package com.android.vending.licensing;

import com.android.vending.licensing.a.a;
import com.android.vending.licensing.a.b;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class o
  implements g
{
  private static final byte[] a;
  private Cipher b;
  private Cipher c;

  static
  {
    byte[] arrayOfByte = new byte[16];
    arrayOfByte[0] = 16;
    arrayOfByte[1] = 74;
    arrayOfByte[2] = 71;
    arrayOfByte[3] = 65456;
    arrayOfByte[4] = 32;
    arrayOfByte[5] = 101;
    arrayOfByte[6] = 65489;
    arrayOfByte[7] = 72;
    arrayOfByte[8] = 117;
    arrayOfByte[9] = 65522;
    arrayOfByte[11] = 65507;
    arrayOfByte[12] = 70;
    arrayOfByte[13] = 65;
    arrayOfByte[14] = 65524;
    arrayOfByte[15] = 74;
    a = arrayOfByte;
  }

  public o(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    try
    {
      SecretKeyFactory localSecretKeyFactory = SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
      String str = String.valueOf(paramString1);
      char[] arrayOfChar = (str + paramString2).toCharArray();
      PBEKeySpec localPBEKeySpec = new PBEKeySpec(arrayOfChar, paramArrayOfByte, 1024, 256);
      byte[] arrayOfByte1 = localSecretKeyFactory.generateSecret(localPBEKeySpec).getEncoded();
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(arrayOfByte1, "AES");
      Cipher localCipher1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
      this.b = localCipher1;
      Cipher localCipher2 = this.b;
      byte[] arrayOfByte2 = a;
      IvParameterSpec localIvParameterSpec1 = new IvParameterSpec(arrayOfByte2);
      localCipher2.init(1, localSecretKeySpec, localIvParameterSpec1);
      Cipher localCipher3 = Cipher.getInstance("AES/CBC/PKCS5Padding");
      this.c = localCipher3;
      Cipher localCipher4 = this.c;
      byte[] arrayOfByte3 = a;
      IvParameterSpec localIvParameterSpec2 = new IvParameterSpec(arrayOfByte3);
      localCipher4.init(2, localSecretKeySpec, localIvParameterSpec2);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
    }
    throw new RuntimeException("Invalid environment", localGeneralSecurityException);
  }

  public final String a(String paramString)
  {
    int i;
    if (paramString == null)
      i = 0;
    while (true)
    {
      return i;
      try
      {
        Object localObject = this.b;
        byte[] arrayOfByte = ("com.android.vending.licensing.AESObfuscator-1|" + paramString).getBytes("UTF-8");
        localObject = b.a(((Cipher)localObject).doFinal(arrayOfByte));
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new RuntimeException("Invalid environment", localUnsupportedEncodingException);
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
      }
    }
    throw new RuntimeException("Invalid environment", localGeneralSecurityException);
  }

  public final String b(String paramString)
  {
    int i;
    if (paramString == null)
      i = 0;
    while (true)
    {
      return i;
      try
      {
        Cipher localCipher = this.c;
        byte[] arrayOfByte1 = b.a(paramString);
        byte[] arrayOfByte2 = localCipher.doFinal(arrayOfByte1);
        str1 = new String(arrayOfByte2, "UTF-8");
        if (str1.indexOf("com.android.vending.licensing.AESObfuscator-1|") != 0)
        {
          String str2 = "Header not found (invalid data or key):" + paramString;
          throw new n(str2);
        }
      }
      catch (a locala)
      {
        String str3 = String.valueOf(locala.getMessage());
        String str4 = str3 + ":" + paramString;
        throw new n(str4);
        int j = "com.android.vending.licensing.AESObfuscator-1|".length();
        int k = str1.length();
        String str1 = str1.substring(j, k);
      }
      catch (IllegalBlockSizeException localIllegalBlockSizeException)
      {
        String str5 = String.valueOf(localIllegalBlockSizeException.getMessage());
        String str6 = str5 + ":" + paramString;
        throw new n(str6);
      }
      catch (BadPaddingException localBadPaddingException)
      {
        String str7 = String.valueOf(localBadPaddingException.getMessage());
        String str8 = str7 + ":" + paramString;
        throw new n(str8);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
    }
    throw new RuntimeException("Invalid environment", localUnsupportedEncodingException);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.android.vending.licensing.o
 * JD-Core Version:    0.6.0
 */