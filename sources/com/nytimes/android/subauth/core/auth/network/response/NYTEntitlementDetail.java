package com.nytimes.android.subauth.core.auth.network.response;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nytimes/android/subauth/core/auth/network/response/NYTEntitlementDetail;", "", "", "expirationDate", "freeTrialStartDate", "freeTrialEndDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nytimes/android/subauth/core/auth/network/response/NYTEntitlementDetail;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NYTEntitlementDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String freeTrialStartDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String freeTrialEndDate;

    public NYTEntitlementDetail(@g(name = "expiration_date") String str, @g(name = "free_trial_start_date") String str2, @g(name = "free_trial_end_date") String str3) {
        this.expirationDate = str;
        this.freeTrialStartDate = str2;
        this.freeTrialEndDate = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFreeTrialEndDate() {
        return this.freeTrialEndDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFreeTrialStartDate() {
        return this.freeTrialStartDate;
    }

    @NotNull
    public final NYTEntitlementDetail copy(@g(name = "expiration_date") String expirationDate, @g(name = "free_trial_start_date") String freeTrialStartDate, @g(name = "free_trial_end_date") String freeTrialEndDate) {
        return new NYTEntitlementDetail(expirationDate, freeTrialStartDate, freeTrialEndDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NYTEntitlementDetail)) {
            return false;
        }
        NYTEntitlementDetail nYTEntitlementDetail = (NYTEntitlementDetail) other;
        return Intrinsics.areEqual(this.expirationDate, nYTEntitlementDetail.expirationDate) && Intrinsics.areEqual(this.freeTrialStartDate, nYTEntitlementDetail.freeTrialStartDate) && Intrinsics.areEqual(this.freeTrialEndDate, nYTEntitlementDetail.freeTrialEndDate);
    }

    public int hashCode() {
        String str = this.expirationDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.freeTrialStartDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.freeTrialEndDate;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "NYTEntitlementDetail(expirationDate=" + this.expirationDate + ", freeTrialStartDate=" + this.freeTrialStartDate + ", freeTrialEndDate=" + this.freeTrialEndDate + ")";
    }
}
