package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vg4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vg4 f36800b = new ug4().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36801a;

    public final boolean a() {
        return this.f36801a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vg4) {
            return this.f36801a.equals(((vg4) obj).f36801a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36801a.hashCode();
    }

    public final String toString() {
        return this.f36801a.toString();
    }
}
