package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class w65 extends z65 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Logger f37183a;

    public w65(String str) {
        this.f37183a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.z65
    public final void a(String str) {
        this.f37183a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
