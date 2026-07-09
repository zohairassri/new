package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p65 extends s65 implements mi {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final String f32751h = "moov";

    public p65(String str) {
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void a(t65 t65Var, ByteBuffer byteBuffer, long j11, ji jiVar) {
        t65Var.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f34552b = t65Var;
        this.f34554d = t65Var.zzc();
        t65Var.r(t65Var.zzc() + j11);
        this.f34555e = t65Var.zzc();
        this.f34551a = jiVar;
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final String zza() {
        return this.f32751h;
    }
}
