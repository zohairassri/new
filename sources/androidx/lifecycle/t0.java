package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    private final f6.g impl = new f6.g();

    public /* synthetic */ void s2(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        f6.g gVar = this.impl;
        if (gVar != null) {
            gVar.d(closeable);
        }
    }

    public final void t2(String key, AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        f6.g gVar = this.impl;
        if (gVar != null) {
            gVar.e(key, closeable);
        }
    }

    public final void u2() {
        f6.g gVar = this.impl;
        if (gVar != null) {
            gVar.f();
        }
        w2();
    }

    public final AutoCloseable v2(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f6.g gVar = this.impl;
        if (gVar != null) {
            return gVar.h(key);
        }
        return null;
    }

    protected void w2() {
    }
}
