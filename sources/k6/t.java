package k6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f107677b;

    public t() {
        this(32);
    }

    public void a(long j11) {
        int i11 = this.f107676a;
        long[] jArr = this.f107677b;
        if (i11 == jArr.length) {
            this.f107677b = Arrays.copyOf(jArr, i11 * 2);
        }
        long[] jArr2 = this.f107677b;
        int i12 = this.f107676a;
        this.f107676a = i12 + 1;
        jArr2[i12] = j11;
    }

    public void b(long[] jArr) {
        int length = this.f107676a + jArr.length;
        long[] jArr2 = this.f107677b;
        if (length > jArr2.length) {
            this.f107677b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f107677b, this.f107676a, jArr.length);
        this.f107676a = length;
    }

    public long c(int i11) {
        if (i11 >= 0 && i11 < this.f107676a) {
            return this.f107677b[i11];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i11 + ", size is " + this.f107676a);
    }

    public int d() {
        return this.f107676a;
    }

    public t(int i11) {
        this.f107677b = new long[i11];
    }
}
