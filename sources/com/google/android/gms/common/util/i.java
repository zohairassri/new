package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f22906a = new i();

    private i() {
    }

    public static f c() {
        return f22906a;
    }

    @Override // com.google.android.gms.common.util.f
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.f
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.f
    public final long nanoTime() {
        return System.nanoTime();
    }
}
