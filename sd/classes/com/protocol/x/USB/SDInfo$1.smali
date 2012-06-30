.class Lcom/protocol/x/USB/SDInfo$1;
.super Ljava/lang/Object;
.source "SDInfo.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/protocol/x/USB/SDInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/protocol/x/USB/SDInfo;


# direct methods
.method constructor <init>(Lcom/protocol/x/USB/SDInfo;)V
    .registers 2
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 10

    .prologue
    const/4 v7, 0x0

    .line 41
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    const-string v5, "sd_location"

    const-string v6, ""

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_8d

    .line 42
    new-instance v5, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "/sys/devices/platform/usb_mass_storage/lun0/file;"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 43
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/sys/devices/platform/usb_mass_storage/lun1/file;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 44
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/sys/devices/platform/s3c6410-usbgadget/gadget/lun0/file;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 45
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/sys/devices/platform/s3c-usbgadget/gadget/lun0/file;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 46
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/sys/devices/platform/usb_mass_storage/lun1/file;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 47
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/sys/devices/platform/msm_hsusb/gadget/lun0/file;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 66
    .local v3, xCmdON:Ljava/lang/String;
    :cond_76
    :goto_76
    new-instance v1, Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {v1}, Lcom/protocol/x/USB/SUEXEC;-><init>()V

    .line 67
    .local v1, exeScript2:Lcom/protocol/x/USB/SUEXEC;
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget v4, v4, Lcom/protocol/x/USB/SDInfo;->newLVL:I

    if-nez v4, :cond_172

    .line 68
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->xCmdOFF:Ljava/lang/String;

    iput-object v4, v1, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 72
    :goto_87
    iget-object v4, v1, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v4}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->start()V

    .line 73
    return-void

    .line 49
    .end local v1           #exeScript2:Lcom/protocol/x/USB/SUEXEC;
    .end local v3           #xCmdON:Ljava/lang/String;
    :cond_8d
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    const-string v5, "sd_location"

    const-string v6, ""

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 50
    .local v0, _mounts:[Ljava/lang/String;
    array-length v4, v0

    const/4 v5, 0x2

    if-lt v4, v5, :cond_10e

    .line 51
    const-string v3, ""

    .line 52
    .restart local v3       #xCmdON:Ljava/lang/String;
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    const-string v5, ""

    iput-object v5, v4, Lcom/protocol/x/USB/SDInfo;->xCmdOFF:Ljava/lang/String;

    .line 53
    const/4 v2, 0x0

    .local v2, i:I
    :goto_ac
    array-length v4, v0

    if-ge v2, v4, :cond_76

    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    aget-object v5, v0, v2

    const-string v6, "\n"

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/file;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 55
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v4, Lcom/protocol/x/USB/SDInfo;->xCmdOFF:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "echo \"\" > "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    aget-object v6, v0, v2

    const-string v7, "\n"

    const-string v8, ""

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/file;"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/protocol/x/USB/SDInfo;->xCmdOFF:Ljava/lang/String;

    .line 53
    add-int/lit8 v2, v2, 0x1

    goto :goto_ac

    .line 59
    .end local v2           #i:I
    .end local v3           #xCmdON:Ljava/lang/String;
    :cond_10e
    new-instance v5, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    const-string v6, "sd_location"

    const-string v7, ""

    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "\n"

    const-string v7, ""

    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/file"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 60
    .restart local v3       #xCmdON:Ljava/lang/String;
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "echo \"\" > "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lcom/protocol/x/USB/SDInfo$1;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v6, v6, Lcom/protocol/x/USB/SDInfo;->settings:Landroid/content/SharedPreferences;

    const-string v7, "sd_location"

    const-string v8, ""

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "\n"

    const-string v8, ""

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/file"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/protocol/x/USB/SDInfo;->xCmdOFF:Ljava/lang/String;

    goto/16 :goto_76

    .line 70
    .end local v0           #_mounts:[Ljava/lang/String;
    .restart local v1       #exeScript2:Lcom/protocol/x/USB/SUEXEC;
    :cond_172
    iput-object v3, v1, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    goto/16 :goto_87
.end method
