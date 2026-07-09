package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ey3 implements by3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final by3 f25980d = dy3.f25507a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iy3 f25981a = new iy3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile by3 f25982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f25983c;

    ey3(by3 by3Var) {
        this.f25982b = by3Var;
    }

    public final String toString() {
        Object string = this.f25982b;
        if (string == f25980d) {
            String strValueOf = String.valueOf(this.f25983c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.by3
    public final Object zza() {
        by3 by3Var = this.f25982b;
        by3 by3Var2 = f25980d;
        if (by3Var != by3Var2) {
            synchronized (this.f25981a) {
                try {
                    if (this.f25982b != by3Var2) {
                        Object objZza = this.f25982b.zza();
                        this.f25983c = objZza;
                        this.f25982b = by3Var2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f25983c;
    }
}
