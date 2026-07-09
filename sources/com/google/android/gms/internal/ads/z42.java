package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class z42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f38987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38988e;

    public z42(int i11) {
        int i12 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        this.f38984a = 0;
        this.f38985b = -1;
        this.f38986c = 0;
        this.f38987d = new long[i12];
        this.f38988e = r3.length - 1;
    }

    public final void a(long j11) {
        int i11 = this.f38986c;
        long[] jArr = this.f38987d;
        int length = jArr.length;
        if (i11 == length) {
            int i12 = length + length;
            if (i12 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i12];
            int i13 = this.f38984a;
            int i14 = length - i13;
            System.arraycopy(jArr, i13, jArr2, 0, i14);
            System.arraycopy(this.f38987d, 0, jArr2, i14, i13);
            this.f38984a = 0;
            this.f38985b = this.f38986c - 1;
            this.f38987d = jArr2;
            this.f38988e = jArr2.length - 1;
            jArr = jArr2;
        }
        int i15 = (this.f38985b + 1) & this.f38988e;
        this.f38985b = i15;
        jArr[i15] = j11;
        this.f38986c++;
    }

    public final long b() {
        int i11 = this.f38986c;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f38987d;
        int i12 = this.f38984a;
        long j11 = jArr[i12];
        this.f38984a = this.f38988e & (i12 + 1);
        this.f38986c = i11 - 1;
        return j11;
    }

    public final long c() {
        if (this.f38986c != 0) {
            return this.f38987d[this.f38984a];
        }
        throw new NoSuchElementException();
    }

    public final boolean d() {
        return this.f38986c == 0;
    }

    public final void e() {
        this.f38984a = 0;
        this.f38985b = -1;
        this.f38986c = 0;
    }
}
