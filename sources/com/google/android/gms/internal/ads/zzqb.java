package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqb extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39804b;

    public zzqb(int i11, boolean z11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 26);
        sb2.append("AudioOutput write failed: ");
        sb2.append(i11);
        super(sb2.toString());
        this.f39804b = z11;
        this.f39803a = i11;
    }
}
