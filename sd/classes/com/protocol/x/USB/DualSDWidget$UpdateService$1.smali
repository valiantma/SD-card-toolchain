.class Lcom/protocol/x/USB/DualSDWidget$UpdateService$1;
.super Ljava/lang/Object;
.source "DualSDWidget.java"

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/protocol/x/USB/DualSDWidget$UpdateService;->buildUpdate(Landroid/content/Context;)Landroid/widget/RemoteViews;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/protocol/x/USB/DualSDWidget$UpdateService;


# direct methods
.method constructor <init>(Lcom/protocol/x/USB/DualSDWidget$UpdateService;)V
    .registers 2
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/protocol/x/USB/DualSDWidget$UpdateService$1;->this$1:Lcom/protocol/x/USB/DualSDWidget$UpdateService;

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMediaScannerConnected()V
    .registers 4

    .prologue
    .line 115
    :try_start_0
    sget-object v0, Lcom/protocol/x/USB/DualSDWidget;->newScanner:Landroid/media/MediaScannerConnection;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_e} :catch_f

    .line 117
    :goto_e
    return-void

    .line 116
    :catch_f
    move-exception v0

    goto :goto_e
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .registers 4
    .parameter "path"
    .parameter "uri"

    .prologue
    .line 120
    :try_start_0
    sget-object v0, Lcom/protocol/x/USB/DualSDWidget;->newScanner:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5} :catch_6

    .line 122
    :goto_5
    return-void

    .line 121
    :catch_6
    move-exception v0

    goto :goto_5
.end method
