package com.google.android.gms.internal.ads;

import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ky4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f29913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29914b;

    ky4(Object obj, int i11) {
        this.f29913a = obj;
        this.f29914b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ky4)) {
            return false;
        }
        ky4 ky4Var = (ky4) obj;
        return this.f29913a == ky4Var.f29913a && this.f29914b == ky4Var.f29914b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f29913a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f29914b;
    }
}
