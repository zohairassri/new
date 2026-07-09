package com.google.android.gms.internal.pal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f42235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zb f42238d;

    /* synthetic */ yb(zb zbVar, byte[] bArr, xb xbVar) {
        this.f42238d = zbVar;
        this.f42235a = bArr;
    }

    public final yb a(int i11) {
        this.f42237c = i11;
        return this;
    }

    public final yb b(int i11) {
        this.f42236b = i11;
        return this;
    }

    public final synchronized void c() {
        try {
            zb zbVar = this.f42238d;
            if (zbVar.f42276b) {
                zbVar.f42275a.zzj(this.f42235a);
                this.f42238d.f42275a.zzi(this.f42236b);
                this.f42238d.f42275a.zzg(this.f42237c);
                this.f42238d.f42275a.zzh(null);
                this.f42238d.f42275a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
