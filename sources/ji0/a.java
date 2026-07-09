package ji0;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static long a(long j11, long j12) {
        long j13 = j11 + j12;
        return j13 < 0 ? LongCompanionObject.MAX_VALUE : j13;
    }

    public static long b(AtomicLong atomicLong, long j11) {
        long j12;
        do {
            j12 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j12, a(j12, j11)));
        return j12;
    }

    public static long c(AtomicLong atomicLong, long j11) {
        long j12;
        long j13;
        do {
            j12 = atomicLong.get();
            if (j12 == LongCompanionObject.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
            j13 = j12 - j11;
            if (j13 < 0) {
                throw new IllegalStateException("More produced than requested: " + j13);
            }
        } while (!atomicLong.compareAndSet(j12, j13));
        return j13;
    }
}
