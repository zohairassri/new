package q6;

import android.util.Pair;
import h6.z;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends h6.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f122432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b7.t f122433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f122434g;

    public a(boolean z11, b7.t tVar) {
        this.f122434g = z11;
        this.f122433f = tVar;
        this.f122432e = tVar.getLength();
    }

    private int B(int i11, boolean z11) {
        if (z11) {
            return this.f122433f.c(i11);
        }
        if (i11 < this.f122432e - 1) {
            return i11 + 1;
        }
        return -1;
    }

    private int C(int i11, boolean z11) {
        if (z11) {
            return this.f122433f.b(i11);
        }
        if (i11 > 0) {
            return i11 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i11);

    protected abstract h6.z D(int i11);

    @Override // h6.z
    public int a(boolean z11) {
        if (this.f122432e == 0) {
            return -1;
        }
        if (this.f122434g) {
            z11 = false;
        }
        int iF = z11 ? this.f122433f.f() : 0;
        while (D(iF).q()) {
            iF = B(iF, z11);
            if (iF == -1) {
                return -1;
            }
        }
        return A(iF) + D(iF).a(z11);
    }

    @Override // h6.z
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // h6.z
    public int c(boolean z11) {
        int i11 = this.f122432e;
        if (i11 == 0) {
            return -1;
        }
        if (this.f122434g) {
            z11 = false;
        }
        int iD = z11 ? this.f122433f.d() : i11 - 1;
        while (D(iD).q()) {
            iD = C(iD, z11);
            if (iD == -1) {
                return -1;
            }
        }
        return A(iD) + D(iD).c(z11);
    }

    @Override // h6.z
    public int e(int i11, int i12, boolean z11) {
        if (this.f122434g) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int iU = u(i11);
        int iA = A(iU);
        int iE = D(iU).e(i11 - iA, i12 != 2 ? i12 : 0, z11);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z11);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z11);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z11);
        }
        if (i12 == 2) {
            return a(z11);
        }
        return -1;
    }

    @Override // h6.z
    public final z.b g(int i11, z.b bVar, boolean z11) {
        int iT = t(i11);
        int iA = A(iT);
        D(iT).g(i11 - z(iT), bVar, z11);
        bVar.f100437c += iA;
        if (z11) {
            bVar.f100436b = y(x(iT), k6.a.e(bVar.f100436b));
        }
        return bVar;
    }

    @Override // h6.z
    public final z.b h(Object obj, z.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f100437c += iA;
        bVar.f100436b = obj;
        return bVar;
    }

    @Override // h6.z
    public int l(int i11, int i12, boolean z11) {
        if (this.f122434g) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int iU = u(i11);
        int iA = A(iU);
        int iL = D(iU).l(i11 - iA, i12 != 2 ? i12 : 0, z11);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z11);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z11);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z11);
        }
        if (i12 == 2) {
            return c(z11);
        }
        return -1;
    }

    @Override // h6.z
    public final Object m(int i11) {
        int iT = t(i11);
        return y(x(iT), D(iT).m(i11 - z(iT)));
    }

    @Override // h6.z
    public final z.c o(int i11, z.c cVar, long j11) {
        int iU = u(i11);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i11 - iA, cVar, j11);
        Object objX = x(iU);
        if (!z.c.f100442q.equals(cVar.f100452a)) {
            objX = y(objX, cVar.f100452a);
        }
        cVar.f100452a = objX;
        cVar.f100465n += iZ;
        cVar.f100466o += iZ;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i11);

    protected abstract int u(int i11);

    protected abstract Object x(int i11);

    protected abstract int z(int i11);
}
