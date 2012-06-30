package com.protocol.x.USB;

import android.app.PendingIntent;
import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import android.os.Environment;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.widget.RemoteViews;
import java.io.File;



public class DualSDWidget extends AppWidgetProvider // receive appwidget broadcast
{
	public static String KEY_LEVEL;
	public static String PREFS_NAME = "USBWIDG_PREFS";
	public static String USB_STATE;
	static MediaScannerConnection newScanner;

	static 
	{
		KEY_LEVEL = "USBWIDG_STATUS";					//wedgit status 
		USB_STATE = "UPDATE_USB_STATUS";
	}

	public void onDeleted(Context paramContext, int[] paramArrayOfInt)
	{
		super.onDeleted(paramContext, paramArrayOfInt);
		try 
		{
			paramContext.stopService(new Intent(paramContext,UpdateService.class));
			
		} 
		catch (Exception localException)
		{
			return;
		}
	}// deal with the situation when the user delete the widget

	public void onDisabled(Context paramContext)
	{
		super.onDisabled(paramContext);
		try 
		{
			paramContext.stopService(new Intent(paramContext,UpdateService.class));			
		}
		catch (Exception localException) 
		{			
			return;
		}
	}// deal with the situation when the user stop the survice

	public void onEnabled(Context paramContext)
	{
		super.onEnabled(paramContext);
	}// deal with the situation when the user start the survice

	public void onUpdate(Context paramContext,AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
	{
		paramContext.startService(new Intent(paramContext, UpdateService.class));
	}//update the info of widget

	public static class UpdateService extends Service 
	{
		SDInfo mBI = null;// store the info of SD card
		SharedPreferences localSharedPreferences;// store the state of widget
		
		public RemoteViews buildUpdate(Context paramContext)
		{
			RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), 2130903041);
			int i = 0;
			try 
			{
				localSharedPreferences = getSharedPreferences(DualSDWidget.PREFS_NAME, 0);//here we get SharedPreferences info. 
				if (PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("SDMediaScanner", false))
				{
					int j = localSharedPreferences.getInt(DualSDWidget.KEY_LEVEL, 0);
					if (j != 0)
						;
				}
				label148: return localRemoteViews;
			} 
			catch (Exception localException3) //
			{
				try
				{								// media scanner
					DualSDWidget.newScanner = new MediaScannerConnection(paramContext,new MediaScannerConnection.MediaScannerConnectionClient() 
					{
						public void onMediaScannerConnected() 
						{
							try 
							{
								DualSDWidget.newScanner.scanFile(Environment.getExternalStorageDirectory().toString(),null);
										label13: return;
							} 
							catch (Exception localException)
							{
								label113: return;
							}
					}

				 public void onScanCompleted(String paramString,Uri paramUri)
				 {
					try 
					{
						DualSDWidget.newScanner.disconnect();
						label6: return;
					} 
					catch (Exception localException)
					{
										
					}
			}
		});
				}
		catch (Exception localException31)
		{
			try
			{
				DualSDWidget.newScanner.connect();
				while (true) 
				{
					label84: if (localSharedPreferences != null)
								i = localSharedPreferences.getInt(DualSDWidget.KEY_LEVEL, 0);
							if (i == 0)
								localRemoteViews.setImageViewResource(2131099656, 2130837509);
							try 
							{
								while (true)
								{
									Intent localIntent = new Intent(paramContext, SDInfo.class);
									localIntent.setAction(DualSDWidget.USB_STATE);
									localRemoteViews.setOnClickPendingIntent(2131099655, PendingIntent.getBroadcast(paramContext,0, localIntent, 0));
									 return localRemoteViews;
								}
							} 
							catch (Exception localException2) 
							{
								
							}
				 }
			  } 
			catch (Exception localException4) 
			{
				label148: return localRemoteViews;
			}
		}
	}// we mean to scan the media ,but this hasnt been acheived
			return localRemoteViews;
   }

		public IBinder onBind(Intent paramIntent)
		{
			return null;
		}

		@SuppressWarnings("unused")// ignore the warning"unused"
		public void onDestroy()
		{
			super.onDestroy();
			try 
			{
				if (this.mBI != null)
					unregisterReceiver(this.mBI);
				
			}
			catch (Exception localException)
			{
				return;
			}
		}// delete the info remained of SD card

		public void onStart(Intent paramIntent, int paramInt) 
		{
			if (this.mBI == null) 
			{
				this.mBI = new SDInfo();
				IntentFilter localIntentFilter = new IntentFilter();
				localIntentFilter.addAction("android.intent.action.BATTERY_CHANGED");
				registerReceiver(this.mBI, localIntentFilter);//register to receive the info from intentfilter
			}
			RemoteViews localRemoteViews = buildUpdate(this);//call the update service
			if (localRemoteViews != null)
				;
			try
			{
				ComponentName localComponentName = new ComponentName(this,DualSDWidget.class);
				AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(this);
				if ((localAppWidgetManager != null)&& (localRemoteViews != null))
					localAppWidgetManager.updateAppWidget(localComponentName,localRemoteViews);// update info of widget after the start of the sys
				 return;
			} 
			catch (Exception localException)
			{				
				return;
			}
		}
	}
}

