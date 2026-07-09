package com.google.android.gms.internal.ads;

import com.caverock.androidsvg.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class z10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z00 f38962a = z00.b("gads:dynamite_load:fail:sample_rate", 10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z00 f38963b = z00.a("gads:report_dynamite_crash_in_background_thread", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z00 f38964c = new z00("gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z00 f38965d = new z00("gads:sdk_crash_report_class_prefix", "com.google.", 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z00 f38966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z00 f38967f;

    static {
        z00.a("gads:sdk_crash_report_enabled", false);
        f38966e = z00.a("gads:sdk_crash_report_full_stacktrace", false);
        f38967f = z00.c("gads:trapped_exception_sample_rate", 0.01d);
    }
}
