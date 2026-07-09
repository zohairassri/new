package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import w.c1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f8433a;

    public c(Object obj) {
        this.f8433a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return c1.a(this.f8433a, obj, obj2);
    }

    public final Object b() {
        return this.f8433a.get();
    }
}
