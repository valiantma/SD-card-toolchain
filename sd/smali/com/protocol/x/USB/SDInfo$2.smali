.class Lcom/protocol/x/USB/SDInfo$2;
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
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/protocol/x/USB/SDInfo$2;->this$0:Lcom/protocol/x/USB/SDInfo;

    .line 94
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    const/4 v8, 0x0

    .line 97
    :try_start_0
    new-instance v4, Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {v4}, Lcom/protocol/x/USB/SUEXEC;-><init>()V

    .line 98
    .local v4, exeScript:Lcom/protocol/x/USB/SUEXEC;
    const-string v5, "find /sys/devices/platform/ -name lun*"

    iput-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 99
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 101
    :try_start_1
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    :goto_0
    :try_start_2
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$2;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v6, "sd_location"

    iget-object v7, v4, Lcom/protocol/x/USB/SUEXEC;->scriptOutput:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 106
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$2;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 111
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :goto_1
    :try_start_3
    new-instance v4, Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {v4}, Lcom/protocol/x/USB/SUEXEC;-><init>()V

    .line 112
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    const-string v5, "cat /proc/mounts"

    iput-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 113
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->start()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 115
    :try_start_4
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-virtual {v5}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->join()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 119
    :goto_2
    :try_start_5
    iget-object v5, v4, Lcom/protocol/x/USB/SUEXEC;->scriptOutput:Ljava/lang/String;

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 120
    .local v1, _tmp:[Ljava/lang/String;
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$2;->this$0:Lcom/protocol/x/USB/SDInfo;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v5, Lcom/protocol/x/USB/SDInfo;->_Vold:Ljava/util/List;

    .line 121
    array-length v5, v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move v6, v8

    :goto_3
    if-lt v6, v5, :cond_0

    .line 129
    .end local v1           #_tmp:[Ljava/lang/String;
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :goto_4
    iget-object v5, p0, Lcom/protocol/x/USB/SDInfo$2;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v5, v5, Lcom/protocol/x/USB/SDInfo;->UpdateSDOne:Landroid/os/Handler;

    iget-object v6, p0, Lcom/protocol/x/USB/SDInfo$2;->this$0:Lcom/protocol/x/USB/SDInfo;

    iget-object v6, v6, Lcom/protocol/x/USB/SDInfo;->UpdateSDOneResults:Ljava/lang/Runnable;

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 130
    return-void

    .line 102
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_0
    move-exception v5

    move-object v3, v5

    .line 103
    .local v3, e:Ljava/lang/InterruptedException;
    :try_start_6
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_0

    .line 107
    .end local v3           #e:Ljava/lang/InterruptedException;
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_1
    move-exception v5

    move-object v2, v5

    .line 108
    .local v2, a:Ljava/lang/Exception;
    const-string v5, "DMSD"

    const-string v6, "Error in retreiving location."

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 116
    .end local v2           #a:Ljava/lang/Exception;
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_2
    move-exception v5

    move-object v3, v5

    .line 117
    .restart local v3       #e:Ljava/lang/InterruptedException;
    :try_start_7
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_2

    .line 126
    .end local v3           #e:Ljava/lang/InterruptedException;
    .end local v4           #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :catch_3
    move-exception v5

    move-object v3, v5

    .line 127
    .local v3, e:Ljava/lang/Exception;
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_4

    .line 121
    .end local v3           #e:Ljava/lang/Exception;
    .restart local v1       #_tmp:[Ljava/lang/String;
    .restart local v4       #exeScript:Lcom/protocol/x/USB/SUEXEC;
    :cond_0
    :try_start_8
    aget-object v0, v1, v6

    .line 122
    .local v0, _a:Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const-string v8, "mnt/sd"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 123
    iget-object v7, p0, Lcom/protocol/x/USB/SDInfo$2;->this$0:Lcom/protocol/x/USB/SDInfo;

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
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 121
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_3
.end method
