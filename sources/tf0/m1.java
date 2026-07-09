package tf0;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yf0.e0 f130005a = new yf0.e0("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final yf0.e0 f130006b = new yf0.e0("CLOSED_EMPTY");

    public static final long c(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        return j11 >= 9223372036854L ? LongCompanionObject.MAX_VALUE : j11 * 1000000;
    }
}
