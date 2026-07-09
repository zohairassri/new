package com.theathletic.analytics.monitoring;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/theathletic/analytics/monitoring/MonitoringSampleRate;", "", "", "tracing", "liveSession", "webView", "<init>", "(DDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.FORCE_DECAY, QueryKeys.PAGE_LOAD_TIME, "()D", "a", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MonitoringSampleRate {
    public static final int $stable = 0;
    private final double liveSession;
    private final double tracing;
    private final double webView;

    public MonitoringSampleRate() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getLiveSession() {
        return this.liveSession;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getTracing() {
        return this.tracing;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getWebView() {
        return this.webView;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonitoringSampleRate)) {
            return false;
        }
        MonitoringSampleRate monitoringSampleRate = (MonitoringSampleRate) other;
        return Double.compare(this.tracing, monitoringSampleRate.tracing) == 0 && Double.compare(this.liveSession, monitoringSampleRate.liveSession) == 0 && Double.compare(this.webView, monitoringSampleRate.webView) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.tracing) * 31) + Double.hashCode(this.liveSession)) * 31) + Double.hashCode(this.webView);
    }

    public String toString() {
        return "MonitoringSampleRate(tracing=" + this.tracing + ", liveSession=" + this.liveSession + ", webView=" + this.webView + ")";
    }

    public MonitoringSampleRate(double d11, double d12, double d13) {
        this.tracing = d11;
        this.liveSession = d12;
        this.webView = d13;
    }

    public /* synthetic */ MonitoringSampleRate(double d11, double d12, double d13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10.0d : d11, (i11 & 2) != 0 ? 10.0d : d12, (i11 & 4) != 0 ? 10.0d : d13);
    }
}
