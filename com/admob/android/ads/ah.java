package com.admob.android.ads;

import android.content.Context;
import android.media.AudioManager;

public final class ah
{
  public AudioManager a;

  public ah(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    this.a = localAudioManager;
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.ah
 * JD-Core Version:    0.6.0
 */