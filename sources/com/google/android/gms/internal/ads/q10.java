package com.google.android.gms.internal.ads;

import com.statsig.androidsdk.NetworkFallbackResolverKt;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class q10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z00 f33358a = z00.a("gads:flags_check_if_updating_v3:enabled", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z00 f33359b = z00.a("gads:disable_adapter_flag_shared_pref_listener_v3:enabled", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z00 f33360c = z00.a("gads:disable_flag_shared_pref_listener_v3:enabled", false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z00 f33361d = z00.a("gads:disable_sdkcore_refresh_client:enabled", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z00 f33362e = z00.a("gads:enable_adapter_flags:enabled", false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z00 f33363f = z00.a("gads:include_package_name_v3:enabled", false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z00 f33364g = z00.a("gads:js_flags:mf", false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z00 f33365h = z00.b("gads:js_flags:update_interval", NetworkFallbackResolverKt.COOLDOWN_TIME_MS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z00 f33366i = z00.a("gads:persist_js_flag:ars", true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z00 f33367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z00 f33368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z00 f33369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z00 f33370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z00 f33371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z00 f33372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z00 f33373p;

    static {
        z00.a("gads:persist_js_flag:as", true);
        f33367j = z00.a("gads:persist_js_flag:scar", true);
        f33368k = z00.a("gads:read_local_flags_v3:enabled", false);
        f33369l = z00.a("gads:read_local_flags_cld_v3:enabled", false);
        f33370m = z00.a("gads:save_flags_on_background_thread:enabled", false);
        f33371n = z00.a("gads:write_local_flags_cld_v3:enabled", false);
        f33372o = z00.a("gads:write_local_flags_client_v3:enabled", false);
        f33373p = z00.a("gads:write_local_flags_service_v3:enabled", false);
    }
}
