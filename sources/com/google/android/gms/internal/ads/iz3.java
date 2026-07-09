package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class iz3 extends i24 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ax3 f28810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i24 f28811b;

    iz3(ax3 ax3Var, i24 i24Var) {
        this.f28810a = ax3Var;
        this.f28811b = i24Var;
    }

    @Override // com.google.android.gms.internal.ads.i24, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ax3 ax3Var = this.f28810a;
        return this.f28811b.compare(ax3Var.apply(obj), ax3Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iz3) {
            iz3 iz3Var = (iz3) obj;
            if (this.f28810a.equals(iz3Var.f28810a) && this.f28811b.equals(iz3Var.f28811b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f28810a, this.f28811b);
    }

    public final String toString() {
        String string = this.f28811b.toString();
        int length = string.length();
        String string2 = this.f28810a.toString();
        StringBuilder sb2 = new StringBuilder(length + 12 + string2.length() + 1);
        sb2.append(string);
        sb2.append(".onResultOf(");
        sb2.append(string2);
        sb2.append(")");
        return sb2.toString();
    }
}
