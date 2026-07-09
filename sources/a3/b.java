package a3;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f147b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j11) {
            return contentCaptureSession.newAutofillId(autofillId, j11);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j11) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j11);
        }

        static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private b(ContentCaptureSession contentCaptureSession, View view) {
        this.f146a = contentCaptureSession;
        this.f147b = view;
    }

    public static b g(ContentCaptureSession contentCaptureSession, View view) {
        return new b(contentCaptureSession, view);
    }

    public void a() {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f146a;
        a3.a aVarA = c.a(this.f147b);
        Objects.requireNonNull(aVarA);
        a.f(contentCaptureSession, aVarA.a(), new long[]{Long.MIN_VALUE});
    }

    public AutofillId b(long j11) {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f146a;
        a3.a aVarA = c.a(this.f147b);
        Objects.requireNonNull(aVarA);
        return a.a(contentCaptureSession, aVarA.a(), j11);
    }

    public d c(AutofillId autofillId, long j11) {
        return d.i(a.b((ContentCaptureSession) this.f146a, autofillId, j11));
    }

    public void d(ViewStructure viewStructure) {
        a.c((ContentCaptureSession) this.f146a, viewStructure);
    }

    public void e(AutofillId autofillId) {
        a.d((ContentCaptureSession) this.f146a, autofillId);
    }

    public void f(AutofillId autofillId, CharSequence charSequence) {
        a.e((ContentCaptureSession) this.f146a, autofillId, charSequence);
    }
}
