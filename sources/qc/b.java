package qc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f122621a = new b();

    private b() {
    }

    public final List a(int i11, int[] stack, String[] pathNames, int[] pathIndices) {
        String str;
        Intrinsics.checkNotNullParameter(stack, "stack");
        Intrinsics.checkNotNullParameter(pathNames, "pathNames");
        Intrinsics.checkNotNullParameter(pathIndices, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = stack[i12];
            if (i13 == 1 || i13 == 2) {
                arrayList.add(Integer.valueOf(pathIndices[i12]));
            } else if ((i13 == 3 || i13 == 4 || i13 == 5) && (str = pathNames[i12]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
