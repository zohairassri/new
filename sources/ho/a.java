package ho;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f102511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1213a f102512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102513c;

    /* JADX INFO: renamed from: ho.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC1213a {
        void a(Typeface typeface);
    }

    public a(InterfaceC1213a interfaceC1213a, Typeface typeface) {
        this.f102511a = typeface;
        this.f102512b = interfaceC1213a;
    }

    private void d(Typeface typeface) {
        if (this.f102513c) {
            return;
        }
        this.f102512b.a(typeface);
    }

    @Override // ho.f
    public void a(int i11) {
        d(this.f102511a);
    }

    @Override // ho.f
    public void b(Typeface typeface, boolean z11) {
        d(typeface);
    }

    public void c() {
        this.f102513c = true;
    }
}
