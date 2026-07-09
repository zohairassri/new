package k90;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements rc0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja0.a f110088a;

    public j(ja0.a embraceClock) {
        Intrinsics.checkNotNullParameter(embraceClock, "embraceClock");
        this.f110088a = embraceClock;
    }

    @Override // rc0.b
    public long a() {
        return this.f110088a.b();
    }

    @Override // rc0.b
    public long nanoTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
