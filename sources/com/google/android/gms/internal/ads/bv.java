package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f24152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24156e;

    private bv(InputStream inputStream, boolean z11, boolean z12, long j11, boolean z13) {
        this.f24152a = inputStream;
        this.f24153b = z11;
        this.f24154c = z12;
        this.f24155d = j11;
        this.f24156e = z13;
    }

    public static bv a(InputStream inputStream, boolean z11, boolean z12, long j11, boolean z13) {
        return new bv(inputStream, z11, z12, j11, z13);
    }

    public final InputStream b() {
        return this.f24152a;
    }

    public final boolean c() {
        return this.f24153b;
    }

    public final boolean d() {
        return this.f24154c;
    }

    public final long e() {
        return this.f24155d;
    }

    public final boolean f() {
        return this.f24156e;
    }
}
