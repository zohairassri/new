package ml;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f116829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f116830b;

    public r() {
        this(32);
    }

    public void a(long j11) {
        int i11 = this.f116829a;
        long[] jArr = this.f116830b;
        if (i11 == jArr.length) {
            this.f116830b = Arrays.copyOf(jArr, i11 * 2);
        }
        long[] jArr2 = this.f116830b;
        int i12 = this.f116829a;
        this.f116829a = i12 + 1;
        jArr2[i12] = j11;
    }

    public long b(int i11) {
        if (i11 >= 0 && i11 < this.f116829a) {
            return this.f116830b[i11];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i11 + ", size is " + this.f116829a);
    }

    public int c() {
        return this.f116829a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f116830b, this.f116829a);
    }

    public r(int i11) {
        this.f116830b = new long[i11];
    }
}
