package androidx.media3.exoplayer.drm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import r6.k2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f9620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9622c;

        public a(byte[] bArr, String str, int i11) {
            this.f9620a = bArr;
            this.f9621b = str;
            this.f9622c = i11;
        }

        public byte[] a() {
            return this.f9620a;
        }

        public String b() {
            return this.f9621b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void a(m mVar, byte[] bArr, int i11, int i12, byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        m a(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f9623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9624b;

        public d(byte[] bArr, String str) {
            this.f9623a = bArr;
            this.f9624b = str;
        }

        public byte[] a() {
            return this.f9623a;
        }

        public String b() {
            return this.f9624b;
        }
    }

    Map a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr);

    int f();

    p6.b g(byte[] bArr);

    boolean h(byte[] bArr, String str);

    void i(byte[] bArr);

    byte[] j(byte[] bArr, byte[] bArr2);

    a k(byte[] bArr, List list, int i11, HashMap map);

    void m(b bVar);

    void release();

    default void l(byte[] bArr, k2 k2Var) {
    }
}
