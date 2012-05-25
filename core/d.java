package com.rafoid.core;

import android.app.NotificationManager;
import java.util.TimerTask;

final class d extends TimerTask
{
  d(NotificationManager paramNotificationManager)
  {
  }

  public final void run()
  {
    this.a.cancel(1);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.core.d
 * JD-Core Version:    0.6.0
 */