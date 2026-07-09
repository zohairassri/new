package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ln5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Random f30362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f30363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f30364c;

    public ln5(int i11) {
        this(0, new Random());
    }

    public final int a() {
        return this.f30363b.length;
    }

    public final int b(int i11) {
        int i12 = this.f30364c[i11] + 1;
        int[] iArr = this.f30363b;
        if (i12 < iArr.length) {
            return iArr[i12];
        }
        return -1;
    }

    public final int c(int i11) {
        int i12 = this.f30364c[i11] - 1;
        if (i12 >= 0) {
            return this.f30363b[i12];
        }
        return -1;
    }

    public final int d() {
        int[] iArr = this.f30363b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int e() {
        int[] iArr = this.f30363b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final ln5 f(int i11, int i12) {
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        int i13 = 0;
        while (i13 < i12) {
            Random random = this.f30362a;
            iArr[i13] = random.nextInt(this.f30363b.length + 1);
            int i14 = i13 + 1;
            int iNextInt = random.nextInt(i14);
            iArr2[i13] = iArr2[iNextInt];
            iArr2[iNextInt] = i13;
            i13 = i14;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.f30363b;
        int[] iArr4 = new int[iArr3.length + i12];
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr3.length + i12; i17++) {
            if (i15 >= i12 || i16 != iArr[i15]) {
                int i18 = i16 + 1;
                int i19 = iArr3[i16];
                iArr4[i17] = i19;
                if (i19 >= 0) {
                    iArr4[i17] = i19 + i12;
                }
                i16 = i18;
            } else {
                iArr4[i17] = iArr2[i15];
                i15++;
            }
        }
        return new ln5(iArr4, new Random(this.f30362a.nextLong()));
    }

    public final ln5 g() {
        return new ln5(0, new Random(this.f30362a.nextLong()));
    }

    private ln5(int i11, Random random) {
        this(new int[0], random);
    }

    private ln5(int[] iArr, Random random) {
        this.f30363b = iArr;
        this.f30362a = random;
        this.f30364c = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f30364c[iArr[i11]] = i11;
        }
    }
}
