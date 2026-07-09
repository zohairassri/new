package ck;

import com.google.android.exoplayer2.u0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface b0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f17786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17788d;

        public a(int i11, byte[] bArr, int i12, int i13) {
            this.f17785a = i11;
            this.f17786b = bArr;
            this.f17787c = i12;
            this.f17788d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f17785a == aVar.f17785a && this.f17787c == aVar.f17787c && this.f17788d == aVar.f17788d && Arrays.equals(this.f17786b, aVar.f17786b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f17785a * 31) + Arrays.hashCode(this.f17786b)) * 31) + this.f17787c) * 31) + this.f17788d;
        }
    }

    int a(ll.f fVar, int i11, boolean z11, int i12);

    default void b(ml.a0 a0Var, int i11) {
        f(a0Var, i11, 0);
    }

    void c(u0 u0Var);

    default int d(ll.f fVar, int i11, boolean z11) {
        return a(fVar, i11, z11, 0);
    }

    void e(long j11, int i11, int i12, int i13, a aVar);

    void f(ml.a0 a0Var, int i11, int i12);
}
