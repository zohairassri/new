package k90;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f110089a = new HashMap();

    public final boolean a(String string, Set patternSet) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(patternSet, "patternSet");
        Map map = this.f110089a;
        Object obj = map.get(patternSet);
        if (obj == null) {
            Set set = patternSet;
            ArrayList arrayList = new ArrayList(CollectionsKt.z(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Pattern.compile((String) it.next()));
            }
            map.put(patternSet, arrayList);
            obj = arrayList;
        }
        Collection collection = (Collection) obj;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (((Pattern) it2.next()).matcher(string).matches()) {
                return true;
            }
        }
        return false;
    }
}
