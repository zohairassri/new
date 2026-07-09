package n30;

import android.view.View;
import android.widget.AdapterView;
import g5.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
public final class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f117298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f117299b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void f(int i11, AdapterView adapterView, View view, int i12, long j11);
    }

    public c(a aVar, int i11) {
        this.f117298a = aVar;
        this.f117299b = i11;
    }

    @Override // g5.b.a
    public void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
        this.f117298a.f(this.f117299b, adapterView, view, i11, j11);
    }
}
