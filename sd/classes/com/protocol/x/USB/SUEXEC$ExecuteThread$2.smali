.class Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;
.super Ljava/lang/Thread;
.source "SUEXEC.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->Execute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

.field private final synthetic val$stdout:Ljava/io/DataInputStream;


# direct methods
.method constructor <init>(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;Ljava/io/DataInputStream;)V
    .registers 3
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;->this$1:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    iput-object p2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;->val$stdout:Ljava/io/DataInputStream;

    .line 70
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    .prologue
    const/4 v2, 0x1

    .line 73
    invoke-super {p0, v2}, Ljava/lang/Thread;->setPriority(I)V

    .line 77
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .local v1, reply:Ljava/lang/StringBuilder;
    :goto_9
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;->val$stdout:Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/io/DataInputStream;->read()I

    move-result v0

    .local v0, c:I
    const/4 v2, -0x1

    if-ne v0, v2, :cond_31

    .line 83
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;->this$1:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    #getter for: Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;
    invoke-static {v2}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->access$0(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;)Lcom/protocol/x/USB/SUEXEC;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->scriptOutput:Ljava/lang/String;

    .line 84
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;->val$stdout:Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V

    .line 85
    iget-object v2, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$2;->this$1:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    #getter for: Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;
    invoke-static {v2}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->access$0(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;)Lcom/protocol/x/USB/SUEXEC;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lcom/protocol/x/USB/SUEXEC;->stdoutFinished:Ljava/lang/Boolean;

    .line 88
    .end local v0           #c:I
    .end local v1           #reply:Ljava/lang/StringBuilder;
    :goto_30
    return-void

    .line 80
    .restart local v0       #c:I
    .restart local v1       #reply:Ljava/lang/StringBuilder;
    :cond_31
    int-to-char v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_35} :catch_36

    goto :goto_9

    .line 87
    .end local v0           #c:I
    .end local v1           #reply:Ljava/lang/StringBuilder;
    :catch_36
    move-exception v2

    goto :goto_30
.end method
