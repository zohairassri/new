package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class aj2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f23321a;

    aj2(Bundle bundle) {
        this.f23321a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.f23321a;
        f81 f81Var = (f81) obj;
        if (bundle.isEmpty()) {
            return;
        }
        f81Var.f26097a.putBundle("installed_adapter_data", bundle);
    }
}
