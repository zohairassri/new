package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/nytimes/android/subauth/core/purr/model/UserGPPData;", "", "encodedString", "", "mobileData", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getEncodedString", "()Ljava/lang/String;", "getMobileData", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserGPPData {

    @NotNull
    private final String encodedString;

    @NotNull
    private final Map<String, Object> mobileData;

    public UserGPPData(@NotNull String encodedString, @NotNull Map<String, ? extends Object> mobileData) {
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        Intrinsics.checkNotNullParameter(mobileData, "mobileData");
        this.encodedString = encodedString;
        this.mobileData = mobileData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserGPPData copy$default(UserGPPData userGPPData, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userGPPData.encodedString;
        }
        if ((i11 & 2) != 0) {
            map = userGPPData.mobileData;
        }
        return userGPPData.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncodedString() {
        return this.encodedString;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.mobileData;
    }

    @NotNull
    public final UserGPPData copy(@NotNull String encodedString, @NotNull Map<String, ? extends Object> mobileData) {
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        Intrinsics.checkNotNullParameter(mobileData, "mobileData");
        return new UserGPPData(encodedString, mobileData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserGPPData)) {
            return false;
        }
        UserGPPData userGPPData = (UserGPPData) other;
        return Intrinsics.areEqual(this.encodedString, userGPPData.encodedString) && Intrinsics.areEqual(this.mobileData, userGPPData.mobileData);
    }

    @NotNull
    public final String getEncodedString() {
        return this.encodedString;
    }

    @NotNull
    public final Map<String, Object> getMobileData() {
        return this.mobileData;
    }

    public int hashCode() {
        return (this.encodedString.hashCode() * 31) + this.mobileData.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserGPPData(encodedString=" + this.encodedString + ", mobileData=" + this.mobileData + ")";
    }
}
