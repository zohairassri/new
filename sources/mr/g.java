package mr;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f116915a;

    private g() {
        this.f116915a = null;
    }

    public static g a() {
        return new g();
    }

    public static g b(Object obj) {
        return obj == null ? a() : e(obj);
    }

    public static g e(Object obj) {
        return new g(obj);
    }

    public Object c() {
        Object obj = this.f116915a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f116915a != null;
    }

    private g(Object obj) {
        if (obj != null) {
            this.f116915a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
