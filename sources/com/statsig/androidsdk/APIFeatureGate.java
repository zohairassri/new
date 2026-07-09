package com.statsig.androidsdk;

import com.theathletic.video.component.data.VideoRepository;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010\u001b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR,\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/statsig/androidsdk/APIFeatureGate;", "", "name", "", VideoRepository.XML_ATTR_VALUE, "", "ruleID", "groupName", "secondaryExposures", "", "", "idType", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;Ljava/lang/String;)V", "getGroupName", "()Ljava/lang/String;", "getIdType", "getName", "getRuleID", "getSecondaryExposures", "()[Ljava/util/Map;", "[Ljava/util/Map;", "getValue", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;Ljava/lang/String;)Lcom/statsig/androidsdk/APIFeatureGate;", "equals", "other", "hashCode", "", "toString", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class APIFeatureGate {

    @c("group_name")
    private final String groupName;

    @c("id_type")
    private final String idType;

    @c("name")
    @NotNull
    private final String name;

    @c("rule_id")
    @NotNull
    private final String ruleID;

    @c("secondary_exposures")
    private final Map<String, String>[] secondaryExposures;

    @c(VideoRepository.XML_ATTR_VALUE)
    private final boolean value;

    public APIFeatureGate(@NotNull String name, boolean z11, @NotNull String ruleID, String str, Map<String, String>[] mapArr, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        this.name = name;
        this.value = z11;
        this.ruleID = ruleID;
        this.groupName = str;
        this.secondaryExposures = mapArr;
        this.idType = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APIFeatureGate copy$default(APIFeatureGate aPIFeatureGate, String str, boolean z11, String str2, String str3, Map[] mapArr, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aPIFeatureGate.name;
        }
        if ((i11 & 2) != 0) {
            z11 = aPIFeatureGate.value;
        }
        if ((i11 & 4) != 0) {
            str2 = aPIFeatureGate.ruleID;
        }
        if ((i11 & 8) != 0) {
            str3 = aPIFeatureGate.groupName;
        }
        if ((i11 & 16) != 0) {
            mapArr = aPIFeatureGate.secondaryExposures;
        }
        if ((i11 & 32) != 0) {
            str4 = aPIFeatureGate.idType;
        }
        Map[] mapArr2 = mapArr;
        String str5 = str4;
        return aPIFeatureGate.copy(str, z11, str2, str3, mapArr2, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRuleID() {
        return this.ruleID;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    public final Map<String, String>[] component5() {
        return this.secondaryExposures;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdType() {
        return this.idType;
    }

    @NotNull
    public final APIFeatureGate copy(@NotNull String name, boolean value, @NotNull String ruleID, String groupName, Map<String, String>[] secondaryExposures, String idType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        return new APIFeatureGate(name, value, ruleID, groupName, secondaryExposures, idType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APIFeatureGate)) {
            return false;
        }
        APIFeatureGate aPIFeatureGate = (APIFeatureGate) other;
        return Intrinsics.areEqual(this.name, aPIFeatureGate.name) && this.value == aPIFeatureGate.value && Intrinsics.areEqual(this.ruleID, aPIFeatureGate.ruleID) && Intrinsics.areEqual(this.groupName, aPIFeatureGate.groupName) && Intrinsics.areEqual(this.secondaryExposures, aPIFeatureGate.secondaryExposures) && Intrinsics.areEqual(this.idType, aPIFeatureGate.idType);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getIdType() {
        return this.idType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRuleID() {
        return this.ruleID;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z11 = this.value;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int iHashCode2 = (((iHashCode + r12) * 31) + this.ruleID.hashCode()) * 31;
        String str = this.groupName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String>[] mapArr = this.secondaryExposures;
        int iHashCode4 = (iHashCode3 + (mapArr == null ? 0 : Arrays.hashCode(mapArr))) * 31;
        String str2 = this.idType;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "APIFeatureGate(name=" + this.name + ", value=" + this.value + ", ruleID=" + this.ruleID + ", groupName=" + ((Object) this.groupName) + ", secondaryExposures=" + Arrays.toString(this.secondaryExposures) + ", idType=" + ((Object) this.idType) + ')';
    }

    public /* synthetic */ APIFeatureGate(String str, boolean z11, String str2, String str3, Map[] mapArr, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? new Map[0] : mapArr, (i11 & 32) != 0 ? null : str4);
    }
}
