package bs;

import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.d;
import com.google.gson.s;
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
/* JADX INFO: loaded from: classes10.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f15062n = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f15063r = new String[128];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String[] f15064s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f15065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f15066b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15067c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f15068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f15069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f15070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f15072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15073i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f15074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15075m;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f15063r[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f15063r;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f15064s = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        U(6);
        this.f15072h = s.LEGACY_STRICT;
        this.f15075m = true;
        Objects.requireNonNull(writer, "out == null");
        this.f15065a = writer;
        Y(d.f47093d);
    }

    private void C() throws IOException {
        if (this.f15071g) {
            return;
        }
        this.f15065a.write(this.f15068d.b());
        int i11 = this.f15067c;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f15065a.write(this.f15068d.a());
        }
    }

    private void F0() throws IOException {
        if (this.f15074l != null) {
            c();
            p0(this.f15074l);
            this.f15074l = null;
        }
    }

    private c J(int i11, char c11) throws IOException {
        e();
        U(i11);
        this.f15065a.write(c11);
        return this;
    }

    private int M() {
        int i11 = this.f15067c;
        if (i11 != 0) {
            return this.f15066b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void U(int i11) {
        int i12 = this.f15067c;
        int[] iArr = this.f15066b;
        if (i12 == iArr.length) {
            this.f15066b = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f15066b;
        int i13 = this.f15067c;
        this.f15067c = i13 + 1;
        iArr2[i13] = i11;
    }

    private void V(int i11) {
        this.f15066b[this.f15067c - 1] = i11;
    }

    private static boolean a(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void c() throws IOException {
        int iM = M();
        if (iM == 5) {
            this.f15065a.write(this.f15070f);
        } else if (iM != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        C();
        V(4);
    }

    private void e() throws IOException {
        int iM = M();
        if (iM == 1) {
            V(2);
            C();
            return;
        }
        if (iM == 2) {
            this.f15065a.append((CharSequence) this.f15070f);
            C();
        } else {
            if (iM == 4) {
                this.f15065a.append((CharSequence) this.f15069e);
                V(5);
                return;
            }
            if (iM != 6) {
                if (iM != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f15072h != s.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            V(7);
        }
    }

    private c h(int i11, int i12, char c11) throws IOException {
        int iM = M();
        if (iM != i12 && iM != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f15074l != null) {
            throw new IllegalStateException("Dangling name: " + this.f15074l);
        }
        this.f15067c--;
        if (iM == i12) {
            C();
        }
        this.f15065a.write(c11);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f15073i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = bs.c.f15064s
            goto L9
        L7:
            java.lang.String[] r0 = bs.c.f15063r
        L9:
            java.io.Writer r1 = r8.f15065a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f15065a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f15065a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f15065a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r8 = r8.f15065a
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.c.p0(java.lang.String):void");
    }

    public c B0(Boolean bool) throws IOException {
        if (bool == null) {
            return E();
        }
        F0();
        e();
        this.f15065a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c C0(Number number) throws IOException {
        if (number == null) {
            return E();
        }
        F0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f15072h != s.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f15062n.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        e();
        this.f15065a.append((CharSequence) string);
        return this;
    }

    public c D0(String str) throws IOException {
        if (str == null) {
            return E();
        }
        F0();
        e();
        p0(str);
        return this;
    }

    public c E() throws IOException {
        if (this.f15074l != null) {
            if (!this.f15075m) {
                this.f15074l = null;
                return this;
            }
            F0();
        }
        e();
        this.f15065a.write(Constants.NULL_VERSION_ID);
        return this;
    }

    public c E0(boolean z11) throws IOException {
        F0();
        e();
        this.f15065a.write(z11 ? "true" : "false");
        return this;
    }

    public final void Y(d dVar) {
        Objects.requireNonNull(dVar);
        this.f15068d = dVar;
        this.f15070f = ",";
        if (dVar.c()) {
            this.f15069e = ": ";
            if (this.f15068d.b().isEmpty()) {
                this.f15070f = ", ";
            }
        } else {
            this.f15069e = ":";
        }
        this.f15071g = this.f15068d.b().isEmpty() && this.f15068d.a().isEmpty();
    }

    public final void a0(boolean z11) {
        this.f15073i = z11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15065a.close();
        int i11 = this.f15067c;
        if (i11 > 1 || (i11 == 1 && this.f15066b[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15067c = 0;
    }

    public final void e0(boolean z11) {
        this.f15075m = z11;
    }

    public c f() throws IOException {
        F0();
        return J(1, '[');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f15067c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15065a.flush();
    }

    public c g() throws IOException {
        F0();
        return J(3, '{');
    }

    public c j() {
        return h(1, 2, ']');
    }

    public final void j0(s sVar) {
        Objects.requireNonNull(sVar);
        this.f15072h = sVar;
    }

    public c k() {
        return h(3, 5, '}');
    }

    public final boolean l() {
        return this.f15075m;
    }

    public final s n() {
        return this.f15072h;
    }

    public final boolean o() {
        return this.f15073i;
    }

    public boolean q() {
        return this.f15072h == s.LENIENT;
    }

    public c t(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f15074l != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM = M();
        if (iM != 3 && iM != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f15074l = str;
        return this;
    }

    public c v0(double d11) throws IOException {
        F0();
        if (this.f15072h == s.LENIENT || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            e();
            this.f15065a.append((CharSequence) Double.toString(d11));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
    }

    public c x0(long j11) throws IOException {
        F0();
        e();
        this.f15065a.write(Long.toString(j11));
        return this;
    }
}
