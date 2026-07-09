package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {
    public static final void a(ArrayList arrayList) {
        arrayList.clear();
    }

    public static /* synthetic */ ArrayList c(ArrayList arrayList, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return b(arrayList);
    }

    public static final int d(ArrayList arrayList) {
        return arrayList.size();
    }

    public static final boolean e(ArrayList arrayList) {
        return arrayList.isEmpty();
    }

    public static final boolean f(ArrayList arrayList) {
        return !e(arrayList);
    }

    public static final Object g(ArrayList arrayList) {
        return arrayList.get(d(arrayList) - 1);
    }

    public static final Object h(ArrayList arrayList, int i11) {
        return arrayList.get(i11);
    }

    public static final Object i(ArrayList arrayList) {
        return arrayList.remove(d(arrayList) - 1);
    }

    public static final boolean j(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    public static final Object[] k(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        return objArr;
    }

    public static ArrayList b(ArrayList arrayList) {
        return arrayList;
    }
}
