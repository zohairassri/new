package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mg5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f30749a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30750b;

    public final mg5 a(int i11) {
        jx3.i(!this.f30750b);
        this.f30749a.append(i11, true);
        return this;
    }

    public final jh5 b() {
        jx3.i(!this.f30750b);
        this.f30750b = true;
        return new jh5(this.f30749a, null);
    }
}
