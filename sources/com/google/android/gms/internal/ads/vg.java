package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36790a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36791b;

    public final int a() {
        return this.f36790a;
    }

    public final int b() {
        return this.f36791b;
    }

    public final void c(zzash zzashVar) throws zzash {
        int i11 = this.f36791b + 1;
        this.f36791b = i11;
        int i12 = this.f36790a;
        this.f36790a = i12 + i12;
        if (i11 > 1) {
            throw zzashVar;
        }
    }
}
