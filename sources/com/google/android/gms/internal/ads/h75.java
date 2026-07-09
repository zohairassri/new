package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h75 implements r75, c75 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f27554c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile r75 f27555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f27556b = f27554c;

    private h75(r75 r75Var) {
        this.f27555a = r75Var;
    }

    public static r75 a(r75 r75Var) {
        return r75Var instanceof h75 ? r75Var : new h75(r75Var);
    }

    public static c75 b(r75 r75Var) {
        if (r75Var instanceof c75) {
            return (c75) r75Var;
        }
        r75Var.getClass();
        return new h75(r75Var);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.f27556b;
            Object obj2 = f27554c;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.f27555a.zzb();
            Object obj3 = this.f27556b;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.f27556b = objZzb;
            this.f27555a = null;
            return objZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final Object zzb() {
        Object obj = this.f27556b;
        return obj == f27554c ? c() : obj;
    }
}
