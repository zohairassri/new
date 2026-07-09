package ka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f110137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f110138b;

    static {
        String strI = androidx.work.z.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WrkDbPathHelper\")");
        f110137a = strI;
        f110138b = new String[]{"-journal", "-shm", "-wal"};
    }
}
