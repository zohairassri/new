package x1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f136512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f136513b;

    public c(v vVar, Integer num) {
        this.f136512a = vVar;
        this.f136513b = num;
    }

    public static /* synthetic */ c b(c cVar, v vVar, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            vVar = cVar.f136512a;
        }
        if ((i11 & 2) != 0) {
            num = cVar.f136513b;
        }
        return cVar.a(vVar, num);
    }

    public final c a(v vVar, Integer num) {
        return new c(vVar, num);
    }

    public final Integer c() {
        return this.f136513b;
    }

    public final v d() {
        return this.f136512a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f136512a, cVar.f136512a) && Intrinsics.areEqual(this.f136513b, cVar.f136513b);
    }

    public int hashCode() {
        int iHashCode = this.f136512a.hashCode() * 31;
        Integer num = this.f136513b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.f136512a + ", groupOffset=" + this.f136513b + ')';
    }
}
