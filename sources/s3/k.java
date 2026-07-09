package s3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f125501b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f125502c = new k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f125503d = new k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k f125504e = new k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125505a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(List list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | ((k) list.get(i11)).e());
            }
            return new k(numValueOf.intValue());
        }

        public final k b() {
            return k.f125504e;
        }

        public final k c() {
            return k.f125502c;
        }

        public final k d() {
            return k.f125503d;
        }

        private a() {
        }
    }

    public k(int i11) {
        this.f125505a = i11;
    }

    public final boolean d(k kVar) {
        int i11 = this.f125505a;
        return (kVar.f125505a | i11) == i11;
    }

    public final int e() {
        return this.f125505a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f125505a == ((k) obj).f125505a;
    }

    public int hashCode() {
        return this.f125505a;
    }

    public String toString() {
        if (this.f125505a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f125505a & f125503d.f125505a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f125505a & f125504e.f125505a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + b4.b.e(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
