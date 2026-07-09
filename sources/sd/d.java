package sd;

import android.content.Context;
import sd.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f126433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b.a f126434b;

    d(Context context, b.a aVar) {
        this.f126433a = context.getApplicationContext();
        this.f126434b = aVar;
    }

    private void e() {
        r.a(this.f126433a).d(this.f126434b);
    }

    private void g() {
        r.a(this.f126433a).e(this.f126434b);
    }

    @Override // sd.l
    public void a() {
        g();
    }

    @Override // sd.l
    public void c() {
        e();
    }

    @Override // sd.l
    public void onDestroy() {
    }
}
