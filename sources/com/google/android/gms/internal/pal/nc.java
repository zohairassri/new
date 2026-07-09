package com.google.android.gms.internal.pal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class nc extends gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dd f41599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dd f41600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HttpURLConnection f41601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private jc f41602d;

    nc() {
        lc lcVar = new dd() { // from class: com.google.android.gms.internal.pal.lc
            @Override // com.google.android.gms.internal.pal.dd
            public final Object zza() {
                return -1;
            }
        };
        mc mcVar = new dd() { // from class: com.google.android.gms.internal.pal.mc
            @Override // com.google.android.gms.internal.pal.dd
            public final Object zza() {
                return -1;
            }
        };
        this.f41599a = lcVar;
        this.f41600b = mcVar;
        this.f41602d = null;
    }

    public final URLConnection c(URL url, int i11) {
        final int i12 = 26624;
        this.f41599a = new dd(i12) { // from class: com.google.android.gms.internal.pal.ic
            @Override // com.google.android.gms.internal.pal.dd
            public final Object zza() {
                return 26624;
            }
        };
        this.f41602d = new jc(url);
        hc.b(((Integer) this.f41599a.zza()).intValue(), -1);
        jc jcVar = this.f41602d;
        jcVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) jcVar.f41487a.openConnection();
        this.f41601c = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f41601c;
        hc.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
