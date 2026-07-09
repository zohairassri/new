package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class h1 extends e1 {
    @Override // com.google.android.gms.internal.measurement.e1
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }

    private h1() {
    }
}
