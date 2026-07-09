package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ed2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ fe2 f25701a;

    /* synthetic */ ed2(fe2 fe2Var, byte[] bArr) {
        Objects.requireNonNull(fe2Var);
        this.f25701a = fe2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f25701a.f().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ec2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25695a.f25701a.d(context);
            }
        });
    }
}
