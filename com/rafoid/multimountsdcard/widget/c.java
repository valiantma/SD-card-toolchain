package com.rafoid.multimountsdcard.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

final class c
  implements DialogInterface.OnClickListener
{
  c(MultiMountSDCardConfigure paramMultiMountSDCardConfigure)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Uri localUri = Uri.parse("http://market.android.com/details?id=com.rafoid.multimountsdcard.widget");
    Intent localIntent = new Intent("android.intent.action.VIEW", localUri);
    this.a.startActivity(localIntent);
    this.a.finish();
  }
}

/* Location:           D:\Downloads\multimountsdcard_1.60 (1)\classes.dex~\
 * Qualified Name:     com.rafoid.multimountsdcard.widget.c
 * JD-Core Version:    0.6.0
 */