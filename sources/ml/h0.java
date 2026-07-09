package ml;

import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f116776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f116777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f116778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f116779d;

    public h0() {
        this(10);
    }

    private void b(long j11, Object obj) {
        int i11 = this.f116778c;
        int i12 = this.f116779d;
        Object[] objArr = this.f116777b;
        int length = (i11 + i12) % objArr.length;
        this.f116776a[length] = j11;
        objArr[length] = obj;
        this.f116779d = i12 + 1;
    }

    private void d(long j11) {
        if (this.f116779d > 0) {
            if (j11 <= this.f116776a[((this.f116778c + r0) - 1) % this.f116777b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f116777b.length;
        if (this.f116779d < length) {
            return;
        }
        int i11 = length * 2;
        long[] jArr = new long[i11];
        Object[] objArrF = f(i11);
        int i12 = this.f116778c;
        int i13 = length - i12;
        System.arraycopy(this.f116776a, i12, jArr, 0, i13);
        System.arraycopy(this.f116777b, this.f116778c, objArrF, 0, i13);
        int i14 = this.f116778c;
        if (i14 > 0) {
            System.arraycopy(this.f116776a, 0, jArr, i13, i14);
            System.arraycopy(this.f116777b, 0, objArrF, i13, this.f116778c);
        }
        this.f116776a = jArr;
        this.f116777b = objArrF;
        this.f116778c = 0;
    }

    private static Object[] f(int i11) {
        return new Object[i11];
    }

    private Object h(long j11, boolean z11) {
        Object objK = null;
        long j12 = LongCompanionObject.MAX_VALUE;
        while (this.f116779d > 0) {
            long j13 = j11 - this.f116776a[this.f116778c];
            if (j13 < 0 && (z11 || (-j13) >= j12)) {
                break;
            }
            objK = k();
            j12 = j13;
        }
        return objK;
    }

    private Object k() {
        a.f(this.f116779d > 0);
        Object[] objArr = this.f116777b;
        int i11 = this.f116778c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f116778c = (i11 + 1) % objArr.length;
        this.f116779d--;
        return obj;
    }

    public synchronized void a(long j11, Object obj) {
        d(j11);
        e();
        b(j11, obj);
    }

    public synchronized void c() {
        this.f116778c = 0;
        this.f116779d = 0;
        Arrays.fill(this.f116777b, (Object) null);
    }

    public synchronized Object g(long j11) {
        return h(j11, false);
    }

    public synchronized Object i() {
        return this.f116779d == 0 ? null : k();
    }

    public synchronized Object j(long j11) {
        return h(j11, true);
    }

    public synchronized int l() {
        return this.f116779d;
    }

    public h0(int i11) {
        this.f116776a = new long[i11];
        this.f116777b = f(i11);
    }
}
