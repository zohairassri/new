package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f90619a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f90620b;

    public final void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f90620b;
        if (context != null) {
            listener.a(context);
        }
        this.f90619a.add(listener);
    }

    public final void b() {
        this.f90620b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f90620b = context;
        Iterator it = this.f90619a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f90620b;
    }

    public final void e(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f90619a.remove(listener);
    }
}
