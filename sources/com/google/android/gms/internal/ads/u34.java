package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class u34 extends l34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f35888a;

    @Override // com.google.android.gms.internal.ads.l34
    public final /* bridge */ /* synthetic */ InputStream a() {
        return new FileInputStream(this.f35888a);
    }

    public final String toString() {
        String string = this.f35888a.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 20);
        sb2.append("Files.asByteSource(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
