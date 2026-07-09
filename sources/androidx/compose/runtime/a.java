package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4358d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f4360b = h5.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f4361c;

    public a(Object obj) {
        this.f4359a = obj;
        this.f4361c = obj;
    }

    @Override // androidx.compose.runtime.d
    public Object a() {
        return this.f4361c;
    }

    @Override // androidx.compose.runtime.d
    public final void clear() {
        h5.a(this.f4360b);
        n(this.f4359a);
        m();
    }

    @Override // androidx.compose.runtime.d
    public void h(Object obj) {
        h5.j(this.f4360b, a());
        n(obj);
    }

    @Override // androidx.compose.runtime.d
    public void k() {
        n(h5.i(this.f4360b));
    }

    public final Object l() {
        return this.f4359a;
    }

    protected abstract void m();

    protected void n(Object obj) {
        this.f4361c = obj;
    }
}
