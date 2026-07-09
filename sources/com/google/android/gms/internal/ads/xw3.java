package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xw3 implements kx3 {
    protected xw3() {
    }

    public static xw3 b(char c11) {
        return new uw3(c11);
    }

    public abstract boolean a(char c11);

    @Override // com.google.android.gms.internal.ads.kx3
    public final /* synthetic */ boolean zza(Object obj) {
        return a(((Character) obj).charValue());
    }
}
