package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class lx3 implements Serializable, kx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f30478a;

    public final boolean equals(Object obj) {
        if (obj instanceof lx3) {
            return this.f30478a.equals(((lx3) obj).f30478a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30478a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z11 = true;
        for (Object obj : this.f30478a) {
            if (!z11) {
                sb2.append(',');
            }
            sb2.append(obj);
            z11 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.kx3
    public final boolean zza(Object obj) {
        int i11 = 0;
        while (true) {
            List list = this.f30478a;
            if (i11 >= list.size()) {
                return true;
            }
            if (!((kx3) list.get(i11)).zza(obj)) {
                return false;
            }
            i11++;
        }
    }
}
