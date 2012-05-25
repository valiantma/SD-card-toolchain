package com.rafoid.multimountsdcard.widget;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;

public class MultiMountSDCardWidget$UpdateService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    boolean bool1 = MultiMountSDCardWidget.b.booleanValue();
    boolean bool2;
    if (bool1)
      bool2 = null;
    while (true)
    {
      Boolean localBoolean = Boolean.valueOf(bool2);
      RemoteViews localRemoteViews = MultiMountSDCardWidget.a(this, bool2);
      Class localClass = MultiMountSDCardWidget.a;
      ComponentName localComponentName = new ComponentName(this, localClass);
      AppWidgetManager.getInstance(this).updateAppWidget(localComponentName, bool2);
      return;
      bool2 = true;
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.MultiMountSDCardWidget.UpdateService
 * JD-Core Version:    0.6.0
 */