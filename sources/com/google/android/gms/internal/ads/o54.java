package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o54 extends m54 {
    /* synthetic */ o54(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.m54
    final void a(p54 p54Var, Set set, Set set2) {
        synchronized (p54Var) {
            try {
                if (p54Var.f32711h == null) {
                    p54Var.f32711h = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m54
    final int b(p54 p54Var) {
        int i11;
        synchronized (p54Var) {
            i11 = p54Var.f32712i - 1;
            p54Var.f32712i = i11;
        }
        return i11;
    }
}
