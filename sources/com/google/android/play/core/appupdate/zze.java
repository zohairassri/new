package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class zze extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ sn.i f45787a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        if (i11 == 1) {
            this.f45787a.e(-1);
            return;
        }
        sn.i iVar = this.f45787a;
        if (i11 != 2) {
            iVar.e(1);
        } else {
            iVar.e(0);
        }
    }
}
