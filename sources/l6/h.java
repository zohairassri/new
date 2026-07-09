package l6;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k6.b0;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f113362a;

        private b(e eVar, d dVar) throws c {
            int i11 = dVar.f113363a;
            k6.a.a(i11 == 6 || i11 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f113364b.remaining())];
            dVar.f113364b.asReadOnlyBuffer().get(bArr);
            b0 b0Var = new b0(bArr);
            h.f(eVar.f113365a);
            if (b0Var.g()) {
                this.f113362a = false;
                return;
            }
            int iH = b0Var.h(2);
            boolean zG = b0Var.g();
            h.f(eVar.f113366b);
            if (!zG) {
                this.f113362a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : b0Var.g();
            b0Var.q();
            h.f(!eVar.f113368d);
            if (b0Var.g()) {
                h.f(!eVar.f113369e);
                b0Var.q();
            }
            h.f(eVar.f113367c);
            if (iH != 3) {
                b0Var.q();
            }
            b0Var.r(eVar.f113370f);
            if (iH != 2 && iH != 0 && !zG2) {
                b0Var.r(3);
            }
            this.f113362a = ((iH == 3 || iH == 0) ? 255 : b0Var.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f113362a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c extends Exception {
        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f113364b;

        private d(int i11, ByteBuffer byteBuffer) {
            this.f113363a = i11;
            this.f113364b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f113365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f113366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f113367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f113368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f113369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f113370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f113371g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f113372h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f113373i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f113374j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f113375k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f113376l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f113377m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f113378n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f113379o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f113380p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f113381q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final byte f113382r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final byte f113383s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte f113384t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private e(d dVar) {
            int iH;
            int iH2;
            boolean zG;
            ?? r82;
            k6.a.a(dVar.f113363a == 1);
            byte[] bArr = new byte[dVar.f113364b.remaining()];
            dVar.f113364b.asReadOnlyBuffer().get(bArr);
            b0 b0Var = new b0(bArr);
            this.f113371g = b0Var.h(3);
            b0Var.q();
            boolean zG2 = b0Var.g();
            this.f113365a = zG2;
            if (zG2) {
                iH2 = b0Var.h(5);
                this.f113366b = false;
                this.f113374j = false;
                r82 = 0;
                iH = 0;
            } else {
                if (b0Var.g()) {
                    b(b0Var);
                    boolean zG3 = b0Var.g();
                    this.f113366b = zG3;
                    if (zG3) {
                        b0Var.r(47);
                    }
                } else {
                    this.f113366b = false;
                }
                this.f113374j = b0Var.g();
                int iH3 = b0Var.h(5);
                int iH4 = 0;
                int i11 = 0;
                boolean z11 = false;
                iH = 0;
                while (i11 <= iH3) {
                    b0Var.r(12);
                    if (i11 == 0) {
                        iH4 = b0Var.h(5);
                        zG = z11;
                        if (iH4 > 7) {
                            zG = b0Var.g();
                        }
                    } else {
                        zG = z11;
                        if (b0Var.h(5) > 7) {
                            b0Var.q();
                            zG = z11;
                        }
                    }
                    if (this.f113366b) {
                        b0Var.q();
                    }
                    if (this.f113374j && b0Var.g()) {
                        if (i11 == 0) {
                            iH = b0Var.h(4);
                        } else {
                            b0Var.r(4);
                        }
                    }
                    i11++;
                    z11 = zG;
                }
                iH2 = iH4;
                r82 = z11;
            }
            int iH5 = b0Var.h(4);
            int iH6 = b0Var.h(4);
            b0Var.r(iH5 + 1);
            b0Var.r(iH6 + 1);
            if (this.f113365a) {
                this.f113367c = false;
            } else {
                this.f113367c = b0Var.g();
            }
            if (this.f113367c) {
                b0Var.r(4);
                b0Var.r(3);
            }
            b0Var.r(3);
            if (this.f113365a) {
                this.f113369e = true;
                this.f113368d = true;
                this.f113370f = 0;
            } else {
                b0Var.r(4);
                boolean zG4 = b0Var.g();
                if (zG4) {
                    b0Var.r(2);
                }
                if (b0Var.g()) {
                    this.f113368d = true;
                } else {
                    this.f113368d = b0Var.g();
                }
                if (!this.f113368d || b0Var.g()) {
                    this.f113369e = true;
                } else {
                    this.f113369e = b0Var.g();
                }
                if (zG4) {
                    this.f113370f = b0Var.h(3) + 1;
                } else {
                    this.f113370f = 0;
                }
            }
            this.f113372h = iH2;
            this.f113373i = r82;
            this.f113375k = iH;
            b0Var.r(3);
            boolean zG5 = b0Var.g();
            this.f113376l = zG5;
            if (this.f113371g == 2 && zG5) {
                this.f113377m = b0Var.g();
            } else {
                this.f113377m = false;
            }
            if (this.f113371g != 1) {
                this.f113378n = b0Var.g();
            } else {
                this.f113378n = false;
            }
            if (b0Var.g()) {
                this.f113382r = (byte) b0Var.h(8);
                this.f113383s = (byte) b0Var.h(8);
                this.f113384t = (byte) b0Var.h(8);
            } else {
                this.f113382r = (byte) 0;
                this.f113383s = (byte) 0;
                this.f113384t = (byte) 0;
            }
            if (this.f113378n) {
                b0Var.q();
                this.f113379o = false;
                this.f113380p = false;
                this.f113381q = 0;
            } else if (this.f113382r == 1 && this.f113383s == 13 && this.f113384t == 0) {
                this.f113379o = false;
                this.f113380p = false;
                this.f113381q = 0;
            } else {
                b0Var.q();
                int i12 = this.f113371g;
                if (i12 == 0) {
                    this.f113379o = true;
                    this.f113380p = true;
                } else if (i12 == 1) {
                    this.f113379o = false;
                    this.f113380p = false;
                } else if (this.f113377m) {
                    boolean zG6 = b0Var.g();
                    this.f113379o = zG6;
                    if (zG6) {
                        this.f113380p = b0Var.g();
                    } else {
                        this.f113380p = false;
                    }
                } else {
                    this.f113379o = true;
                    this.f113380p = false;
                }
                if (this.f113379o && this.f113380p) {
                    this.f113381q = b0Var.h(2);
                } else {
                    this.f113381q = 0;
                }
            }
            b0Var.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(b0 b0Var) {
            b0Var.r(64);
            if (b0Var.g()) {
                h.d(b0Var);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            byte b11 = byteBuffer.get();
            i11 |= (b11 & ByteCompanionObject.MAX_VALUE) << (i12 * 7);
            if ((b11 & ByteCompanionObject.MIN_VALUE) == 0) {
                return i11;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(b0 b0Var) {
        int i11 = 0;
        while (!b0Var.g()) {
            i11++;
        }
        if (i11 < 32) {
            b0Var.r(i11);
        }
    }

    public static List e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b11 = byteBufferAsReadOnlyBuffer.get();
            int i11 = (b11 >> 3) & 15;
            if (((b11 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b11 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i11, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z11) throws c {
        if (z11) {
            throw new c();
        }
    }
}
