package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class cy3 implements Serializable, by3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient iy3 f24788a = new iy3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final by3 f24789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile transient boolean f24790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object f24791d;

    cy3(by3 by3Var) {
        this.f24789b = by3Var;
    }

    public final String toString() {
        Object string;
        if (this.f24790c) {
            String strValueOf = String.valueOf(this.f24791d);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        } else {
            string = this.f24789b;
        }
        String string2 = string.toString();
        StringBuilder sb3 = new StringBuilder(string2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(string2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.by3
    public final Object zza() {
        if (!this.f24790c) {
            synchronized (this.f24788a) {
                try {
                    if (!this.f24790c) {
                        Object objZza = this.f24789b.zza();
                        this.f24791d = objZza;
                        this.f24790c = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f24791d;
    }
}
