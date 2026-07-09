package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zzicg extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39786a;

    public zzicg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.f39786a = true;
    }

    final boolean b() {
        return this.f39786a;
    }

    public zzicg(String str) {
        super(str);
    }

    public zzicg(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
