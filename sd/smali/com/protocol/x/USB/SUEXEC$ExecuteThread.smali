.class public Lcom/protocol/x/USB/SUEXEC$ExecuteThread;
.super Ljava/lang/Thread;
.source "SUEXEC.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/protocol/x/USB/SUEXEC;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ExecuteThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/protocol/x/USB/SUEXEC;


# direct methods
.method public constructor <init>(Lcom/protocol/x/USB/SUEXEC;)V
    .locals 0
    .parameter

    .prologue
    .line 37
    iput-object p1, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;)Lcom/protocol/x/USB/SUEXEC;
    .locals 1
    .parameter

    .prologue
    .line 37
    iget-object v0, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    return-object v0
.end method


# virtual methods
.method Execute()V
    .locals 5

    .prologue
    .line 48
    :try_start_0
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    const-string v4, "su"

    invoke-virtual {v3, v4}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v3

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->process:Ljava/lang/Process;

    .line 50
    new-instance v0, Ljava/io/DataOutputStream;

    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v2, v2, Lcom/protocol/x/USB/SUEXEC;->process:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 51
    .local v0, stdin:Ljava/io/DataOutputStream;
    new-instance v1, Ljava/io/DataInputStream;

    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v2, v2, Lcom/protocol/x/USB/SUEXEC;->process:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 54
    .local v1, stdout:Ljava/io/DataInputStream;
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    new-instance v3, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$1;

    invoke-direct {v3, p0}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$1;-><init>(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;)V

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->stdinThread:Ljava/lang/Thread;

    .line 70
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    new-instance v3, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;

    invoke-direct {v3, p0, v1}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;-><init>(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;Ljava/io/DataInputStream;)V

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->stdoutThread:Ljava/lang/Thread;

    .line 90
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->scriptRunning:Ljava/lang/Boolean;

    .line 92
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v2, v2, Lcom/protocol/x/USB/SUEXEC;->stdoutThread:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 93
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v2, v2, Lcom/protocol/x/USB/SUEXEC;->stdinThread:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v3, v3, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 96
    const-string v2, "exit\n"

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 100
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v2, v2, Lcom/protocol/x/USB/SUEXEC;->process:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->waitFor()I

    .line 102
    :cond_0
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v2, v2, Lcom/protocol/x/USB/SUEXEC;->stdoutFinished:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 106
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V

    .line 107
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V

    .line 109
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    const/4 v3, 0x0

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->stdoutThread:Ljava/lang/Thread;

    .line 110
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    const/4 v3, 0x0

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->stdinThread:Ljava/lang/Thread;

    .line 112
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->scriptRunning:Ljava/lang/Boolean;

    .line 113
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;

    iget-object v2, v2, Lcom/protocol/x/USB/SUEXEC;->process:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .end local v0           #stdin:Ljava/io/DataOutputStream;
    .end local v1           #stdout:Ljava/io/DataInputStream;
    :goto_0
    return-void

    .line 115
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public run()V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x1

    invoke-super {p0, v0}, Ljava/lang/Thread;->setPriority(I)V

    .line 41
    invoke-virtual {p0}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->Execute()V

    .line 42
    return-void
.end method
