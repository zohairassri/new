package j50;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.d1;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.j, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b3\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010\"R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\b/\u0010\"R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b-\u0010\"R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010\"R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b:\u00106R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\b=\u00106R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\b<\u00106R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010H\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010 ¨\u0006I"}, d2 = {"Lj50/j;", "Lcom/theathletic/ui/d1;", "", "id", "", "sectionId", "title", "formattedDate", "formattedDuration", "imageUrl", VideoRepository.XML_ATTR_DURATION, "", "finished", "Landroid/graphics/drawable/Drawable;", "playDrawable", "", "downloadDrawable", "downloadTint", "downloadProgress", "commentCount", "showCommentCount", "isPlayClickable", "showDivider", "Lj50/j$a;", "analyticsInfo", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLandroid/graphics/drawable/Drawable;IIIIZZZLj50/j$a;)V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", QueryKeys.ACCOUNT_ID, "()J", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "getSectionId", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "l", QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.VISIT_FREQUENCY, QueryKeys.HOST, "getDuration", QueryKeys.MEMFLY_API_VERSION, "getFinished", "()Z", QueryKeys.VIEW_TITLE, "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", QueryKeys.DECAY, QueryKeys.IDLING, "k", QueryKeys.MAX_SCROLL_DEPTH, "getCommentCount", QueryKeys.IS_NEW_USER, QueryKeys.DOCUMENT_WIDTH, QueryKeys.VIEW_ID, "q", "Lj50/j$a;", "getAnalyticsInfo", "()Lj50/j$a;", QueryKeys.EXTERNAL_REFERRER, "getStableId", "stableId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodcastEpisodeListItem implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sectionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedDuration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long duration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean finished;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Drawable playDrawable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int downloadDrawable;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final int downloadTint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final int downloadProgress;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final int commentCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showCommentCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPlayClickable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showDivider;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsInfo analyticsInfo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    /* JADX INFO: renamed from: j50.j$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj50/j$a;", "", "", "podcastId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPodcastId", "()J", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnalyticsInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long podcastId;

        public AnalyticsInfo(long j11) {
            this.podcastId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnalyticsInfo) && this.podcastId == ((AnalyticsInfo) other).podcastId;
        }

        public int hashCode() {
            return Long.hashCode(this.podcastId);
        }

        public String toString() {
            return "AnalyticsInfo(podcastId=" + this.podcastId + ")";
        }
    }

    public PodcastEpisodeListItem(long j11, String sectionId, String title, String formattedDate, String formattedDuration, String imageUrl, long j12, boolean z11, Drawable drawable, int i11, int i12, int i13, int i14, boolean z12, boolean z13, boolean z14, AnalyticsInfo analyticsInfo) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        Intrinsics.checkNotNullParameter(formattedDuration, "formattedDuration");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(analyticsInfo, "analyticsInfo");
        this.id = j11;
        this.sectionId = sectionId;
        this.title = title;
        this.formattedDate = formattedDate;
        this.formattedDuration = formattedDuration;
        this.imageUrl = imageUrl;
        this.duration = j12;
        this.finished = z11;
        this.playDrawable = drawable;
        this.downloadDrawable = i11;
        this.downloadTint = i12;
        this.downloadProgress = i13;
        this.commentCount = i14;
        this.showCommentCount = z12;
        this.isPlayClickable = z13;
        this.showDivider = z14;
        this.analyticsInfo = analyticsInfo;
        this.stableId = "PodcastEpisodeListItem:" + sectionId + ":" + j11;
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return i80.a.f103306a.a(Integer.valueOf(this.commentCount), context);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDownloadDrawable() {
        return this.downloadDrawable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDownloadProgress() {
        return this.downloadProgress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDownloadTint() {
        return this.downloadTint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFormattedDate() {
        return this.formattedDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PodcastEpisodeListItem)) {
            return false;
        }
        PodcastEpisodeListItem podcastEpisodeListItem = (PodcastEpisodeListItem) other;
        return this.id == podcastEpisodeListItem.id && Intrinsics.areEqual(this.sectionId, podcastEpisodeListItem.sectionId) && Intrinsics.areEqual(this.title, podcastEpisodeListItem.title) && Intrinsics.areEqual(this.formattedDate, podcastEpisodeListItem.formattedDate) && Intrinsics.areEqual(this.formattedDuration, podcastEpisodeListItem.formattedDuration) && Intrinsics.areEqual(this.imageUrl, podcastEpisodeListItem.imageUrl) && this.duration == podcastEpisodeListItem.duration && this.finished == podcastEpisodeListItem.finished && Intrinsics.areEqual(this.playDrawable, podcastEpisodeListItem.playDrawable) && this.downloadDrawable == podcastEpisodeListItem.downloadDrawable && this.downloadTint == podcastEpisodeListItem.downloadTint && this.downloadProgress == podcastEpisodeListItem.downloadProgress && this.commentCount == podcastEpisodeListItem.commentCount && this.showCommentCount == podcastEpisodeListItem.showCommentCount && this.isPlayClickable == podcastEpisodeListItem.isPlayClickable && this.showDivider == podcastEpisodeListItem.showDivider && Intrinsics.areEqual(this.analyticsInfo, podcastEpisodeListItem.analyticsInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFormattedDuration() {
        return this.formattedDuration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Long.hashCode(this.id) * 31) + this.sectionId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.formattedDate.hashCode()) * 31) + this.formattedDuration.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + Long.hashCode(this.duration)) * 31) + Boolean.hashCode(this.finished)) * 31;
        Drawable drawable = this.playDrawable;
        return ((((((((((((((((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + Integer.hashCode(this.downloadDrawable)) * 31) + Integer.hashCode(this.downloadTint)) * 31) + Integer.hashCode(this.downloadProgress)) * 31) + Integer.hashCode(this.commentCount)) * 31) + Boolean.hashCode(this.showCommentCount)) * 31) + Boolean.hashCode(this.isPlayClickable)) * 31) + Boolean.hashCode(this.showDivider)) * 31) + this.analyticsInfo.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Drawable getPlayDrawable() {
        return this.playDrawable;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowCommentCount() {
        return this.showCommentCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsPlayClickable() {
        return this.isPlayClickable;
    }

    public String toString() {
        return "PodcastEpisodeListItem(id=" + this.id + ", sectionId=" + this.sectionId + ", title=" + this.title + ", formattedDate=" + this.formattedDate + ", formattedDuration=" + this.formattedDuration + ", imageUrl=" + this.imageUrl + ", duration=" + this.duration + ", finished=" + this.finished + ", playDrawable=" + this.playDrawable + ", downloadDrawable=" + this.downloadDrawable + ", downloadTint=" + this.downloadTint + ", downloadProgress=" + this.downloadProgress + ", commentCount=" + this.commentCount + ", showCommentCount=" + this.showCommentCount + ", isPlayClickable=" + this.isPlayClickable + ", showDivider=" + this.showDivider + ", analyticsInfo=" + this.analyticsInfo + ")";
    }
}
