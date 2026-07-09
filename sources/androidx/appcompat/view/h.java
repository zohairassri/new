package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import x4.b1;
import x4.c1;
import x4.d1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f1703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c1 f1704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1705e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1702b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d1 f1706f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f1701a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1707a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1708b = 0;

        a() {
        }

        @Override // x4.c1
        public void b(View view) {
            int i11 = this.f1708b + 1;
            this.f1708b = i11;
            if (i11 == h.this.f1701a.size()) {
                c1 c1Var = h.this.f1704d;
                if (c1Var != null) {
                    c1Var.b(null);
                }
                d();
            }
        }

        @Override // x4.d1, x4.c1
        public void c(View view) {
            if (this.f1707a) {
                return;
            }
            this.f1707a = true;
            c1 c1Var = h.this.f1704d;
            if (c1Var != null) {
                c1Var.c(null);
            }
        }

        void d() {
            this.f1708b = 0;
            this.f1707a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f1705e) {
            ArrayList arrayList = this.f1701a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((b1) obj).c();
            }
            this.f1705e = false;
        }
    }

    void b() {
        this.f1705e = false;
    }

    public h c(b1 b1Var) {
        if (!this.f1705e) {
            this.f1701a.add(b1Var);
        }
        return this;
    }

    public h d(b1 b1Var, b1 b1Var2) {
        this.f1701a.add(b1Var);
        b1Var2.i(b1Var.d());
        this.f1701a.add(b1Var2);
        return this;
    }

    public h e(long j11) {
        if (!this.f1705e) {
            this.f1702b = j11;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f1705e) {
            this.f1703c = interpolator;
        }
        return this;
    }

    public h g(c1 c1Var) {
        if (!this.f1705e) {
            this.f1704d = c1Var;
        }
        return this;
    }

    public void h() {
        if (this.f1705e) {
            return;
        }
        ArrayList arrayList = this.f1701a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b1 b1Var = (b1) obj;
            long j11 = this.f1702b;
            if (j11 >= 0) {
                b1Var.e(j11);
            }
            Interpolator interpolator = this.f1703c;
            if (interpolator != null) {
                b1Var.f(interpolator);
            }
            if (this.f1704d != null) {
                b1Var.g(this.f1706f);
            }
            b1Var.k();
        }
        this.f1705e = true;
    }
}
