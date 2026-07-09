package we0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f135181e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f135182f = l.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f135183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f135184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f135185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f135186d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(int i11, int i12, int i13) {
        this.f135183a = i11;
        this.f135184b = i12;
        this.f135185c = i13;
        this.f135186d = b(i11, i12, i13);
    }

    private final int b(int i11, int i12, int i13) {
        if (i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256 && i13 >= 0 && i13 < 256) {
            return (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i11 + '.' + i12 + '.' + i13).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f135186d - other.f135186d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k kVar = obj instanceof k ? (k) obj : null;
        return kVar != null && this.f135186d == kVar.f135186d;
    }

    public int hashCode() {
        return this.f135186d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f135183a);
        sb2.append('.');
        sb2.append(this.f135184b);
        sb2.append('.');
        sb2.append(this.f135185c);
        return sb2.toString();
    }
}
