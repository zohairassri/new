package com.google.android.gms.internal.pal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bm f41145b = new yl().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f41146a;

    public final Map a() {
        return this.f41146a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bm) {
            return this.f41146a.equals(((bm) obj).f41146a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41146a.hashCode();
    }

    public final String toString() {
        return this.f41146a.toString();
    }
}
