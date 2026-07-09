package m9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f115926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f115927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f115928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f115929d;

    public f(int i11, int i12, String from, String to2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        this.f115926a = i11;
        this.f115927b = i12;
        this.f115928c = from;
        this.f115929d = to2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i11 = this.f115926a - other.f115926a;
        return i11 == 0 ? this.f115927b - other.f115927b : i11;
    }

    public final String b() {
        return this.f115928c;
    }

    public final int c() {
        return this.f115926a;
    }

    public final String e() {
        return this.f115929d;
    }
}
