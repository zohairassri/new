package z1;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f141594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f141595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f141596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AutofillId f141597d;

    public a(View view, m mVar) {
        this.f141594a = view;
        this.f141595b = mVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f141596c = autofillManager;
        view.setImportantForAutofill(1);
        a3.a aVarA = a3.c.a(view);
        AutofillId autofillIdA = aVarA != null ? aVarA.a() : null;
        if (autofillIdA != null) {
            this.f141597d = autofillIdA;
        } else {
            u2.a.c("Required value was null.");
            throw new KotlinNothingValueException();
        }
    }

    public final AutofillManager a() {
        return this.f141596c;
    }

    public final m b() {
        return this.f141595b;
    }

    public final AutofillId c() {
        return this.f141597d;
    }

    public final View d() {
        return this.f141594a;
    }
}
