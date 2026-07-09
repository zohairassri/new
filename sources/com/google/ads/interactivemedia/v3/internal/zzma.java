package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzma {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* synthetic */ zzma(int i11, String str, Object obj, Object obj2, zzlz zzlzVar) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        zzls.zza().zzb(this);
    }

    public static zzma zze(int i11, String str, float f11, float f12) {
        return new zzlx(1, str, Float.valueOf(f11), Float.valueOf(f12));
    }

    public static zzma zzf(int i11, String str, int i12, int i13) {
        return new zzlv(1, str, Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static zzma zzg(int i11, String str, long j11, long j12) {
        return new zzlw(1, str, Long.valueOf(j11), Long.valueOf(j12));
    }

    public static zzma zzh(int i11, String str) {
        zzly zzlyVar = new zzly(1, "gads:sdk_core_constants:experiment_id", null, null);
        zzls.zza().zza(zzlyVar);
        return zzlyVar;
    }

    protected abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    protected abstract Object zzc(SharedPreferences sharedPreferences);

    public final int zzd() {
        return this.zza;
    }

    public final Object zzi() {
        return zzls.zzc().zzd() ? this.zzd : this.zzc;
    }

    public final String zzj() {
        return this.zzb;
    }
}
