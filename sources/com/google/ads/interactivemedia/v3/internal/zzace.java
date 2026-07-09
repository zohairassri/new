package com.google.ads.interactivemedia.v3.internal;

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
/* JADX INFO: loaded from: classes8.dex */
public class zzace implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private zzvl zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private zzwg zzk;
    private boolean zzl;
    private String zzm;
    private boolean zzn;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            zzb[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzace(Writer writer) {
        zzz(6);
        this.zzk = zzwg.LEGACY_STRICT;
        this.zzn = true;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzo(zzvl.zza);
    }

    private final void zzA(int i11) {
        this.zze[this.zzf - 1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzB(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.zzl
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.zzace.zzc
            goto L9
        L7:
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.zzace.zzb
        L9:
            java.io.Writer r1 = r8.zzd
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L44
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L27
            r6 = r0[r6]
            if (r6 == 0) goto L42
            goto L34
        L27:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2e
            java.lang.String r6 = "\\u2028"
            goto L34
        L2e:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L42
            java.lang.String r6 = "\\u2029"
        L34:
            if (r4 >= r3) goto L3c
            java.io.Writer r7 = r8.zzd
            int r3 = r3 - r4
            r7.write(r9, r4, r3)
        L3c:
            java.io.Writer r3 = r8.zzd
            r3.write(r6)
            r4 = r5
        L42:
            r3 = r5
            goto L16
        L44:
            if (r4 >= r1) goto L4c
            java.io.Writer r0 = r8.zzd
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4c:
            java.io.Writer r8 = r8.zzd
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzace.zzB(java.lang.String):void");
    }

    private final void zzC() throws IOException {
        if (this.zzm != null) {
            int iZza = zza();
            if (iZza == 5) {
                this.zzd.write(this.zzi);
            } else if (iZza != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzy();
            zzA(4);
            zzB(this.zzm);
            this.zzm = null;
        }
    }

    private final int zza() {
        int i11 = this.zzf;
        if (i11 != 0) {
            return this.zze[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final zzace zzv(int i11, int i12, char c11) throws IOException {
        int iZza = zza();
        if (iZza != i12 && iZza != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzm;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (iZza == i12) {
            zzy();
        }
        this.zzd.write(c11);
        return this;
    }

    private final zzace zzw(int i11, char c11) throws IOException {
        zzx();
        zzz(i11);
        this.zzd.write(c11);
        return this;
    }

    private final void zzx() throws IOException {
        int iZza = zza();
        if (iZza == 1) {
            zzA(2);
            zzy();
            return;
        }
        if (iZza == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzy();
        } else {
            if (iZza == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzA(5);
                return;
            }
            if (iZza != 6) {
                if (iZza != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzwg.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzA(7);
        }
    }

    private final void zzy() throws IOException {
        if (this.zzj) {
            return;
        }
        this.zzd.write(this.zzg.zzb());
        int i11 = this.zzf;
        for (int i12 = 1; i12 < i11; i12++) {
            this.zzd.write(this.zzg.zza());
        }
    }

    private final void zzz(int i11) {
        int i12 = this.zzf;
        int[] iArr = this.zze;
        if (i12 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i12 + i12);
        }
        int[] iArr2 = this.zze;
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        iArr2[i13] = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zzd.close();
        int i11 = this.zzf;
        if (i11 > 1 || (i11 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public zzace zzb() throws IOException {
        zzC();
        zzw(1, '[');
        return this;
    }

    public zzace zzc() throws IOException {
        zzC();
        zzw(3, '{');
        return this;
    }

    public zzace zzd() throws IOException {
        zzv(1, 2, ']');
        return this;
    }

    public zzace zze() throws IOException {
        zzv(3, 5, '}');
        return this;
    }

    public zzace zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzm != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZza = zza();
        if (iZza != 3 && iZza != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzm = str;
        return this;
    }

    public zzace zzg() throws IOException {
        if (this.zzm != null) {
            if (!this.zzn) {
                this.zzm = null;
                return this;
            }
            zzC();
        }
        zzx();
        this.zzd.write(Constants.NULL_VERSION_ID);
        return this;
    }

    public zzace zzh(double d11) throws IOException {
        zzC();
        if (this.zzk == zzwg.LENIENT || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            zzx();
            this.zzd.append((CharSequence) Double.toString(d11));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
    }

    public zzace zzi(long j11) throws IOException {
        zzC();
        zzx();
        this.zzd.write(Long.toString(j11));
        return this;
    }

    public zzace zzj(Boolean bool) throws IOException {
        if (bool == null) {
            zzg();
            return this;
        }
        zzC();
        zzx();
        this.zzd.write(true != bool.booleanValue() ? "false" : "true");
        return this;
    }

    public zzace zzk(Number number) throws IOException {
        if (number == null) {
            zzg();
            return this;
        }
        zzC();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.zzk != zzwg.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        zzx();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public zzace zzl(String str) throws IOException {
        if (str == null) {
            zzg();
            return this;
        }
        zzC();
        zzx();
        zzB(str);
        return this;
    }

    public zzace zzm(boolean z11) throws IOException {
        zzC();
        zzx();
        this.zzd.write(true != z11 ? "false" : "true");
        return this;
    }

    public final zzwg zzn() {
        return this.zzk;
    }

    public final void zzo(zzvl zzvlVar) {
        Objects.requireNonNull(zzvlVar);
        this.zzg = zzvlVar;
        this.zzi = ",";
        if (zzvlVar.zzc()) {
            this.zzh = ": ";
            if (this.zzg.zzb().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ":";
        }
        boolean z11 = false;
        if (this.zzg.zzb().isEmpty() && this.zzg.zza().isEmpty()) {
            z11 = true;
        }
        this.zzj = z11;
    }

    public final void zzp(boolean z11) {
        this.zzl = z11;
    }

    public final void zzq(boolean z11) {
        this.zzn = z11;
    }

    public final void zzr(zzwg zzwgVar) {
        Objects.requireNonNull(zzwgVar);
        this.zzk = zzwgVar;
    }

    public final boolean zzs() {
        return this.zzn;
    }

    public final boolean zzt() {
        return this.zzl;
    }

    public final boolean zzu() {
        return this.zzk == zzwg.LENIENT;
    }
}
