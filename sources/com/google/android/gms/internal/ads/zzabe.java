package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzabe extends IOException {
    public zzabe(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String strConcat = th2.getMessage() != null ? ": ".concat(String.valueOf(th2.getMessage())) : "";
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 11 + strConcat.length());
        sb2.append("Unexpected ");
        sb2.append(simpleName);
        sb2.append(strConcat);
        super(sb2.toString(), th2);
    }
}
