package com.google.ads.interactivemedia.v3.internal;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzvf {
    private String zza = null;

    public final zzvf zza(String str) {
        String.format(Locale.ROOT, "imasdk-%d", 0);
        this.zza = "imasdk-%d";
        return this;
    }

    public final ThreadFactory zzb() {
        String str = this.zza;
        return new zzve(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, null, null, null);
    }
}
