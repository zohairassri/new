package oq;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f120647b;

    /* JADX INFO: renamed from: oq.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1584b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f120648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f120649b = null;

        C1584b(String str) {
            this.f120648a = str;
        }

        public b a() {
            return new b(this.f120648a, this.f120649b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f120649b)));
        }

        public C1584b b(Annotation annotation) {
            if (this.f120649b == null) {
                this.f120649b = new HashMap();
            }
            this.f120649b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static C1584b a(String str) {
        return new C1584b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f120646a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f120647b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f120646a.equals(bVar.f120646a) && this.f120647b.equals(bVar.f120647b);
    }

    public int hashCode() {
        return (this.f120646a.hashCode() * 31) + this.f120647b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f120646a + ", properties=" + this.f120647b.values() + "}";
    }

    private b(String str, Map map) {
        this.f120646a = str;
        this.f120647b = map;
    }
}
