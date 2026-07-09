package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f0 f22651e = new f0(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f22652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f22653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Throwable f22654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f22655d;

    private f0(boolean z11, int i11, int i12, String str, Throwable th2, long j11) {
        this.f22652a = z11;
        this.f22655d = i11;
        this.f22653b = str;
        this.f22654c = th2;
    }

    static f0 b() {
        return f22651e;
    }

    static f0 c(String str) {
        return new f0(false, 1, 5, str, null, -1L);
    }

    static f0 d(String str, Throwable th2) {
        return new f0(false, 1, 5, str, th2, -1L);
    }

    public static f0 f(int i11, long j11) {
        return new f0(true, i11, 1, null, null, j11);
    }

    static f0 g(int i11, int i12, String str, Throwable th2) {
        return new f0(false, i11, i12, str, th2, -1L);
    }

    String a() {
        return this.f22653b;
    }

    final void e() {
        if (this.f22652a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f22654c != null) {
            a();
        } else {
            a();
        }
    }

    /* synthetic */ f0(boolean z11, int i11, int i12, String str, Throwable th2, long j11, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
