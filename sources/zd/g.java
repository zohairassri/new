package zd;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f142257a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j11) {
        return (b() - j11) * f142257a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
