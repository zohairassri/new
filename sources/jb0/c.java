package jb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f105484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f105485b;

    public c(int i11, String str) {
        this.f105484a = i11;
        this.f105485b = str;
    }

    public final int a() {
        return this.f105484a;
    }

    public final String b() {
        return this.f105485b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f105484a == cVar.f105484a && Intrinsics.areEqual(this.f105485b, cVar.f105485b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f105484a) * 31;
        String str = this.f105485b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DomainSettings(limit=" + this.f105484a + ", suffix=" + this.f105485b + ')';
    }
}
