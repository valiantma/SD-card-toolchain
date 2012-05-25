package com.admob.android.ads;

import java.lang.ref.WeakReference;

final class aa
  implements Runnable
{
  private WeakReference a;

  public aa(AdView paramAdView)
  {
    WeakReference localWeakReference = new WeakReference(paramAdView);
    this.a = localWeakReference;
  }

  public final void run()
  {
    this = (AdView)this.a.get();
    if ((this != null) && ((AdView.a(this) == null) || (AdView.a(this).getParent() == null)) && (AdView.b(this) != null));
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.admob.android.ads.aa
 * JD-Core Version:    0.6.0
 */