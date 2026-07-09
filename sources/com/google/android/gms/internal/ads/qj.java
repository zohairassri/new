package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f33665a = new ArrayDeque();

    public qj(int i11) {
    }

    public final void a(long j11, long j12, long j13) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = i17 + ((((i12 & (~i11)) | i13) + ((i11 & i14) | i15)) - i16);
        pj pjVar = new pj(j11, j12, j13);
        ArrayDeque arrayDeque = this.f33665a;
        if (arrayDeque.size() >= ((i18 % 452867621) ^ i19)) {
            throw new zzaus();
        }
        arrayDeque.push(pjVar);
    }

    public final pj b() {
        return (pj) Optional.ofNullable((pj) this.f33665a.peek()).orElseThrow(oj.f31954b);
    }
}
