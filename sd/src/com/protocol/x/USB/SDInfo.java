package com.protocol.x.USB;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.widget.Toast;
import java.util.List;

public class SDInfo extends BroadcastReceiver
{
  Handler UpdateSDOne = new Handler();				
  List<String> _Vold;
  SharedPreferences.Editor editor;				//shared editor
  Context mContext;
  int newLVL;
  SharedPreferences settings;
  SharedPreferences settings2;					//cmd sh to make the path
  String xCmdOFF = "echo \"\" > /sys/devices/platform/usb_mass_storage/lun0/file;echo \"\" > " +
  		"/sys/devices/platform/usb_mass_storage/lun1/file;echo \"\" > /sys/devices/platform/s3c6410-usbgadget/gadget/lun0/file;echo \"\" > " +
  		"/sys/devices/platform/s3c-usbgadget/gadget/lun0/file;echo \"\" > /sys/devices/platform/s3c-usbgadget/gadget/lun1/file;echo \"\" > " +
  		"/sys/devices/platform/usb_mass_storage/lun0/file;echo \"\" > /sys/devices/platform/usb_mass_storage/lun1/file;echo \"\" > " +
  		"/sys/devices/platform/msm_hsusb/gadget/lun0/file";
  final Runnable UpdateSDOneResults = new Runnable()
  {
    @SuppressWarnings("unused")
	public void run()
    {
      String str;
      SUEXEC localSUEXEC = null;				//modify the cmd
      if (SDInfo.this.settings.getString("sd_location", "").length() == 0)
      {
        str = (String)SDInfo.this._Vold.get(0) + "/sys/devices/platform/usb_mass_storage/lun0/file;" + SDInfo.this._Vold + "/sys/devices/platform/usb_mass_storage/lun1/file;" + SDInfo.this._Vold + "/sys/devices/platform/s3c6410-usbgadget/gadget/lun0/file;" + SDInfo.this._Vold + "/sys/devices/platform/s3c-usbgadget/gadget/lun0/file;" + SDInfo.this._Vold + "/sys/devices/platform/usb_mass_storage/lun1/file;" + SDInfo.this._Vold + "/sys/devices/platform/msm_hsusb/gadget/lun0/file;";
        localSUEXEC = new SUEXEC();	
      }// get the location where the SD card is mounted
     
    
      for (localSUEXEC.xCmd = SDInfo.this.xCmdOFF; ; localSUEXEC.xCmd = str)			//in case the phone has more than one card
      {
        localSUEXEC.executeThread.start();
        String[] arrayOfString = SDInfo.this.settings.getString("sd_location", "").split("\n");// split the path string by "/n"
        if (arrayOfString.length >= 2)
        {
          str = "";
          SDInfo.this.xCmdOFF = "";
          for (int i = 0; i < arrayOfString.length; i++)					
          {
            str = str + (String)SDInfo.this._Vold.get(i) + arrayOfString[i].replace("\n", "") + "/file;";
            SDInfo localSDInfo = SDInfo.this;
            localSDInfo.xCmdOFF = (localSDInfo.xCmdOFF + "echo \"\" > " + arrayOfString[i].replace("\n", "") + "/file;");
          }
          break;
        }
        str = (String)SDInfo.this._Vold.get(0) + SDInfo.this.settings.getString("sd_location", "").replace("\n", "") + "/file";
        SDInfo.this.xCmdOFF = ("echo \"\" > " + SDInfo.this.settings.getString("sd_location", "").replace("\n", "") + "/file");
        break;
      }//move or gedit files according to the cmd via the thread created by the SUEXEC class
    
    }
    
  };

  public void onReceive(Context paramContext, Intent paramIntent)//to start the service when the syd is started
  {
    this.mContext = paramContext;
    
    try
    {
      String str = paramIntent.getAction();
      
      if (str.equals("android.intent.action.BOOT_COMPLETED"))  //set the key level to 1 incase the boot auto is enabled (not care in fact)
      {
        this.settings = paramContext.getSharedPreferences(DualSDWidget.PREFS_NAME, 0);
        this.settings2 = PreferenceManager.getDefaultSharedPreferences(paramContext);
        if (this.settings2.getBoolean("MountOnPowerConnection", false))
        {
          this.editor = this.settings.edit();
          if (this.settings.getInt(DualSDWidget.KEY_LEVEL, 0) != 0);
          	return;
        }
      }
       //label527:
    	   for (int j = 1; ; j = 0)
      {
        this.newLVL = j;
        this.editor.putInt(DualSDWidget.KEY_LEVEL, this.newLVL);
        this.editor.commit();
        new Thread()
        {
          
          public void run()
          {

          }
        }
        .start();
        if (this.settings2.getBoolean("Toasty", true))  // the true active
          Toast.makeText(paramContext, "À´÷ÿπ“‘ÿSDø®“—∆Ù”√" ,0).show(); 
        paramContext.startService(new Intent(paramContext, DualSDWidget.UpdateService.class));
        if ((str.equals("android.intent.action.BOOT_COMPLETED")) || (str.equals("android.intent.action.UMS_DISCONNECTED")))
        {
          this.settings = paramContext.getSharedPreferences(DualSDWidget.PREFS_NAME, 1); // from enable? -> diable !
          this.settings2 = PreferenceManager.getDefaultSharedPreferences(paramContext);
          if ((!str.equals("android.intent.action.UMS_DISCONNECTED")) || (this.settings2.getBoolean("MountOnConnection", false)))
          {
            this.editor = this.settings.edit();
            this.editor.putInt(DualSDWidget.KEY_LEVEL, 0);
            this.editor.commit();
            new Thread()
            {
              
              public void run()
              {

              }
            }
            .start();
            paramContext.startService(new Intent(paramContext, DualSDWidget.UpdateService.class));
          }
        }
        else if ((str.equals(DualSDWidget.USB_STATE)) || (str.equals("android.intent.action.UMS_CONNECTED")))  // from diable! -> enable?
        {
          this.settings = paramContext.getSharedPreferences(DualSDWidget.PREFS_NAME, 1);
          this.settings2 = PreferenceManager.getDefaultSharedPreferences(paramContext);
          if ((!str.equals("android.intent.action.UMS_CONNECTED")) || (this.settings2.getBoolean("MountOnConnection", false)))
          {
            this.editor = this.settings.edit();
            if (this.settings.getInt(DualSDWidget.KEY_LEVEL, 0) != 0)
              break;

            this.newLVL = 1;
            this.editor.putInt(DualSDWidget.KEY_LEVEL, this.newLVL);
            this.editor.commit();
            new Thread()
            {
             
              public void run()
              {

              }
            }
            .start();
            if (this.newLVL == 0)
              if (this.settings2.getBoolean("Toasty", true))
                Toast.makeText(paramContext, "À´÷ÿπ“‘ÿSDø®“—Õ£”√",0).show();
            while (true)
            {
              paramContext.startService(new Intent(paramContext, DualSDWidget.UpdateService.class));
              break;
            }
          }
        }
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        continue;
      }
    }
  }
}

