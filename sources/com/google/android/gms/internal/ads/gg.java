package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f26988a;

    public gg(Bundle bundle) {
        this.f26988a = bundle;
    }

    public final String a() {
        return this.f26988a.getString("install_referrer");
    }

    public final long b() {
        return this.f26988a.getLong("referrer_click_timestamp_seconds");
    }

    public final long c() {
        return this.f26988a.getLong("install_begin_timestamp_seconds");
    }

    public final boolean d() {
        return this.f26988a.getBoolean("google_play_instant");
    }

    public final long e() {
        return this.f26988a.getLong("referrer_click_timestamp_server_seconds");
    }

    public final long f() {
        return this.f26988a.getLong("install_begin_timestamp_server_seconds");
    }

    public final String g() {
        return this.f26988a.getString("install_version");
    }
}
