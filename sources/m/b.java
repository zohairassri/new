package m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import t.f1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f115378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1 f115379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1 f115380c;

    b(Context context) {
        this.f115378a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof q4.b)) {
            return menuItem;
        }
        q4.b bVar = (q4.b) menuItem;
        if (this.f115379b == null) {
            this.f115379b = new f1();
        }
        MenuItem menuItem2 = (MenuItem) this.f115379b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f115378a, bVar);
        this.f115379b.put(bVar, cVar);
        return cVar;
    }

    final void e() {
        f1 f1Var = this.f115379b;
        if (f1Var != null) {
            f1Var.clear();
        }
        f1 f1Var2 = this.f115380c;
        if (f1Var2 != null) {
            f1Var2.clear();
        }
    }

    final void f(int i11) {
        if (this.f115379b == null) {
            return;
        }
        int i12 = 0;
        while (i12 < this.f115379b.size()) {
            if (((q4.b) this.f115379b.h(i12)).getGroupId() == i11) {
                this.f115379b.j(i12);
                i12--;
            }
            i12++;
        }
    }

    final void g(int i11) {
        if (this.f115379b == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f115379b.size(); i12++) {
            if (((q4.b) this.f115379b.h(i12)).getItemId() == i11) {
                this.f115379b.j(i12);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
