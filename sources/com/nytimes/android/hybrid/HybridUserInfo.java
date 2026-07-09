package com.nytimes.android.hybrid;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/nytimes/android/hybrid/HybridUserInfo;", "", "", "regiId", "pushToken", "agentId", "", "entitlements", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.SUBDOMAIN, QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Ljava/util/Set;", "()Ljava/util/Set;", "hybrid_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HybridUserInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String regiId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pushToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String agentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set entitlements;

    public HybridUserInfo(String str, String str2, String str3, Set set) {
        this.regiId = str;
        this.pushToken = str2;
        this.agentId = str3;
        this.entitlements = set;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Set getEntitlements() {
        return this.entitlements;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRegiId() {
        return this.regiId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridUserInfo)) {
            return false;
        }
        HybridUserInfo hybridUserInfo = (HybridUserInfo) other;
        return Intrinsics.areEqual(this.regiId, hybridUserInfo.regiId) && Intrinsics.areEqual(this.pushToken, hybridUserInfo.pushToken) && Intrinsics.areEqual(this.agentId, hybridUserInfo.agentId) && Intrinsics.areEqual(this.entitlements, hybridUserInfo.entitlements);
    }

    public int hashCode() {
        String str = this.regiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pushToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set set = this.entitlements;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "HybridUserInfo(regiId=" + this.regiId + ", pushToken=" + this.pushToken + ", agentId=" + this.agentId + ", entitlements=" + this.entitlements + ")";
    }

    public /* synthetic */ HybridUserInfo(String str, String str2, String str3, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : set);
    }
}
