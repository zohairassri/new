package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ iv f27974c;

    /* synthetic */ hv(iv ivVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(ivVar);
        this.f27974c = ivVar;
        this.f27972a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized void c() {
        try {
            iv ivVar = this.f27974c;
            if (ivVar.f28567b) {
                ivVar.f28566a.U2(this.f27972a);
                ivVar.f28566a.zzi(0);
                ivVar.f28566a.L(this.f27973b);
                ivVar.f28566a.w2(null);
                ivVar.f28566a.zzf();
            }
        } catch (RemoteException e11) {
            cm.o.b("Clearcut log failed", e11);
        }
    }

    public final synchronized void a() {
        this.f27974c.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27313a.c();
            }
        });
    }

    public final hv b(int i11) {
        this.f27973b = i11;
        return this;
    }
}
