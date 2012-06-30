.class Lcom/protocol/x/USB/SUEXEC$ExecuteThread$1;
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


# direct methods
.method constructor <init>(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;)V
    .registers 2
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$1;->this$1:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    .line 54
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    .prologue
    .line 58
    const/4 v0, 0x1

    invoke-super {p0, v0}, Ljava/lang/Thread;->setPriority(I)V

    .line 60
    :goto_4
    iget-object v0, p0, Lcom/protocol/x/USB/SUEXEC$ExecuteThread$1;->this$1:Lcom/protocol/x/USB/SUEXEC$ExecuteThread;

    #getter for: Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->this$0:Lcom/protocol/x/USB/SUEXEC;
    invoke-static {v0}, Lcom/protocol/x/USB/SUEXEC$ExecuteThread;->access$0(Lcom/protocol/x/USB/SUEXEC$ExecuteThread;)Lcom/protocol/x/USB/SUEXEC;

    move-result-object v0

    iget-object v0, v0, Lcom/protocol/x/USB/SUEXEC;->scriptRunning:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_13

    .line 67
    return-void

    .line 64
    :cond_13
    const-wide/16 v0, 0xc8

    :try_start_15
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_18} :catch_19

    goto :goto_4

    .line 65
    :catch_19
    move-exception v0

    goto :goto_4
.end method
