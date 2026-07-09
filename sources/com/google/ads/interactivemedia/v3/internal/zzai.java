package com.google.ads.interactivemedia.v3.internal;

import com.comscore.util.crashreport.CrashReportManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzai extends zzady implements zzafc {
    private static final zzai zzb;
    private int zzd;
    private boolean zze;
    private int zzf = CrashReportManager.TIME_WINDOW;
    private boolean zzg;
    private boolean zzh;

    static {
        zzai zzaiVar = new zzai();
        zzb = zzaiVar;
        zzady.zzaM(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    public static zzah zzb() {
        return (zzah) zzb.zzay();
    }

    public static zzai zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzai zzaiVar, boolean z11) {
        zzaiVar.zzd |= 1;
        zzaiVar.zze = true;
    }

    public final int zza() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzai();
        }
        zzag zzagVar = null;
        if (i12 == 4) {
            return new zzah(zzagVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
