package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class fi implements wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f26353a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26354b;

    fi(Context context) {
        this.f26354b = context;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final File zza() {
        if (this.f26353a == null) {
            this.f26353a = new File(this.f26354b.getCacheDir(), "volley");
        }
        return this.f26353a;
    }
}
