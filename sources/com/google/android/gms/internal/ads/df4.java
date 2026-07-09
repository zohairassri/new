package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class df4 implements ff4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f25040a = new AtomicBoolean(false);

    df4(boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.ff4
    public final boolean zza() {
        return this.f25040a.get();
    }
}
