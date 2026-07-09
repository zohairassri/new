package com.google.android.gms.internal.pal;

import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41590b;

    n1(Object obj, int i11) {
        this.f41589a = obj;
        this.f41590b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f41589a == n1Var.f41589a && this.f41590b == n1Var.f41590b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f41589a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f41590b;
    }
}
