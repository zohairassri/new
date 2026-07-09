package o;

import java.util.HashMap;
import java.util.Map;
import o.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f119874e = new HashMap();

    @Override // o.b
    protected b.c b(Object obj) {
        return (b.c) this.f119874e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f119874e.containsKey(obj);
    }

    @Override // o.b
    public Object j(Object obj, Object obj2) {
        b.c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f119880b;
        }
        this.f119874e.put(obj, i(obj, obj2));
        return null;
    }

    @Override // o.b
    public Object l(Object obj) {
        Object objL = super.l(obj);
        this.f119874e.remove(obj);
        return objL;
    }

    public Map.Entry m(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f119874e.get(obj)).f119882d;
        }
        return null;
    }
}
