package com.rafoid.multimountsdcard.widget;

import I;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.provider.Settings.Secure;
import android.widget.RemoteViews;
import com.android.vending.licensing.l;
import com.android.vending.licensing.o;
import com.android.vending.licensing.p;
import com.android.vending.licensing.s;

public class MultiMountSDCardConfigure extends PreferenceActivity
{
  private static final byte[] d = { 214, 62, 32, 131, 143, 219, 74, 192, 51, 88, 95, 211, 77, 139, 220, 113, 245, 32, 192, 122 };
  private int a = null;
  private ProgressDialog b;
  private Intent c;
  private p e;
  private s f;
  private Handler g;
  private String h = "";
  private ProgressDialog i = null;
  private Runnable j;
  private Runnable k;

  public MultiMountSDCardConfigure()
  {
    j localj = new j(this);
    this.j = localj;
    f localf = new f(this);
    this.k = localf;
  }

  public final void a()
  {
    int m = 0;
    int n = 1;
    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putBoolean("RootAccess", n).commit();
    Object localObject = new Handler();
    this.g = ((Handler)localObject);
    localObject = getString(2131099669);
    String str1 = getString(2131099651);
    localObject = ProgressDialog.show(this, (CharSequence)localObject, str1, n, m);
    this.b = ((ProgressDialog)localObject);
    localObject = MultiMountSDCardWidget.c;
    if (localObject == null)
    {
      Context localContext = getBaseContext();
      localObject = new a(localContext);
      MultiMountSDCardWidget.c = (a)localObject;
    }
    localObject = (PreferenceCategory)findPreference("categorysdcard");
    boolean bool = MultiMountSDCardWidget.c.b();
    ((PreferenceCategory)localObject).setEnabled(bool);
    ((NotificationManager)getSystemService("notification")).cancel(n);
    localObject = Settings.Secure.getString(getContentResolver(), "android_id");
    b localb = new b(this);
    this.e = localb;
    byte[] arrayOfByte = d;
    String str2 = getPackageName();
    o localo = new o(arrayOfByte, str2, (String)localObject);
    l locall = new l(this, localo);
    s locals = new s(this, n, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAg1POxzZFMTfUS1nH1D1xpduzw2aTaWy2gxMYnNjRPVJeKg4ydwFdJTSV7FLMeJfaBy854omAqDfv0FpbSoRM4CQ/B6U68P2RrUYgqDL8U3GWoFo+YAxByl517a9NvD78yf/sB75lzu8w6kMaSeVw2ncKrS6jX1zonczMBw4RZylrt36A507qwEQ+nWqFJHkfbfcX3HW59OZkXv9dZ73x9OGFa1nCnnL8wUDQO09kqVtZDkaE2sdtxyTOGG8UsNvyrm3lD3bTiqzKyndQ6R5Z37evYURSRsW94YNhEOwOlgn3EgXvxL15fDKiAgedHC+0foOcMJD0eS8z0uU7wGnK1QIDAQAB");
    this.f = locals;
    localObject = this.f;
    p localp = this.e;
    ((s)localObject).a(localp);
    localObject = getIntent().getExtras();
    if (localObject != null)
    {
      int i1 = ((Bundle)localObject).getInt("appWidgetId", m);
      this.a = ((I)localObject);
    }
    Intent localIntent1 = new Intent();
    this.c = localIntent1;
    Intent localIntent2 = this.c;
    int i2 = this.a;
    localIntent2.putExtra("appWidgetId", i2);
    new h(this).run();
    Intent localIntent3 = this.c;
    setResult(-1, localIntent3);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2130968576);
    new g(this).run();
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    int m = 2131099655;
    int n = 2131099656;
    int i1;
    if (paramInt == 1)
    {
      i1 = 2131099659;
      n = 2131099648;
    }
    int i2;
    for (m = i1; ; m = i2)
    {
      AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this).setTitle(n).setMessage(m);
      c localc = new c(this);
      AlertDialog.Builder localBuilder2 = m.setPositiveButton(2131099657, localc);
      d locald = new d(this);
      return m.setNegativeButton(2131099658, locald).create();
      i2 = n;
      n = m;
    }
  }

  public void onDestroy()
  {
    Context localContext = getApplicationContext();
    Class localClass = MultiMountSDCardWidget.a;
    ComponentName localComponentName = new ComponentName(localContext, localClass);
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(localContext);
    Intent localIntent = new Intent(localContext, MultiMountSDCardWidget.UpdateService.class);
    PendingIntent localPendingIntent = PendingIntent.getService(localContext, 0, localIntent, 0);
    String str = localContext.getPackageName();
    RemoteViews localRemoteViews = new RemoteViews(str, 2130903042);
    localRemoteViews.setOnClickPendingIntent(2131230729, localPendingIntent);
    localAppWidgetManager.updateAppWidget(localComponentName, localRemoteViews);
    if (this.f != null)
      this.f.a();
    super.onDestroy();
  }

  public void setContentView(int paramInt)
  {
    super.setContentView(2130903040);
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.MultiMountSDCardConfigure
 * JD-Core Version:    0.6.0
 */