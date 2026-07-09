package z1;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AutofillManager f141653a;

    public s(AutofillManager autofillManager) {
        this.f141653a = autofillManager;
    }

    @Override // z1.r
    public void a(View view, int i11, AutofillValue autofillValue) {
        this.f141653a.notifyValueChanged(view, i11, autofillValue);
    }

    @Override // z1.r
    public void b(View view, int i11) {
        this.f141653a.notifyViewExited(view, i11);
    }

    @Override // z1.r
    public void c(View view, int i11, Rect rect) {
        this.f141653a.requestAutofill(view, i11, rect);
    }

    @Override // z1.r
    public void commit() {
        this.f141653a.commit();
    }

    @Override // z1.r
    public void d(View view, int i11, boolean z11) {
        i.f141614a.a(view, this.f141653a, i11, z11);
    }

    @Override // z1.r
    public void e(View view, int i11, Rect rect) {
        this.f141653a.notifyViewEntered(view, i11, rect);
    }
}
