package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class y {
    public static List a(List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((xe0.b) builder).A();
    }

    public static final Object[] b(Object[] objArr, boolean z11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (z11 && Intrinsics.areEqual(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new xe0.b(0, 1, null);
    }

    public static List d(int i11) {
        return new xe0.b(i11);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List f(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        List listK1 = CollectionsKt___CollectionsKt.k1(iterable);
        Collections.shuffle(listK1);
        return listK1;
    }

    public static Object[] g(int i11, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
