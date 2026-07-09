package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f4452a = new long[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return i12 >= iArr.length ? iArr.length : iArr[i12 + 4] + Integer.bitCount(iArr[i12 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(ArrayList arrayList, int i11, int i12) {
        int iT = t(arrayList, i11, i12);
        if (iT >= 0) {
            return (b) arrayList.get(iT);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(int[] iArr, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, int i14) {
        int i15 = i11 * 5;
        iArr[i15] = i12;
        iArr[i15 + 1] = ((z11 ? 1 : 0) << 30) | ((z12 ? 1 : 0) << 29) | ((z13 ? 1 : 0) << 28);
        iArr[i15 + 2] = i13;
        iArr[i15 + 3] = 0;
        iArr[i15 + 4] = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(ArrayList arrayList, int i11, int i12) {
        int iT = t(arrayList, i11, i12);
        return iT >= 0 ? iT : -(iT + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + Integer.bitCount(iArr[i12 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(ArrayList arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int iA = ((b) arrayList.get(i14)).a();
            if (iA < 0) {
                iA += i12;
            }
            int iCompare = Intrinsics.compare(iA, i11);
            if (iCompare < 0) {
                i13 = i14 + 1;
            } else {
                if (iCompare <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + Integer.bitCount(iArr[i12 + 1] >> 28);
    }

    public static final void v() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        iArr[i12] = ((z11 ? 1 : 0) << 26) | (iArr[i12] & (-67108865));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 3] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        iArr[i12] = ((z11 ? 1 : 0) << 27) | (iArr[i12] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(int[] iArr, int i11, int i12) {
        if (i12 >= 0) {
        }
        int i13 = (i11 * 5) + 1;
        iArr[i13] = i12 | (iArr[i13] & (-67108864));
    }
}
