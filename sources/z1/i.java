package z1;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f141614a = new i();

    private i() {
    }

    public final void a(View view, AutofillManager autofillManager, int i11, boolean z11) {
        autofillManager.notifyViewVisibilityChanged(view, i11, z11);
    }
}
