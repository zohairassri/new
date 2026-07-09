package com.google.android.gms.internal.pal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f41293a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f41300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41301i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f41302l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f41304n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f41305r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f41294b = new char[1024];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41295c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41296d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41297e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41298f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f41299g = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41303m = 1;

    static {
        pu.f41668a = new e0();
    }

    public f0(Reader reader) {
        int[] iArr = new int[32];
        this.f41302l = iArr;
        iArr[0] = 6;
        this.f41304n = new String[32];
        this.f41305r = new int[32];
        this.f41293a = reader;
    }

    private final IOException C(String str) throws zzabf {
        throw new zzabf(str.concat(c()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0119, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011b, code lost:
    
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0128, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f41295c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String E(char r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.f0.E(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        throw C("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String J() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r5.f41295c
            int r3 = r3 + r2
            int r4 = r5.f41296d
            if (r3 >= r4) goto L4f
            char[] r4 = r5.f41294b
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5b
            r4 = 10
            if (r3 == r4) goto L5b
            r4 = 12
            if (r3 == r4) goto L5b
            r4 = 13
            if (r3 == r4) goto L5b
            r4 = 32
            if (r3 == r4) goto L5b
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L5b
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5b
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5b
            r4 = 58
            if (r3 == r4) goto L5b
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L5b;
                case 92: goto L48;
                case 93: goto L5b;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r5 = r5.C(r0)
            throw r5
        L4f:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5d
            int r3 = r2 + 1
            boolean r3 = r5.U(r3)
            if (r3 != 0) goto L3
        L5b:
            r1 = r2
            goto L7d
        L5d:
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6a:
            char[] r3 = r5.f41294b
            int r4 = r5.f41295c
            r0.append(r3, r4, r2)
            int r3 = r5.f41295c
            int r3 = r3 + r2
            r5.f41295c = r3
            r2 = 1
            boolean r2 = r5.U(r2)
            if (r2 != 0) goto L2
        L7d:
            if (r0 != 0) goto L89
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.f41294b
            int r3 = r5.f41295c
            r0.<init>(r2, r3, r1)
            goto L94
        L89:
            char[] r2 = r5.f41294b
            int r3 = r5.f41295c
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L94:
            int r2 = r5.f41295c
            int r2 = r2 + r1
            r5.f41295c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.f0.J():java.lang.String");
    }

    private final void M(int i11) {
        int i12 = this.f41303m;
        int[] iArr = this.f41302l;
        if (i12 == iArr.length) {
            int i13 = i12 + i12;
            this.f41302l = Arrays.copyOf(iArr, i13);
            this.f41305r = Arrays.copyOf(this.f41305r, i13);
            this.f41304n = (String[]) Arrays.copyOf(this.f41304n, i13);
        }
        int[] iArr2 = this.f41302l;
        int i14 = this.f41303m;
        this.f41303m = i14 + 1;
        iArr2[i14] = i11;
    }

    private final boolean U(int i11) throws IOException {
        int i12;
        char[] cArr = this.f41294b;
        int i13 = this.f41298f;
        int i14 = this.f41295c;
        this.f41298f = i13 - i14;
        int i15 = this.f41296d;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f41296d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f41296d = 0;
        }
        this.f41295c = 0;
        do {
            Reader reader = this.f41293a;
            int i17 = this.f41296d;
            int i18 = reader.read(cArr, i17, 1024 - i17);
            if (i18 == -1) {
                return false;
            }
            i12 = this.f41296d + i18;
            this.f41296d = i12;
            if (this.f41297e == 0 && this.f41298f == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f41295c++;
                this.f41298f = 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private final boolean V(char c11) throws IOException {
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
        throw C("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final int t(boolean z11) throws IOException {
        char[] cArr = this.f41294b;
        int i11 = this.f41295c;
        int i12 = this.f41296d;
        while (true) {
            if (i11 == i12) {
                this.f41295c = i11;
                if (!U(1)) {
                    if (z11) {
                        throw new EOFException("End of input".concat(c()));
                    }
                    return -1;
                }
                i11 = this.f41295c;
                i12 = this.f41296d;
            }
            int i13 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 == '\n') {
                this.f41297e++;
                this.f41298f = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 != '/') {
                    if (c11 != '#') {
                        this.f41295c = i13;
                        return c11;
                    }
                    this.f41295c = i13;
                    throw C("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                this.f41295c = i13;
                if (i13 == i12) {
                    this.f41295c = i11;
                    boolean zU = U(2);
                    this.f41295c++;
                    if (!zU) {
                        return 47;
                    }
                }
                throw C("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01bb, code lost:
    
        if (V(r12) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01bf, code lost:
    
        if (r9 != 2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c1, code lost:
    
        if (r18 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c7, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c9, code lost:
    
        if (r19 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01cb, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01cd, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01cf, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d3, code lost:
    
        if (r6 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01d5, code lost:
    
        if (r3 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d8, code lost:
    
        if (r3 == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01db, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01dc, code lost:
    
        r24.f41300h = r6;
        r24.f41295c += r8;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e5, code lost:
    
        r24.f41299g = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e8, code lost:
    
        if (r9 == 2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01eb, code lost:
    
        if (r9 == 4) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01ee, code lost:
    
        if (r9 != 7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01f0, code lost:
    
        r24.f41301i = r8;
        r6 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.f0.a():int");
    }

    final String c() {
        int i11 = this.f41297e;
        int i12 = this.f41295c;
        int i13 = this.f41298f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" at line ");
        sb2.append(i11 + 1);
        sb2.append(" column ");
        sb2.append((i12 - i13) + 1);
        sb2.append(" path ");
        StringBuilder sb3 = new StringBuilder();
        sb3.append('$');
        for (int i14 = 0; i14 < this.f41303m; i14++) {
            int i15 = this.f41302l[i14];
            if (i15 == 1 || i15 == 2) {
                int i16 = this.f41305r[i14];
                sb3.append('[');
                sb3.append(i16);
                sb3.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb3.append('.');
                String str = this.f41304n[i14];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41299g = 0;
        this.f41302l[0] = 8;
        this.f41303m = 1;
        this.f41293a.close();
    }

    public final String e() throws IOException {
        String strE;
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 14) {
            strE = J();
        } else if (iA == 12) {
            strE = E('\'');
        } else {
            if (iA != 13) {
                throw new IllegalStateException("Expected a name but was " + ((Object) g0.a(q())) + c());
            }
            strE = E('\"');
        }
        this.f41299g = 0;
        this.f41304n[this.f41303m - 1] = strE;
        return strE;
    }

    public final String f() throws IOException {
        String str;
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 10) {
            str = J();
        } else if (iA == 8) {
            str = E('\'');
        } else if (iA == 9) {
            str = E('\"');
        } else if (iA == 11) {
            str = null;
        } else if (iA == 15) {
            str = Long.toString(this.f41300h);
        } else {
            if (iA != 16) {
                throw new IllegalStateException("Expected a string but was " + ((Object) g0.a(q())) + c());
            }
            str = new String(this.f41294b, this.f41295c, this.f41301i);
            this.f41295c += this.f41301i;
        }
        this.f41299g = 0;
        int[] iArr = this.f41305r;
        int i11 = this.f41303m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final void g() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 3) {
            M(1);
            this.f41305r[this.f41303m - 1] = 0;
            this.f41299g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) g0.a(q())) + c());
        }
    }

    public final void h() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 1) {
            M(3);
            this.f41299g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) g0.a(q())) + c());
        }
    }

    public final void j() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) g0.a(q())) + c());
        }
        int i11 = this.f41303m;
        this.f41303m = i11 - 1;
        int[] iArr = this.f41305r;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f41299g = 0;
    }

    public final void k() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) g0.a(q())) + c());
        }
        int i11 = this.f41303m;
        int i12 = i11 - 1;
        this.f41303m = i12;
        this.f41304n[i12] = null;
        int[] iArr = this.f41305r;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f41299g = 0;
    }

    public final void l() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 7) {
            this.f41299g = 0;
            int[] iArr = this.f41305r;
            int i11 = this.f41303m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + ((Object) g0.a(q())) + c());
    }

    public final boolean n() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        return (iA == 2 || iA == 4 || iA == 17) ? false : true;
    }

    public final boolean o() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 5) {
            this.f41299g = 0;
            int[] iArr = this.f41305r;
            int i11 = this.f41303m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iA == 6) {
            this.f41299g = 0;
            int[] iArr2 = this.f41305r;
            int i12 = this.f41303m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + ((Object) g0.a(q())) + c());
    }

    public final int q() throws IOException {
        int iA = this.f41299g;
        if (iA == 0) {
            iA = a();
        }
        switch (iA) {
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
        return f0.class.getSimpleName().concat(c());
    }
}
