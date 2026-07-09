package mg0;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f116236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f116237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f116238c;

    static {
        g gVar = new g();
        f116236a = gVar;
        f116237b = new char[117];
        f116238c = new byte[126];
        gVar.f();
        gVar.e();
    }

    private g() {
    }

    private final void a(char c11, char c12) {
        b(c11, c12);
    }

    private final void b(int i11, char c11) {
        if (c11 != 'u') {
            f116237b[c11] = (char) i11;
        }
    }

    private final void c(char c11, byte b11) {
        d(c11, b11);
    }

    private final void d(int i11, byte b11) {
        f116238c[i11] = b11;
    }

    private final void e() {
        for (int i11 = 0; i11 < 33; i11++) {
            d(i11, ByteCompanionObject.MAX_VALUE);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    private final void f() {
        for (int i11 = 0; i11 < 32; i11++) {
            b(i11, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
