package rx.internal.util.unsafe;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f125279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f125280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f125281e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final long f125282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object[] f125283b;

    static {
        int iIntValue = Integer.getInteger("sparse.shift", 0).intValue();
        f125279c = iIntValue;
        int iArrayIndexScale = z.f125296a.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            f125281e = iIntValue + 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            f125281e = iIntValue + 3;
        }
        f125280d = r1.arrayBaseOffset(Object[].class) + (32 << (f125281e - iIntValue));
    }

    public a(int i11) {
        int iA = j.a(i11);
        this.f125282a = iA - 1;
        this.f125283b = new Object[(iA << f125279c) + 64];
    }

    protected final long a(long j11) {
        return b(j11, this.f125282a);
    }

    protected final long b(long j11, long j12) {
        return f125280d + ((j11 & j12) << f125281e);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    protected final Object d(long j11) {
        return e(this.f125283b, j11);
    }

    protected final Object e(Object[] objArr, long j11) {
        return z.f125296a.getObject(objArr, j11);
    }

    protected final Object i(long j11) {
        return j(this.f125283b, j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    protected final Object j(Object[] objArr, long j11) {
        return z.f125296a.getObjectVolatile(objArr, j11);
    }

    protected final void l(Object[] objArr, long j11, Object obj) {
        z.f125296a.putOrderedObject(objArr, j11, obj);
    }

    protected final void m(long j11, Object obj) {
        p(this.f125283b, j11, obj);
    }

    protected final void p(Object[] objArr, long j11, Object obj) {
        z.f125296a.putObject(objArr, j11, obj);
    }
}
