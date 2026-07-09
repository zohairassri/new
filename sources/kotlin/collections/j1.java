package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class j1 extends i1 {
    public static Set e() {
        return n0.f111711a;
    }

    public static HashSet f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) t.W0(elements, new HashSet(a1.e(elements.length)));
    }

    public static Set g(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) t.W0(elements, new LinkedHashSet(a1.e(elements.length)));
    }

    public static final Set h(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : i1.d(set.iterator().next()) : e();
    }

    public static Set i(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return t.l1(elements);
    }
}
