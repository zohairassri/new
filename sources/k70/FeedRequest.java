package k70;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k70.cn, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b!\u0010\u0011R%\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\f8\u0006¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f8\u0006¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011R\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b&\u0010\u0011R\u001f\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f8\u0006¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b)\u0010\u0011¨\u0006+"}, d2 = {"Lk70/cn;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llc/t0;", "Lk70/ln;", "a", "Llc/t0;", QueryKeys.PAGE_LOAD_TIME, "()Llc/t0;", "feed_type", "feed_id", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "feed_url", "Lk70/yy0;", QueryKeys.SUBDOMAIN, QueryKeys.DECAY, "tags", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.IDLING, QueryKeys.ACCOUNT_ID, "page", QueryKeys.VISIT_FREQUENCY, "locale", "Lk70/le0;", QueryKeys.HOST, "platform", "", "Lk70/fx;", "layouts", QueryKeys.VIEW_TITLE, "override", "show_long_titles", "k", "is_mobile_web", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 feed_type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 feed_id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 feed_url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 tags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int page;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 locale;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 platform;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 layouts;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 override;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 show_long_titles;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 is_mobile_web;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final lc.t0 getFeed_id() {
        return this.feed_id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final lc.t0 getFeed_type() {
        return this.feed_type;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final lc.t0 getFeed_url() {
        return this.feed_url;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lc.t0 getLayouts() {
        return this.layouts;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final lc.t0 getLocale() {
        return this.locale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedRequest)) {
            return false;
        }
        FeedRequest feedRequest = (FeedRequest) other;
        return Intrinsics.areEqual(this.feed_type, feedRequest.feed_type) && Intrinsics.areEqual(this.feed_id, feedRequest.feed_id) && Intrinsics.areEqual(this.feed_url, feedRequest.feed_url) && Intrinsics.areEqual(this.tags, feedRequest.tags) && this.page == feedRequest.page && Intrinsics.areEqual(this.locale, feedRequest.locale) && Intrinsics.areEqual(this.platform, feedRequest.platform) && Intrinsics.areEqual(this.layouts, feedRequest.layouts) && Intrinsics.areEqual(this.override, feedRequest.override) && Intrinsics.areEqual(this.show_long_titles, feedRequest.show_long_titles) && Intrinsics.areEqual(this.is_mobile_web, feedRequest.is_mobile_web);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final lc.t0 getOverride() {
        return this.override;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final lc.t0 getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return (((((((((((((((((((this.feed_type.hashCode() * 31) + this.feed_id.hashCode()) * 31) + this.feed_url.hashCode()) * 31) + this.tags.hashCode()) * 31) + Integer.hashCode(this.page)) * 31) + this.locale.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.layouts.hashCode()) * 31) + this.override.hashCode()) * 31) + this.show_long_titles.hashCode()) * 31) + this.is_mobile_web.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final lc.t0 getShow_long_titles() {
        return this.show_long_titles;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final lc.t0 getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final lc.t0 getIs_mobile_web() {
        return this.is_mobile_web;
    }

    public String toString() {
        return "FeedRequest(feed_type=" + this.feed_type + ", feed_id=" + this.feed_id + ", feed_url=" + this.feed_url + ", tags=" + this.tags + ", page=" + this.page + ", locale=" + this.locale + ", platform=" + this.platform + ", layouts=" + this.layouts + ", override=" + this.override + ", show_long_titles=" + this.show_long_titles + ", is_mobile_web=" + this.is_mobile_web + ")";
    }
}
