package k6;

import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f107613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f107614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107616d;

    public h0() {
        this(10);
    }

    private void b(long j11, Object obj) {
        int i11 = this.f107615c;
        int i12 = this.f107616d;
        Object[] objArr = this.f107614b;
        int length = (i11 + i12) % objArr.length;
        this.f107613a[length] = j11;
        objArr[length] = obj;
        this.f107616d = i12 + 1;
    }

    private void d(long j11) {
        if (this.f107616d > 0) {
            if (j11 <= this.f107613a[((this.f107615c + r0) - 1) % this.f107614b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f107614b.length;
        if (this.f107616d < length) {
            return;
        }
        int i11 = length * 2;
        long[] jArr = new long[i11];
        Object[] objArrF = f(i11);
        int i12 = this.f107615c;
        int i13 = length - i12;
        System.arraycopy(this.f107613a, i12, jArr, 0, i13);
        System.arraycopy(this.f107614b, this.f107615c, objArrF, 0, i13);
        int i14 = this.f107615c;
        if (i14 > 0) {
            System.arraycopy(this.f107613a, 0, jArr, i13, i14);
            System.arraycopy(this.f107614b, 0, objArrF, i13, this.f107615c);
        }
        this.f107613a = jArr;
        this.f107614b = objArrF;
        this.f107615c = 0;
    }

    private static Object[] f(int i11) {
        return new Object[i11];
    }

    private Object h(long j11, boolean z11) {
        Object objK = null;
        long j12 = LongCompanionObject.MAX_VALUE;
        while (this.f107616d > 0) {
            long j13 = j11 - this.f107613a[this.f107615c];
            if (j13 < 0 && (z11 || (-j13) >= j12)) {
                break;
            }
            objK = k();
            j12 = j13;
        }
        return objK;
    }

    private Object k() {
        a.g(this.f107616d > 0);
        Object[] objArr = this.f107614b;
        int i11 = this.f107615c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f107615c = (i11 + 1) % objArr.length;
        this.f107616d--;
        return obj;
    }

    public synchronized void a(long j11, Object obj) {
        d(j11);
        e();
        b(j11, obj);
    }

    public synchronized void c() {
        this.f107615c = 0;
        this.f107616d = 0;
        Arrays.fill(this.f107614b, (Object) null);
    }

    public synchronized Object g(long j11) {
        return h(j11, false);
    }

    public synchronized Object i() {
        return this.f107616d == 0 ? null : k();
    }

    public synchronized Object j(long j11) {
        return h(j11, true);
    }

    public synchronized int l() {
        return this.f107616d;
    }

    public h0(int i11) {
        this.f107613a = new long[i11];
        this.f107614b = f(i11);
    }
}
