package mi0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Integer f116348g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicLong f116349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f116350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicLong f116351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f116352f;

    public b(int i11) {
        super(i11);
        this.f116349c = new AtomicLong();
        this.f116351e = new AtomicLong();
        this.f116352f = Math.min(i11 / 4, f116348g.intValue());
    }

    private long j() {
        return this.f116351e.get();
    }

    private long l() {
        return this.f116349c.get();
    }

    private void m(long j11) {
        this.f116351e.lazySet(j11);
    }

    private void p(long j11) {
        this.f116349c.lazySet(j11);
    }

    @Override // mi0.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return l() == j();
    }

    @Override // mi0.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f116346a;
        int i11 = this.f116347b;
        long j11 = this.f116349c.get();
        int iB = b(j11, i11);
        if (j11 >= this.f116350d) {
            long j12 = ((long) this.f116352f) + j11;
            if (e(atomicReferenceArray, b(j12, i11)) == null) {
                this.f116350d = j12;
            } else if (e(atomicReferenceArray, iB) != null) {
                return false;
            }
        }
        p(j11 + 1);
        i(atomicReferenceArray, iB, obj);
        return true;
    }

    @Override // java.util.Queue
    public Object peek() {
        return d(a(this.f116351e.get()));
    }

    @Override // java.util.Queue
    public Object poll() {
        long j11 = this.f116351e.get();
        int iA = a(j11);
        AtomicReferenceArray atomicReferenceArray = this.f116346a;
        Object objE = e(atomicReferenceArray, iA);
        if (objE == null) {
            return null;
        }
        m(j11 + 1);
        i(atomicReferenceArray, iA, null);
        return objE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long j11 = j();
        while (true) {
            long jL = l();
            long j12 = j();
            if (j11 == j12) {
                return (int) (jL - j12);
            }
            j11 = j12;
        }
    }
}
