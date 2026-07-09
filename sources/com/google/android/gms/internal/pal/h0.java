package com.google.android.gms.internal.pal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f41386g = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f41387h = new String[128];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f41388i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f41389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f41390b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41391c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f41394f;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f41387h[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f41387h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f41388i = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public h0(Writer writer) {
        E(6);
        this.f41392d = ":";
        this.f41389a = writer;
    }

    private final void C() throws IOException {
        int iO = o();
        if (iO == 1) {
            J(2);
            return;
        }
        if (iO == 2) {
            this.f41389a.append(',');
            return;
        }
        if (iO == 4) {
            this.f41389a.append((CharSequence) this.f41392d);
            J(5);
            return;
        }
        if (iO != 6) {
            if (iO != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.f41393e) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        J(7);
    }

    private final void E(int i11) {
        int i12 = this.f41391c;
        int[] iArr = this.f41390b;
        if (i12 == iArr.length) {
            this.f41390b = Arrays.copyOf(iArr, i12 + i12);
        }
        int[] iArr2 = this.f41390b;
        int i13 = this.f41391c;
        this.f41391c = i13 + 1;
        iArr2[i13] = i11;
    }

    private final void J(int i11) {
        this.f41390b[this.f41391c - 1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void M(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String[] r0 = com.google.android.gms.internal.pal.h0.f41387h
            java.io.Writer r1 = r8.f41389a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r1) goto L3e
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1e
            r5 = r0[r5]
            if (r5 != 0) goto L2b
            goto L3b
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3b
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L34
            java.io.Writer r6 = r8.f41389a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L34:
            java.io.Writer r4 = r8.f41389a
            r4.write(r5)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Lf
        L3e:
            if (r4 >= r1) goto L46
            java.io.Writer r0 = r8.f41389a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L46:
            java.io.Writer r8 = r8.f41389a
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.h0.M(java.lang.String):void");
    }

    private final void U() throws IOException {
        if (this.f41394f != null) {
            int iO = o();
            if (iO == 5) {
                this.f41389a.write(44);
            } else if (iO != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            J(4);
            M(this.f41394f);
            this.f41394f = null;
        }
    }

    private final int o() {
        int i11 = this.f41391c;
        if (i11 != 0) {
            return this.f41390b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final h0 q(int i11, int i12, char c11) throws IOException {
        int iO = o();
        if (iO != i12 && iO != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f41394f;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f41391c--;
        this.f41389a.write(c11);
        return this;
    }

    private final h0 t(int i11, char c11) throws IOException {
        C();
        E(i11);
        this.f41389a.write(c11);
        return this;
    }

    public final h0 a() throws IOException {
        U();
        t(1, '[');
        return this;
    }

    public final h0 c() throws IOException {
        U();
        t(3, '{');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41389a.close();
        int i11 = this.f41391c;
        if (i11 > 1 || (i11 == 1 && this.f41390b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f41391c = 0;
    }

    public final h0 e() throws IOException {
        q(1, 2, ']');
        return this;
    }

    public final h0 f() throws IOException {
        q(3, 5, '}');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f41391c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f41389a.flush();
    }

    public final h0 g(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f41394f != null) {
            throw new IllegalStateException();
        }
        if (this.f41391c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f41394f = str;
        return this;
    }

    public final h0 h() throws IOException {
        if (this.f41394f != null) {
            U();
        }
        C();
        this.f41389a.write(Constants.NULL_VERSION_ID);
        return this;
    }

    public final h0 j(Number number) throws IOException {
        U();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f41386g.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f41393e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        C();
        this.f41389a.append((CharSequence) string);
        return this;
    }

    public final h0 k(String str) throws IOException {
        if (str == null) {
            h();
            return this;
        }
        U();
        C();
        M(str);
        return this;
    }

    public final h0 l(boolean z11) throws IOException {
        U();
        C();
        this.f41389a.write(true != z11 ? "false" : "true");
        return this;
    }

    public final void n(boolean z11) {
        this.f41393e = true;
    }
}
