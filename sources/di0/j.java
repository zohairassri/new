package di0;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class j extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f89988b = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((String) entry2.getKey()).length() - ((String) entry.getKey()).length();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f89989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f89990b;

        b(Map map) {
            this.f89989a = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (k kVar : map.keySet()) {
                HashMap map3 = new HashMap();
                for (Map.Entry entry : ((Map) map.get(kVar)).entrySet()) {
                    map3.put(entry.getValue(), j.e(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(map3.values());
                Collections.sort(arrayList2, j.f89988b);
                map2.put(kVar, arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Collections.sort(arrayList, j.f89988b);
            this.f89990b = map2;
        }

        String a(long j11, k kVar) {
            Map map = (Map) this.f89989a.get(kVar);
            if (map != null) {
                return (String) map.get(Long.valueOf(j11));
            }
            return null;
        }

        Iterator b(k kVar) {
            List list = (List) this.f89990b.get(kVar);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry e(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
