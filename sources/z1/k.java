package z1;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f141616a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141617b = 8;

    private k() {
    }

    public final void a(a aVar) {
        aVar.a().registerCallback(this);
    }

    public final void b(a aVar) {
        aVar.a().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i11, int i12) {
        super.onAutofillEvent(view, i11, i12);
    }
}
