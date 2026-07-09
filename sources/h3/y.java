package h3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f99914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f99915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f99916c;

    public y(z zVar, int i11, int i12) {
        this.f99914a = zVar;
        this.f99915b = i11;
        this.f99916c = i12;
    }

    public final int a() {
        return this.f99916c;
    }

    public final z b() {
        return this.f99914a;
    }

    public final int c() {
        return this.f99915b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f99914a, yVar.f99914a) && this.f99915b == yVar.f99915b && this.f99916c == yVar.f99916c;
    }

    public int hashCode() {
        return (((this.f99914a.hashCode() * 31) + Integer.hashCode(this.f99915b)) * 31) + Integer.hashCode(this.f99916c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f99914a + ", startIndex=" + this.f99915b + ", endIndex=" + this.f99916c + ')';
    }
}
