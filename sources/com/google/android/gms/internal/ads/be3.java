package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class be3 extends td3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private by3 f23848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private by3 f23849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vd3 f23850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f23851d;

    be3(by3 by3Var, by3 by3Var2, vd3 vd3Var) {
        this.f23848a = by3Var;
        this.f23849b = by3Var2;
        this.f23850c = vd3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer c() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer e() {
        return -1;
    }

    public static void g(HttpURLConnection httpURLConnection) {
        ud3.b();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g(this.f23851d);
    }

    public HttpURLConnection f(vd3 vd3Var, final int i11, final int i12) {
        this.f23848a = new by3() { // from class: com.google.android.gms.internal.ads.yd3
            @Override // com.google.android.gms.internal.ads.by3
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.f23849b = new by3() { // from class: com.google.android.gms.internal.ads.zd3
            @Override // com.google.android.gms.internal.ads.by3
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i12);
            }
        };
        this.f23850c = vd3Var;
        return h();
    }

    public HttpURLConnection h() {
        ud3.a(((Integer) this.f23848a.zza()).intValue(), ((Integer) this.f23849b.zza()).intValue());
        vd3 vd3Var = this.f23850c;
        vd3Var.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) vd3Var.zza();
        this.f23851d = httpURLConnection;
        return httpURLConnection;
    }

    be3() {
        this(ae3.f23276a, xd3.f37913a, null);
    }
}
