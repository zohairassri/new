package q0;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f122284a = new y0();

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Context context, TextClassification textClassification, MenuItem menuItem) throws PendingIntent.CanceledException {
        m0.f122224a.a(context, textClassification);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(RemoteAction remoteAction, MenuItem menuItem) throws PendingIntent.CanceledException {
        m0.f122224a.b(remoteAction.getActionIntent());
        return true;
    }

    public final void c(Menu menu, int i11, final Context context, final TextClassification textClassification) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i11, textClassification.getLabel());
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(textClassification.getIcon());
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q0.w0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return y0.d(context, textClassification, menuItem);
            }
        });
    }

    public final void e(Menu menu, int i11, Context context, TextClassification textClassification, int i12) {
        if (i12 < 0) {
            c(menu, i11, context, textClassification);
        } else {
            f(menu, i11, context, i12 == 0, textClassification.getActions().get(i12));
        }
    }

    public final void f(Menu menu, int i11, Context context, boolean z11, final RemoteAction remoteAction) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, z11 ? 16908353 : 0, i11, remoteAction.getTitle());
        menuItemAdd.setShowAsAction(z11 ? 2 : 0);
        if (z11 || remoteAction.shouldShowIcon()) {
            menuItemAdd.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q0.x0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return y0.g(remoteAction, menuItem);
            }
        });
    }
}
