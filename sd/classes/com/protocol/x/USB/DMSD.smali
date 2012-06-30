.class public Lcom/protocol/x/USB/DMSD;
.super Landroid/preference/PreferenceActivity;
.source "DMSD.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 6
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 3
    .parameter "savedInstanceState"

    .prologue
    .line 10
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 11
    const/high16 v0, 0x7f04

    invoke-virtual {p0, v0}, Lcom/protocol/x/USB/DMSD;->addPreferencesFromResource(I)V

    .line 12
    return-void
.end method
