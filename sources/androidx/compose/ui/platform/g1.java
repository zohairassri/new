package androidx.compose.ui.platform;

import android.view.View;
import m2.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements m2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f5696a;

    public g1(View view) {
        this.f5696a = view;
    }

    @Override // m2.a
    public void a(int i11) {
        b.a aVar = m2.b.f115471a;
        if (m2.b.b(i11, aVar.a())) {
            this.f5696a.performHapticFeedback(16);
            return;
        }
        if (m2.b.b(i11, aVar.b())) {
            this.f5696a.performHapticFeedback(6);
            return;
        }
        if (m2.b.b(i11, aVar.c())) {
            this.f5696a.performHapticFeedback(13);
            return;
        }
        if (m2.b.b(i11, aVar.d())) {
            this.f5696a.performHapticFeedback(23);
            return;
        }
        if (m2.b.b(i11, aVar.e())) {
            this.f5696a.performHapticFeedback(3);
            return;
        }
        if (m2.b.b(i11, aVar.f())) {
            this.f5696a.performHapticFeedback(0);
            return;
        }
        if (m2.b.b(i11, aVar.g())) {
            this.f5696a.performHapticFeedback(17);
            return;
        }
        if (m2.b.b(i11, aVar.h())) {
            this.f5696a.performHapticFeedback(27);
            return;
        }
        if (m2.b.b(i11, aVar.i())) {
            this.f5696a.performHapticFeedback(26);
            return;
        }
        if (m2.b.b(i11, aVar.j())) {
            this.f5696a.performHapticFeedback(9);
            return;
        }
        if (m2.b.b(i11, aVar.k())) {
            this.f5696a.performHapticFeedback(22);
        } else if (m2.b.b(i11, aVar.l())) {
            this.f5696a.performHapticFeedback(21);
        } else if (m2.b.b(i11, aVar.m())) {
            this.f5696a.performHapticFeedback(1);
        }
    }
}
