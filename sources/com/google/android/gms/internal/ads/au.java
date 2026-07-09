package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final au f23496a = new wq();

    static {
        String str = yy2.f38899a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    protected au() {
    }

    public abstract int a();

    public abstract ys b(int i11, ys ysVar, long j11);

    public abstract int c();

    public abstract xr d(int i11, xr xrVar, boolean z11);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        if (auVar.a() == a() && auVar.c() == c()) {
            ys ysVar = new ys();
            xr xrVar = new xr();
            ys ysVar2 = new ys();
            xr xrVar2 = new xr();
            for (int i11 = 0; i11 < a(); i11++) {
                if (!b(i11, ysVar, 0L).equals(auVar.b(i11, ysVar2, 0L))) {
                    return false;
                }
            }
            for (int i12 = 0; i12 < c(); i12++) {
                if (!d(i12, xrVar, true).equals(auVar.d(i12, xrVar2, true))) {
                    return false;
                }
            }
            int iK = k(true);
            if (iK == auVar.k(true) && (iJ = j(true)) == auVar.j(true)) {
                while (iK != iJ) {
                    int iH = h(iK, 0, true);
                    if (iH != auVar.h(iK, 0, true)) {
                        return false;
                    }
                    iK = iH;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i11);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == j(z11)) {
                return -1;
            }
            return i11 + 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == j(z11) ? k(z11) : i11 + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i11;
        ys ysVar = new ys();
        xr xrVar = new xr();
        int iA = a() + 217;
        int i12 = 0;
        while (true) {
            i11 = iA * 31;
            if (i12 >= a()) {
                break;
            }
            iA = i11 + b(i12, ysVar, 0L).hashCode();
            i12++;
        }
        int iC = i11 + c();
        for (int i13 = 0; i13 < c(); i13++) {
            iC = (iC * 31) + d(i13, xrVar, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public int i(int i11, int i12, boolean z11) {
        if (i11 == k(false)) {
            return -1;
        }
        return i11 - 1;
    }

    public int j(boolean z11) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z11) {
        return g() ? -1 : 0;
    }

    public final int l(int i11, xr xrVar, ys ysVar, int i12, boolean z11) {
        int i13 = d(i11, xrVar, false).f38115c;
        if (b(i13, ysVar, 0L).f38696n != i11) {
            return i11 + 1;
        }
        int iH = h(i13, i12, z11);
        if (iH == -1) {
            return -1;
        }
        return b(iH, ysVar, 0L).f38695m;
    }

    public final Pair m(ys ysVar, xr xrVar, int i11, long j11) {
        Pair pairN = n(ysVar, xrVar, i11, j11, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(ys ysVar, xr xrVar, int i11, long j11, long j12) {
        jx3.m(i11, a(), "index");
        b(i11, ysVar, j12);
        if (j11 == -9223372036854775807L) {
            long j13 = ysVar.f38693k;
            j11 = 0;
        }
        int i12 = ysVar.f38695m;
        d(i12, xrVar, false);
        while (i12 < ysVar.f38696n) {
            long j14 = xrVar.f38117e;
            if (j11 == 0) {
                break;
            }
            int i13 = i12 + 1;
            long j15 = d(i13, xrVar, false).f38117e;
            if (j11 < 0) {
                break;
            }
            i12 = i13;
        }
        d(i12, xrVar, true);
        long j16 = xrVar.f38117e;
        long j17 = xrVar.f38116d;
        if (j17 != -9223372036854775807L) {
            j11 = Math.min(j11, j17 - 1);
        }
        long jMax = Math.max(0L, j11);
        Object obj = xrVar.f38114b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public xr o(Object obj, xr xrVar) {
        return d(e(obj), xrVar, true);
    }
}
