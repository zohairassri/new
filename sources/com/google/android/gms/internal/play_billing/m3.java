package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m3 extends k3 implements y3 {
    protected m3() {
    }

    protected abstract y3 e();

    @Override // com.google.android.gms.internal.play_billing.y3
    public final void j(Runnable runnable, Executor executor) {
        e().j(runnable, executor);
    }
}
