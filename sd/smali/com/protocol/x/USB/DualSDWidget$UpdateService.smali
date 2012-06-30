.class public Lcom/protocol/x/USB/DualSDWidget$UpdateService;
.super Landroid/app/Service;
.source "DualSDWidget.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/protocol/x/USB/DualSDWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdateService"
.end annotation


# instance fields
.field mBI:Lcom/protocol/x/USB/SDInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->mBI:Lcom/protocol/x/USB/SDInfo;

    .line 57
    return-void
.end method


# virtual methods
.method public buildUpdate(Landroid/content/Context;)Landroid/widget/RemoteViews;
    .locals 8
    .parameter "context"

    .prologue
    .line 104
    new-instance v5, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f030001

    invoke-direct {v5, v6, v7}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 105
    .local v5, updateViews:Landroid/widget/RemoteViews;
    const/4 v1, 0x0

    .line 107
    .local v1, level:I
    :try_start_0
    sget-object v6, Lcom/protocol/x/USB/DualSDWidget;->PREFS_NAME:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual {p0, v6, v7}, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 108
    .local v3, settings:Landroid/content/SharedPreferences;
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 109
    .local v4, settings2:Landroid/content/SharedPreferences;
    const-string v6, "SDMediaScanner"

    const/4 v7, 0x0

    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v6, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-nez v6, :cond_0

    .line 111
    :try_start_1
    new-instance v6, Landroid/media/MediaScannerConnection;

    .line 112
    new-instance v7, Lcom/protocol/x/USB/DualSDWidget$UpdateService$1;

    invoke-direct {v7, p0}, Lcom/protocol/x/USB/DualSDWidget$UpdateService$1;-><init>(Lcom/protocol/x/USB/DualSDWidget$UpdateService;)V

    .line 111
    invoke-direct {v6, p1, v7}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    sput-object v6, Lcom/protocol/x/USB/DualSDWidget;->newScanner:Landroid/media/MediaScannerConnection;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 125
    :try_start_2
    sget-object v6, Lcom/protocol/x/USB/DualSDWidget;->newScanner:Landroid/media/MediaScannerConnection;

    invoke-virtual {v6}, Landroid/media/MediaScannerConnection;->connect()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 129
    :cond_0
    :goto_0
    if-eqz v3, :cond_1

    .line 130
    :try_start_3
    sget-object v6, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 133
    :cond_1
    if-nez v1, :cond_2

    .line 134
    const v6, 0x7f060008

    const v7, 0x7f020005

    invoke-virtual {v5, v6, v7}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 141
    .end local v3           #settings:Landroid/content/SharedPreferences;
    .end local v4           #settings2:Landroid/content/SharedPreferences;
    :goto_1
    :try_start_4
    new-instance v0, Landroid/content/Intent;

    const-class v6, Lcom/protocol/x/USB/SDInfo;

    invoke-direct {v0, p1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 142
    .local v0, forceUpIntent:Landroid/content/Intent;
    sget-object v6, Lcom/protocol/x/USB/DualSDWidget;->USB_STATE:Ljava/lang/String;

    invoke-virtual {v0, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p1, v6, v0, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 144
    .local v2, pendingIntent2:Landroid/app/PendingIntent;
    const v6, 0x7f060007

    invoke-virtual {v5, v6, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 148
    .end local v0           #forceUpIntent:Landroid/content/Intent;
    .end local v2           #pendingIntent2:Landroid/app/PendingIntent;
    :goto_2
    return-object v5

    .line 136
    .restart local v3       #settings:Landroid/content/SharedPreferences;
    .restart local v4       #settings2:Landroid/content/SharedPreferences;
    :cond_2
    const v6, 0x7f060008

    const v7, 0x7f020006

    :try_start_5
    invoke-virtual {v5, v6, v7}, Landroid/widget/RemoteViews;->setImageViewResource(II)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_1

    .line 138
    .end local v3           #settings:Landroid/content/SharedPreferences;
    .end local v4           #settings2:Landroid/content/SharedPreferences;
    :catch_0
    move-exception v6

    goto :goto_1

    .line 146
    :catch_1
    move-exception v6

    goto :goto_2

    .line 127
    .restart local v3       #settings:Landroid/content/SharedPreferences;
    .restart local v4       #settings2:Landroid/content/SharedPreferences;
    :catch_2
    move-exception v6

    goto :goto_0

    .line 126
    :catch_3
    move-exception v6

    goto :goto_0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .parameter "intent"

    .prologue
    .line 152
    const/4 v0, 0x0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 91
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 93
    :try_start_0
    iget-object v0, p0, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->mBI:Lcom/protocol/x/USB/SDInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->mBI:Lcom/protocol/x/USB/SDInfo;

    invoke-virtual {p0, v0}, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :cond_0
    :goto_0
    return-void

    .line 94
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 5
    .parameter "intent"
    .parameter "startId"

    .prologue
    .line 63
    iget-object v4, p0, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->mBI:Lcom/protocol/x/USB/SDInfo;

    if-nez v4, :cond_0

    .line 64
    new-instance v4, Lcom/protocol/x/USB/SDInfo;

    invoke-direct {v4}, Lcom/protocol/x/USB/SDInfo;-><init>()V

    iput-object v4, p0, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->mBI:Lcom/protocol/x/USB/SDInfo;

    .line 65
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 66
    .local v0, mIntentFilter:Landroid/content/IntentFilter;
    const-string v4, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {v0, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 67
    iget-object v4, p0, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->mBI:Lcom/protocol/x/USB/SDInfo;

    invoke-virtual {p0, v4, v0}, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 71
    .end local v0           #mIntentFilter:Landroid/content/IntentFilter;
    :cond_0
    invoke-virtual {p0, p0}, Lcom/protocol/x/USB/DualSDWidget$UpdateService;->buildUpdate(Landroid/content/Context;)Landroid/widget/RemoteViews;

    move-result-object v3

    .line 72
    .local v3, updateViews:Landroid/widget/RemoteViews;
    if-eqz v3, :cond_1

    .line 75
    :try_start_0
    new-instance v2, Landroid/content/ComponentName;

    const-class v4, Lcom/protocol/x/USB/DualSDWidget;

    invoke-direct {v2, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 77
    .local v2, thisWidget:Landroid/content/ComponentName;
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v1

    .line 78
    .local v1, manager:Landroid/appwidget/AppWidgetManager;
    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    .line 79
    invoke-virtual {v1, v2, v3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .end local v1           #manager:Landroid/appwidget/AppWidgetManager;
    .end local v2           #thisWidget:Landroid/content/ComponentName;
    :cond_1
    :goto_0
    return-void

    .line 85
    :catch_0
    move-exception v4

    goto :goto_0
.end method
