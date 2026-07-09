package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzqc {
    private final String zza;
    private final zzqa zzb;
    private zzqa zzc;

    /* synthetic */ zzqc(String str, zzqb zzqbVar) {
        zzqa zzqaVar = new zzqa();
        this.zzb = zzqaVar;
        this.zzc = zzqaVar;
        str.getClass();
        this.zza = str;
    }

    private final zzqa zzc() {
        zzqa zzqaVar = new zzqa();
        this.zzc.zzc = zzqaVar;
        this.zzc = zzqaVar;
        return zzqaVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzqa zzqaVar = this.zzb.zzc;
        String str = "";
        while (zzqaVar != null) {
            Object obj = zzqaVar.zzb;
            sb2.append(str);
            String str2 = zzqaVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            zzqaVar = zzqaVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzqc zza(String str, Object obj) {
        zzqa zzqaVarZzc = zzc();
        zzqaVarZzc.zzb = obj;
        zzqaVarZzc.zza = "consentKeyTypes";
        return this;
    }

    public final zzqc zzb(Object obj) {
        zzc().zzb = obj;
        return this;
    }
}
