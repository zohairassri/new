package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4528a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4529b;

    private final int[] i() {
        int[] iArr = this.f4528a;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f4528a = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void a() {
        this.f4529b = 0;
    }

    public final int b(int i11) {
        int[] iArr = this.f4528a;
        int iMin = Math.min(iArr.length, this.f4529b);
        for (int i12 = 0; i12 < iMin; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public final int c() {
        return this.f4528a[this.f4529b - 1];
    }

    public final int d(int i11) {
        return this.f4528a[i11];
    }

    public final int e() {
        return this.f4528a[this.f4529b - 2];
    }

    public final int f(int i11) {
        int i12 = this.f4529b - 1;
        return i12 >= 0 ? this.f4528a[i12] : i11;
    }

    public final int g() {
        int[] iArr = this.f4528a;
        int i11 = this.f4529b - 1;
        this.f4529b = i11;
        return iArr[i11];
    }

    public final void h(int i11) {
        int[] iArrI = this.f4528a;
        if (this.f4529b >= iArrI.length) {
            iArrI = i();
        }
        int i12 = this.f4529b;
        this.f4529b = i12 + 1;
        iArrI[i12] = i11;
    }
}
