package je0;

import be0.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ne0.p;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends AtomicReferenceArray implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Integer f105579f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f105580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicLong f105581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f105582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicLong f105583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f105584e;

    public b(int i11) {
        super(p.a(i11));
        this.f105580a = length() - 1;
        this.f105581b = new AtomicLong();
        this.f105583d = new AtomicLong();
        this.f105584e = Math.min(i11 / 4, f105579f.intValue());
    }

    int a(long j11) {
        return this.f105580a & ((int) j11);
    }

    int c(long j11, int i11) {
        return ((int) j11) & i11;
    }

    @Override // be0.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    Object d(int i11) {
        return get(i11);
    }

    void e(long j11) {
        this.f105583d.lazySet(j11);
    }

    void f(int i11, Object obj) {
        lazySet(i11, obj);
    }

    void g(long j11) {
        this.f105581b.lazySet(j11);
    }

    @Override // be0.h
    public boolean isEmpty() {
        return this.f105581b.get() == this.f105583d.get();
    }

    @Override // be0.h
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i11 = this.f105580a;
        long j11 = this.f105581b.get();
        int iC = c(j11, i11);
        if (j11 >= this.f105582c) {
            long j12 = ((long) this.f105584e) + j11;
            if (d(c(j12, i11)) == null) {
                this.f105582c = j12;
            } else if (d(iC) != null) {
                return false;
            }
        }
        f(iC, obj);
        g(j11 + 1);
        return true;
    }

    @Override // be0.g, be0.h
    public Object poll() {
        long j11 = this.f105583d.get();
        int iA = a(j11);
        Object objD = d(iA);
        if (objD == null) {
            return null;
        }
        e(j11 + 1);
        f(iA, null);
        return objD;
    }
}
