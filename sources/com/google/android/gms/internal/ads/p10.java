package com.google.android.gms.internal.ads;

import com.theathletic.pushnotification.component.data.remote.PushNotificationRePromptRemoteDataStore;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z00 f32629a = new z00("gads:gma_attestation:click:macro_string", "@click_attok@", 4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z00 f32630b = new z00("gads:gma_attestation:click:query_param", "attok", 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z00 f32631c = z00.b("gads:gma_attestation:click:timeout", PushNotificationRePromptRemoteDataStore.DEFAULT_DELAY_MS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z00 f32632d = z00.a("gads:gma_attestation:click:enable", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z00 f32633e = z00.b("gads:gma_attestation:click:enable_dynamite_version", 213806100);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z00 f32634f = z00.a("gads:gma_attestation:click:qualification:enable", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z00 f32635g = z00.a("gads:gma_attestation:image_hash", false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z00 f32636h = z00.a("gads:gma_attestation:impression:enable", false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z00 f32637i;

    static {
        z00.a("gads:gma_attestation:request:enable_javascript", false);
        z00.a("gads:gma_attestation:request:enable", true);
        f32637i = z00.a("gads:gma_attestation:click:report_error", true);
    }
}
