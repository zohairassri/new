package com.theathletic.debugtools.userinfo.ui;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJx\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b'\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b(\u0010\u0013¨\u0006)"}, d2 = {"Lcom/theathletic/debugtools/userinfo/ui/DebugUserInfoState;", "Lcom/theathletic/ui/r;", "", "email", "", "userId", "deviceId", "userAgent", "accessToken", "", "isSubscribed", "isAnonymous", "firebaseToken", "advertisingId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lcom/theathletic/debugtools/userinfo/ui/DebugUserInfoState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Ljava/lang/Long;", QueryKeys.HOST, "()Ljava/lang/Long;", QueryKeys.SUBDOMAIN, QueryKeys.ACCOUNT_ID, QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, QueryKeys.DECAY, "()Z", QueryKeys.VIEW_TITLE, QueryKeys.VISIT_FREQUENCY, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DebugUserInfoState implements r {
    public static final int $stable = 0;
    private final String accessToken;
    private final String advertisingId;
    private final String deviceId;
    private final String email;
    private final String firebaseToken;
    private final boolean isAnonymous;
    private final boolean isSubscribed;
    private final String userAgent;
    private final Long userId;

    public DebugUserInfoState() {
        this(null, null, null, null, null, false, false, null, null, 511, null);
    }

    public final DebugUserInfoState a(String email, Long userId, String deviceId, String userAgent, String accessToken, boolean isSubscribed, boolean isAnonymous, String firebaseToken, String advertisingId) {
        return new DebugUserInfoState(email, userId, deviceId, userAgent, accessToken, isSubscribed, isAnonymous, firebaseToken, advertisingId);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugUserInfoState)) {
            return false;
        }
        DebugUserInfoState debugUserInfoState = (DebugUserInfoState) other;
        return Intrinsics.areEqual(this.email, debugUserInfoState.email) && Intrinsics.areEqual(this.userId, debugUserInfoState.userId) && Intrinsics.areEqual(this.deviceId, debugUserInfoState.deviceId) && Intrinsics.areEqual(this.userAgent, debugUserInfoState.userAgent) && Intrinsics.areEqual(this.accessToken, debugUserInfoState.accessToken) && this.isSubscribed == debugUserInfoState.isSubscribed && this.isAnonymous == debugUserInfoState.isAnonymous && Intrinsics.areEqual(this.firebaseToken, debugUserInfoState.firebaseToken) && Intrinsics.areEqual(this.advertisingId, debugUserInfoState.advertisingId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.userId;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.deviceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userAgent;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accessToken;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isSubscribed)) * 31) + Boolean.hashCode(this.isAnonymous)) * 31;
        String str5 = this.firebaseToken;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.advertisingId;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public String toString() {
        return "DebugUserInfoState(email=" + this.email + ", userId=" + this.userId + ", deviceId=" + this.deviceId + ", userAgent=" + this.userAgent + ", accessToken=" + this.accessToken + ", isSubscribed=" + this.isSubscribed + ", isAnonymous=" + this.isAnonymous + ", firebaseToken=" + this.firebaseToken + ", advertisingId=" + this.advertisingId + ")";
    }

    public DebugUserInfoState(String str, Long l11, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6) {
        this.email = str;
        this.userId = l11;
        this.deviceId = str2;
        this.userAgent = str3;
        this.accessToken = str4;
        this.isSubscribed = z11;
        this.isAnonymous = z12;
        this.firebaseToken = str5;
        this.advertisingId = str6;
    }

    public /* synthetic */ DebugUserInfoState(String str, Long l11, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6);
    }
}
