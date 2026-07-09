package com.theathletic.ui.widgets;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.ui.widgets.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0004R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0007¨\u0006\""}, d2 = {"Lcom/theathletic/ui/widgets/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAuthorImage1", "authorImage1", QueryKeys.PAGE_LOAD_TIME, "getAuthorImage2", "authorImage2", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getAuthorImage3", "authorImage3", QueryKeys.SUBDOMAIN, "getAuthorImage4", "authorImage4", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Ljava/lang/Integer;", "getExcessCount", "()Ljava/lang/Integer;", "excessCount", QueryKeys.VISIT_FREQUENCY, QueryKeys.IDLING, "getDisplayImageCount", "displayImageCount", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthorImageStackModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authorImage1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authorImage2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authorImage3;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authorImage4;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer excessCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int displayImageCount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorImageStackModel)) {
            return false;
        }
        AuthorImageStackModel authorImageStackModel = (AuthorImageStackModel) other;
        return Intrinsics.areEqual(this.authorImage1, authorImageStackModel.authorImage1) && Intrinsics.areEqual(this.authorImage2, authorImageStackModel.authorImage2) && Intrinsics.areEqual(this.authorImage3, authorImageStackModel.authorImage3) && Intrinsics.areEqual(this.authorImage4, authorImageStackModel.authorImage4) && Intrinsics.areEqual(this.excessCount, authorImageStackModel.excessCount) && this.displayImageCount == authorImageStackModel.displayImageCount;
    }

    public int hashCode() {
        String str = this.authorImage1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authorImage2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorImage3;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authorImage4;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.excessCount;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.displayImageCount);
    }

    public String toString() {
        return "AuthorImageStackModel(authorImage1=" + this.authorImage1 + ", authorImage2=" + this.authorImage2 + ", authorImage3=" + this.authorImage3 + ", authorImage4=" + this.authorImage4 + ", excessCount=" + this.excessCount + ", displayImageCount=" + this.displayImageCount + ")";
    }
}
