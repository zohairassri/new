package l7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface o0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f113581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f113582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f113583d;

        public a(int i11, byte[] bArr, int i12, int i13) {
            this.f113580a = i11;
            this.f113581b = bArr;
            this.f113582c = i12;
            this.f113583d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f113580a == aVar.f113580a && this.f113582c == aVar.f113582c && this.f113583d == aVar.f113583d && Arrays.equals(this.f113581b, aVar.f113581b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f113580a * 31) + Arrays.hashCode(this.f113581b)) * 31) + this.f113582c) * 31) + this.f113583d;
        }
    }

    void a(androidx.media3.common.a aVar);

    void b(long j11, int i11, int i12, int i13, a aVar);

    void d(k6.c0 c0Var, int i11, int i12);

    default void e(k6.c0 c0Var, int i11) {
        d(c0Var, i11, 0);
    }

    default int f(h6.i iVar, int i11, boolean z11) {
        return g(iVar, i11, z11, 0);
    }

    int g(h6.i iVar, int i11, boolean z11, int i12);

    default void c(long j11) {
    }
}
