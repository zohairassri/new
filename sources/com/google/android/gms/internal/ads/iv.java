package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    yr f28566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f28567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f28568c;

    public iv() {
        this.f28568c = cm.b.f17956b;
    }

    final /* synthetic */ ExecutorService a() {
        return this.f28568c;
    }

    public iv(final Context context) {
        ExecutorService executorService = cm.b.f17956b;
        this.f28568c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ev
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) yl.e.c().d(oz.f32205d6)).booleanValue();
                Context context2 = context;
                iv ivVar = this.f25936a;
                if (zBooleanValue) {
                    try {
                        ivVar.f28566a = (yr) cm.r.a(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", fv.f26585a);
                        ivVar.f28566a.zze(com.google.android.gms.dynamic.b.k1(context2), "GMA_SDK");
                        ivVar.f28567b = true;
                    } catch (RemoteException | zzr | NullPointerException unused) {
                        cm.o.a("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
