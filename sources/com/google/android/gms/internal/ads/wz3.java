package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class wz3 extends i24 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f37683a;

    wz3(Comparator comparator) {
        this.f37683a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.i24, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f37683a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wz3) {
            return this.f37683a.equals(((wz3) obj).f37683a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37683a.hashCode();
    }

    public final String toString() {
        return this.f37683a.toString();
    }
}
