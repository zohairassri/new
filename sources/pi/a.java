package pi;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static long a() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static long b() {
        return System.nanoTime();
    }

    public static long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
