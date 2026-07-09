package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class bg implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fg f23903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ eg f23904b;

    /* synthetic */ bg(eg egVar, fg fgVar, byte[] bArr) {
        Objects.requireNonNull(egVar);
        this.f23904b = egVar;
        this.f23903a = fgVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hg.a("InstallReferrerClient", "Install Referrer service connected.");
        eg egVar = this.f23904b;
        egVar.f(tr.n7(iBinder));
        egVar.e(2);
        this.f23903a.zza(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        hg.b("InstallReferrerClient", "Install Referrer service disconnected.");
        eg egVar = this.f23904b;
        egVar.f(null);
        egVar.e(0);
    }
}
