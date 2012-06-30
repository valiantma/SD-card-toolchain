.class public Lcom/protocol/x/USB/DualSDWidget;
.super Landroid/appwidget/AppWidgetProvider;
.source "DualSDWidget.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/protocol/x/USB/DualSDWidget$UpdateService;
    }
.end annotation


# static fields
.field public static KEY_LEVEL:Ljava/lang/String;

.field public static PREFS_NAME:Ljava/lang/String;

.field public static USB_STATE:Ljava/lang/String;

.field static newScanner:Landroid/media/MediaScannerConnection;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 24
    const-string v0, "USBWIDG_PREFS"

    sput-object v0, Lcom/protocol/x/USB/DualSDWidget;->PREFS_NAME:Ljava/lang/String;

    .line 25
    const-string v0, "USBWIDG_STATUS"

    sput-object v0, Lcom/protocol/x/USB/DualSDWidget;->KEY_LEVEL:Ljava/lang/String;

    .line 26
    const-string v0, "UPDATE_USB_STATUS"

    sput-object v0, Lcom/protocol/x/USB/DualSDWidget;->USB_STATE:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeleted(Landroid/content/Context;[I)V
    .registers 5
    .parameter "context"
    .parameter "appWidgetIds"

    .prologue
    .line 44
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onDeleted(Landroid/content/Context;[I)V

    .line 46
    :try_start_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/protocol/x/USB/DualSDWidget$UpdateService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_d} :catch_e

    .line 48
    :goto_d
    return-void

    .line 47
    :catch_e
    move-exception v0

    goto :goto_d
.end method

.method public onDisabled(Landroid/content/Context;)V
    .registers 4
    .parameter "context"

    .prologue
    .line 36
    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onDisabled(Landroid/content/Context;)V

    .line 38
    :try_start_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/protocol/x/USB/DualSDWidget$UpdateService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_d} :catch_e

    .line 40
    :goto_d
    return-void

    .line 39
    :catch_e
    move-exception v0

    goto :goto_d
.end method

.method public onEnabled(Landroid/content/Context;)V
    .registers 2
    .parameter "context"

    .prologue
    .line 31
    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onEnabled(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .registers 6
    .parameter "context"
    .parameter "appWidgetManager"
    .parameter "appWidgetIds"

    .prologue
    .line 54
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/protocol/x/USB/DualSDWidget$UpdateService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 55
    return-void
.end method
