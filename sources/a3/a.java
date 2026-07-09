package a3;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f145a;

    private a(AutofillId autofillId) {
        this.f145a = autofillId;
    }

    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f145a;
    }
}
