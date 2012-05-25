package com.rafoid.multimountsdcard.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.widget.RemoteViews;
import java.io.File;

public class MultiMountSDCardWidget extends AppWidgetProvider
{
  public static Class a = MultiMountSDCardWidget.class;
  public static Boolean b;
  public static a c;
  private static String d = "";
  private static String e = "";
  private static Boolean f;

  static
  {
    b = Boolean.valueOf(null);
    f = Boolean.valueOf(null);
  }

  public static RemoteViews a(Context paramContext, Boolean paramBoolean)
  {
    int i = 2130837504;
    boolean bool = true;
    int j = 2131230729;
    int k = 2131099648;
    int m = 0;
    Object localObject = paramContext.getPackageName();
    int n = 2130903042;
    RemoteViews localRemoteViews = new RemoteViews((String)localObject, n);
    localObject = com.rafoid.core.a.a();
    if (localObject == 0)
    {
      String str2 = paramContext.getResources().getString(2131099675);
      String str3 = paramContext.getResources().getString(k);
      Boolean localBoolean1 = Boolean.valueOf(bool);
      com.rafoid.core.a.a(paramContext, i, str2, str3, localBoolean1, MultiMountSDCardConfigure.class);
      b = Boolean.valueOf(m);
      if (!b.booleanValue())
        break label540;
      localRemoteViews.setImageViewResource(j, 2130837507);
    }
    while (true)
    {
      if (!b.booleanValue())
      {
        StringBuilder localStringBuilder = new StringBuilder("file://");
        String str4 = Environment.getExternalStorageDirectory().getAbsolutePath();
        Uri localUri = Uri.parse(str4);
        Intent localIntent1 = new Intent("android.intent.action.MEDIA_MOUNTED", localUri);
        paramContext.sendBroadcast(localIntent1);
      }
      Intent localIntent2 = new Intent(paramContext, MultiMountSDCardWidget.UpdateService.class);
      PendingIntent localPendingIntent = PendingIntent.getService(paramContext, m, localIntent2, m);
      localRemoteViews.setOnClickPendingIntent(j, localPendingIntent);
      return localRemoteViews;
      localObject = c;
      if (localObject == null)
      {
        localObject = new a(paramContext);
        c = (a)localObject;
      }
      localObject = Boolean.valueOf(c.e());
      a(paramContext);
      String str1 = PreferenceManager.getDefaultSharedPreferences(paramContext).getString("whatsdcard", "internal_external");
      if (localObject != paramBoolean)
      {
        localObject = c.a();
        if ((b.booleanValue()) || ((localObject != 0) && (!b.booleanValue())))
        {
          if (!c.b())
            break label393;
          c.a(str1);
        }
        while (true)
        {
          if ((b.booleanValue()) || (localObject != 0))
            break label404;
          String str5 = paramContext.getResources().getString(2131099670);
          String str6 = paramContext.getResources().getString(k);
          Boolean localBoolean2 = Boolean.valueOf(bool);
          com.rafoid.core.a.a(paramContext, i, str5, str6, localBoolean2, MultiMountSDCardConfigure.class);
          b = Boolean.valueOf(c.e());
          break;
          label393: c.a("internal_external");
        }
        label404: if (b.booleanValue())
          c.d();
        while (true)
        {
          Boolean localBoolean3 = Boolean.valueOf(c.e());
          b = localBoolean3;
          if (!localBoolean3.booleanValue())
            break label492;
          String str7 = d;
          String str8 = paramContext.getResources().getString(k);
          Boolean localBoolean4 = Boolean.valueOf(m);
          com.rafoid.core.a.a(paramContext, 2130837507, str7, str8, localBoolean4, MultiMountSDCardConfigure.class);
          break;
          c.c();
        }
        label492: String str9 = e;
        String str10 = paramContext.getResources().getString(k);
        Boolean localBoolean5 = Boolean.valueOf(m);
        com.rafoid.core.a.a(paramContext, 2130837506, str9, str10, localBoolean5, MultiMountSDCardConfigure.class);
        break;
      }
      b = (Boolean)localObject;
      break;
      label540: localRemoteViews.setImageViewResource(j, 2130837506);
    }
  }

  private static void a(Context paramContext)
  {
    int i = 1;
    int j = 0;
    Object localObject = "";
    if ((d.length() == 0) && (c.b()))
    {
      localObject = PreferenceManager.getDefaultSharedPreferences(paramContext).getString("whatsdcard", "internal_external");
      if (!((String)localObject).equals("internal"))
        break label123;
      localObject = paramContext.getResources().getString(2131099663);
    }
    while (true)
    {
      String str1 = paramContext.getResources().getString(2131099666);
      Object[] arrayOfObject1 = new Object[i];
      arrayOfObject1[j] = localObject;
      d = String.format(str1, arrayOfObject1);
      String str2 = paramContext.getResources().getString(2131099667);
      Object[] arrayOfObject2 = new Object[i];
      arrayOfObject2[j] = localObject;
      e = String.format(str2, arrayOfObject2);
      return;
      label123: localObject = ((String)localObject).equals("external");
      if (localObject != 0)
      {
        localObject = paramContext.getResources().getString(2131099664);
        continue;
      }
      localObject = paramContext.getResources().getString(2131099665);
    }
  }

  public void onDeleted(Context paramContext, int[] paramArrayOfInt)
  {
  }

  public void onEnabled(Context paramContext)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = 2131230729;
    int j = 0;
    Object localObject1 = PreferenceManager.getDefaultSharedPreferences(paramContext);
    Object localObject2 = paramIntent.getAction();
    Object localObject3 = Boolean.valueOf(((String)localObject2).equals("android.appwidget.action.APPWIDGET_ENABLED"));
    Boolean localBoolean1 = Boolean.valueOf(((String)localObject2).equals("android.appwidget.action.APPWIDGET_UPDATE"));
    Boolean localBoolean2 = Boolean.valueOf(((String)localObject2).equals("android.intent.action.UMS_CONNECTED"));
    localObject2 = Boolean.valueOf(((String)localObject2).equals("android.intent.action.UMS_DISCONNECTED"));
    localObject3 = ((Boolean)localObject3).booleanValue();
    if (localObject3 == 0)
    {
      localObject3 = localBoolean1.booleanValue();
      if (localObject3 == 0)
      {
        localObject3 = localBoolean2.booleanValue();
        if (localObject3 == 0)
        {
          localObject3 = ((Boolean)localObject2).booleanValue();
          if (localObject3 == 0)
            break label311;
        }
      }
    }
    int k = 0;
    if ((localBoolean2.booleanValue()) || (((Boolean)localObject2).booleanValue()))
    {
      if (c == null)
        c = new a(paramContext);
      a locala = c;
      boolean bool = localBoolean2.booleanValue();
      locala.a(bool);
      localObject1 = ((SharedPreferences)localObject1).getBoolean("usbconnect", j);
      if (localObject1 != 0)
        localObject1 = Boolean.valueOf(c.a());
    }
    for (localObject1 = a(paramContext, (Boolean)localObject1); ; localObject1 = k)
    {
      if (localObject1 == 0)
      {
        String str = paramContext.getPackageName();
        localObject1 = new RemoteViews(str, 2130903042);
      }
      if (b.booleanValue())
        ((RemoteViews)localObject1).setImageViewResource(i, 2130837507);
      while (true)
      {
        Class localClass = a;
        ComponentName localComponentName = new ComponentName(paramContext, localClass);
        AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(paramContext);
        Intent localIntent = new Intent(paramContext, MultiMountSDCardWidget.UpdateService.class);
        PendingIntent localPendingIntent = PendingIntent.getService(paramContext, j, localIntent, j);
        ((RemoteViews)localObject1).setOnClickPendingIntent(i, localPendingIntent);
        localAppWidgetManager.updateAppWidget(localComponentName, (RemoteViews)localObject1);
        label311: return;
        ((RemoteViews)localObject1).setImageViewResource(i, 2130837506);
      }
    }
  }

  public void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
  {
    if (c == null)
      c = new a(paramContext);
    a(paramContext);
    if (PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("RootAccess", null))
      b = Boolean.valueOf(c.e());
    Intent localIntent = new Intent(paramContext, MultiMountSDCardWidget.UpdateService.class);
    PendingIntent localPendingIntent = PendingIntent.getService(paramContext, 0, localIntent, 0);
    String str1 = paramContext.getPackageName();
    RemoteViews localRemoteViews = new RemoteViews(str1, 2130903042);
    localRemoteViews.setOnClickPendingIntent(2131230729, localPendingIntent);
    int i = paramArrayOfInt.length;
    Object localObject = null;
    if (localObject >= i)
      return;
    int k = paramArrayOfInt[localObject];
    if (!com.rafoid.core.a.a())
    {
      localRemoteViews.setImageViewResource(2131230729, 2130837506);
      String str2 = paramContext.getResources().getString(2131099675);
      String str3 = paramContext.getResources().getString(2131099648);
      Boolean localBoolean1 = Boolean.valueOf(true);
      com.rafoid.core.a.a(paramContext, 2130837504, str2, str3, localBoolean1, MultiMountSDCardConfigure.class);
    }
    while (true)
    {
      paramAppWidgetManager.updateAppWidget(k, localRemoteViews);
      int j = localObject + 1;
      break;
      if (b.booleanValue())
      {
        localRemoteViews.setImageViewResource(2131230729, 2130837507);
        String str4 = d;
        String str5 = paramContext.getResources().getString(2131099648);
        Boolean localBoolean2 = Boolean.valueOf(null);
        com.rafoid.core.a.a(paramContext, 2130837507, str4, str5, localBoolean2, MultiMountSDCardConfigure.class);
        continue;
      }
      localRemoteViews.setImageViewResource(2131230729, 2130837506);
      String str6 = e;
      String str7 = paramContext.getResources().getString(2131099648);
      Boolean localBoolean3 = Boolean.valueOf(null);
      com.rafoid.core.a.a(paramContext, 2130837506, str6, str7, localBoolean3, MultiMountSDCardConfigure.class);
    }
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.MultiMountSDCardWidget
 * JD-Core Version:    0.6.0
 */