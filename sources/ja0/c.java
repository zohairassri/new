package ja0;

import android.os.SystemClock;
import ja0.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f105351a;

    public c(d systemClock) {
        Intrinsics.checkNotNullParameter(systemClock, "systemClock");
        this.f105351a = systemClock.a() - SystemClock.elapsedRealtime();
    }

    @Override // ja0.a
    public long a() {
        return this.f105351a + SystemClock.elapsedRealtime();
    }

    @Override // ja0.a
    public long b() {
        return a.C1295a.a(this);
    }
}
