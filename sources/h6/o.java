package h6;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f100162a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f100163a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f100164b;

        public b a(int i11) {
            k6.a.g(!this.f100164b);
            this.f100163a.append(i11, true);
            return this;
        }

        public b b(o oVar) {
            for (int i11 = 0; i11 < oVar.d(); i11++) {
                a(oVar.c(i11));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i11 : iArr) {
                a(i11);
            }
            return this;
        }

        public b d(int i11, boolean z11) {
            return z11 ? a(i11) : this;
        }

        public o e() {
            k6.a.g(!this.f100164b);
            this.f100164b = true;
            return new o(this.f100163a);
        }
    }

    public boolean a(int i11) {
        return this.f100162a.get(i11);
    }

    public boolean b(int... iArr) {
        for (int i11 : iArr) {
            if (a(i11)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i11) {
        k6.a.c(i11, 0, d());
        return this.f100162a.keyAt(i11);
    }

    public int d() {
        return this.f100162a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f100162a.equals(((o) obj).f100162a);
        }
        return false;
    }

    public int hashCode() {
        return this.f100162a.hashCode();
    }

    private o(SparseBooleanArray sparseBooleanArray) {
        this.f100162a = sparseBooleanArray;
    }
}
