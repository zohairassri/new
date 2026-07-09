package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f37018a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f37019b = new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37021d;

    public vu2(int i11) {
    }

    private final Object f() {
        jx3.i(this.f37021d > 0);
        Object[] objArr = this.f37019b;
        int i11 = this.f37020c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f37020c = (i11 + 1) % objArr.length;
        this.f37021d--;
        return obj;
    }

    public final synchronized void a(long j11, Object obj) {
        try {
            if (this.f37021d > 0) {
                if (j11 <= this.f37018a[((this.f37020c + r0) - 1) % this.f37019b.length]) {
                    b();
                }
            }
            int length = this.f37019b.length;
            if (this.f37021d >= length) {
                int i11 = length + length;
                long[] jArr = new long[i11];
                Object[] objArr = new Object[i11];
                int i12 = this.f37020c;
                int i13 = length - i12;
                System.arraycopy(this.f37018a, i12, jArr, 0, i13);
                System.arraycopy(this.f37019b, this.f37020c, objArr, 0, i13);
                int i14 = this.f37020c;
                if (i14 > 0) {
                    System.arraycopy(this.f37018a, 0, jArr, i13, i14);
                    System.arraycopy(this.f37019b, 0, objArr, i13, this.f37020c);
                }
                this.f37018a = jArr;
                this.f37019b = objArr;
                this.f37020c = 0;
            }
            int i15 = this.f37020c;
            int i16 = this.f37021d;
            Object[] objArr2 = this.f37019b;
            int length2 = (i15 + i16) % objArr2.length;
            this.f37018a[length2] = j11;
            objArr2[length2] = obj;
            this.f37021d = i16 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        this.f37020c = 0;
        this.f37021d = 0;
        Arrays.fill(this.f37019b, (Object) null);
    }

    public final synchronized int c() {
        return this.f37021d;
    }

    public final synchronized Object d() {
        if (this.f37021d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object e(long j11) {
        Object objF;
        objF = null;
        while (this.f37021d > 0 && j11 - this.f37018a[this.f37020c] >= 0) {
            objF = f();
        }
        return objF;
    }
}
