package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f23820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ cd3 f23823d;

    /* synthetic */ bd3(cd3 cd3Var, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(cd3Var);
        this.f23823d = cd3Var;
        this.f23820a = bArr;
    }

    public final synchronized void a() {
        try {
            cd3 cd3Var = this.f23823d;
            if (cd3Var.f24531b) {
                fd3 fd3Var = cd3Var.f24530a;
                fd3Var.o2(this.f23820a);
                fd3Var.zzh(this.f23821b);
                fd3Var.zzi(this.f23822c);
                fd3Var.J3(null);
                fd3Var.zze();
            }
        } catch (RemoteException unused) {
        }
    }

    public final bd3 b(int i11) {
        this.f23821b = i11;
        return this;
    }

    public final bd3 c(int i11) {
        this.f23822c = i11;
        return this;
    }
}
