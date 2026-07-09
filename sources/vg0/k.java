package vg0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class k {
    byte[] A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int G;
    byte[] H;
    int I;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int P;
    int U;
    int V;
    int W;
    int X;
    int Y;
    byte[] Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f133122b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f133124d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f133127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f133128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f133129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f133130j;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f133143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f133144x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f133145y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    byte[] f133146z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f133121a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a f133123c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int[] f133125e = new int[3240];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int[] f133126f = new int[3240];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final h f133131k = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final h f133132l = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final h f133133m = new h();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int[] f133134n = new int[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int[] f133135o = new int[3];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int[] f133136p = new int[6];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int[] f133137q = {16, 15, 11, 4};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f133138r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f133139s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f133140t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f133141u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f133142v = 0;
    int Q = 0;
    long R = 0;
    byte[] S = new byte[0];
    int T = 0;

    k() {
    }

    static void a(k kVar) throws IOException {
        int i11 = kVar.f133121a;
        if (i11 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i11 == 11) {
            return;
        }
        kVar.f133121a = 11;
        a.b(kVar.f133123c);
    }

    private static int b(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 16;
        }
        int i11 = a.i(aVar, 3);
        if (i11 != 0) {
            return i11 + 17;
        }
        int i12 = a.i(aVar, 3);
        if (i12 != 0) {
            return i12 + 8;
        }
        return 17;
    }

    static void c(k kVar, InputStream inputStream) {
        if (kVar.f133121a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a.e(kVar.f133123c, inputStream);
        int iB = b(kVar.f133123c);
        if (iB == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i11 = 1 << iB;
        kVar.P = i11;
        kVar.O = i11 - 16;
        kVar.f133121a = 1;
    }
}
