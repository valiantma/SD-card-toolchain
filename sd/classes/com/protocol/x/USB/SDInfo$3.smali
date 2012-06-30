.class Lcom/protocol/x/USB/SDInfo$3;
.super Ljava/lang/Thread;
.source "SDInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/protocol/x/USB/SDInfo;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
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
    iput-object p1, p0, Lcom/protocol/x/USB/SDInfo$3;->this$0:Lcom/protocol/x/USB/SDInfo;

    .line 154
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 8

    .prologue
    .line 157
    :try_start_0
    new-instance v2, Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {v2}, Lcom/protocol/x/USB/SUEXEC;-><init>()V

    .line 158
    .local v2, exeScript:Lcom/protocol/x/USB/SUEXEC;
    const-string v4, "find /sys/devices/platform/ -name lun*"

    iput-object v4, v2, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 159
    iget-object v4, v2, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v4}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->start()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_e} :catch_3c

    .line 161
    :try_start_e
    iget-object v4, v2, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v4}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->join()V
    :try_end_13
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_13} :catch_36
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_13} :catch_3c

    .line 165
    :goto_13
    :try_start_13
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$3;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v5, "sd_location"

    iget-object v6, v2, Lcom/protocol/x/USB/SUEXEC;->scriptOutput:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 166
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$3;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_25} :catch_3c

    .line 171
    .end local v2           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :goto_25
    :try_start_25
    new-instance v3, Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {v3}, Lcom/protocol/x/USB/SUEXEC;-><init>()V

    .line 172
    .local v3, exeScript2:Lcom/protocol/x/USB/SUEXEC;
    iget-object v4, p0, Lcom/protocol/x/USB/SDInfo$3;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v4, v4, Lcom/protocol/x/USB/SDInfo;->xCmdOFF:Ljava/lang/String;

    iput-object v4, v3, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 173
    iget-object v4, v3, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v4}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->start()V
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_35} :catch_46

    .line 177
    .end local v3           #exeScript2:Lcom/protocol/x/USB/SUEXEC;
    :goto_35
    return-void

    .line 162
    .restart local v2       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_36
    move-exception v4

    move-object v1, v4

    .line 163
    .local v1, e:Ljava/lang/InterruptedException;
    :try_start_38
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_3b
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_3b} :catch_3c

    goto :goto_13

    .line 167
    .end local v1           #e:Ljava/lang/InterruptedException;
    .end local v2           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_3c
    move-exception v4

    move-object v0, v4

    .line 168
    .local v0, a:Ljava/lang/Exception;
    const-string v4, "DMSD"

    const-string v5, "Error in retreiving location."

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_25

    .line 174
    .end local v0           #a:Ljava/lang/Exception;
    :catch_46
    move-exception v4

    move-object v1, v4

    .line 175
    .local v1, e:Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_35
.end method
