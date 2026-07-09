package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class sq0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f35002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f35003b;

    sq0(JsPromptResult jsPromptResult, EditText editText) {
        this.f35002a = jsPromptResult;
        this.f35003b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f35002a.confirm(this.f35003b.getText().toString());
    }
}
