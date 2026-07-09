package bs;

import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.internal.bind.g;
import com.google.gson.s;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import yr.h0;
import yr.y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f15035a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f15044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f15045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f15046n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f15047r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String[] f15049v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f15050w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f15036b = s.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15037c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f15038d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15039e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15040f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15041g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15042h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f15043i = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f15048s = 1;

    /* JADX INFO: renamed from: bs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C0249a extends y {
        C0249a() {
        }

        @Override // yr.y
        public void a(a aVar) throws IOException {
            if (aVar instanceof g) {
                ((g) aVar).b1();
                return;
            }
            int iH = aVar.f15043i;
            if (iH == 0) {
                iH = aVar.h();
            }
            if (iH == 13) {
                aVar.f15043i = 9;
            } else if (iH == 12) {
                aVar.f15043i = 8;
            } else {
                if (iH != 14) {
                    throw aVar.F0("a name");
                }
                aVar.f15043i = 10;
            }
        }
    }

    static {
        y.f140953a = new C0249a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f15047r = iArr;
        iArr[0] = 6;
        this.f15049v = new String[32];
        this.f15050w = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f15035a = reader;
    }

    private boolean B0(String str) {
        int length = str.length();
        while (true) {
            if (this.f15039e + length > this.f15040f && !l(length)) {
                return false;
            }
            char[] cArr = this.f15038d;
            int i11 = this.f15039e;
            if (cArr[i11] != '\n') {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.f15038d[this.f15039e + i12] != str.charAt(i12)) {
                        break;
                    }
                }
                return true;
            }
            this.f15041g++;
            this.f15042h = i11 + 1;
            this.f15039e++;
        }
    }

    private boolean C(char c11) throws MalformedJsonException {
        if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
            return false;
        }
        if (c11 != '#') {
            if (c11 == ',') {
                return false;
            }
            if (c11 != '/' && c11 != '=') {
                if (c11 == '{' || c11 == '}' || c11 == ':') {
                    return false;
                }
                if (c11 != ';') {
                    switch (c11) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    private void C0() {
        char c11;
        do {
            if (this.f15039e >= this.f15040f && !l(1)) {
                return;
            }
            char[] cArr = this.f15038d;
            int i11 = this.f15039e;
            int i12 = i11 + 1;
            this.f15039e = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f15041g++;
                this.f15042h = i12;
                return;
            }
        } while (c11 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void D0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f15039e
            int r2 = r1 + r0
            int r3 = r4.f15040f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f15038d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.f()
        L4b:
            int r1 = r4.f15039e
            int r1 = r1 + r0
            r4.f15039e = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f15039e = r1
            r0 = 1
            boolean r0 = r4.l(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.a.D0():void");
    }

    private MalformedJsonException E0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + E() + "\nSee " + h0.a("malformed-json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException F0(String str) {
        return new IllegalStateException("Expected " + str + " but was " + Y() + E() + "\nSee " + h0.a(Y() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int J(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.f15038d
            int r1 = r8.f15039e
            int r2 = r8.f15040f
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r8.f15039e = r1
            boolean r1 = r8.l(r3)
            if (r1 != 0) goto L30
            if (r9 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r8 = r8.E()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L30:
            int r1 = r8.f15039e
            int r2 = r8.f15040f
        L34:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L45
            int r1 = r8.f15041g
            int r1 = r1 + r3
            r8.f15041g = r1
            r8.f15042h = r4
            goto Lb2
        L45:
            r6 = 32
            if (r5 == r6) goto Lb2
            r6 = 13
            if (r5 == r6) goto Lb2
            r6 = 9
            if (r5 != r6) goto L52
            goto Lb2
        L52:
            r6 = 47
            if (r5 != r6) goto L9d
            r8.f15039e = r4
            r7 = 2
            if (r4 != r2) goto L69
            r8.f15039e = r1
            boolean r1 = r8.l(r7)
            int r2 = r8.f15039e
            int r2 = r2 + r3
            r8.f15039e = r2
            if (r1 != 0) goto L69
            goto L76
        L69:
            r8.f()
            int r1 = r8.f15039e
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L83
            if (r2 == r6) goto L77
        L76:
            return r5
        L77:
            int r1 = r1 + 1
            r8.f15039e = r1
            r8.C0()
            int r1 = r8.f15039e
            int r2 = r8.f15040f
            goto L6
        L83:
            int r1 = r1 + 1
            r8.f15039e = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.B0(r1)
            if (r1 == 0) goto L96
            int r1 = r8.f15039e
            int r1 = r1 + r7
            int r2 = r8.f15040f
            goto L6
        L96:
            java.lang.String r9 = "Unterminated comment"
            com.google.gson.stream.MalformedJsonException r8 = r8.E0(r9)
            throw r8
        L9d:
            r1 = 35
            if (r5 != r1) goto Laf
            r8.f15039e = r4
            r8.f()
            r8.C0()
            int r1 = r8.f15039e
            int r2 = r8.f15040f
            goto L6
        Laf:
            r8.f15039e = r4
            return r5
        Lb2:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.a.J(boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f15039e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String U(char r11) throws com.google.gson.stream.MalformedJsonException {
        /*
            r10 = this;
            char[] r0 = r10.f15038d
            r1 = 0
        L3:
            int r2 = r10.f15039e
            int r3 = r10.f15040f
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6c
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.s r8 = r10.f15036b
            com.google.gson.s r9 = com.google.gson.s.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r2 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.gson.stream.MalformedJsonException r10 = r10.E0(r11)
            throw r10
        L24:
            if (r2 != r11) goto L3a
            r10.f15039e = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L32
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L32:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L3a:
            r8 = 92
            if (r2 != r8) goto L5f
            r10.f15039e = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L50
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L50:
            r1.append(r0, r3, r2)
            char r2 = r10.p0()
            r1.append(r2)
            int r2 = r10.f15039e
            int r3 = r10.f15040f
            goto L7
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r10.f15041g
            int r2 = r2 + r6
            r10.f15041g = r2
            r10.f15042h = r7
        L6a:
            r2 = r7
            goto L9
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f15039e = r2
            boolean r2 = r10.l(r6)
            if (r2 == 0) goto L8b
            goto L3
        L8b:
            java.lang.String r11 = "Unterminated string"
            com.google.gson.stream.MalformedJsonException r10 = r10.E0(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.a.U(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        f();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String V() throws com.google.gson.stream.MalformedJsonException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f15039e
            int r4 = r3 + r2
            int r5 = r6.f15040f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f15038d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.f()
            goto L5c
        L4e:
            char[] r3 = r6.f15038d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.l(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f15038d
            int r4 = r6.f15039e
            r0.append(r3, r4, r2)
            int r3 = r6.f15039e
            int r3 = r3 + r2
            r6.f15039e = r3
            r2 = 1
            boolean r2 = r6.l(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f15038d
            int r3 = r6.f15039e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f15038d
            int r3 = r6.f15039e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f15039e
            int r2 = r2 + r1
            r6.f15039e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.a.V():java.lang.String");
    }

    private int a0() {
        String str;
        String str2;
        int i11;
        char c11 = this.f15038d[this.f15039e];
        if (c11 == 't' || c11 == 'T') {
            str = "true";
            str2 = "TRUE";
            i11 = 5;
        } else if (c11 == 'f' || c11 == 'F') {
            str = "false";
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (c11 != 'n' && c11 != 'N') {
                return 0;
            }
            str = Constants.NULL_VERSION_ID;
            str2 = "NULL";
            i11 = 7;
        }
        boolean z11 = this.f15036b != s.STRICT;
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f15039e + i12 >= this.f15040f && !l(i12 + 1)) {
                return 0;
            }
            char c12 = this.f15038d[this.f15039e + i12];
            if (c12 != str.charAt(i12) && (!z11 || c12 != str2.charAt(i12))) {
                return 0;
            }
        }
        if ((this.f15039e + length < this.f15040f || l(length + 1)) && C(this.f15038d[this.f15039e + length])) {
            return 0;
        }
        this.f15039e += length;
        this.f15043i = i11;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (C(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        r19.f15044l = r11;
        r19.f15039e += r8;
        r19.f15043i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r19.f15045m = r8;
        r19.f15043i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e0() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.a.e0():int");
    }

    private void f() throws MalformedJsonException {
        if (this.f15036b != s.LENIENT) {
            throw E0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void g() throws IOException {
        J(true);
        int i11 = this.f15039e;
        this.f15039e = i11 - 1;
        if (i11 + 4 <= this.f15040f || l(5)) {
            int i12 = this.f15039e;
            char[] cArr = this.f15038d;
            if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                this.f15039e = i12 + 5;
            }
        }
    }

    private void j0(int i11) throws MalformedJsonException {
        int i12 = this.f15048s;
        if (i12 - 1 >= this.f15037c) {
            throw new MalformedJsonException("Nesting limit " + this.f15037c + " reached" + E());
        }
        int[] iArr = this.f15047r;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f15047r = Arrays.copyOf(iArr, i13);
            this.f15050w = Arrays.copyOf(this.f15050w, i13);
            this.f15049v = (String[]) Arrays.copyOf(this.f15049v, i13);
        }
        int[] iArr2 = this.f15047r;
        int i14 = this.f15048s;
        this.f15048s = i14 + 1;
        iArr2[i14] = i11;
    }

    private boolean l(int i11) throws IOException {
        int i12;
        int i13;
        char[] cArr = this.f15038d;
        int i14 = this.f15042h;
        int i15 = this.f15039e;
        this.f15042h = i14 - i15;
        int i16 = this.f15040f;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f15040f = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f15040f = 0;
        }
        this.f15039e = 0;
        do {
            Reader reader = this.f15035a;
            int i18 = this.f15040f;
            int i19 = reader.read(cArr, i18, cArr.length - i18);
            if (i19 == -1) {
                return false;
            }
            i12 = this.f15040f + i19;
            this.f15040f = i12;
            if (this.f15041g == 0 && (i13 = this.f15042h) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f15039e++;
                this.f15042h = i13 + 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private String n(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i11 = 0;
        while (true) {
            int i12 = this.f15048s;
            if (i11 >= i12) {
                return sb2.toString();
            }
            int i13 = this.f15047r[i11];
            switch (i13) {
                case 1:
                case 2:
                    int i14 = this.f15050w[i11];
                    if (z11 && i14 > 0 && i11 == i12 - 1) {
                        i14--;
                    }
                    sb2.append('[');
                    sb2.append(i14);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f15049v[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i13);
            }
            i11++;
        }
    }

    private char p0() throws MalformedJsonException {
        int i11;
        if (this.f15039e == this.f15040f && !l(1)) {
            throw E0("Unterminated escape sequence");
        }
        char[] cArr = this.f15038d;
        int i12 = this.f15039e;
        int i13 = i12 + 1;
        this.f15039e = i13;
        char c11 = cArr[i12];
        if (c11 != '\n') {
            if (c11 != '\"') {
                if (c11 != '\'') {
                    if (c11 != '/' && c11 != '\\') {
                        if (c11 == 'b') {
                            return '\b';
                        }
                        if (c11 == 'f') {
                            return '\f';
                        }
                        if (c11 == 'n') {
                            return '\n';
                        }
                        if (c11 == 'r') {
                            return '\r';
                        }
                        if (c11 == 't') {
                            return '\t';
                        }
                        if (c11 != 'u') {
                            throw E0("Invalid escape sequence");
                        }
                        if (i12 + 5 > this.f15040f && !l(4)) {
                            throw E0("Unterminated escape sequence");
                        }
                        int i14 = this.f15039e;
                        int i15 = i14 + 4;
                        int i16 = 0;
                        while (i14 < i15) {
                            char c12 = this.f15038d[i14];
                            int i17 = i16 << 4;
                            if (c12 >= '0' && c12 <= '9') {
                                i11 = c12 - '0';
                            } else if (c12 >= 'a' && c12 <= 'f') {
                                i11 = c12 - 'W';
                            } else {
                                if (c12 < 'A' || c12 > 'F') {
                                    throw E0("Malformed Unicode escape \\u" + new String(this.f15038d, this.f15039e, 4));
                                }
                                i11 = c12 - '7';
                            }
                            i16 = i17 + i11;
                            i14++;
                        }
                        this.f15039e += 4;
                        return (char) i16;
                    }
                }
            }
            return c11;
        }
        if (this.f15036b == s.STRICT) {
            throw E0("Cannot escape a newline character in strict mode");
        }
        this.f15041g++;
        this.f15042h = i13;
        if (this.f15036b == s.STRICT) {
            throw E0("Invalid escaped character \"'\" in strict mode");
        }
        return c11;
    }

    private void x0(char c11) throws MalformedJsonException {
        char[] cArr = this.f15038d;
        do {
            int i11 = this.f15039e;
            int i12 = this.f15040f;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.f15039e = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.f15039e = i13;
                    p0();
                    i11 = this.f15039e;
                    i12 = this.f15040f;
                } else {
                    if (c12 == '\n') {
                        this.f15041g++;
                        this.f15042h = i13;
                    }
                    i11 = i13;
                }
            }
            this.f15039e = i11;
        } while (l(1));
        throw E0("Unterminated string");
    }

    String E() {
        return " at line " + (this.f15041g + 1) + " column " + ((this.f15039e - this.f15042h) + 1) + " path " + b();
    }

    public void M() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 7) {
            throw F0(Constants.NULL_VERSION_ID);
        }
        this.f15043i = 0;
        int[] iArr = this.f15050w;
        int i11 = this.f15048s - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public b Y() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String b() {
        return n(false);
    }

    public void c() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 3) {
            throw F0("BEGIN_ARRAY");
        }
        j0(1);
        this.f15050w[this.f15048s - 1] = 0;
        this.f15043i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15043i = 0;
        this.f15047r[0] = 8;
        this.f15048s = 1;
        this.f15035a.close();
    }

    public void e() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 1) {
            throw F0("BEGIN_OBJECT");
        }
        j0(3);
        this.f15043i = 0;
    }

    int h() throws IOException {
        int iJ;
        int[] iArr = this.f15047r;
        int i11 = this.f15048s;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int iJ2 = J(true);
            if (iJ2 != 44) {
                if (iJ2 != 59) {
                    if (iJ2 != 93) {
                        throw E0("Unterminated array");
                    }
                    this.f15043i = 4;
                    return 4;
                }
                f();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5 && (iJ = J(true)) != 44) {
                    if (iJ != 59) {
                        if (iJ != 125) {
                            throw E0("Unterminated object");
                        }
                        this.f15043i = 2;
                        return 2;
                    }
                    f();
                }
                int iJ3 = J(true);
                if (iJ3 == 34) {
                    this.f15043i = 13;
                    return 13;
                }
                if (iJ3 == 39) {
                    f();
                    this.f15043i = 12;
                    return 12;
                }
                if (iJ3 == 125) {
                    if (i12 == 5) {
                        throw E0("Expected name");
                    }
                    this.f15043i = 2;
                    return 2;
                }
                f();
                this.f15039e--;
                if (!C((char) iJ3)) {
                    throw E0("Expected name");
                }
                this.f15043i = 14;
                return 14;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int iJ4 = J(true);
                if (iJ4 != 58) {
                    if (iJ4 != 61) {
                        throw E0("Expected ':'");
                    }
                    f();
                    if (this.f15039e < this.f15040f || l(1)) {
                        char[] cArr = this.f15038d;
                        int i13 = this.f15039e;
                        if (cArr[i13] == '>') {
                            this.f15039e = i13 + 1;
                        }
                    }
                }
            } else if (i12 == 6) {
                if (this.f15036b == s.LENIENT) {
                    g();
                }
                this.f15047r[this.f15048s - 1] = 7;
            } else if (i12 == 7) {
                if (J(false) == -1) {
                    this.f15043i = 17;
                    return 17;
                }
                f();
                this.f15039e--;
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iJ5 = J(true);
        if (iJ5 == 34) {
            this.f15043i = 9;
            return 9;
        }
        if (iJ5 == 39) {
            f();
            this.f15043i = 8;
            return 8;
        }
        if (iJ5 != 44 && iJ5 != 59) {
            if (iJ5 == 91) {
                this.f15043i = 3;
                return 3;
            }
            if (iJ5 != 93) {
                if (iJ5 == 123) {
                    this.f15043i = 1;
                    return 1;
                }
                this.f15039e--;
                int iA0 = a0();
                if (iA0 != 0) {
                    return iA0;
                }
                int iE0 = e0();
                if (iE0 != 0) {
                    return iE0;
                }
                if (!C(this.f15038d[this.f15039e])) {
                    throw E0("Expected value");
                }
                f();
                this.f15043i = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f15043i = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw E0("Unexpected value");
        }
        f();
        this.f15039e--;
        this.f15043i = 7;
        return 7;
    }

    public boolean hasNext() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4 || iH == 17) ? false : true;
    }

    public void j() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 4) {
            throw F0("END_ARRAY");
        }
        int i11 = this.f15048s;
        this.f15048s = i11 - 1;
        int[] iArr = this.f15050w;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f15043i = 0;
    }

    public void k() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 2) {
            throw F0("END_OBJECT");
        }
        int i11 = this.f15048s;
        int i12 = i11 - 1;
        this.f15048s = i12;
        this.f15049v[i12] = null;
        int[] iArr = this.f15050w;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f15043i = 0;
    }

    public boolean nextBoolean() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 5) {
            this.f15043i = 0;
            int[] iArr = this.f15050w;
            int i11 = this.f15048s - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iH != 6) {
            throw F0("a boolean");
        }
        this.f15043i = 0;
        int[] iArr2 = this.f15050w;
        int i12 = this.f15048s - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f15043i = 0;
            int[] iArr = this.f15050w;
            int i11 = this.f15048s - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f15044l;
        }
        if (iH == 16) {
            this.f15046n = new String(this.f15038d, this.f15039e, this.f15045m);
            this.f15039e += this.f15045m;
        } else if (iH == 8 || iH == 9) {
            this.f15046n = U(iH == 8 ? '\'' : '\"');
        } else if (iH == 10) {
            this.f15046n = V();
        } else if (iH != 11) {
            throw F0("a double");
        }
        this.f15043i = 11;
        double d11 = Double.parseDouble(this.f15046n);
        if (this.f15036b != s.LENIENT && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw E0("JSON forbids NaN and infinities: " + d11);
        }
        this.f15046n = null;
        this.f15043i = 0;
        int[] iArr2 = this.f15050w;
        int i12 = this.f15048s - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return d11;
    }

    public int nextInt() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            long j11 = this.f15044l;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.f15043i = 0;
                int[] iArr = this.f15050w;
                int i12 = this.f15048s - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f15044l + E());
        }
        if (iH == 16) {
            this.f15046n = new String(this.f15038d, this.f15039e, this.f15045m);
            this.f15039e += this.f15045m;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw F0("an int");
            }
            if (iH == 10) {
                this.f15046n = V();
            } else {
                this.f15046n = U(iH == 8 ? '\'' : '\"');
            }
            try {
                int i13 = Integer.parseInt(this.f15046n);
                this.f15043i = 0;
                int[] iArr2 = this.f15050w;
                int i14 = this.f15048s - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15043i = 11;
        double d11 = Double.parseDouble(this.f15046n);
        int i15 = (int) d11;
        if (i15 != d11) {
            throw new NumberFormatException("Expected an int but was " + this.f15046n + E());
        }
        this.f15046n = null;
        this.f15043i = 0;
        int[] iArr3 = this.f15050w;
        int i16 = this.f15048s - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public long nextLong() throws IOException {
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f15043i = 0;
            int[] iArr = this.f15050w;
            int i11 = this.f15048s - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f15044l;
        }
        if (iH == 16) {
            this.f15046n = new String(this.f15038d, this.f15039e, this.f15045m);
            this.f15039e += this.f15045m;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw F0("a long");
            }
            if (iH == 10) {
                this.f15046n = V();
            } else {
                this.f15046n = U(iH == 8 ? '\'' : '\"');
            }
            try {
                long j11 = Long.parseLong(this.f15046n);
                this.f15043i = 0;
                int[] iArr2 = this.f15050w;
                int i12 = this.f15048s - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15043i = 11;
        double d11 = Double.parseDouble(this.f15046n);
        long j12 = (long) d11;
        if (j12 != d11) {
            throw new NumberFormatException("Expected a long but was " + this.f15046n + E());
        }
        this.f15046n = null;
        this.f15043i = 0;
        int[] iArr3 = this.f15050w;
        int i13 = this.f15048s - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j12;
    }

    public String nextName() throws IOException {
        String strU;
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strU = V();
        } else if (iH == 12) {
            strU = U('\'');
        } else {
            if (iH != 13) {
                throw F0("a name");
            }
            strU = U('\"');
        }
        this.f15043i = 0;
        this.f15049v[this.f15048s - 1] = strU;
        return strU;
    }

    public String nextString() throws IOException {
        String str;
        int iH = this.f15043i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 10) {
            str = V();
        } else if (iH == 8) {
            str = U('\'');
        } else if (iH == 9) {
            str = U('\"');
        } else if (iH == 11) {
            str = this.f15046n;
            this.f15046n = null;
        } else if (iH == 15) {
            str = Long.toString(this.f15044l);
        } else {
            if (iH != 16) {
                throw F0("a string");
            }
            str = new String(this.f15038d, this.f15039e, this.f15045m);
            this.f15039e += this.f15045m;
        }
        this.f15043i = 0;
        int[] iArr = this.f15050w;
        int i11 = this.f15048s - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public String o() {
        return n(true);
    }

    public final s q() {
        return this.f15036b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i11 = 0;
        do {
            int iH = this.f15043i;
            if (iH == 0) {
                iH = h();
            }
            switch (iH) {
                case 1:
                    j0(3);
                    i11++;
                    this.f15043i = 0;
                    break;
                case 2:
                    if (i11 == 0) {
                        this.f15049v[this.f15048s - 1] = null;
                    }
                    this.f15048s--;
                    i11--;
                    this.f15043i = 0;
                    break;
                case 3:
                    j0(1);
                    i11++;
                    this.f15043i = 0;
                    break;
                case 4:
                    this.f15048s--;
                    i11--;
                    this.f15043i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f15043i = 0;
                    break;
                case 8:
                    x0('\'');
                    this.f15043i = 0;
                    break;
                case 9:
                    x0('\"');
                    this.f15043i = 0;
                    break;
                case 10:
                    D0();
                    this.f15043i = 0;
                    break;
                case 12:
                    x0('\'');
                    if (i11 == 0) {
                        this.f15049v[this.f15048s - 1] = "<skipped>";
                    }
                    this.f15043i = 0;
                    break;
                case 13:
                    x0('\"');
                    if (i11 == 0) {
                        this.f15049v[this.f15048s - 1] = "<skipped>";
                    }
                    this.f15043i = 0;
                    break;
                case 14:
                    D0();
                    if (i11 == 0) {
                        this.f15049v[this.f15048s - 1] = "<skipped>";
                    }
                    this.f15043i = 0;
                    break;
                case 16:
                    this.f15039e += this.f15045m;
                    this.f15043i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i11 > 0);
        int[] iArr = this.f15050w;
        int i12 = this.f15048s - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final boolean t() {
        return this.f15036b == s.LENIENT;
    }

    public String toString() {
        return getClass().getSimpleName() + E();
    }

    public final void v0(s sVar) {
        Objects.requireNonNull(sVar);
        this.f15036b = sVar;
    }
}
