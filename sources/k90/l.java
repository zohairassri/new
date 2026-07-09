package k90;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fb0.a f110090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f110091b;

    public l(fb0.a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f110090a = logger;
        this.f110091b = new AtomicBoolean(false);
    }

    public final AtomicBoolean a() {
        return this.f110091b;
    }

    public final boolean b() {
        if (this.f110091b.get()) {
            return true;
        }
        synchronized (this.f110091b) {
            if (!this.f110091b.get()) {
                try {
                    try {
                        o.e("load-embrace-native-lib");
                        System.loadLibrary("embrace-native");
                        Unit unit = Unit.f111650a;
                        o.c();
                        this.f110091b.set(true);
                    } catch (UnsatisfiedLinkError e11) {
                        this.f110090a.d("Failed to load SO file embrace-native", e11);
                        return false;
                    }
                } finally {
                }
            }
        }
        return true;
    }
}
