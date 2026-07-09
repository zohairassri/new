package gf;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f98633a;

    public e(String initialVersion) {
        Intrinsics.checkNotNullParameter(initialVersion, "initialVersion");
        this.f98633a = new AtomicReference(initialVersion);
    }

    @Override // gf.b
    public void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f98633a.set(value);
    }

    @Override // gf.b
    public String getVersion() {
        Object obj = this.f98633a.get();
        Intrinsics.checkNotNullExpressionValue(obj, "value.get()");
        return (String) obj;
    }
}
