package k6;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f107681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f107682e;

    public u() {
        this(16);
    }

    private void c() {
        long[] jArr = this.f107681d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i11 = this.f107678a;
        int i12 = length2 - i11;
        System.arraycopy(jArr, i11, jArr2, 0, i12);
        System.arraycopy(this.f107681d, 0, jArr2, i12, i11);
        this.f107678a = 0;
        this.f107679b = this.f107680c - 1;
        this.f107681d = jArr2;
        this.f107682e = jArr2.length - 1;
    }

    public void a(long j11) {
        if (this.f107680c == this.f107681d.length) {
            c();
        }
        int i11 = (this.f107679b + 1) & this.f107682e;
        this.f107679b = i11;
        this.f107681d[i11] = j11;
        this.f107680c++;
    }

    public void b() {
        this.f107678a = 0;
        this.f107679b = -1;
        this.f107680c = 0;
    }

    public long d() {
        if (this.f107680c != 0) {
            return this.f107681d[this.f107678a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f107680c == 0;
    }

    public long f() {
        int i11 = this.f107680c;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f107681d;
        int i12 = this.f107678a;
        long j11 = jArr[i12];
        this.f107678a = this.f107682e & (i12 + 1);
        this.f107680c = i11 - 1;
        return j11;
    }

    public u(int i11) {
        a.a(i11 >= 0 && i11 <= 1073741824);
        i11 = i11 == 0 ? 1 : i11;
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.f107678a = 0;
        this.f107679b = -1;
        this.f107680c = 0;
        long[] jArr = new long[i11];
        this.f107681d = jArr;
        this.f107682e = jArr.length - 1;
    }
}
