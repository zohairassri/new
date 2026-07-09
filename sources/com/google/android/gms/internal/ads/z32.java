package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class z32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f38980b;

    public z32(int i11) {
        this.f38980b = new long[i11];
    }

    public final void a(long j11) {
        int i11 = this.f38979a;
        long[] jArr = this.f38980b;
        if (i11 == jArr.length) {
            this.f38980b = Arrays.copyOf(jArr, i11 + i11);
        }
        long[] jArr2 = this.f38980b;
        int i12 = this.f38979a;
        this.f38979a = i12 + 1;
        jArr2[i12] = 0;
    }

    public final void b(long[] jArr) {
        int i11 = this.f38979a;
        int length = jArr.length;
        int i12 = i11 + length;
        long[] jArr2 = this.f38980b;
        int length2 = jArr2.length;
        if (i12 > length2) {
            this.f38980b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i12));
        }
        System.arraycopy(jArr, 0, this.f38980b, this.f38979a, length);
        this.f38979a = i12;
    }

    public final long c(int i11) {
        if (i11 >= 0 && i11 < this.f38979a) {
            return this.f38980b[i11];
        }
        int i12 = this.f38979a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 24 + String.valueOf(i12).length());
        sb2.append("Invalid index ");
        sb2.append(i11);
        sb2.append(", size is ");
        sb2.append(i12);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int d() {
        return this.f38979a;
    }
}
