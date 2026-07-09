package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ex4 implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f25961l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f25962m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f25963n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f25964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f25965b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25966c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vv4 f25967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f25969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f25970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bw4 f25971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f25972i;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f25962m[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f25962m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f25963n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public ex4(Writer writer) {
        boolean z11 = false;
        t(6);
        this.f25971h = bw4.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.f25964a = writer;
        vv4 vv4Var = vv4.f37043d;
        Objects.requireNonNull(vv4Var);
        this.f25967d = vv4Var;
        this.f25969f = ",";
        if (vv4Var.c()) {
            this.f25968e = ": ";
            if (vv4Var.a().isEmpty()) {
                this.f25969f = ", ";
            }
        } else {
            this.f25968e = ":";
        }
        if (vv4Var.a().isEmpty() && vv4Var.b().isEmpty()) {
            z11 = true;
        }
        this.f25970g = z11;
    }

    private final int C() {
        int i11 = this.f25966c;
        if (i11 != 0) {
            return this.f25965b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void E(int i11) {
        this.f25965b[this.f25966c - 1] = i11;
    }

    private final void J() throws IOException {
        if (this.f25972i != null) {
            int iC = C();
            if (iC == 5) {
                this.f25964a.write(this.f25969f);
            } else if (iC != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            U();
            E(4);
            M(this.f25972i);
            this.f25972i = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void M(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.io.Writer r8 = r8.f25964a
            java.lang.String[] r0 = com.google.android.gms.internal.ads.ex4.f25962m
            r1 = 34
            r8.write(r1)
            int r2 = r9.length()
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r2) goto L39
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L20
            r6 = r0[r6]
            if (r6 == 0) goto L37
            goto L2d
        L20:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L27
            java.lang.String r6 = "\\u2028"
            goto L2d
        L27:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2d:
            if (r4 >= r3) goto L33
            int r3 = r3 - r4
            r8.write(r9, r4, r3)
        L33:
            r8.write(r6)
            r4 = r5
        L37:
            r3 = r5
            goto Lf
        L39:
            if (r4 >= r2) goto L3f
            int r2 = r2 - r4
            r8.write(r9, r4, r2)
        L3f:
            r8.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex4.M(java.lang.String):void");
    }

    private final void U() throws IOException {
        if (this.f25970g) {
            return;
        }
        Writer writer = this.f25964a;
        vv4 vv4Var = this.f25967d;
        writer.write(vv4Var.a());
        int i11 = this.f25966c;
        for (int i12 = 1; i12 < i11; i12++) {
            writer.write(vv4Var.b());
        }
    }

    private final void V() throws IOException {
        int iC = C();
        if (iC == 1) {
            E(2);
            U();
            return;
        }
        if (iC == 2) {
            this.f25964a.append((CharSequence) this.f25969f);
            U();
        } else {
            if (iC == 4) {
                this.f25964a.append((CharSequence) this.f25968e);
                E(5);
                return;
            }
            if (iC != 6) {
                if (iC != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f25971h != bw4.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            E(7);
        }
    }

    private final ex4 o(int i11, char c11) throws IOException {
        V();
        t(i11);
        this.f25964a.write(c11);
        return this;
    }

    private final ex4 q(int i11, int i12, char c11) throws IOException {
        int iC = C();
        if (iC != i12 && iC != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f25972i;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f25966c--;
        if (iC == i12) {
            U();
        }
        this.f25964a.write(c11);
        return this;
    }

    private final void t(int i11) {
        int i12 = this.f25966c;
        int[] iArr = this.f25965b;
        if (i12 == iArr.length) {
            this.f25965b = Arrays.copyOf(iArr, i12 + i12);
        }
        int[] iArr2 = this.f25965b;
        int i13 = this.f25966c;
        this.f25966c = i13 + 1;
        iArr2[i13] = i11;
    }

    public final void a(bw4 bw4Var) {
        Objects.requireNonNull(bw4Var);
        this.f25971h = bw4Var;
    }

    public final ex4 c() throws IOException {
        J();
        o(1, '[');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25964a.close();
        int i11 = this.f25966c;
        if (i11 > 1 || (i11 == 1 && this.f25965b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f25966c = 0;
    }

    public final ex4 e() throws IOException {
        q(1, 2, ']');
        return this;
    }

    public final ex4 f() throws IOException {
        J();
        o(3, '{');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f25966c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f25964a.flush();
    }

    public final ex4 g() throws IOException {
        q(3, 5, '}');
        return this;
    }

    public final ex4 h(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f25972i != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iC = C();
        if (iC != 3 && iC != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f25972i = str;
        return this;
    }

    public final ex4 j(String str) throws IOException {
        if (str == null) {
            n();
            return this;
        }
        J();
        V();
        M(str);
        return this;
    }

    public final ex4 k(boolean z11) throws IOException {
        J();
        V();
        this.f25964a.write(true != z11 ? "false" : "true");
        return this;
    }

    public final ex4 l(Number number) throws IOException {
        if (number == null) {
            n();
            return this;
        }
        J();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f25971h != bw4.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f25961l.matcher(string).matches()) {
                String strValueOf = String.valueOf(cls);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47 + string.length());
                sb2.append("String created by ");
                sb2.append(strValueOf);
                sb2.append(" is not a valid JSON number: ");
                sb2.append(string);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        V();
        this.f25964a.append((CharSequence) string);
        return this;
    }

    public final ex4 n() throws IOException {
        if (this.f25972i != null) {
            J();
        }
        V();
        this.f25964a.write(Constants.NULL_VERSION_ID);
        return this;
    }
}
