package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzqh {
    public static int zza(int i11, int i12, String str) {
        String strZzb;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            strZzb = zzqm.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            strZzb = zzqm.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zzj(i11, i12, "index"));
        }
        return i11;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Executor was null.");
    }

    public static void zzd(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z11, String str, char c11) {
        if (!z11) {
            throw new IllegalArgumentException(zzqm.zzb(str, Character.valueOf(c11)));
        }
    }

    public static void zzg(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(zzqm.zzb(str, obj));
        }
    }

    public static void zzh(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? zzj(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? zzj(i12, i13, "end index") : zzqm.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static void zzi(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzqm.zzb("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzqm.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
