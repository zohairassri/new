package com.theathletic.analytics.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theathletic/analytics/auth/AuthenticationAnalyticsContext;", "", "<init>", "()V", "Lcom/theathletic/analytics/auth/AuthenticationNavigationSource;", "navigationSource", "Lcom/theathletic/analytics/auth/AuthenticationNavigationSource;", "getNavigationSource", "()Lcom/theathletic/analytics/auth/AuthenticationNavigationSource;", "a", "(Lcom/theathletic/analytics/auth/AuthenticationNavigationSource;)V", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthenticationAnalyticsContext {
    public static final int $stable = 8;

    @NotNull
    private AuthenticationNavigationSource navigationSource = AuthenticationNavigationSource.START_SCREEN;

    public final void a(AuthenticationNavigationSource authenticationNavigationSource) {
        Intrinsics.checkNotNullParameter(authenticationNavigationSource, "<set-?>");
        this.navigationSource = authenticationNavigationSource;
    }
}
