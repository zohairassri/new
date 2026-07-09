package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ne1 extends if1 implements h50 {
    public ne1(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.h50
    public final synchronized void B0(final String str, final String str2) {
        j0(new hf1() { // from class: com.google.android.gms.internal.ads.me1
            @Override // com.google.android.gms.internal.ads.hf1
            public final /* synthetic */ void zza(Object obj) {
                ((rl.c) obj).D(str, str2);
            }
        });
    }
}
