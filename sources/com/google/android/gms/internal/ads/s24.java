package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class s24 extends i24 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i24 f34473a;

    s24(i24 i24Var) {
        this.f34473a = i24Var;
    }

    @Override // com.google.android.gms.internal.ads.i24, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f34473a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s24) {
            return this.f34473a.equals(((s24) obj).f34473a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f34473a.hashCode();
    }

    public final String toString() {
        return this.f34473a.toString().concat(".reverse()");
    }
}
