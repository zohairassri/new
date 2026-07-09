package d8;

import l7.q;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f89476d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f89477a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f89479c;

    public static long a(byte[] bArr, int i11, boolean z11) {
        long j11 = ((long) bArr[0]) & 255;
        if (z11) {
            j11 &= ~f89476d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (((long) bArr[i12]) & 255);
        }
        return j11;
    }

    public static int c(int i11) {
        int i12 = 0;
        while (true) {
            long[] jArr = f89476d;
            if (i12 >= jArr.length) {
                return -1;
            }
            if ((jArr[i12] & ((long) i11)) != 0) {
                return i12 + 1;
            }
            i12++;
        }
    }

    public int b() {
        return this.f89479c;
    }

    public long d(q qVar, boolean z11, boolean z12, int i11) {
        if (this.f89478b == 0) {
            if (!qVar.f(this.f89477a, 0, 1, z11)) {
                return -1L;
            }
            int iC = c(this.f89477a[0] & 255);
            this.f89479c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f89478b = 1;
        }
        int i12 = this.f89479c;
        if (i12 > i11) {
            this.f89478b = 0;
            return -2L;
        }
        if (i12 != 1) {
            qVar.readFully(this.f89477a, 1, i12 - 1);
        }
        this.f89478b = 0;
        return a(this.f89477a, this.f89479c, z12);
    }

    public void e() {
        this.f89478b = 0;
        this.f89479c = 0;
    }
}
