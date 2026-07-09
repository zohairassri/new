package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jh5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f29074a;

    public final boolean a(int i11) {
        return this.f29074a.get(i11);
    }

    public final int b() {
        return this.f29074a.size();
    }

    public final int c(int i11) {
        SparseBooleanArray sparseBooleanArray = this.f29074a;
        jx3.m(i11, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jh5) {
            return this.f29074a.equals(((jh5) obj).f29074a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29074a.hashCode();
    }
}
