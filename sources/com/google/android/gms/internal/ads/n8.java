package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f31255d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f31256a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31258c;

    public static int d(int i11) {
        int i12 = 0;
        while (i12 < 8) {
            int i13 = i12 + 1;
            if ((f31255d[i12] & ((long) i11)) != 0) {
                return i13;
            }
            i12 = i13;
        }
        return -1;
    }

    public static long e(byte[] bArr, int i11, boolean z11) {
        long j11 = ((long) bArr[0]) & 255;
        if (z11) {
            j11 &= ~f31255d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (((long) bArr[i12]) & 255);
        }
        return j11;
    }

    public final void a() {
        this.f31257b = 0;
        this.f31258c = 0;
    }

    public final long b(x3 x3Var, boolean z11, boolean z12, int i11) {
        if (this.f31257b == 0) {
            byte[] bArr = this.f31256a;
            if (!x3Var.A(bArr, 0, 1, z11)) {
                return -1L;
            }
            int iD = d(bArr[0] & 255);
            this.f31258c = iD;
            if (iD == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f31257b = 1;
        }
        int i12 = this.f31258c;
        if (i12 > i11) {
            this.f31257b = 0;
            return -2L;
        }
        if (i12 != 1) {
            x3Var.y(this.f31256a, 1, i12 - 1);
        }
        this.f31257b = 0;
        return e(this.f31256a, this.f31258c, z12);
    }

    public final int c() {
        return this.f31258c;
    }
}
