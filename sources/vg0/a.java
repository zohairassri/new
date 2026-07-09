package vg0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f133089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f133090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f133091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f133092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f133093h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f133086a = new byte[4160];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f133087b = new int[1040];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f133088c = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f133094i = 0;

    a() {
    }

    static void a(a aVar, boolean z11) {
        if (aVar.f133090e) {
            int i11 = ((aVar.f133093h << 2) + ((aVar.f133092g + 7) >> 3)) - 8;
            int i12 = aVar.f133094i;
            if (i11 > i12) {
                throw new c("Read after end");
            }
            if (z11 && i11 != i12) {
                throw new c("Unused bytes after end");
            }
        }
    }

    static void b(a aVar) throws IOException {
        InputStream inputStream = aVar.f133089d;
        aVar.f133089d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void c(a aVar, byte[] bArr, int i11, int i12) {
        if ((aVar.f133092g & 7) != 0) {
            throw new c("Unaligned copyBytes");
        }
        while (true) {
            int i13 = aVar.f133092g;
            if (i13 == 64 || i12 == 0) {
                break;
            }
            bArr[i11] = (byte) (aVar.f133091f >>> i13);
            aVar.f133092g = i13 + 8;
            i12--;
            i11++;
        }
        if (i12 == 0) {
            return;
        }
        int iMin = Math.min(f(aVar), i12 >> 2);
        if (iMin > 0) {
            int i14 = iMin << 2;
            System.arraycopy(aVar.f133086a, aVar.f133093h << 2, bArr, i11, i14);
            i11 += i14;
            i12 -= i14;
            aVar.f133093h += iMin;
        }
        if (i12 == 0) {
            return;
        }
        if (f(aVar) <= 0) {
            while (i12 > 0) {
                try {
                    int i15 = aVar.f133089d.read(bArr, i11, i12);
                    if (i15 == -1) {
                        throw new c("Unexpected end of input");
                    }
                    i11 += i15;
                    i12 -= i15;
                } catch (IOException e11) {
                    throw new c("Failed to read input", e11);
                }
            }
            return;
        }
        d(aVar);
        while (i12 != 0) {
            long j11 = aVar.f133091f;
            int i16 = aVar.f133092g;
            bArr[i11] = (byte) (j11 >>> i16);
            aVar.f133092g = i16 + 8;
            i12--;
            i11++;
        }
        a(aVar, false);
    }

    static void d(a aVar) {
        int i11 = aVar.f133092g;
        if (i11 >= 32) {
            int[] iArr = aVar.f133087b;
            int i12 = aVar.f133093h;
            aVar.f133093h = i12 + 1;
            aVar.f133091f = (((long) iArr[i12]) << 32) | (aVar.f133091f >>> 32);
            aVar.f133092g = i11 - 32;
        }
    }

    static void e(a aVar, InputStream inputStream) {
        if (aVar.f133089d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        i.b(aVar.f133088c, aVar.f133086a, aVar.f133087b);
        aVar.f133089d = inputStream;
        aVar.f133091f = 0L;
        aVar.f133092g = 64;
        aVar.f133093h = 1024;
        aVar.f133090e = false;
        h(aVar);
    }

    static int f(a aVar) {
        return (aVar.f133090e ? (aVar.f133094i + 3) >> 2 : 1024) - aVar.f133093h;
    }

    static void g(a aVar) {
        int i11 = (64 - aVar.f133092g) & 7;
        if (i11 != 0 && i(aVar, i11) != 0) {
            throw new c("Corrupted padding bits");
        }
    }

    private static void h(a aVar) {
        j(aVar);
        a(aVar, false);
        d(aVar);
        d(aVar);
    }

    static int i(a aVar, int i11) {
        d(aVar);
        long j11 = aVar.f133091f;
        int i12 = aVar.f133092g;
        int i13 = ((int) (j11 >>> i12)) & ((1 << i11) - 1);
        aVar.f133092g = i12 + i11;
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r4.f133090e = true;
        r4.f133094i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void j(vg0.a r4) {
        /*
            int r0 = r4.f133093h
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r1) goto L7
            goto L12
        L7:
            boolean r1 = r4.f133090e
            if (r1 == 0) goto L1b
            int r4 = f(r4)
            r0 = -2
            if (r4 < r0) goto L13
        L12:
            return
        L13:
            vg0.c r4 = new vg0.c
            java.lang.String r0 = "No more input"
            r4.<init>(r0)
            throw r4
        L1b:
            int r0 = r0 << 2
            int r1 = 4096 - r0
            byte[] r2 = r4.f133086a
            r3 = 0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            r4.f133093h = r3
        L27:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L4a
            java.io.InputStream r0 = r4.f133089d     // Catch: java.io.IOException -> L41
            byte[] r2 = r4.f133086a     // Catch: java.io.IOException -> L41
            int r3 = 4096 - r1
            int r0 = r0.read(r2, r1, r3)     // Catch: java.io.IOException -> L41
            if (r0 > 0) goto L3f
            r0 = 1
            r4.f133090e = r0     // Catch: java.io.IOException -> L41
            r4.f133094i = r1     // Catch: java.io.IOException -> L41
            int r1 = r1 + 3
            goto L4a
        L3f:
            int r1 = r1 + r0
            goto L27
        L41:
            r4 = move-exception
            vg0.c r0 = new vg0.c
            java.lang.String r1 = "Failed to read input"
            r0.<init>(r1, r4)
            throw r0
        L4a:
            vg0.i r4 = r4.f133088c
            int r0 = r1 >> 2
            vg0.i.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vg0.a.j(vg0.a):void");
    }

    static void k(a aVar) {
        if (aVar.f133092g == 64) {
            h(aVar);
        }
    }
}
