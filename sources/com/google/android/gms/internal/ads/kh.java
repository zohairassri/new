package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rg f29621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzash f29622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29623d;

    private kh(zzash zzashVar) {
        this.f29623d = false;
        this.f29620a = null;
        this.f29621b = null;
        this.f29622c = zzashVar;
    }

    public static kh a(Object obj, rg rgVar) {
        return new kh(obj, rgVar);
    }

    public static kh b(zzash zzashVar) {
        return new kh(zzashVar);
    }

    public final boolean c() {
        return this.f29622c == null;
    }

    private kh(Object obj, rg rgVar) {
        this.f29623d = false;
        this.f29620a = obj;
        this.f29621b = rgVar;
        this.f29622c = null;
    }
}
