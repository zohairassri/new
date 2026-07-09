package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class k13 implements i13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29334a;

    public k13(String str) {
        this.f29334a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k13) {
            return this.f29334a.equals(((k13) obj).f29334a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29334a.hashCode();
    }

    public final String toString() {
        return this.f29334a;
    }
}
