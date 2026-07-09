package com.statsig.androidsdk;

import com.amazonaws.event.ProgressEvent;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0097\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\u0017\u0010<\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\b>J\t\u0010?\u001a\u00020\u0003HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006@"}, d2 = {"Lcom/statsig/androidsdk/StatsigMetadata;", "", "stableID", "", "sdkType", "sdkVersion", "sessionID", "appIdentifier", "appVersion", "deviceModel", "deviceOS", "locale", "language", "systemVersion", "systemName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppIdentifier", "()Ljava/lang/String;", "setAppIdentifier", "(Ljava/lang/String;)V", "getAppVersion", "setAppVersion", "getDeviceModel", "setDeviceModel", "getDeviceOS", "setDeviceOS", "getLanguage", "setLanguage", "getLocale", "setLocale", "getSdkType", "setSdkType", "getSdkVersion", "setSdkVersion", "getSessionID", "setSessionID", "getStableID", "setStableID", "getSystemName", "setSystemName", "getSystemVersion", "setSystemVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "overrideStableID", "", "overrideStableID$private_android_sdk_release", "toString", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StatsigMetadata {

    @c("appIdentifier")
    private String appIdentifier;

    @c("appVersion")
    private String appVersion;

    @c("deviceModel")
    private String deviceModel;

    @c("deviceOS")
    private String deviceOS;

    @c("language")
    private String language;

    @c("locale")
    private String locale;

    @c("sdkType")
    private String sdkType;

    @c("sdkVersion")
    private String sdkVersion;

    @c("sessionID")
    @NotNull
    private String sessionID;

    @c("stableID")
    private String stableID;

    @c("systemName")
    private String systemName;

    @c("systemVersion")
    private String systemVersion;

    public StatsigMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ StatsigMetadata copy$default(StatsigMetadata statsigMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = statsigMetadata.stableID;
        }
        if ((i11 & 2) != 0) {
            str2 = statsigMetadata.sdkType;
        }
        if ((i11 & 4) != 0) {
            str3 = statsigMetadata.sdkVersion;
        }
        if ((i11 & 8) != 0) {
            str4 = statsigMetadata.sessionID;
        }
        if ((i11 & 16) != 0) {
            str5 = statsigMetadata.appIdentifier;
        }
        if ((i11 & 32) != 0) {
            str6 = statsigMetadata.appVersion;
        }
        if ((i11 & 64) != 0) {
            str7 = statsigMetadata.deviceModel;
        }
        if ((i11 & 128) != 0) {
            str8 = statsigMetadata.deviceOS;
        }
        if ((i11 & 256) != 0) {
            str9 = statsigMetadata.locale;
        }
        if ((i11 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0) {
            str10 = statsigMetadata.language;
        }
        if ((i11 & 1024) != 0) {
            str11 = statsigMetadata.systemVersion;
        }
        if ((i11 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0) {
            str12 = statsigMetadata.systemName;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return statsigMetadata.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStableID() {
        return this.stableID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSystemName() {
        return this.systemName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkType() {
        return this.sdkType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceOS() {
        return this.deviceOS;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final StatsigMetadata copy(String stableID, String sdkType, String sdkVersion, @NotNull String sessionID, String appIdentifier, String appVersion, String deviceModel, String deviceOS, String locale, String language, String systemVersion, String systemName) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        return new StatsigMetadata(stableID, sdkType, sdkVersion, sessionID, appIdentifier, appVersion, deviceModel, deviceOS, locale, language, systemVersion, systemName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsigMetadata)) {
            return false;
        }
        StatsigMetadata statsigMetadata = (StatsigMetadata) other;
        return Intrinsics.areEqual(this.stableID, statsigMetadata.stableID) && Intrinsics.areEqual(this.sdkType, statsigMetadata.sdkType) && Intrinsics.areEqual(this.sdkVersion, statsigMetadata.sdkVersion) && Intrinsics.areEqual(this.sessionID, statsigMetadata.sessionID) && Intrinsics.areEqual(this.appIdentifier, statsigMetadata.appIdentifier) && Intrinsics.areEqual(this.appVersion, statsigMetadata.appVersion) && Intrinsics.areEqual(this.deviceModel, statsigMetadata.deviceModel) && Intrinsics.areEqual(this.deviceOS, statsigMetadata.deviceOS) && Intrinsics.areEqual(this.locale, statsigMetadata.locale) && Intrinsics.areEqual(this.language, statsigMetadata.language) && Intrinsics.areEqual(this.systemVersion, statsigMetadata.systemVersion) && Intrinsics.areEqual(this.systemName, statsigMetadata.systemName);
    }

    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getSdkType() {
        return this.sdkType;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getStableID() {
        return this.stableID;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public int hashCode() {
        String str = this.stableID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkVersion;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.sessionID.hashCode()) * 31;
        String str4 = this.appIdentifier;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appVersion;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceModel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceOS;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.locale;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.language;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.systemVersion;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.systemName;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void overrideStableID$private_android_sdk_release(String overrideStableID) {
        if (overrideStableID == null || Intrinsics.areEqual(overrideStableID, this.stableID)) {
            return;
        }
        this.stableID = overrideStableID;
    }

    public final void setAppIdentifier(String str) {
        this.appIdentifier = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public final void setDeviceOS(String str) {
        this.deviceOS = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setSdkType(String str) {
        this.sdkType = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public final void setSessionID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionID = str;
    }

    public final void setStableID(String str) {
        this.stableID = str;
    }

    public final void setSystemName(String str) {
        this.systemName = str;
    }

    public final void setSystemVersion(String str) {
        this.systemVersion = str;
    }

    @NotNull
    public String toString() {
        return "StatsigMetadata(stableID=" + ((Object) this.stableID) + ", sdkType=" + ((Object) this.sdkType) + ", sdkVersion=" + ((Object) this.sdkVersion) + ", sessionID=" + this.sessionID + ", appIdentifier=" + ((Object) this.appIdentifier) + ", appVersion=" + ((Object) this.appVersion) + ", deviceModel=" + ((Object) this.deviceModel) + ", deviceOS=" + ((Object) this.deviceOS) + ", locale=" + ((Object) this.locale) + ", language=" + ((Object) this.language) + ", systemVersion=" + ((Object) this.systemVersion) + ", systemName=" + ((Object) this.systemName) + ')';
    }

    public StatsigMetadata(String str, String str2, String str3, @NotNull String sessionID, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        this.stableID = str;
        this.sdkType = str2;
        this.sdkVersion = str3;
        this.sessionID = sessionID;
        this.appIdentifier = str4;
        this.appVersion = str5;
        this.deviceModel = str6;
        this.deviceOS = str7;
        this.locale = str8;
        this.language = str9;
        this.systemVersion = str10;
        this.systemName = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StatsigMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i11 & 1) != 0 ? null : str;
        str2 = (i11 & 2) != 0 ? "android-client" : str2;
        str3 = (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3;
        if ((i11 & 8) != 0) {
            str4 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str4, "randomUUID().toString()");
        }
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str12);
    }
}
