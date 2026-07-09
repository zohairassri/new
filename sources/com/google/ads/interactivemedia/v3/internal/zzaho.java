package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzaho {
    private static final ThreadLocal zza = new ThreadLocal();
    private boolean zzb = true;
    private final List zzc;
    private String[] zzd;

    public zzaho() {
        ArrayList arrayList = new ArrayList(1);
        this.zzc = arrayList;
        arrayList.add(String.class);
    }

    static Set zza() {
        return (Set) zza.get();
    }

    static zzahw zze(Object obj, Object obj2) {
        return zzahv.zzc(new zzaht(obj), new zzaht(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzf(java.lang.Object r2, java.lang.Object r3, boolean r4, java.lang.Class r5, boolean r6, java.lang.String... r7) {
        /*
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            com.google.ads.interactivemedia.v3.internal.zzaho r4 = new com.google.ads.interactivemedia.v3.internal.zzaho
            r4.<init>()
            r4.zzd = r7
            boolean r5 = r4.zzb
            if (r5 != 0) goto L10
            goto L6c
        L10:
            if (r2 == r3) goto L6c
            java.lang.Class r5 = r2.getClass()
            java.lang.Class r6 = r3.getClass()
            boolean r7 = r5.isInstance(r3)
            r0 = 0
            if (r7 == 0) goto L28
            boolean r7 = r6.isInstance(r2)
            if (r7 != 0) goto L34
            goto L36
        L28:
            boolean r7 = r6.isInstance(r2)
            if (r7 == 0) goto L6a
            boolean r7 = r5.isInstance(r3)
            if (r7 != 0) goto L36
        L34:
            r7 = r5
            goto L37
        L36:
            r7 = r6
        L37:
            boolean r1 = r7.isArray()     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r1 == 0) goto L41
            r4.zzd(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L6c
        L41:
            java.util.List r1 = r4.zzc     // Catch: java.lang.IllegalArgumentException -> L6a
            boolean r5 = r1.contains(r5)     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r5 != 0) goto L63
            java.util.List r5 = r4.zzc     // Catch: java.lang.IllegalArgumentException -> L6a
            boolean r5 = r5.contains(r6)     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r5 == 0) goto L52
            goto L63
        L52:
            r4.zzg(r2, r3, r7)     // Catch: java.lang.IllegalArgumentException -> L6a
        L55:
            java.lang.Class r5 = r7.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r5 == 0) goto L6c
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6a
            r4.zzg(r2, r3, r7)     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L55
        L63:
            boolean r2 = r2.equals(r3)     // Catch: java.lang.IllegalArgumentException -> L6a
            r4.zzb = r2     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L6c
        L6a:
            r4.zzb = r0
        L6c:
            boolean r2 = r4.zzb
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzaho.zzf(java.lang.Object, java.lang.Object, boolean, java.lang.Class, boolean, java.lang.String[]):boolean");
    }

    private final void zzg(Object obj, Object obj2, Class cls) {
        Set setZza = zza();
        zzahw zzahwVarZze = zze(obj, obj2);
        zzahv zzahvVar = (zzahv) zzahwVarZze;
        zzahv zzahvVarZzc = zzahv.zzc((zzaht) zzahvVar.zzb, (zzaht) zzahvVar.zza);
        if (setZza == null || !(setZza.contains(zzahwVarZze) || setZza.contains(zzahvVarZzc))) {
            try {
                Set setZza2 = zza();
                if (setZza2 == null) {
                    setZza2 = new HashSet();
                    zza.set(setZza2);
                }
                setZza2.add(zze(obj, obj2));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (int i11 = 0; i11 < declaredFields.length && this.zzb; i11++) {
                    Field field = declaredFields[i11];
                    if (!zzahl.zza(this.zzd, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(zzahp.class)) {
                        zzd(zzahu.zza(field, obj), zzahu.zza(field, obj2));
                    }
                }
                zzh(obj, obj2);
            } catch (Throwable th2) {
                zzh(obj, obj2);
                throw th2;
            }
        }
    }

    private static void zzh(Object obj, Object obj2) {
        Set setZza = zza();
        if (setZza != null) {
            setZza.remove(zze(obj, obj2));
            if (setZza.isEmpty()) {
                zza.remove();
            }
        }
    }

    public final zzaho zzb(int i11, int i12) {
        if (!this.zzb) {
            return this;
        }
        this.zzb = i11 == i12;
        return this;
    }

    public final zzaho zzc(long j11, long j12) {
        if (!this.zzb) {
            return this;
        }
        this.zzb = j11 == j12;
        return this;
    }

    public final zzaho zzd(Object obj, Object obj2) {
        if (this.zzb && obj != obj2) {
            int i11 = 0;
            if (obj == null || obj2 == null) {
                this.zzb = false;
            } else {
                if (!obj.getClass().isArray()) {
                    this.zzb = obj.equals(obj2);
                    return this;
                }
                if (obj.getClass() != obj2.getClass()) {
                    this.zzb = false;
                    return this;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    long[] jArr2 = (long[]) obj2;
                    if (this.zzb && jArr != jArr2) {
                        if (jArr.length != jArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        while (i11 < jArr.length && this.zzb) {
                            zzc(jArr[i11], jArr2[i11]);
                            i11++;
                        }
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int[] iArr2 = (int[]) obj2;
                    if (this.zzb && iArr != iArr2) {
                        if (iArr.length != iArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        while (i11 < iArr.length && this.zzb) {
                            zzb(iArr[i11], iArr2[i11]);
                            i11++;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    short[] sArr2 = (short[]) obj2;
                    if (this.zzb && sArr != sArr2) {
                        if (sArr.length != sArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        for (int i12 = 0; i12 < sArr.length && this.zzb; i12++) {
                            this.zzb = sArr[i12] == sArr2[i12];
                        }
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    char[] cArr2 = (char[]) obj2;
                    if (this.zzb && cArr != cArr2) {
                        if (cArr.length != cArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        for (int i13 = 0; i13 < cArr.length && this.zzb; i13++) {
                            this.zzb = cArr[i13] == cArr2[i13];
                        }
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (this.zzb && bArr != bArr2) {
                        if (bArr.length != bArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        for (int i14 = 0; i14 < bArr.length && this.zzb; i14++) {
                            this.zzb = bArr[i14] == bArr2[i14];
                        }
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    double[] dArr2 = (double[]) obj2;
                    if (this.zzb && dArr != dArr2) {
                        if (dArr.length != dArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        while (i11 < dArr.length && this.zzb) {
                            zzc(Double.doubleToLongBits(dArr[i11]), Double.doubleToLongBits(dArr2[i11]));
                            i11++;
                        }
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    if (this.zzb && fArr != fArr2) {
                        if (fArr.length != fArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        while (i11 < fArr.length && this.zzb) {
                            zzb(Float.floatToIntBits(fArr[i11]), Float.floatToIntBits(fArr2[i11]));
                            i11++;
                        }
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    boolean[] zArr2 = (boolean[]) obj2;
                    if (this.zzb && zArr != zArr2) {
                        if (zArr.length != zArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        for (int i15 = 0; i15 < zArr.length && this.zzb; i15++) {
                            this.zzb = zArr[i15] == zArr2[i15];
                        }
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    Object[] objArr2 = (Object[]) obj2;
                    if (this.zzb && objArr != objArr2) {
                        if (objArr.length != objArr2.length) {
                            this.zzb = false;
                            return this;
                        }
                        while (i11 < objArr.length && this.zzb) {
                            zzd(objArr[i11], objArr2[i11]);
                            i11++;
                        }
                    }
                }
            }
        }
        return this;
    }
}
