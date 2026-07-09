package com.theathletic.analytics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"staging", "Lcom/theathletic/analytics/Config;", "prod", "mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsEndpointConfigKt {

    @NotNull
    private static final Config staging = new Config("https://analytic-proxy-staging.theathletic.com", "e3p2NHDerBNWkeKQ3suKC6dywRo6xMQ7", 26, "staging-android-events");

    @NotNull
    private static final Config prod = new Config("https://analytic-proxy.theathletic.com", "3Jsgsg2EeX24F96WMFURVhaQKfnAuMZM", 26, "production-android-events");
}
