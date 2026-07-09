package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataSetObservable f13202a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f13203b;

    public abstract void a(ViewGroup viewGroup, int i11, Object obj);

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public int e(Object obj) {
        return -1;
    }

    public abstract CharSequence f(int i11);

    public float g(int i11) {
        return 1.0f;
    }

    public abstract Object h(ViewGroup viewGroup, int i11);

    public abstract boolean i(View view, Object obj);

    public void j(DataSetObserver dataSetObserver) {
        this.f13202a.registerObserver(dataSetObserver);
    }

    public Parcelable l() {
        return null;
    }

    public void n(ViewGroup viewGroup, int i11, Object obj) {
        m(viewGroup, i11, obj);
    }

    void o(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f13203b = dataSetObserver;
        }
    }

    public void q(ViewGroup viewGroup) {
        p(viewGroup);
    }

    public void r(DataSetObserver dataSetObserver) {
        this.f13202a.unregisterObserver(dataSetObserver);
    }

    public void b(View view) {
    }

    public void p(View view) {
    }

    public void k(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void m(View view, int i11, Object obj) {
    }
}
