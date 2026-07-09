package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface n0 extends Executor {
    static n0 l(Executor executor, np1 np1Var) {
        return new m0(executor, np1Var);
    }

    void zza();
}
