package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j75 implements i75, c75 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j75 f28923b = new j75(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28924a;

    private j75(Object obj) {
        this.f28924a = obj;
    }

    public static i75 a(Object obj) {
        q75.a(obj, "instance cannot be null");
        return new j75(obj);
    }

    public static i75 b(Object obj) {
        return obj == null ? f28923b : new j75(obj);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final Object zzb() {
        return this.f28924a;
    }
}
