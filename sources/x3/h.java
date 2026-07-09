package x3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f137009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f137010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f137011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f137012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f137013e;

    public h(int i11, int i12, int i13, String str, int i14) {
        this.f137009a = i11;
        this.f137010b = i12;
        this.f137011c = i13;
        this.f137012d = str;
        this.f137013e = i14;
    }

    public final int a() {
        return this.f137011c;
    }

    public final int b() {
        return this.f137009a;
    }

    public final int c() {
        return this.f137010b;
    }

    public final String d() {
        return this.f137012d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f137009a == hVar.f137009a && this.f137010b == hVar.f137010b && this.f137011c == hVar.f137011c && Intrinsics.areEqual(this.f137012d, hVar.f137012d) && this.f137013e == hVar.f137013e;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f137009a) * 31) + Integer.hashCode(this.f137010b)) * 31) + Integer.hashCode(this.f137011c)) * 31;
        String str = this.f137012d;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f137013e);
    }

    public String toString() {
        return "SourceLocation(lineNumber=" + this.f137009a + ", offset=" + this.f137010b + ", length=" + this.f137011c + ", sourceFile=" + this.f137012d + ", packageHash=" + this.f137013e + ')';
    }
}
