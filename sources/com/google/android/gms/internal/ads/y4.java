package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5 f38312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5 f38313b;

    public y4(b5 b5Var, b5 b5Var2) {
        this.f38312a = b5Var;
        this.f38313b = b5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y4.class == obj.getClass()) {
            y4 y4Var = (y4) obj;
            if (this.f38312a.equals(y4Var.f38312a) && this.f38313b.equals(y4Var.f38313b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38312a.hashCode() * 31) + this.f38313b.hashCode();
    }

    public final String toString() {
        b5 b5Var = this.f38312a;
        b5 b5Var2 = this.f38313b;
        String string = b5Var.toString();
        String strConcat = b5Var.equals(b5Var2) ? "" : ", ".concat(b5Var2.toString());
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb2.append("[");
        sb2.append(string);
        sb2.append(strConcat);
        sb2.append("]");
        return sb2.toString();
    }
}
