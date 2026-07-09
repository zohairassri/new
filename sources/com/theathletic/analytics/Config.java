package com.theathletic.analytics;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/theathletic/analytics/Config;", "", "", "endpoint", "accessToken", "", "schema", "topic", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "a", QueryKeys.IDLING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class Config {

    @NotNull
    private final String accessToken;

    @NotNull
    private final String endpoint;
    private final int schema;

    @NotNull
    private final String topic;

    public Config(String endpoint, String accessToken, int i11, String topic) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.endpoint = endpoint;
        this.accessToken = accessToken;
        this.schema = i11;
        this.topic = topic;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSchema() {
        return this.schema;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return Intrinsics.areEqual(this.endpoint, config.endpoint) && Intrinsics.areEqual(this.accessToken, config.accessToken) && this.schema == config.schema && Intrinsics.areEqual(this.topic, config.topic);
    }

    public int hashCode() {
        return (((((this.endpoint.hashCode() * 31) + this.accessToken.hashCode()) * 31) + Integer.hashCode(this.schema)) * 31) + this.topic.hashCode();
    }

    public String toString() {
        return "Config(endpoint=" + this.endpoint + ", accessToken=" + this.accessToken + ", schema=" + this.schema + ", topic=" + this.topic + ")";
    }
}
