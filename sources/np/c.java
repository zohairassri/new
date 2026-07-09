package np;

import cp.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final np.a f119492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f119493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f119494c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList f119495a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private np.a f119496b = np.a.f119489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f119497c = null;

        private boolean c(int i11) {
            ArrayList arrayList = this.f119495a;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (((C1551c) obj).a() == i11) {
                    return true;
                }
            }
            return false;
        }

        public b a(k kVar, int i11, String str, String str2) {
            ArrayList arrayList = this.f119495a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C1551c(kVar, i11, str, str2));
            return this;
        }

        public c b() throws GeneralSecurityException {
            if (this.f119495a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f119497c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f119496b, Collections.unmodifiableList(this.f119495a), this.f119497c);
            this.f119495a = null;
            return cVar;
        }

        public b d(np.a aVar) {
            if (this.f119495a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f119496b = aVar;
            return this;
        }

        public b e(int i11) {
            if (this.f119495a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f119497c = Integer.valueOf(i11);
            return this;
        }
    }

    /* JADX INFO: renamed from: np.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1551c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f119498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f119499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f119500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f119501d;

        public int a() {
            return this.f119499b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1551c)) {
                return false;
            }
            C1551c c1551c = (C1551c) obj;
            return this.f119498a == c1551c.f119498a && this.f119499b == c1551c.f119499b && this.f119500c.equals(c1551c.f119500c) && this.f119501d.equals(c1551c.f119501d);
        }

        public int hashCode() {
            return Objects.hash(this.f119498a, Integer.valueOf(this.f119499b), this.f119500c, this.f119501d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f119498a, Integer.valueOf(this.f119499b), this.f119500c, this.f119501d);
        }

        private C1551c(k kVar, int i11, String str, String str2) {
            this.f119498a = kVar;
            this.f119499b = i11;
            this.f119500c = str;
            this.f119501d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f119492a.equals(cVar.f119492a) && this.f119493b.equals(cVar.f119493b) && Objects.equals(this.f119494c, cVar.f119494c);
    }

    public int hashCode() {
        return Objects.hash(this.f119492a, this.f119493b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f119492a, this.f119493b, this.f119494c);
    }

    private c(np.a aVar, List list, Integer num) {
        this.f119492a = aVar;
        this.f119493b = list;
        this.f119494c = num;
    }
}
