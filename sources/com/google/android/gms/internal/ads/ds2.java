package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ds2 implements pq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u64 f25243a;

    public ds2(ru ruVar, u64 u64Var, Context context) {
        this.f25243a = u64Var;
    }

    @Override // com.google.android.gms.internal.ads.pq2
    public final com.google.common.util.concurrent.e zza() {
        return this.f25243a.M0(new Callable(this) { // from class: com.google.android.gms.internal.ads.cs2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new es2(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.pq2
    public final int zzb() {
        return 45;
    }
}
