package k70;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.analytics.data.ObjectType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k70.p20, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lk70/p20;", "", "", ObjectType.ARTICLE_ID, "", "is_read", "Llc/t0;", "", "percent_read", "<init>", "(Ljava/lang/String;ZLlc/t0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Z", "Llc/t0;", "()Llc/t0;", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LogArticleReadInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article_id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean is_read;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 percent_read;

    public LogArticleReadInput(String article_id, boolean z11, lc.t0 percent_read) {
        Intrinsics.checkNotNullParameter(article_id, "article_id");
        Intrinsics.checkNotNullParameter(percent_read, "percent_read");
        this.article_id = article_id;
        this.is_read = z11;
        this.percent_read = percent_read;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getArticle_id() {
        return this.article_id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final lc.t0 getPercent_read() {
        return this.percent_read;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIs_read() {
        return this.is_read;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogArticleReadInput)) {
            return false;
        }
        LogArticleReadInput logArticleReadInput = (LogArticleReadInput) other;
        return Intrinsics.areEqual(this.article_id, logArticleReadInput.article_id) && this.is_read == logArticleReadInput.is_read && Intrinsics.areEqual(this.percent_read, logArticleReadInput.percent_read);
    }

    public int hashCode() {
        return (((this.article_id.hashCode() * 31) + Boolean.hashCode(this.is_read)) * 31) + this.percent_read.hashCode();
    }

    public String toString() {
        return "LogArticleReadInput(article_id=" + this.article_id + ", is_read=" + this.is_read + ", percent_read=" + this.percent_read + ")";
    }
}
