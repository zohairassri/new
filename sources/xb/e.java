package xb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f137320c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f137321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f137322b;

    public e(String... strArr) {
        this.f137321a = Arrays.asList(strArr);
    }

    private boolean b() {
        return ((String) this.f137321a.get(r1.size() - 1)).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f137321a.add(str);
        return eVar;
    }

    public boolean c(String str, int i11) {
        if (i11 >= this.f137321a.size()) {
            return false;
        }
        boolean z11 = i11 == this.f137321a.size() - 1;
        String str2 = (String) this.f137321a.get(i11);
        if (!str2.equals("**")) {
            return (z11 || (i11 == this.f137321a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z11 && ((String) this.f137321a.get(i11 + 1)).equals(str)) {
            return i11 == this.f137321a.size() + (-2) || (i11 == this.f137321a.size() + (-3) && b());
        }
        if (z11) {
            return true;
        }
        int i12 = i11 + 1;
        if (i12 < this.f137321a.size() - 1) {
            return false;
        }
        return ((String) this.f137321a.get(i12)).equals(str);
    }

    public f d() {
        return this.f137322b;
    }

    public int e(String str, int i11) {
        if (f(str)) {
            return 0;
        }
        if (((String) this.f137321a.get(i11)).equals("**")) {
            return (i11 != this.f137321a.size() - 1 && ((String) this.f137321a.get(i11 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f137321a.equals(eVar.f137321a)) {
                return false;
            }
            f fVar = this.f137322b;
            if (fVar != null) {
                return fVar.equals(eVar.f137322b);
            }
            if (eVar.f137322b == null) {
                return true;
            }
        }
        return false;
    }

    public boolean g(String str, int i11) {
        if (f(str)) {
            return true;
        }
        if (i11 >= this.f137321a.size()) {
            return false;
        }
        return ((String) this.f137321a.get(i11)).equals(str) || ((String) this.f137321a.get(i11)).equals("**") || ((String) this.f137321a.get(i11)).equals("*");
    }

    public boolean h(String str, int i11) {
        return "__container".equals(str) || i11 < this.f137321a.size() - 1 || ((String) this.f137321a.get(i11)).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f137321a.hashCode() * 31;
        f fVar = this.f137322b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f137322b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f137321a);
        sb2.append(",resolved=");
        sb2.append(this.f137322b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f137321a = new ArrayList(eVar.f137321a);
        this.f137322b = eVar.f137322b;
    }
}
