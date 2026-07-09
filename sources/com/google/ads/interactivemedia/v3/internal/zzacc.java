package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class zzacc implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private String zzk;
    private int[] zzl;
    private String[] zzn;
    private int[] zzo;
    private zzwg zzc = zzwg.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzm = 1;

    static {
        zzxp.zza = new zzacb();
    }

    public zzacc(Reader reader) {
        int[] iArr = new int[32];
        this.zzl = iArr;
        iArr[0] = 6;
        this.zzn = new String[32];
        this.zzo = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private String zzA(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i11 = 0;
        while (true) {
            int i12 = this.zzm;
            if (i11 >= i12) {
                return sb2.toString();
            }
            int i13 = this.zzl[i11];
            switch (i13) {
                case 1:
                case 2:
                    int i14 = this.zzo[i11];
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
                    String str = this.zzn[i11];
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        r0.append(r4, r2, r3);
        r10.zze = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzB(char r11) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
        L1:
            int r1 = r10.zze
            int r2 = r10.zzf
            r3 = r2
            r2 = r1
        L7:
            char[] r4 = r10.zzd
            r5 = 16
            r6 = 1
            if (r1 >= r3) goto L6f
            int r7 = r1 + 1
            char r1 = r4[r1]
            com.google.ads.interactivemedia.v3.internal.zzwg r8 = r10.zzc
            com.google.ads.interactivemedia.v3.internal.zzwg r9 = com.google.ads.interactivemedia.v3.internal.zzwg.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r1 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.ads.interactivemedia.v3.internal.zzacf r10 = r10.zzy(r11)
            throw r10
        L24:
            if (r1 != r11) goto L3c
            int r11 = r7 - r2
            int r11 = r11 + (-1)
            r10.zze = r7
            if (r0 != 0) goto L34
            java.lang.String r10 = new java.lang.String
            r10.<init>(r4, r2, r11)
            return r10
        L34:
            r0.append(r4, r2, r11)
            java.lang.String r10 = r0.toString()
            return r10
        L3c:
            r8 = 92
            if (r1 != r8) goto L62
            int r1 = r7 - r2
            int r3 = r1 + (-1)
            r10.zze = r7
            if (r0 != 0) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r0.<init>(r1)
        L52:
            r0.append(r4, r2, r3)
            char r1 = r10.zzd()
            r0.append(r1)
            int r2 = r10.zze
            int r3 = r10.zzf
            r1 = r2
            goto L7
        L62:
            r4 = 10
            if (r1 != r4) goto L6d
            int r1 = r10.zzg
            int r1 = r1 + r6
            r10.zzg = r1
            r10.zzh = r7
        L6d:
            r1 = r7
            goto L7
        L6f:
            int r3 = r1 - r2
            if (r0 != 0) goto L7f
            int r0 = r3 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r5)
            r7.<init>(r0)
            r0 = r7
        L7f:
            r0.append(r4, r2, r3)
            r10.zze = r1
            boolean r1 = r10.zzI(r6)
            if (r1 == 0) goto L8c
            goto L1
        L8c:
            java.lang.String r11 = "Unterminated string"
            com.google.ads.interactivemedia.v3.internal.zzacf r10 = r10.zzy(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacc.zzB(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        zzD();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzC() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.zze
            int r3 = r3 + r2
            int r4 = r5.zzf
            if (r3 >= r4) goto L4c
            char[] r4 = r5.zzd
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
            r5.zzD()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.zzI(r3)
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
            char[] r3 = r5.zzd
            int r4 = r5.zze
            r1.append(r3, r4, r2)
            int r3 = r5.zze
            int r3 = r3 + r2
            r5.zze = r3
            r2 = 1
            boolean r2 = r5.zzI(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.zzd
            java.lang.String r2 = new java.lang.String
            int r3 = r5.zze
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.zzd
            int r3 = r5.zze
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.zze
            int r1 = r1 + r0
            r5.zze = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacc.zzC():java.lang.String");
    }

    private final void zzD() throws zzacf {
        if (this.zzc != zzwg.LENIENT) {
            throw zzy("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzE(int i11) throws zzacf {
        int i12 = this.zzm;
        if (i12 - 1 >= 1280) {
            throw new zzacf("Nesting limit 1280 reached" + zzv());
        }
        int[] iArr = this.zzl;
        if (i12 == iArr.length) {
            int i13 = i12 + i12;
            this.zzl = Arrays.copyOf(iArr, i13);
            this.zzo = Arrays.copyOf(this.zzo, i13);
            this.zzn = (String[]) Arrays.copyOf(this.zzn, i13);
        }
        int[] iArr2 = this.zzl;
        int i14 = this.zzm;
        this.zzm = i14 + 1;
        iArr2[i14] = i11;
    }

    private final void zzF(char c11) throws IOException {
        do {
            int i11 = this.zze;
            int i12 = this.zzf;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = this.zzd[i11];
                if (c12 == c11) {
                    this.zze = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.zze = i13;
                    zzd();
                    i11 = this.zze;
                    i12 = this.zzf;
                } else {
                    if (c12 == '\n') {
                        this.zzg++;
                        this.zzh = i13;
                    }
                    i11 = i13;
                }
            }
            this.zze = i11;
        } while (zzI(1));
        throw zzy("Unterminated string");
    }

    private final void zzG() throws IOException {
        char c11;
        do {
            if (this.zze >= this.zzf && !zzI(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i11 = this.zze;
            int i12 = i11 + 1;
            this.zze = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.zzg++;
                this.zzh = i12;
                return;
            }
        } while (c11 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        zzD();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzH() throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r4.zze
            int r2 = r2 + r1
            int r3 = r4.zzf
            if (r2 >= r3) goto L50
            char[] r3 = r4.zzd
            char r2 = r3[r2]
            r3 = 9
            if (r2 == r3) goto L4a
            r3 = 10
            if (r2 == r3) goto L4a
            r3 = 12
            if (r2 == r3) goto L4a
            r3 = 13
            if (r2 == r3) goto L4a
            r3 = 32
            if (r2 == r3) goto L4a
            r3 = 35
            if (r2 == r3) goto L47
            r3 = 44
            if (r2 == r3) goto L4a
            r3 = 47
            if (r2 == r3) goto L47
            r3 = 61
            if (r2 == r3) goto L47
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L4a
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L4a
            r3 = 58
            if (r2 == r3) goto L4a
            r3 = 59
            if (r2 == r3) goto L47
            switch(r2) {
                case 91: goto L4a;
                case 92: goto L47;
                case 93: goto L4a;
                default: goto L44;
            }
        L44:
            int r1 = r1 + 1
            goto L2
        L47:
            r4.zzD()
        L4a:
            int r0 = r4.zze
            int r0 = r0 + r1
            r4.zze = r0
            return
        L50:
            r4.zze = r2
            r1 = 1
            boolean r1 = r4.zzI(r1)
            if (r1 == 0) goto L5a
            goto L1
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacc.zzH():void");
    }

    private final boolean zzI(int i11) throws IOException {
        int i12;
        int i13 = this.zzh;
        int i14 = this.zze;
        this.zzh = i13 - i14;
        char[] cArr = this.zzd;
        int i15 = this.zzf;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.zzf = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i17 = this.zzf;
            int i18 = reader.read(cArr, i17, 1024 - i17);
            if (i18 == -1) {
                return false;
            }
            i12 = this.zzf + i18;
            this.zzf = i12;
            if (this.zzg == 0 && this.zzh == 0 && i12 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private final boolean zzJ(char c11) throws IOException {
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
        zzD();
        return false;
    }

    private final char zzd() throws IOException {
        int i11;
        if (this.zze == this.zzf && !zzI(1)) {
            throw zzy("Unterminated escape sequence");
        }
        char[] cArr = this.zzd;
        int i12 = this.zze;
        int i13 = i12 + 1;
        this.zze = i13;
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
                            throw zzy("Invalid escape sequence");
                        }
                        if (i12 + 5 > this.zzf && !zzI(4)) {
                            throw zzy("Unterminated escape sequence");
                        }
                        int i14 = this.zze;
                        int i15 = i14 + 4;
                        int i16 = 0;
                        while (i14 < i15) {
                            char[] cArr2 = this.zzd;
                            int i17 = i16 << 4;
                            char c12 = cArr2[i14];
                            if (c12 >= '0' && c12 <= '9') {
                                i11 = c12 - '0';
                            } else if (c12 >= 'a' && c12 <= 'f') {
                                i11 = c12 - 'W';
                            } else {
                                if (c12 < 'A' || c12 > 'F') {
                                    throw zzy("Malformed Unicode escape \\u".concat(new String(cArr2, this.zze, 4)));
                                }
                                i11 = c12 - '7';
                            }
                            i16 = i17 + i11;
                            i14++;
                        }
                        this.zze += 4;
                        return (char) i16;
                    }
                }
            }
            return c11;
        }
        if (this.zzc == zzwg.STRICT) {
            throw zzy("Cannot escape a newline character in strict mode");
        }
        this.zzg++;
        this.zzh = i13;
        if (this.zzc == zzwg.STRICT) {
            throw zzy("Invalid escaped character \"'\" in strict mode");
        }
        return c11;
    }

    private final int zzn(boolean z11) throws IOException {
        int i11;
        int i12 = this.zze;
        int i13 = this.zzf;
        while (true) {
            if (i12 == i13) {
                this.zze = i12;
                if (!zzI(1)) {
                    if (z11) {
                        throw new EOFException("End of input".concat(zzv()));
                    }
                    return -1;
                }
                i12 = this.zze;
                i13 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i14 = i12 + 1;
            char c11 = cArr[i12];
            if (c11 == '\n') {
                this.zzg++;
                this.zzh = i14;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.zze = i14;
                    if (i14 == i13) {
                        this.zze = i12;
                        boolean zZzI = zzI(2);
                        this.zze++;
                        if (!zZzI) {
                            return 47;
                        }
                    }
                    zzD();
                    int i15 = this.zze;
                    char c12 = cArr[i15];
                    if (c12 == '*') {
                        this.zze = i15 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzI(2)) {
                                throw zzy("Unterminated comment");
                            }
                            char[] cArr2 = this.zzd;
                            int i16 = this.zze;
                            if (cArr2[i16] != '\n') {
                                while (i11 < 2) {
                                    i11 = this.zzd[this.zze + i11] == "*/".charAt(i11) ? i11 + 1 : 0;
                                }
                                i12 = this.zze + 2;
                                i13 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i16 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c12 != '/') {
                            return 47;
                        }
                        this.zze = i15 + 1;
                        zzG();
                        i12 = this.zze;
                        i13 = this.zzf;
                    }
                } else {
                    if (c11 != '#') {
                        this.zze = i14;
                        return c11;
                    }
                    this.zze = i14;
                    zzD();
                    zzG();
                    i12 = this.zze;
                    i13 = this.zzf;
                }
            }
            i12 = i14;
        }
    }

    private final zzacf zzy(String str) throws zzacf {
        throw new zzacf(str + zzv() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IllegalStateException zzz(String str) throws IOException {
        int iZzr = zzr();
        String strZza = zzacd.zza(zzr());
        String strZzv = zzv();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(str);
        sb2.append(" but was ");
        sb2.append(strZza);
        sb2.append(strZzv);
        sb2.append("\nSee ");
        sb2.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iZzr == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sb2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zza = 0;
        this.zzl[0] = 8;
        this.zzm = 1;
        this.zzb.close();
    }

    public String toString() {
        return getClass().getSimpleName().concat(zzv());
    }

    public double zza() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs == 15) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i11 = this.zzm - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.zzi;
        }
        if (iZzs == 16) {
            char[] cArr = this.zzd;
            int i12 = this.zze;
            int i13 = this.zzj;
            this.zzk = new String(cArr, i12, i13);
            this.zze = i12 + i13;
        } else if (iZzs == 8 || iZzs == 9) {
            this.zzk = zzB(iZzs == 8 ? '\'' : '\"');
        } else if (iZzs == 10) {
            this.zzk = zzC();
        } else if (iZzs != 11) {
            throw zzz("a double");
        }
        this.zza = 11;
        double d11 = Double.parseDouble(this.zzk);
        if (this.zzc != zzwg.LENIENT && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw zzy("JSON forbids NaN and infinities: " + d11);
        }
        this.zzk = null;
        this.zza = 0;
        int[] iArr2 = this.zzo;
        int i14 = this.zzm - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return d11;
    }

    public int zzb() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs == 15) {
            long j11 = this.zzi;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.zza = 0;
                int[] iArr = this.zzo;
                int i12 = this.zzm - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + j11 + zzv());
        }
        if (iZzs == 16) {
            char[] cArr = this.zzd;
            int i13 = this.zze;
            int i14 = this.zzj;
            this.zzk = new String(cArr, i13, i14);
            this.zze = i13 + i14;
        } else {
            if (iZzs != 8 && iZzs != 9 && iZzs != 10) {
                throw zzz("an int");
            }
            if (iZzs == 10) {
                this.zzk = zzC();
            } else {
                this.zzk = zzB(iZzs == 8 ? '\'' : '\"');
            }
            try {
                int i15 = Integer.parseInt(this.zzk);
                this.zza = 0;
                int[] iArr2 = this.zzo;
                int i16 = this.zzm - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return i15;
            } catch (NumberFormatException unused) {
            }
        }
        this.zza = 11;
        double d11 = Double.parseDouble(this.zzk);
        int i17 = (int) d11;
        if (i17 == d11) {
            this.zzk = null;
            this.zza = 0;
            int[] iArr3 = this.zzo;
            int i18 = this.zzm - 1;
            iArr3[i18] = iArr3[i18] + 1;
            return i17;
        }
        throw new NumberFormatException("Expected an int but was " + this.zzk + zzv());
    }

    public long zzc() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs == 15) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i11 = this.zzm - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.zzi;
        }
        if (iZzs == 16) {
            char[] cArr = this.zzd;
            int i12 = this.zze;
            int i13 = this.zzj;
            this.zzk = new String(cArr, i12, i13);
            this.zze = i12 + i13;
        } else {
            if (iZzs != 8 && iZzs != 9 && iZzs != 10) {
                throw zzz("a long");
            }
            if (iZzs == 10) {
                this.zzk = zzC();
            } else {
                this.zzk = zzB(iZzs == 8 ? '\'' : '\"');
            }
            try {
                long j11 = Long.parseLong(this.zzk);
                this.zza = 0;
                int[] iArr2 = this.zzo;
                int i14 = this.zzm - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        }
        this.zza = 11;
        double d11 = Double.parseDouble(this.zzk);
        long j12 = (long) d11;
        if (j12 == d11) {
            this.zzk = null;
            this.zza = 0;
            int[] iArr3 = this.zzo;
            int i15 = this.zzm - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return j12;
        }
        throw new NumberFormatException("Expected a long but was " + this.zzk + zzv());
    }

    public String zze() {
        return zzA(false);
    }

    public String zzf() {
        return zzA(true);
    }

    public String zzg() throws IOException {
        String strZzB;
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs == 14) {
            strZzB = zzC();
        } else if (iZzs == 12) {
            strZzB = zzB('\'');
        } else {
            if (iZzs != 13) {
                throw zzz("a name");
            }
            strZzB = zzB('\"');
        }
        this.zza = 0;
        this.zzn[this.zzm - 1] = strZzB;
        return strZzB;
    }

    public String zzh() throws IOException {
        String string;
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs == 10) {
            string = zzC();
        } else if (iZzs == 8) {
            string = zzB('\'');
        } else if (iZzs == 9) {
            string = zzB('\"');
        } else if (iZzs == 11) {
            string = this.zzk;
            this.zzk = null;
        } else if (iZzs == 15) {
            string = Long.toString(this.zzi);
        } else {
            if (iZzs != 16) {
                throw zzz("a string");
            }
            String str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            string = str;
        }
        this.zza = 0;
        int[] iArr = this.zzo;
        int i11 = this.zzm - 1;
        iArr[i11] = iArr[i11] + 1;
        return string;
    }

    public void zzi() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs != 3) {
            throw zzz("BEGIN_ARRAY");
        }
        zzE(1);
        this.zzo[this.zzm - 1] = 0;
        this.zza = 0;
    }

    public void zzj() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs != 1) {
            throw zzz("BEGIN_OBJECT");
        }
        zzE(3);
        this.zza = 0;
    }

    public void zzk() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs != 4) {
            throw zzz("END_ARRAY");
        }
        int i11 = this.zzm;
        this.zzm = i11 - 1;
        int[] iArr = this.zzo;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.zza = 0;
    }

    public void zzl() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs != 2) {
            throw zzz("END_OBJECT");
        }
        int i11 = this.zzm;
        int i12 = i11 - 1;
        this.zzm = i12;
        this.zzn[i12] = null;
        int[] iArr = this.zzo;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.zza = 0;
    }

    public void zzm() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs != 7) {
            throw zzz(Constants.NULL_VERSION_ID);
        }
        this.zza = 0;
        int[] iArr = this.zzo;
        int i11 = this.zzm - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void zzo() throws IOException {
        int i11 = 0;
        do {
            int iZzs = this.zza;
            if (iZzs == 0) {
                iZzs = zzs();
            }
            switch (iZzs) {
                case 1:
                    zzE(3);
                    i11++;
                    this.zza = 0;
                    break;
                case 2:
                    if (i11 == 0) {
                        this.zzn[this.zzm - 1] = null;
                        i11 = 0;
                    }
                    this.zzm--;
                    i11--;
                    this.zza = 0;
                    break;
                case 3:
                    zzE(1);
                    i11++;
                    this.zza = 0;
                    break;
                case 4:
                    this.zzm--;
                    i11--;
                    this.zza = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.zza = 0;
                    break;
                case 8:
                    zzF('\'');
                    this.zza = 0;
                    break;
                case 9:
                    zzF('\"');
                    this.zza = 0;
                    break;
                case 10:
                    zzH();
                    this.zza = 0;
                    break;
                case 12:
                    zzF('\'');
                    if (i11 == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i11 = 0;
                    }
                    this.zza = 0;
                    break;
                case 13:
                    zzF('\"');
                    if (i11 == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i11 = 0;
                    }
                    this.zza = 0;
                    break;
                case 14:
                    zzH();
                    if (i11 == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i11 = 0;
                    }
                    this.zza = 0;
                    break;
                case 16:
                    this.zze += this.zzj;
                    this.zza = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i11 > 0);
        int[] iArr = this.zzo;
        int i12 = this.zzm - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public boolean zzp() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        return (iZzs == 2 || iZzs == 4 || iZzs == 17) ? false : true;
    }

    public boolean zzq() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        if (iZzs == 5) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i11 = this.zzm - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iZzs != 6) {
            throw zzz("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzo;
        int i12 = this.zzm - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public int zzr() throws IOException {
        int iZzs = this.zza;
        if (iZzs == 0) {
            iZzs = zzs();
        }
        switch (iZzs) {
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

    /* JADX WARN: Code restructure failed: missing block: B:161:0x022a, code lost:
    
        if (zzJ(r8) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0245, code lost:
    
        if (r3 == 0) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0294 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzs() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacc.zzs():int");
    }

    public final zzwg zzt() {
        return this.zzc;
    }

    String zzv() {
        int i11 = this.zzg + 1;
        int i12 = this.zze - this.zzh;
        return " at line " + i11 + " column " + (i12 + 1) + " path " + zze();
    }

    public final void zzw(zzwg zzwgVar) {
        Objects.requireNonNull(zzwgVar);
        this.zzc = zzwgVar;
    }

    public final boolean zzx() {
        return this.zzc == zzwg.LENIENT;
    }
}
