package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p4 extends o4 implements Serializable, n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f41636a;

    protected p4(long j11) {
        this.f41636a = j11;
    }

    @Override // com.google.android.gms.internal.pal.n4
    public final long zzd() {
        return this.f41636a;
    }
}
