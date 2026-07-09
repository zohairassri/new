package s70;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC1693a f125659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f125660b;

    /* JADX INFO: renamed from: s70.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC1693a {
        void a(int i11, View view);
    }

    public a(InterfaceC1693a interfaceC1693a, int i11) {
        this.f125659a = interfaceC1693a;
        this.f125660b = i11;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f125659a.a(this.f125660b, view);
    }
}
