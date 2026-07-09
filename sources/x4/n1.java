package x4;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.rtc2.internal.Marshallable;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f137132a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f137133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0 f137134b;

        a(Window window, l0 l0Var) {
            this.f137133a = window;
            this.f137134b = l0Var;
        }

        private void g(int i11) {
            if (i11 == 1) {
                h(4);
            } else if (i11 == 2) {
                h(2);
            } else {
                if (i11 != 8) {
                    return;
                }
                this.f137134b.a();
            }
        }

        private void j(int i11) {
            if (i11 == 1) {
                k(4);
                l(1024);
            } else if (i11 == 2) {
                k(2);
            } else {
                if (i11 != 8) {
                    return;
                }
                this.f137134b.b();
            }
        }

        @Override // x4.n1.g
        void a(int i11) {
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    g(i12);
                }
            }
        }

        @Override // x4.n1.g
        void f(int i11) {
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    j(i12);
                }
            }
        }

        protected void h(int i11) {
            View decorView = this.f137133a.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        protected void i(int i11) {
            this.f137133a.addFlags(i11);
        }

        protected void k(int i11) {
            View decorView = this.f137133a.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        protected void l(int i11) {
            this.f137133a.clearFlags(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b extends a {
        b(Window window, l0 l0Var) {
            super(window, l0Var);
        }

        @Override // x4.n1.g
        public boolean c() {
            return (this.f137133a.getDecorView().getSystemUiVisibility() & Marshallable.PROTO_PACKET_SIZE) != 0;
        }

        @Override // x4.n1.g
        public void e(boolean z11) {
            if (!z11) {
                k(Marshallable.PROTO_PACKET_SIZE);
                return;
            }
            l(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            i(IntCompanionObject.MIN_VALUE);
            h(Marshallable.PROTO_PACKET_SIZE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c extends b {
        c(Window window, l0 l0Var) {
            super(window, l0Var);
        }

        @Override // x4.n1.g
        public boolean b() {
            return (this.f137133a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // x4.n1.g
        public void d(boolean z11) {
            if (!z11) {
                k(16);
                return;
            }
            l(134217728);
            i(IntCompanionObject.MIN_VALUE);
            h(16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class e extends d {
        e(Window window, n1 n1Var, l0 l0Var) {
            super(window, n1Var, l0Var);
        }

        e(WindowInsetsController windowInsetsController, n1 n1Var, l0 l0Var) {
            super(windowInsetsController, n1Var, l0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class f extends e {
        f(Window window, n1 n1Var, l0 l0Var) {
            super(window, n1Var, l0Var);
        }

        @Override // x4.n1.d, x4.n1.g
        public boolean b() {
            return (this.f137136b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // x4.n1.d, x4.n1.g
        public boolean c() {
            return (this.f137136b.getSystemBarsAppearance() & 8) != 0;
        }

        f(WindowInsetsController windowInsetsController, n1 n1Var, l0 l0Var) {
            super(windowInsetsController, n1Var, l0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class g {
        g() {
        }

        abstract void a(int i11);

        public abstract boolean b();

        public abstract boolean c();

        public abstract void d(boolean z11);

        public abstract void e(boolean z11);

        abstract void f(int i11);
    }

    private n1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f137132a = new f(windowInsetsController, this, new l0(windowInsetsController));
        } else {
            this.f137132a = new d(windowInsetsController, this, new l0(windowInsetsController));
        }
    }

    public static n1 g(WindowInsetsController windowInsetsController) {
        return new n1(windowInsetsController);
    }

    public void a(int i11) {
        this.f137132a.a(i11);
    }

    public boolean b() {
        return this.f137132a.b();
    }

    public boolean c() {
        return this.f137132a.c();
    }

    public void d(boolean z11) {
        this.f137132a.d(z11);
    }

    public void e(boolean z11) {
        this.f137132a.e(z11);
    }

    public void f(int i11) {
        this.f137132a.f(i11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n1 f137135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f137136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final l0 f137137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t.f1 f137138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f137139e;

        d(Window window, n1 n1Var, l0 l0Var) {
            this(window.getInsetsController(), n1Var, l0Var);
            this.f137139e = window;
        }

        @Override // x4.n1.g
        void a(int i11) {
            if ((i11 & 8) != 0) {
                this.f137137c.a();
            }
            this.f137136b.hide(i11 & (-9));
        }

        @Override // x4.n1.g
        public boolean b() {
            this.f137136b.setSystemBarsAppearance(0, 0);
            return (this.f137136b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // x4.n1.g
        public boolean c() {
            this.f137136b.setSystemBarsAppearance(0, 0);
            return (this.f137136b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // x4.n1.g
        public void d(boolean z11) {
            if (z11) {
                if (this.f137139e != null) {
                    g(16);
                }
                this.f137136b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f137139e != null) {
                    h(16);
                }
                this.f137136b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // x4.n1.g
        public void e(boolean z11) {
            if (z11) {
                if (this.f137139e != null) {
                    g(Marshallable.PROTO_PACKET_SIZE);
                }
                this.f137136b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f137139e != null) {
                    h(Marshallable.PROTO_PACKET_SIZE);
                }
                this.f137136b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // x4.n1.g
        void f(int i11) {
            if ((i11 & 8) != 0) {
                this.f137137c.b();
            }
            this.f137136b.show(i11 & (-9));
        }

        protected void g(int i11) {
            View decorView = this.f137139e.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        protected void h(int i11) {
            View decorView = this.f137139e.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, n1 n1Var, l0 l0Var) {
            this.f137138d = new t.f1();
            this.f137136b = windowInsetsController;
            this.f137135a = n1Var;
            this.f137137c = l0Var;
        }
    }

    public n1(Window window, View view) {
        l0 l0Var = new l0(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            this.f137132a = new f(window, this, l0Var);
        } else if (i11 >= 30) {
            this.f137132a = new d(window, this, l0Var);
        } else {
            this.f137132a = new c(window, l0Var);
        }
    }
}
