package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8573a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f8573a.values().iterator();
        while (it.hasNext()) {
            ((t0) it.next()).u2();
        }
        this.f8573a.clear();
    }

    public final t0 b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (t0) this.f8573a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f8573a.keySet());
    }

    public final void d(String key, t0 viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        t0 t0Var = (t0) this.f8573a.put(key, viewModel);
        if (t0Var != null) {
            t0Var.u2();
        }
    }
}
