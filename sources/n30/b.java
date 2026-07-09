package n30;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f117296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f117297b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(int i11, View view);
    }

    public b(a aVar, int i11) {
        this.f117296a = aVar;
        this.f117297b = i11;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f117296a.a(this.f117297b, view);
    }
}
