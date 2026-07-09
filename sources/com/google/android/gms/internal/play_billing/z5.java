package com.google.android.gms.internal.play_billing;

import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42651b;

    z5(Object obj, int i11) {
        this.f42650a = obj;
        this.f42651b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return this.f42650a == z5Var.f42650a && this.f42651b == z5Var.f42651b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f42650a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f42651b;
    }
}
