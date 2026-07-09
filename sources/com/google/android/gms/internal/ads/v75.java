package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class v75 implements r75 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36639c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile r75 f36640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f36641b = f36639c;

    private v75(r75 r75Var) {
        this.f36640a = r75Var;
    }

    public static r75 a(r75 r75Var) {
        return ((r75Var instanceof v75) || (r75Var instanceof h75)) ? r75Var : new v75(r75Var);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final Object zzb() {
        Object obj = this.f36641b;
        if (obj != f36639c) {
            return obj;
        }
        r75 r75Var = this.f36640a;
        if (r75Var == null) {
            return this.f36641b;
        }
        Object objZzb = r75Var.zzb();
        this.f36641b = objZzb;
        this.f36640a = null;
        return objZzb;
    }
}
