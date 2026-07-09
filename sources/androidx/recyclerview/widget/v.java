package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f12268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f12269b = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12270a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12274e;

        a() {
        }

        void a(int i11) {
            this.f12270a = i11 | this.f12270a;
        }

        boolean b() {
            int i11 = this.f12270a;
            if ((i11 & 7) != 0 && (i11 & c(this.f12273d, this.f12271b)) == 0) {
                return false;
            }
            int i12 = this.f12270a;
            if ((i12 & 112) != 0 && (i12 & (c(this.f12273d, this.f12272c) << 4)) == 0) {
                return false;
            }
            int i13 = this.f12270a;
            if ((i13 & 1792) != 0 && (i13 & (c(this.f12274e, this.f12271b) << 8)) == 0) {
                return false;
            }
            int i14 = this.f12270a;
            return (i14 & 28672) == 0 || ((c(this.f12274e, this.f12272c) << 12) & i14) != 0;
        }

        int c(int i11, int i12) {
            if (i11 > i12) {
                return 1;
            }
            return i11 == i12 ? 2 : 4;
        }

        void d() {
            this.f12270a = 0;
        }

        void e(int i11, int i12, int i13, int i14) {
            this.f12271b = i11;
            this.f12272c = i12;
            this.f12273d = i13;
            this.f12274e = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface b {
        View a(int i11);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    v(b bVar) {
        this.f12268a = bVar;
    }

    View a(int i11, int i12, int i13, int i14) {
        int iC = this.f12268a.c();
        int iD = this.f12268a.d();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        while (i11 != i12) {
            View viewA = this.f12268a.a(i11);
            this.f12269b.e(iC, iD, this.f12268a.b(viewA), this.f12268a.e(viewA));
            if (i13 != 0) {
                this.f12269b.d();
                this.f12269b.a(i13);
                if (this.f12269b.b()) {
                    return viewA;
                }
            }
            if (i14 != 0) {
                this.f12269b.d();
                this.f12269b.a(i14);
                if (this.f12269b.b()) {
                    view = viewA;
                }
            }
            i11 += i15;
        }
        return view;
    }

    boolean b(View view, int i11) {
        this.f12269b.e(this.f12268a.c(), this.f12268a.d(), this.f12268a.b(view), this.f12268a.e(view));
        if (i11 == 0) {
            return false;
        }
        this.f12269b.d();
        this.f12269b.a(i11);
        return this.f12269b.b();
    }
}
