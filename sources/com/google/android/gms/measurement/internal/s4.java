package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class s4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q4 f43421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f43423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f43424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f43425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f43426f;

    @Override // java.lang.Runnable
    public final void run() {
        this.f43421a.a(this.f43425e, this.f43422b, this.f43423c, this.f43424d, this.f43426f);
    }

    private s4(String str, q4 q4Var, int i11, Throwable th2, byte[] bArr, Map map) {
        com.google.android.gms.common.internal.n.l(q4Var);
        this.f43421a = q4Var;
        this.f43422b = i11;
        this.f43423c = th2;
        this.f43424d = bArr;
        this.f43425e = str;
        this.f43426f = map;
    }
}
