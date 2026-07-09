package wj;

import android.util.SparseArray;
import java.util.HashMap;
import jj.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f135571a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f135572b;

    static {
        HashMap map = new HashMap();
        f135572b = map;
        map.put(d.DEFAULT, 0);
        f135572b.put(d.VERY_LOW, 1);
        f135572b.put(d.HIGHEST, 2);
        for (d dVar : f135572b.keySet()) {
            f135571a.append(((Integer) f135572b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f135572b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i11) {
        d dVar = (d) f135571a.get(i11);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i11);
    }
}
