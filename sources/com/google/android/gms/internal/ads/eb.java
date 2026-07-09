package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class eb {
    public static void a(gb gbVar, jb jbVar, np1 np1Var) {
        for (int i11 = 0; i11 < gbVar.zza(); i11++) {
            long jZzb = gbVar.zzb(i11);
            List listZzc = gbVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i11 == gbVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = gbVar.zzb(i11 + 1) - gbVar.zzb(i11);
                if (jZzb2 > 0) {
                    np1Var.zza(new cb(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
