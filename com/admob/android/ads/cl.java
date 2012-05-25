package com.admob.android.ads;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.util.Log;
import java.lang.ref.WeakReference;

final class cl
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener
{
  private WeakReference a;

  public cl(bd parambd)
  {
    WeakReference localWeakReference = new WeakReference(parambd);
    this.a = localWeakReference;
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    boolean bool = true;
    this = (bd)this.a.get();
    if (this != null)
    {
      this.i = bool;
      f();
      a(bool);
    }
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    boolean bool = bh.a("AdMobSDK", 6);
    if (bool)
    {
      localObject = "AdMobSDK";
      String str = "error playing video, what: " + paramInt1 + ", extra: " + paramInt2;
      Log.e((String)localObject, str);
    }
    Object localObject = this.a;
    this = (bd)((WeakReference)localObject).get();
    if (this == null)
      localObject = null;
    while (true)
    {
      return localObject;
      c();
      int i = 1;
    }
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    this = (bd)this.a.get();
    if (this != null)
      a();
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.cl
 * JD-Core Version:    0.6.0
 */