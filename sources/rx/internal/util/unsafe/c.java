package rx.internal.util.unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f125284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f125285h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final long[] f125286f;

    static {
        if (8 != z.f125296a.arrayIndexScale(long[].class)) {
            throw new IllegalStateException("Unexpected long[] element size");
        }
        f125285h = a.f125279c + 3;
        f125284g = r0.arrayBaseOffset(long[].class) + (32 << (r3 - r2));
    }

    public c(int i11) {
        super(i11);
        int i12 = (int) (this.f125282a + 1);
        this.f125286f = new long[(i12 << a.f125279c) + 64];
        for (long j11 = 0; j11 < i12; j11++) {
            v(this.f125286f, s(j11), j11);
        }
    }

    protected final long s(long j11) {
        return f125284g + ((j11 & this.f125282a) << f125285h);
    }

    protected final long u(long[] jArr, long j11) {
        return z.f125296a.getLongVolatile(jArr, j11);
    }

    protected final void v(long[] jArr, long j11, long j12) {
        z.f125296a.putOrderedLong(jArr, j11, j12);
    }
}
