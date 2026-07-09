package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24445b;

    private c93(String str, String str2) {
        this.f24444a = str;
        this.f24445b = str2;
    }

    public static c93 a(String str, String str2) {
        na3.c(str, "Name is null or empty");
        na3.c(str2, "Version is null or empty");
        return new c93(str, str2);
    }

    public final String b() {
        return this.f24444a;
    }

    public final String c() {
        return this.f24445b;
    }
}
