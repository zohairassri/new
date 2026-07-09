package z1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f141613a = new h();

    private h() {
    }

    public final void A(ViewStructure viewStructure, int i11) {
        viewStructure.setVisibility(i11);
    }

    public final CharSequence B(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public final int a(ViewStructure viewStructure, int i11) {
        return viewStructure.addChildCount(i11);
    }

    public final AutofillValue b(String str) {
        return AutofillValue.forText(str);
    }

    public final boolean c(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean d(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean e(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean f(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final ViewStructure g(ViewStructure viewStructure, int i11) {
        return viewStructure.newChild(i11);
    }

    public final void h(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void i(ViewStructure viewStructure, AutofillId autofillId, int i11) {
        viewStructure.setAutofillId(autofillId, i11);
    }

    public final void j(ViewStructure viewStructure, int i11) {
        viewStructure.setAutofillType(i11);
    }

    public final void k(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public final void l(ViewStructure viewStructure, boolean z11) {
        viewStructure.setCheckable(z11);
    }

    public final void m(ViewStructure viewStructure, boolean z11) {
        viewStructure.setChecked(z11);
    }

    public final void n(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public final void o(ViewStructure viewStructure, boolean z11) {
        viewStructure.setClickable(z11);
    }

    public final void p(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public final void q(ViewStructure viewStructure, boolean z11) {
        viewStructure.setDataIsSensitive(z11);
    }

    public final void r(ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
        viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
    }

    public final void s(ViewStructure viewStructure, boolean z11) {
        viewStructure.setEnabled(z11);
    }

    public final void t(ViewStructure viewStructure, boolean z11) {
        viewStructure.setFocusable(z11);
    }

    public final void u(ViewStructure viewStructure, boolean z11) {
        viewStructure.setFocused(z11);
    }

    public final void v(ViewStructure viewStructure, int i11, String str, String str2, String str3) {
        viewStructure.setId(i11, str, str2, str3);
    }

    public final void w(ViewStructure viewStructure, int i11) {
        viewStructure.setInputType(i11);
    }

    public final void x(ViewStructure viewStructure, boolean z11) {
        viewStructure.setLongClickable(z11);
    }

    public final void y(ViewStructure viewStructure, boolean z11) {
        viewStructure.setSelected(z11);
    }

    public final void z(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }
}
