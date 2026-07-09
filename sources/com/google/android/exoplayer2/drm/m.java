package com.google.android.exoplayer2.drm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import yj.r1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f20477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20479c;

        public a(byte[] bArr, String str, int i11) {
            this.f20477a = bArr;
            this.f20478b = str;
            this.f20479c = i11;
        }

        public byte[] a() {
            return this.f20477a;
        }

        public String b() {
            return this.f20478b;
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
        private final byte[] f20480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20481b;

        public d(byte[] bArr, String str) {
            this.f20480a = bArr;
            this.f20481b = str;
        }

        public byte[] a() {
            return this.f20480a;
        }

        public String b() {
            return this.f20481b;
        }
    }

    Map a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr);

    int f();

    ak.b g(byte[] bArr);

    boolean h(byte[] bArr, String str);

    void i(byte[] bArr);

    byte[] j(byte[] bArr, byte[] bArr2);

    a k(byte[] bArr, List list, int i11, HashMap map);

    void l(b bVar);

    void release();

    default void m(byte[] bArr, r1 r1Var) {
    }
}
