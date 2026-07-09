package com.google.android.gms.internal.ads;

import com.theathletic.pushnotification.component.data.remote.PushNotificationRePromptRemoteDataStore;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z00 f26032a = z00.a("gads:trustless_token_for_decagon:enabled", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z00 f26033b;

    static {
        z00.a("gads:invalidate_token_at_refresh_start", true);
        z00.a("gms:expose_token_for_gma:enabled", true);
        z00.a("gads:referesh_rate_limit", false);
        f26033b = z00.b("gads:timeout_for_trustless_token:millis", PushNotificationRePromptRemoteDataStore.DEFAULT_DELAY_MS);
        z00.a("gads:token_anonymization:enabled", true);
        z00.b("gads:cached_token:ttl_millis", 10800000L);
    }
}
