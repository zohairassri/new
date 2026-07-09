package s2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import r2.w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f125408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f125409b = new long[2];

    private final long[] i(int i11) {
        long[] jArr = this.f125409b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i11, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.f125409b = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean a(long j11) {
        if (c(j11)) {
            return false;
        }
        j(this.f125408a, j11);
        return true;
    }

    public final void b() {
        this.f125408a = 0;
    }

    public final boolean c(long j11) {
        int i11 = this.f125408a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f125409b[i12] == j11) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i11) {
        return w.a(this.f125409b[i11]);
    }

    public final int e() {
        return this.f125408a;
    }

    public final boolean f() {
        return this.f125408a == 0;
    }

    public final boolean g(long j11) {
        int i11 = this.f125408a;
        int i12 = 0;
        while (i12 < i11) {
            if (j11 == this.f125409b[i12]) {
                int i13 = this.f125408a - 1;
                while (i12 < i13) {
                    long[] jArr = this.f125409b;
                    int i14 = i12 + 1;
                    jArr[i12] = jArr[i14];
                    i12 = i14;
                }
                this.f125408a--;
                return true;
            }
            i12++;
        }
        return false;
    }

    public final boolean h(int i11) {
        int i12 = this.f125408a;
        if (i11 >= i12) {
            return false;
        }
        int i13 = i12 - 1;
        while (i11 < i13) {
            long[] jArr = this.f125409b;
            int i14 = i11 + 1;
            jArr[i11] = jArr[i14];
            i11 = i14;
        }
        this.f125408a--;
        return true;
    }

    public final void j(int i11, long j11) {
        long[] jArrI = this.f125409b;
        if (i11 >= jArrI.length) {
            jArrI = i(i11 + 1);
        }
        jArrI[i11] = j11;
        if (i11 >= this.f125408a) {
            this.f125408a = i11 + 1;
        }
    }
}
