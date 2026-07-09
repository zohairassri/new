package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgjg extends RuntimeException {
    public zzgjg() {
        this(0);
    }

    public zzgjg(int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 3);
        sb2.append("r: ");
        sb2.append(i11);
        super(sb2.toString());
    }

    public zzgjg(int i11, Throwable th2) {
        super("r: 2", th2);
    }
}
