package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26564c;

    private ft0(int i11, int i12, int i13) {
        this.f26562a = i11;
        this.f26564c = i12;
        this.f26563b = i13;
    }

    public static ft0 a(zzr zzrVar) {
        return zzrVar.f22333d ? new ft0(3, 0, 0) : zzrVar.f22338i ? new ft0(2, 0, 0) : zzrVar.f22337h ? new ft0(0, 0, 0) : new ft0(1, zzrVar.f22335f, zzrVar.f22332c);
    }

    public static ft0 b() {
        return new ft0(0, 0, 0);
    }

    public static ft0 c(int i11, int i12) {
        return new ft0(1, i11, i12);
    }

    public static ft0 d() {
        return new ft0(4, 0, 0);
    }

    public static ft0 e() {
        return new ft0(5, 0, 0);
    }

    public final boolean f() {
        return this.f26562a == 2;
    }

    public final boolean g() {
        return this.f26562a == 3;
    }

    public final boolean h() {
        return this.f26562a == 0;
    }

    public final boolean i() {
        return this.f26562a == 4;
    }

    public final boolean j() {
        return this.f26562a == 5;
    }
}
