package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g64 extends e64 implements com.google.common.util.concurrent.e {
    protected g64() {
    }

    @Override // com.google.common.util.concurrent.e
    public final void a(Runnable runnable, Executor executor) {
        x().a(runnable, executor);
    }

    protected abstract com.google.common.util.concurrent.e x();
}
