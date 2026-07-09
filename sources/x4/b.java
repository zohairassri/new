package x4;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f137022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f137023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1921b f137024c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(boolean z11);
    }

    /* JADX INFO: renamed from: x4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC1921b {
        void onActionProviderVisibilityChanged(boolean z11);
    }

    public b(Context context) {
        this.f137022a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f137024c = null;
        this.f137023b = null;
    }

    public void h(a aVar) {
        this.f137023b = aVar;
    }

    public abstract void i(InterfaceC1921b interfaceC1921b);

    public void j(boolean z11) {
        a aVar = this.f137023b;
        if (aVar != null) {
            aVar.a(z11);
        }
    }
}
