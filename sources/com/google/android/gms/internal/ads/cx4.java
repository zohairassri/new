package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class cx4 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f24772a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24780i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f24782m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String[] f24784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f24785s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bw4 f24773b = bw4.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f24774c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24775d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24776e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24777f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24778g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f24779h = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f24783n = 1;

    static {
        ew4.f25955a = new bx4();
    }

    public cx4(Reader reader) {
        int[] iArr = new int[32];
        this.f24782m = iArr;
        iArr[0] = 6;
        this.f24784r = new String[32];
        this.f24785s = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f24772a = reader;
    }

    private final boolean C(char c11) throws zzhzt {
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
        Y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x013c, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013e, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0140, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x014c, code lost:
    
        r0.append(r4, r2, r3);
        r11.f24775d = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ed, code lost:
    
        throw e0("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.f24775d, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String E(char r12) throws com.google.android.gms.internal.ads.zzhzt {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cx4.E(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        Y();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String J() throws com.google.android.gms.internal.ads.zzhzt {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.f24775d
            int r3 = r3 + r2
            int r4 = r5.f24776e
            if (r3 >= r4) goto L4c
            char[] r4 = r5.f24774c
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.Y()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.U(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.f24774c
            int r4 = r5.f24775d
            r1.append(r3, r4, r2)
            int r3 = r5.f24775d
            int r3 = r3 + r2
            r5.f24775d = r3
            r2 = 1
            boolean r2 = r5.U(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.f24774c
            java.lang.String r2 = new java.lang.String
            int r3 = r5.f24775d
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.f24774c
            int r3 = r5.f24775d
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.f24775d
            int r1 = r1 + r0
            r5.f24775d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cx4.J():java.lang.String");
    }

    private final void M(int i11) throws zzhzt {
        int i12 = this.f24783n;
        if (i12 - 1 >= 1280) {
            String strQ = q();
            StringBuilder sb2 = new StringBuilder(strQ.length() + 26);
            sb2.append("Nesting limit 1280 reached");
            sb2.append(strQ);
            throw new zzhzt(sb2.toString());
        }
        int[] iArr = this.f24782m;
        if (i12 == iArr.length) {
            int i13 = i12 + i12;
            this.f24782m = Arrays.copyOf(iArr, i13);
            this.f24785s = Arrays.copyOf(this.f24785s, i13);
            this.f24784r = (String[]) Arrays.copyOf(this.f24784r, i13);
        }
        int[] iArr2 = this.f24782m;
        int i14 = this.f24783n;
        this.f24783n = i14 + 1;
        iArr2[i14] = i11;
    }

    private final boolean U(int i11) throws IOException {
        int i12;
        int i13 = this.f24778g;
        int i14 = this.f24775d;
        this.f24778g = i13 - i14;
        char[] cArr = this.f24774c;
        int i15 = this.f24776e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f24776e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f24776e = 0;
        }
        this.f24775d = 0;
        do {
            Reader reader = this.f24772a;
            int i17 = this.f24776e;
            int i18 = reader.read(cArr, i17, 1024 - i17);
            if (i18 == -1) {
                return false;
            }
            i12 = this.f24776e + i18;
            this.f24776e = i12;
            if (this.f24777f == 0 && this.f24778g == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f24775d++;
                this.f24778g = 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private final int V(boolean z11) throws IOException {
        int i11;
        int i12 = this.f24775d;
        int i13 = this.f24776e;
        while (true) {
            if (i12 == i13) {
                this.f24775d = i12;
                if (!U(1)) {
                    if (z11) {
                        throw new EOFException("End of input".concat(q()));
                    }
                    return -1;
                }
                i12 = this.f24775d;
                i13 = this.f24776e;
            }
            char[] cArr = this.f24774c;
            int i14 = i12 + 1;
            char c11 = cArr[i12];
            if (c11 == '\n') {
                this.f24777f++;
                this.f24778g = i14;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f24775d = i14;
                    if (i14 == i13) {
                        this.f24775d = i12;
                        boolean zU = U(2);
                        this.f24775d++;
                        if (!zU) {
                            return 47;
                        }
                    }
                    Y();
                    int i15 = this.f24775d;
                    char c12 = cArr[i15];
                    if (c12 == '*') {
                        this.f24775d = i15 + 1;
                        while (true) {
                            if (this.f24775d + 2 > this.f24776e && !U(2)) {
                                throw e0("Unterminated comment");
                            }
                            int i16 = this.f24775d;
                            if (cArr[i16] != '\n') {
                                while (i11 < 2) {
                                    i11 = cArr[this.f24775d + i11] == "*/".charAt(i11) ? i11 + 1 : 0;
                                }
                                i12 = this.f24775d + 2;
                                i13 = this.f24776e;
                                break;
                            }
                            this.f24777f++;
                            this.f24778g = i16 + 1;
                            this.f24775d++;
                        }
                    } else {
                        if (c12 != '/') {
                            return 47;
                        }
                        this.f24775d = i15 + 1;
                        a0();
                        i12 = this.f24775d;
                        i13 = this.f24776e;
                    }
                } else {
                    if (c11 != '#') {
                        this.f24775d = i14;
                        return c11;
                    }
                    this.f24775d = i14;
                    Y();
                    a0();
                    i12 = this.f24775d;
                    i13 = this.f24776e;
                }
            }
            i12 = i14;
        }
    }

    private final void Y() throws zzhzt {
        if (this.f24773b != bw4.LENIENT) {
            throw e0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void a0() {
        char c11;
        do {
            if (this.f24775d >= this.f24776e && !U(1)) {
                return;
            }
            char[] cArr = this.f24774c;
            int i11 = this.f24775d;
            int i12 = i11 + 1;
            this.f24775d = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f24777f++;
                this.f24778g = i12;
                return;
            }
        } while (c11 != '\r');
    }

    private final zzhzt e0(String str) throws zzhzt {
        String strQ = q();
        StringBuilder sb2 = new StringBuilder(str.length() + strQ.length() + 79);
        sb2.append(str);
        sb2.append(strQ);
        sb2.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new zzhzt(sb2.toString());
    }

    private final IllegalStateException j0(String str) throws IOException {
        int iT = t();
        String strA = dx4.a(t());
        String strQ = q();
        int length = str.length() + 18 + strA.length() + strQ.length();
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iT == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb2 = new StringBuilder(length + 5 + strConcat.length());
        sb2.append("Expected ");
        sb2.append(str);
        sb2.append(" but was ");
        sb2.append(strA);
        sb2.append(strQ);
        sb2.append("\nSee ");
        sb2.append(strConcat);
        return new IllegalStateException(sb2.toString());
    }

    public final void a(bw4 bw4Var) {
        Objects.requireNonNull(bw4Var);
        this.f24773b = bw4Var;
    }

    public final void c() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 3) {
            throw j0("BEGIN_ARRAY");
        }
        M(1);
        this.f24785s[this.f24783n - 1] = 0;
        this.f24779h = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f24779h = 0;
        this.f24782m[0] = 8;
        this.f24783n = 1;
        this.f24772a.close();
    }

    public final void e() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 4) {
            throw j0("END_ARRAY");
        }
        int i11 = this.f24783n;
        this.f24783n = i11 - 1;
        int[] iArr = this.f24785s;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f24779h = 0;
    }

    public final void f() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 1) {
            throw j0("BEGIN_OBJECT");
        }
        M(3);
        this.f24779h = 0;
    }

    public final void g() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 2) {
            throw j0("END_OBJECT");
        }
        int i11 = this.f24783n;
        int i12 = i11 - 1;
        this.f24783n = i12;
        this.f24784r[i12] = null;
        int[] iArr = this.f24785s;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f24779h = 0;
    }

    public final boolean h() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        return (iJ == 2 || iJ == 4 || iJ == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a2, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01de, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022c, code lost:
    
        if (C(r1) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0247, code lost:
    
        if (r3 == 0) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int j() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cx4.j():int");
    }

    public final String k() throws IOException {
        String strE;
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 14) {
            strE = J();
        } else if (iJ == 12) {
            strE = E('\'');
        } else {
            if (iJ != 13) {
                throw j0("a name");
            }
            strE = E('\"');
        }
        this.f24779h = 0;
        this.f24784r[this.f24783n - 1] = strE;
        return strE;
    }

    public final String l() throws IOException {
        String string;
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 10) {
            string = J();
        } else if (iJ == 8) {
            string = E('\'');
        } else if (iJ == 9) {
            string = E('\"');
        } else if (iJ == 11) {
            string = null;
        } else if (iJ == 15) {
            string = Long.toString(this.f24780i);
        } else {
            if (iJ != 16) {
                throw j0("a string");
            }
            String str = new String(this.f24774c, this.f24775d, this.f24781l);
            this.f24775d += this.f24781l;
            string = str;
        }
        this.f24779h = 0;
        int[] iArr = this.f24785s;
        int i11 = this.f24783n - 1;
        iArr[i11] = iArr[i11] + 1;
        return string;
    }

    public final boolean n() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 5) {
            this.f24779h = 0;
            int[] iArr = this.f24785s;
            int i11 = this.f24783n - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iJ != 6) {
            throw j0("a boolean");
        }
        this.f24779h = 0;
        int[] iArr2 = this.f24785s;
        int i12 = this.f24783n - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public final void o() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 7) {
            throw j0(Constants.NULL_VERSION_ID);
        }
        this.f24779h = 0;
        int[] iArr = this.f24785s;
        int i11 = this.f24783n - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    final String q() {
        int i11 = this.f24777f + 1;
        int i12 = this.f24775d - this.f24778g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i13 = 0; i13 < this.f24783n; i13++) {
            int i14 = this.f24782m[i13];
            switch (i14) {
                case 1:
                case 2:
                    int i15 = this.f24785s[i13];
                    sb2.append('[');
                    sb2.append(i15);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f24784r[i13];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 21);
                    sb3.append("Unknown scope value: ");
                    sb3.append(i14);
                    throw new AssertionError(sb3.toString());
            }
        }
        int i16 = i12 + 1;
        String string = sb2.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 17 + String.valueOf(i16).length() + 6 + string.length());
        sb4.append(" at line ");
        sb4.append(i11);
        sb4.append(" column ");
        sb4.append(i16);
        sb4.append(" path ");
        sb4.append(string);
        return sb4.toString();
    }

    public final int t() throws IOException {
        int iJ = this.f24779h;
        if (iJ == 0) {
            iJ = j();
        }
        switch (iJ) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return cx4.class.getSimpleName().concat(q());
    }
}
