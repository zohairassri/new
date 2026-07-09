package com.theathletic.liveblog.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/theathletic/liveblog/ui/k;", "Lcom/theathletic/utility/x;", "<init>", "()V", "a", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, "Lcom/theathletic/liveblog/ui/k$a;", "Lcom/theathletic/liveblog/ui/k$b;", "Lcom/theathletic/liveblog/ui/k$c;", "Lcom/theathletic/liveblog/ui/k$d;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k extends com.theathletic.utility.x {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/liveblog/ui/k$a;", "Lcom/theathletic/liveblog/ui/k;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70495a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f70496b = 8;

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.theathletic.liveblog.ui.k$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/theathletic/liveblog/ui/k$b;", "Lcom/theathletic/liveblog/ui/k;", "", "liveBlogId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnPaywallClick extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String liveBlogId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPaywallClick(String liveBlogId) {
            super(null);
            Intrinsics.checkNotNullParameter(liveBlogId, "liveBlogId");
            this.liveBlogId = liveBlogId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLiveBlogId() {
            return this.liveBlogId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnPaywallClick) && Intrinsics.areEqual(this.liveBlogId, ((OnPaywallClick) other).liveBlogId);
        }

        public int hashCode() {
            return this.liveBlogId.hashCode();
        }

        public String toString() {
            return "OnPaywallClick(liveBlogId=" + this.liveBlogId + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.liveblog.ui.k$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/theathletic/liveblog/ui/k$c;", "Lcom/theathletic/liveblog/ui/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "permalink", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnShareClick extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String permalink;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPermalink() {
            return this.permalink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnShareClick) && Intrinsics.areEqual(this.permalink, ((OnShareClick) other).permalink);
        }

        public int hashCode() {
            return this.permalink.hashCode();
        }

        public String toString() {
            return "OnShareClick(permalink=" + this.permalink + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/theathletic/liveblog/ui/k$d;", "Lcom/theathletic/liveblog/ui/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f70499a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f70500b = 8;

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 1417222086;
        }

        public String toString() {
            return "OnShareSubscribeClick";
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
