package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class FirebaseOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f46387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f46388g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f46392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f46393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f46394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f46395g;

        public Builder() {
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.f46390b, this.f46389a, this.f46391c, this.f46392d, this.f46393e, this.f46394f, this.f46395g);
        }

        @NonNull
        public Builder setApiKey(@NonNull String str) {
            this.f46389a = n.g(str, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String str) {
            this.f46390b = n.g(str, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(String str) {
            this.f46391c = str;
            return this;
        }

        @NonNull
        public Builder setGaTrackingId(String str) {
            this.f46392d = str;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(String str) {
            this.f46393e = str;
            return this;
        }

        @NonNull
        public Builder setProjectId(String str) {
            this.f46395g = str;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(String str) {
            this.f46394f = str;
            return this;
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions) {
            this.f46390b = firebaseOptions.f46383b;
            this.f46389a = firebaseOptions.f46382a;
            this.f46391c = firebaseOptions.f46384c;
            this.f46392d = firebaseOptions.f46385d;
            this.f46393e = firebaseOptions.f46386e;
            this.f46394f = firebaseOptions.f46387f;
            this.f46395g = firebaseOptions.f46388g;
        }
    }

    public static FirebaseOptions fromResource(@NonNull Context context) {
        p pVar = new p(context);
        String strA = pVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new FirebaseOptions(strA, pVar.a("google_api_key"), pVar.a("firebase_database_url"), pVar.a("ga_trackingId"), pVar.a("gcm_defaultSenderId"), pVar.a("google_storage_bucket"), pVar.a("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return m.a(this.f46383b, firebaseOptions.f46383b) && m.a(this.f46382a, firebaseOptions.f46382a) && m.a(this.f46384c, firebaseOptions.f46384c) && m.a(this.f46385d, firebaseOptions.f46385d) && m.a(this.f46386e, firebaseOptions.f46386e) && m.a(this.f46387f, firebaseOptions.f46387f) && m.a(this.f46388g, firebaseOptions.f46388g);
    }

    @NonNull
    public String getApiKey() {
        return this.f46382a;
    }

    @NonNull
    public String getApplicationId() {
        return this.f46383b;
    }

    public String getDatabaseUrl() {
        return this.f46384c;
    }

    public String getGaTrackingId() {
        return this.f46385d;
    }

    public String getGcmSenderId() {
        return this.f46386e;
    }

    public String getProjectId() {
        return this.f46388g;
    }

    public String getStorageBucket() {
        return this.f46387f;
    }

    public int hashCode() {
        return m.b(this.f46383b, this.f46382a, this.f46384c, this.f46385d, this.f46386e, this.f46387f, this.f46388g);
    }

    public String toString() {
        return m.c(this).a("applicationId", this.f46383b).a("apiKey", this.f46382a).a("databaseUrl", this.f46384c).a("gcmSenderId", this.f46386e).a("storageBucket", this.f46387f).a("projectId", this.f46388g).toString();
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        n.q(!t.a(str), "ApplicationId must be set.");
        this.f46383b = str;
        this.f46382a = str2;
        this.f46384c = str3;
        this.f46385d = str4;
        this.f46386e = str5;
        this.f46387f = str6;
        this.f46388g = str7;
    }
}
