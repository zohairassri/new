package of;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f120334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f120335b;

    public a(int i11, Object obj) {
        this.f120334a = i11;
        this.f120335b = obj;
    }

    public final Object a() {
        return this.f120335b;
    }

    public final int b() {
        return this.f120334a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f120334a == aVar.f120334a && Intrinsics.areEqual(this.f120335b, aVar.f120335b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f120334a) * 31;
        Object obj = this.f120335b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "DataStoreContent(versionCode=" + this.f120334a + ", data=" + this.f120335b + ")";
    }
}
