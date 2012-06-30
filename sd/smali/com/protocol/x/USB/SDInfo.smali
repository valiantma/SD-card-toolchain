.class public Lcom/protocol/x/USB/SDInfo;
.super Landroid/content/BroadcastReceiver;
.source "SDInfo.java"


# instance fields
.field UpdateSDOne:Landroid/os/Handler;

.field final UpdateSDOneResults:Ljava/lang/Runnable;

.field _Vold:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field editor:Landroid/content/SharedPreferences$Editor;

.field mContext:Landroid/content/Context;

.field newLVL:I

.field settings:Landroid/content/SharedPreferences;

.field settings2:Landroid/content/SharedPreferences;

.field xCmdOFF:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 23
    const-string v0, "echo \"\" > /sys/devices/platform/usb_mass_storage/lun0/file;echo \"\" > /sys/devices/platform/usb_mass_storage/lun1/file;echo \"\" > /sys/devices/platform/s3c6410-usbgadget/gadget/lun0/file;echo \"\" > /sys/devices/platform/s3c-usbgadget/gadget/lun0/file;echo \"\" > /sys/devices/platform/s3c-usbgadget/gadget/lun1/file;echo \"\" > /sys/devices/platform/usb_mass_storage/lun0/file;echo \"\" > /sys/devices/platform/usb_mass_storage/lun1/file;echo \"\" > /sys/devices/platform/msm_hsusb/gadget/lun0/file"

    iput-object v0, p0, Lcom/protocol/x/USB/SDInfo;->xCmdOFF:Ljava/lang/String;

    .line 36
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/protocol/x/USB/SDInfo;->UpdateSDOne:Landroid/os/Handler;

    .line 38
    new-instance v0, Lcom/protocol/x/USB/SDInfo$1;

    invoke-direct {v0, p0}, Lcom/protocol/x/USB/SDInfo$1;-><init>(Lcom/protocol/x/USB/SDInfo;)V

    iput-object v0, p0, Lcom/protocol/x/USB/SDInfo;->UpdateSDOneResults:Ljava/lang/Runnable;

    .line 15
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8
    .parameter "context"
    .parameter "intent"

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 79
    iput-object p1, p0, Lcom/protocol/x/USB/SDInfo;->mContext:Landroid/content/Context;

    .line 81
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 84
    .local v0, action:Ljava/lang/String;
    const-string v3, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 85
    sget-object v3, Lcom/protocol/x/USB/DualSDWidget;->PREFS_NAME:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    .line 86
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    .line 88
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    const-string v4, "MountOnPowerConnection"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 89
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    .line 90
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    sget-object v4, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-nez v3, :cond_2

    move v3, v7

    :goto_0
    iput v3, p0, Lcom/protocol/x/USB/SDInfo;->newLVL:I

    .line 91
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    sget-object v4, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    iget v5, p0, Lcom/protocol/x/USB/SDInfo;->newLVL:I

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 92
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 94
    new-instance v2, Lcom/protocol/x/USB/SDInfo$2;

    invoke-direct {v2, p0}, Lcom/protocol/x/USB/SDInfo$2;-><init>(Lcom/protocol/x/USB/SDInfo;)V

    .line 132
    .local v2, t:Ljava/lang/Thread;
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 133
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    const-string v4, "Toasty"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 134
    const-string v3, "\u53cc\u91cd\u6302\u8f7dSD\u5361\u5df2\u542f\u7528\uff01"

    const/4 v4, 0x0

    invoke-static {p1, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 136
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/protocol/x/USB/DualSDWidget$UpdateService;

    invoke-direct {v1, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 137
    .local v1, forceUpIntent:Landroid/content/Intent;
    invoke-virtual {p1, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 251
    .end local v0           #action:Ljava/lang/String;
    .end local v1           #forceUpIntent:Landroid/content/Intent;
    .end local v2           #t:Ljava/lang/Thread;
    :cond_1
    :goto_1
    return-void

    .restart local v0       #action:Ljava/lang/String;
    :cond_2
    move v3, v6

    .line 90
    goto :goto_0

    .line 142
    :cond_3
    const-string v3, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "android.intent.action.UMS_DISCONNECTED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 143
    :cond_4
    sget-object v3, Lcom/protocol/x/USB/DualSDWidget;->PREFS_NAME:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    .line 144
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    .line 145
    const-string v3, "android.intent.action.UMS_DISCONNECTED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 146
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    const-string v4, "MountOnConnection"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 150
    :cond_5
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    .line 151
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    sget-object v4, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 152
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 154
    new-instance v2, Lcom/protocol/x/USB/SDInfo$3;

    invoke-direct {v2, p0}, Lcom/protocol/x/USB/SDInfo$3;-><init>(Lcom/protocol/x/USB/SDInfo;)V

    .line 179
    .restart local v2       #t:Ljava/lang/Thread;
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 181
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/protocol/x/USB/DualSDWidget$UpdateService;

    invoke-direct {v1, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 182
    .restart local v1       #forceUpIntent:Landroid/content/Intent;
    invoke-virtual {p1, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_1

    .line 250
    .end local v0           #action:Ljava/lang/String;
    .end local v1           #forceUpIntent:Landroid/content/Intent;
    .end local v2           #t:Ljava/lang/Thread;
    :catch_0
    move-exception v3

    goto :goto_1

    .line 183
    .restart local v0       #action:Ljava/lang/String;
    :cond_6
    sget-object v3, Lcom/protocol/x/USB/DualSDWidget;->USB_STATE:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string v3, "android.intent.action.UMS_CONNECTED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 185
    :cond_7
    sget-object v3, Lcom/protocol/x/USB/DualSDWidget;->PREFS_NAME:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    .line 186
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    .line 187
    const-string v3, "android.intent.action.UMS_CONNECTED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 188
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    const-string v4, "MountOnConnection"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 192
    :cond_8
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    iput-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    .line 193
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    sget-object v4, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-nez v3, :cond_a

    move v3, v7

    :goto_2
    iput v3, p0, Lcom/protocol/x/USB/SDInfo;->newLVL:I

    .line 194
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    sget-object v4, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    iget v5, p0, Lcom/protocol/x/USB/SDInfo;->newLVL:I

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 195
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 197
    new-instance v2, Lcom/protocol/x/USB/SDInfo$4;

    invoke-direct {v2, p0}, Lcom/protocol/x/USB/SDInfo$4;-><init>(Lcom/protocol/x/USB/SDInfo;)V

    .line 235
    .restart local v2       #t:Ljava/lang/Thread;
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 237
    iget v3, p0, Lcom/protocol/x/USB/SDInfo;->newLVL:I

    if-nez v3, :cond_b

    .line 238
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    const-string v4, "Toasty"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 239
    const-string v3, "\u53cc\u91cd\u6302\u8f7dSD\u5361\u5df2\u505c\u7528\uff01"

    const/4 v4, 0x0

    invoke-static {p1, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 247
    :cond_9
    :goto_3
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/protocol/x/USB/DualSDWidget$UpdateService;

    invoke-direct {v1, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 248
    .restart local v1       #forceUpIntent:Landroid/content/Intent;
    invoke-virtual {p1, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto/16 :goto_1

    .end local v1           #forceUpIntent:Landroid/content/Intent;
    .end local v2           #t:Ljava/lang/Thread;
    :cond_a
    move v3, v6

    .line 193
    goto :goto_2

    .line 242
    .restart local v2       #t:Ljava/lang/Thread;
    :cond_b
    iget-object v3, p0, Lcom/protocol/x/USB/SDInfo;->settings2:Landroid/content/SharedPreferences;

    const-string v4, "Toasty"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 243
    const-string v3, "\u53cc\u91cd\u6302\u8f7dSD\u5361\u5df2\u542f\u7528\uff01"

    const/4 v4, 0x0

    invoke-static {p1, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3
.end method
