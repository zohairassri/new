package ja0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final long a(long j11) {
        return TimeUnit.MILLISECONDS.toNanos(j11);
    }

    public static final long b(long j11) {
        return TimeUnit.NANOSECONDS.toMillis(j11);
    }

    public static final long c(long j11) {
        return j11 < 95617584000000L ? j11 : b(j11);
    }
}
