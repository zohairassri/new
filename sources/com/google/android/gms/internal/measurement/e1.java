package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e1 f40250a = new h1();

    public static synchronized e1 a() {
        return f40250a;
    }

    public abstract URLConnection b(URL url, String str);
}
