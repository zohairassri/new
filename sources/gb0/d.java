package gb0;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f98451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f98452b;

    public d(Function0 getConfigLogLimit) {
        Intrinsics.checkNotNullParameter(getConfigLogLimit, "getConfigLogLimit");
        this.f98451a = getConfigLogLimit;
        this.f98452b = new AtomicInteger(0);
    }

    public final boolean a() {
        if (this.f98452b.get() >= ((Number) this.f98451a.invoke()).intValue()) {
            return false;
        }
        this.f98452b.incrementAndGet();
        return true;
    }

    public final void b() {
        this.f98452b.set(0);
    }

    public final int c() {
        return this.f98452b.get();
    }
}
