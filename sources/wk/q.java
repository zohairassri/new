package wk;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f135806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f135807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f135808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f135809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f135810e;

    public q(Object obj) {
        this(obj, -1L);
    }

    public q a(Object obj) {
        return this.f135806a.equals(obj) ? this : new q(obj, this.f135807b, this.f135808c, this.f135809d, this.f135810e);
    }

    public boolean b() {
        return this.f135807b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f135806a.equals(qVar.f135806a) && this.f135807b == qVar.f135807b && this.f135808c == qVar.f135808c && this.f135809d == qVar.f135809d && this.f135810e == qVar.f135810e;
    }

    public int hashCode() {
        return ((((((((527 + this.f135806a.hashCode()) * 31) + this.f135807b) * 31) + this.f135808c) * 31) + ((int) this.f135809d)) * 31) + this.f135810e;
    }

    public q(Object obj, long j11) {
        this(obj, -1, -1, j11, -1);
    }

    public q(Object obj, long j11, int i11) {
        this(obj, -1, -1, j11, i11);
    }

    public q(Object obj, int i11, int i12, long j11) {
        this(obj, i11, i12, j11, -1);
    }

    protected q(q qVar) {
        this.f135806a = qVar.f135806a;
        this.f135807b = qVar.f135807b;
        this.f135808c = qVar.f135808c;
        this.f135809d = qVar.f135809d;
        this.f135810e = qVar.f135810e;
    }

    private q(Object obj, int i11, int i12, long j11, int i13) {
        this.f135806a = obj;
        this.f135807b = i11;
        this.f135808c = i12;
        this.f135809d = j11;
        this.f135810e = i13;
    }
}
