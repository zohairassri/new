package v3;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f132458a = CollectionsKt.e("TransformOriginInterruptionHandling");

    public static final long a(long j11) {
        return j11 * 1000000;
    }

    public static final long b(long j11) {
        return (j11 + ((long) 999999)) / ((long) 1000000);
    }
}
