.class Lcom/protocol/x/USB/SDInfo$4;
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
    iput-object p1, p0, Lcom/protocol/x/USB/SDInfo$4;->this$0:Lcom/protocol/x/USB/SDInfo;

    .line 197
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 12

    .prologue
    const/4 v8, 0x0

    .line 200
    :try_start_1
    new-instance v4, Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {v4}, Lcom/protocol/x/USB/SUEXEC;-><init>()V

    .line 201
    .local v4, exeScript:Lcom/protocol/x/USB/SUEXEC;
    const-string v5, "find /sys/devices/platform/ -name lun*"

    iput-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 202
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->start()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_f} :catch_60

    .line 204
    :try_start_f
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->join()V
    :try_end_14
    .catch Ljava/lang/InterruptedException; {:try_start_f .. :try_end_14} :catch_5a
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_14} :catch_60

    .line 208
    :goto_14
    :try_start_14
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$4;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v6, "sd_location"

    iget-object v7, v4, Lcom/protocol/x/USB/SUEXEC;->scriptOutput:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 209
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$4;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_26} :catch_60

    .line 214
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :goto_26
    :try_start_26
    new-instance v4, Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {v4}, Lcom/protocol/x/USB/SUEXEC;-><init>()V

    .line 215
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    const-string v5, "cat /proc/mounts"

    iput-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 216
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->start()V
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_34} :catch_70

    .line 218
    :try_start_34
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->join()V
    :try_end_39
    .catch Ljava/lang/InterruptedException; {:try_start_34 .. :try_end_39} :catch_6a
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_39} :catch_70

    .line 222
    :goto_39
    :try_start_39
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->scriptOutput:Ljava/lang/String;

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 223
    .local v1, _tmp:[Ljava/lang/String;
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$4;->this$0:Lcom/protocol/x/USB/SDInfo;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v5, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    .line 224
    array-length v5, v1
    :try_end_4b
    .catch Ljava/lang/Exception; {:try_start_39 .. :try_end_4b} :catch_70

    move v6, v8

    :goto_4c
    if-lt v6, v5, :cond_76

    .line 232
    .end local v1           #_tmp:[Ljava/lang/String;
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :goto_4e
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$4;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->UpdateSDOne:Landroid/os/Handler;

    iget-object v6, p0, Lcom/protocol/x/USB/SDInfo$4;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v6, v6, Lcom/protocol/x/USB/SDInfo;->UpdateSDOneResults:Ljava/lang/Runnable;

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 233
    return-void

    .line 205
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_5a
    move-exception v5

    move-object v3, v5

    .line 206
    .local v3, e:Ljava/lang/InterruptedException;
    :try_start_5c
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_5f
    .catch Ljava/lang/Exception; {:try_start_5c .. :try_end_5f} :catch_60

    goto :goto_14

    .line 210
    .end local v3           #e:Ljava/lang/InterruptedException;
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_60
    move-exception v5

    move-object v2, v5

    .line 211
    .local v2, a:Ljava/lang/Exception;
    const-string v5, "DMSD"

    const-string v6, "Error in retreiving location."

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_26

    .line 219
    .end local v2           #a:Ljava/lang/Exception;
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_6a
    move-exception v5

    move-object v3, v5

    .line 220
    .restart local v3       #e:Ljava/lang/InterruptedException;
    :try_start_6c
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_6f
    .catch Ljava/lang/Exception; {:try_start_6c .. :try_end_6f} :catch_70

    goto :goto_39

    .line 229
    .end local v3           #e:Ljava/lang/InterruptedException;
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_70
    move-exception v5

    move-object v3, v5

    .line 230
    .local v3, e:Ljava/lang/Exception;
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_4e

    .line 224
    .end local v3           #e:Ljava/lang/Exception;
    .restart local v1       #_tmp:[Ljava/lang/String;
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :cond_76
    :try_start_76
    aget-object v0, v1, v6

    .line 225
    .local v0, _a:Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const-string v8, "mnt/sd"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_ab

    .line 226
    iget-object v7, p0, Lcom/protocol/x/USB/SDInfo$4;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v7, v7, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "echo "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x0

    const-string v10, " "

    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v0, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " > "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_ab
    .catch Ljava/lang/Exception; {:try_start_76 .. :try_end_ab} :catch_70

    .line 224
    :cond_ab
    add-int/lit8 v6, v6, 0x1

    goto :goto_4c
.end method
