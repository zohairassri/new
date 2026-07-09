package com.nytimes.android.subauth.core.auth.network.response;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/nytimes/android/subauth/core/auth/network/response/EmailStatusResponseAccountStatus;", "", "", "status", "", "regiLite", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailStatusResponseAccountStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean regiLite;

    public EmailStatusResponseAccountStatus(String status, Boolean bool) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.regiLite = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getRegiLite() {
        return this.regiLite;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailStatusResponseAccountStatus)) {
            return false;
        }
        EmailStatusResponseAccountStatus emailStatusResponseAccountStatus = (EmailStatusResponseAccountStatus) other;
        return Intrinsics.areEqual(this.status, emailStatusResponseAccountStatus.status) && Intrinsics.areEqual(this.regiLite, emailStatusResponseAccountStatus.regiLite);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Boolean bool = this.regiLite;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "EmailStatusResponseAccountStatus(status=" + this.status + ", regiLite=" + this.regiLite + ")";
    }

    public /* synthetic */ EmailStatusResponseAccountStatus(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : bool);
    }
}
