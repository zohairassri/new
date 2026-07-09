package tg;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g {
    public static final f a(long j11) {
        f fVar = new f(0L, 0L, 3, null);
        return new f(j11, TimeUnit.MILLISECONDS.toNanos(j11 - fVar.b()) + fVar.a());
    }
}
