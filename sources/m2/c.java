package m2;

import android.view.View;
import m2.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f115472a;

    public c(View view) {
        this.f115472a = view;
    }

    @Override // m2.a
    public void a(int i11) {
        b.a aVar = b.f115471a;
        if (b.b(i11, aVar.a())) {
            this.f115472a.performHapticFeedback(16);
            return;
        }
        if (b.b(i11, aVar.b())) {
            this.f115472a.performHapticFeedback(6);
            return;
        }
        if (b.b(i11, aVar.c())) {
            this.f115472a.performHapticFeedback(13);
            return;
        }
        if (b.b(i11, aVar.d())) {
            this.f115472a.performHapticFeedback(23);
            return;
        }
        if (b.b(i11, aVar.e())) {
            this.f115472a.performHapticFeedback(3);
            return;
        }
        if (b.b(i11, aVar.f())) {
            this.f115472a.performHapticFeedback(0);
            return;
        }
        if (b.b(i11, aVar.g())) {
            this.f115472a.performHapticFeedback(17);
            return;
        }
        if (b.b(i11, aVar.h())) {
            this.f115472a.performHapticFeedback(27);
            return;
        }
        if (b.b(i11, aVar.i())) {
            this.f115472a.performHapticFeedback(26);
            return;
        }
        if (b.b(i11, aVar.j())) {
            this.f115472a.performHapticFeedback(9);
            return;
        }
        if (b.b(i11, aVar.k())) {
            this.f115472a.performHapticFeedback(22);
        } else if (b.b(i11, aVar.l())) {
            this.f115472a.performHapticFeedback(21);
        } else if (b.b(i11, aVar.m())) {
            this.f115472a.performHapticFeedback(1);
        }
    }
}
