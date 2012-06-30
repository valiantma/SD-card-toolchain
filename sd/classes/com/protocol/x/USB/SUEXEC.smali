.class public Lcom/protocol/x/USB/SUEXEC;
.super Ljava/lang/Object;
.source "SUEXEC.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/protocol/x/USB/SUEXEC$ExecuteThread;
    }
.end annotation


# instance fields
.field AutoClose:Ljava/lang/Boolean;

.field AutoCloseSeconds:I

.field AutoCloseTimer:Ljava/util/Timer;

.field ExecuteFinished:I

.field ExecuteResponse:I

.field ExecuteUpdateButton:I

.field public executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

.field process:Ljava/lang/Process;

.field processName:Ljava/lang/String;

.field processScript:Ljava/lang/String;

.field public scriptOutput:Ljava/lang/String;

.field scriptOutputError:Ljava/lang/String;

.field scriptRunning:Ljava/lang/Boolean;

.field stdin:Ljava/io/DataOutputStream;

.field stdinThread:Ljava/lang/Thread;

.field stdout:Ljava/io/DataInputStream;

.field stdoutFinished:Ljava/lang/Boolean;

.field stdoutThread:Ljava/lang/Thread;

.field public xCmd:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    invoke-direct {v0, p0}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;-><init>(Lcom/protocol/x/USB/SUEXEC;)V

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->executeThread:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    .line 11
    const/16 v0, 0x3e7

    iput v0, p0, Lcom/protocol/x/USB/SUEXEC;->ExecuteResponse:I

    .line 12
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/protocol/x/USB/SUEXEC;->ExecuteFinished:I

    .line 13
    const/16 v0, 0x3e9

    iput v0, p0, Lcom/protocol/x/USB/SUEXEC;->ExecuteUpdateButton:I

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->xCmd:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->processName:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->processScript:Ljava/lang/String;

    .line 19
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->AutoClose:Ljava/lang/Boolean;

    .line 20
    const/4 v0, 0x3

    iput v0, p0, Lcom/protocol/x/USB/SUEXEC;->AutoCloseSeconds:I

    .line 21
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->AutoCloseTimer:Ljava/util/Timer;

    .line 24
    iput-object v1, p0, Lcom/protocol/x/USB/SUEXEC;->stdin:Ljava/io/DataOutputStream;

    .line 25
    iput-object v1, p0, Lcom/protocol/x/USB/SUEXEC;->stdout:Ljava/io/DataInputStream;

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->scriptOutput:Ljava/lang/String;

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->scriptOutputError:Ljava/lang/String;

    .line 29
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->scriptRunning:Ljava/lang/Boolean;

    .line 30
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/protocol/x/USB/SUEXEC;->stdoutFinished:Ljava/lang/Boolean;

    .line 32
    iput-object v1, p0, Lcom/protocol/x/USB/SUEXEC;->stdoutThread:Ljava/lang/Thread;

    .line 33
    iput-object v1, p0, Lcom/protocol/x/USB/SUEXEC;->stdinThread:Ljava/lang/Thread;

    .line 35
    iput-object v1, p0, Lcom/protocol/x/USB/SUEXEC;->process:Ljava/lang/Process;

    .line 7
    return-void
.end method
