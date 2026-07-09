package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cf3 {
    public static final af3 a(final ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new af3() { // from class: com.google.android.gms.internal.ads.bf3
            @Override // com.google.android.gms.internal.ads.af3
            public final /* synthetic */ tf0.n0 zza() {
                return tf0.o0.a(tf0.r1.c(executorService));
            }
        };
    }
}
