package xe0;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final Object[] d(int i11) {
        if (i11 >= 0) {
            return new Object[i11];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] objArr, int i11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void f(Object[] objArr, int i11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i11] = null;
    }

    public static final void g(Object[] objArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i11 < i12) {
            f(objArr, i11);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Object[] objArr, int i11, int i12, List list) {
        if (i12 != list.size()) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!Intrinsics.areEqual(objArr[i11 + i13], list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Object[] objArr, int i11, int i12) {
        int iHashCode = 1;
        for (int i13 = 0; i13 < i12; i13++) {
            Object obj = objArr[i11 + i13];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Object[] objArr, int i11, int i12, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i11 + i13];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
