package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class e85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25652a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25655d;

    public final synchronized void a() {
        this.f25655d++;
    }

    public final synchronized void b() {
        this.f25655d--;
    }

    public final synchronized int c() {
        return this.f25655d;
    }
}
