package zo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b implements p, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f142479a;

        @Override // zo.p
        public boolean apply(Object obj) {
            for (int i11 = 0; i11 < this.f142479a.size(); i11++) {
                if (!((p) this.f142479a.get(i11)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f142479a.equals(((b) obj).f142479a);
            }
            return false;
        }

        public int hashCode() {
            return this.f142479a.hashCode() + 306654252;
        }

        public String toString() {
            return q.d("and", this.f142479a);
        }

        private b(List list) {
            this.f142479a = list;
        }
    }

    public static p b(p pVar, p pVar2) {
        return new b(c((p) o.k(pVar), (p) o.k(pVar2)));
    }

    private static List c(p pVar, p pVar2) {
        return Arrays.asList(pVar, pVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z11 = true;
        for (Object obj : iterable) {
            if (!z11) {
                sb2.append(',');
            }
            sb2.append(obj);
            z11 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
