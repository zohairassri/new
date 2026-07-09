package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jh5 f36202a;

    public um(jh5 jh5Var) {
        this.f36202a = jh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof um) {
            return this.f36202a.equals(((um) obj).f36202a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36202a.hashCode();
    }
}
