package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/nytimes/android/subauth/core/purr/model/UserTCFData;", "", "tcfString", "", "tcfNoticeVersion", "tcfDecodedData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTcfString", "()Ljava/lang/String;", "getTcfNoticeVersion", "getTcfDecodedData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserTCFData {

    @NotNull
    private final Map<String, Object> tcfDecodedData;

    @NotNull
    private final String tcfNoticeVersion;

    @NotNull
    private final String tcfString;

    public UserTCFData(@NotNull String tcfString, @NotNull String tcfNoticeVersion, @NotNull Map<String, ? extends Object> tcfDecodedData) {
        Intrinsics.checkNotNullParameter(tcfString, "tcfString");
        Intrinsics.checkNotNullParameter(tcfNoticeVersion, "tcfNoticeVersion");
        Intrinsics.checkNotNullParameter(tcfDecodedData, "tcfDecodedData");
        this.tcfString = tcfString;
        this.tcfNoticeVersion = tcfNoticeVersion;
        this.tcfDecodedData = tcfDecodedData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserTCFData copy$default(UserTCFData userTCFData, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userTCFData.tcfString;
        }
        if ((i11 & 2) != 0) {
            str2 = userTCFData.tcfNoticeVersion;
        }
        if ((i11 & 4) != 0) {
            map = userTCFData.tcfDecodedData;
        }
        return userTCFData.copy(str, str2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTcfString() {
        return this.tcfString;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTcfNoticeVersion() {
        return this.tcfNoticeVersion;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.tcfDecodedData;
    }

    @NotNull
    public final UserTCFData copy(@NotNull String tcfString, @NotNull String tcfNoticeVersion, @NotNull Map<String, ? extends Object> tcfDecodedData) {
        Intrinsics.checkNotNullParameter(tcfString, "tcfString");
        Intrinsics.checkNotNullParameter(tcfNoticeVersion, "tcfNoticeVersion");
        Intrinsics.checkNotNullParameter(tcfDecodedData, "tcfDecodedData");
        return new UserTCFData(tcfString, tcfNoticeVersion, tcfDecodedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTCFData)) {
            return false;
        }
        UserTCFData userTCFData = (UserTCFData) other;
        return Intrinsics.areEqual(this.tcfString, userTCFData.tcfString) && Intrinsics.areEqual(this.tcfNoticeVersion, userTCFData.tcfNoticeVersion) && Intrinsics.areEqual(this.tcfDecodedData, userTCFData.tcfDecodedData);
    }

    @NotNull
    public final Map<String, Object> getTcfDecodedData() {
        return this.tcfDecodedData;
    }

    @NotNull
    public final String getTcfNoticeVersion() {
        return this.tcfNoticeVersion;
    }

    @NotNull
    public final String getTcfString() {
        return this.tcfString;
    }

    public int hashCode() {
        return (((this.tcfString.hashCode() * 31) + this.tcfNoticeVersion.hashCode()) * 31) + this.tcfDecodedData.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserTCFData(tcfString=" + this.tcfString + ", tcfNoticeVersion=" + this.tcfNoticeVersion + ", tcfDecodedData=" + this.tcfDecodedData + ")";
    }
}
