package hn;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f102493a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f102494b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f102495c;

    b(int i11) {
    }

    public final b a(Object obj) {
        int i11;
        obj.getClass();
        int length = this.f102493a.length;
        int i12 = this.f102494b;
        int i13 = i12 + 1;
        if (i13 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i13 <= length) {
            i11 = length;
        } else {
            i11 = (length >> 1) + length + 1;
            if (i11 < i13) {
                int iHighestOneBit = Integer.highestOneBit(i12);
                i11 = iHighestOneBit + iHighestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
        }
        if (i11 > length || this.f102495c) {
            this.f102493a = Arrays.copyOf(this.f102493a, i11);
            this.f102495c = false;
        }
        Object[] objArr = this.f102493a;
        int i14 = this.f102494b;
        this.f102494b = i14 + 1;
        objArr[i14] = obj;
        return this;
    }
}
