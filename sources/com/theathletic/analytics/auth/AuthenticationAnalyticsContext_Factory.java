package com.theathletic.analytics.auth;

import h90.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AuthenticationAnalyticsContext_Factory implements d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class InstanceHolder {
        static final AuthenticationAnalyticsContext_Factory INSTANCE = new AuthenticationAnalyticsContext_Factory();

        private InstanceHolder() {
        }
    }

    public static AuthenticationAnalyticsContext b() {
        return new AuthenticationAnalyticsContext();
    }

    @Override // ve0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AuthenticationAnalyticsContext get() {
        return b();
    }
}
