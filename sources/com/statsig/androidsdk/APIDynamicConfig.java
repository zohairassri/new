package com.statsig.androidsdk;

import com.amazonaws.event.ProgressEvent;
import com.theathletic.video.component.data.VideoRepository;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010/\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\"\u00100\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003Jà\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R,\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R,\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001d¨\u0006;"}, d2 = {"Lcom/statsig/androidsdk/APIDynamicConfig;", "", "name", "", VideoRepository.XML_ATTR_VALUE, "", "ruleID", "groupName", "secondaryExposures", "", "undelegatedSecondaryExposures", "isDeviceBased", "", "isUserInExperiment", "isExperimentActive", "allocatedExperimentName", "explicitParameters", "rulePassed", "parameterRuleIDs", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getAllocatedExperimentName", "()Ljava/lang/String;", "getExplicitParameters", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getGroupName", "()Z", "getName", "getParameterRuleIDs", "()Ljava/util/Map;", "getRuleID", "getRulePassed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSecondaryExposures", "()[Ljava/util/Map;", "[Ljava/util/Map;", "getUndelegatedSecondaryExposures", "getValue", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/statsig/androidsdk/APIDynamicConfig;", "equals", "other", "hashCode", "", "toString", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class APIDynamicConfig {

    @c("allocated_experiment_name")
    private final String allocatedExperimentName;

    @c("explicit_parameters")
    private final String[] explicitParameters;

    @c("group_name")
    private final String groupName;

    @c("is_device_based")
    private final boolean isDeviceBased;

    @c("is_experiment_active")
    private final boolean isExperimentActive;

    @c("is_user_in_experiment")
    private final boolean isUserInExperiment;

    @c("name")
    @NotNull
    private final String name;

    @c("parameter_rule_ids")
    private final Map<String, String> parameterRuleIDs;

    @c("rule_id")
    @NotNull
    private final String ruleID;

    @c("passed")
    private final Boolean rulePassed;

    @c("secondary_exposures")
    private final Map<String, String>[] secondaryExposures;

    @c("undelegated_secondary_exposures")
    private final Map<String, String>[] undelegatedSecondaryExposures;

    @c(VideoRepository.XML_ATTR_VALUE)
    @NotNull
    private final Map<String, Object> value;

    public APIDynamicConfig(@NotNull String name, @NotNull Map<String, ? extends Object> value, @NotNull String ruleID, String str, Map<String, String>[] mapArr, Map<String, String>[] mapArr2, boolean z11, boolean z12, boolean z13, String str2, String[] strArr, Boolean bool, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        this.name = name;
        this.value = value;
        this.ruleID = ruleID;
        this.groupName = str;
        this.secondaryExposures = mapArr;
        this.undelegatedSecondaryExposures = mapArr2;
        this.isDeviceBased = z11;
        this.isUserInExperiment = z12;
        this.isExperimentActive = z13;
        this.allocatedExperimentName = str2;
        this.explicitParameters = strArr;
        this.rulePassed = bool;
        this.parameterRuleIDs = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APIDynamicConfig copy$default(APIDynamicConfig aPIDynamicConfig, String str, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z11, boolean z12, boolean z13, String str4, String[] strArr, Boolean bool, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aPIDynamicConfig.name;
        }
        return aPIDynamicConfig.copy(str, (i11 & 2) != 0 ? aPIDynamicConfig.value : map, (i11 & 4) != 0 ? aPIDynamicConfig.ruleID : str2, (i11 & 8) != 0 ? aPIDynamicConfig.groupName : str3, (i11 & 16) != 0 ? aPIDynamicConfig.secondaryExposures : mapArr, (i11 & 32) != 0 ? aPIDynamicConfig.undelegatedSecondaryExposures : mapArr2, (i11 & 64) != 0 ? aPIDynamicConfig.isDeviceBased : z11, (i11 & 128) != 0 ? aPIDynamicConfig.isUserInExperiment : z12, (i11 & 256) != 0 ? aPIDynamicConfig.isExperimentActive : z13, (i11 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? aPIDynamicConfig.allocatedExperimentName : str4, (i11 & 1024) != 0 ? aPIDynamicConfig.explicitParameters : strArr, (i11 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? aPIDynamicConfig.rulePassed : bool, (i11 & 4096) != 0 ? aPIDynamicConfig.parameterRuleIDs : map2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String[] getExplicitParameters() {
        return this.explicitParameters;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getRulePassed() {
        return this.rulePassed;
    }

    public final Map<String, String> component13() {
        return this.parameterRuleIDs;
    }

    @NotNull
    public final Map<String, Object> component2() {
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

    public final Map<String, String>[] component6() {
        return this.undelegatedSecondaryExposures;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDeviceBased() {
        return this.isDeviceBased;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    @NotNull
    public final APIDynamicConfig copy(@NotNull String name, @NotNull Map<String, ? extends Object> value, @NotNull String ruleID, String groupName, Map<String, String>[] secondaryExposures, Map<String, String>[] undelegatedSecondaryExposures, boolean isDeviceBased, boolean isUserInExperiment, boolean isExperimentActive, String allocatedExperimentName, String[] explicitParameters, Boolean rulePassed, Map<String, String> parameterRuleIDs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        return new APIDynamicConfig(name, value, ruleID, groupName, secondaryExposures, undelegatedSecondaryExposures, isDeviceBased, isUserInExperiment, isExperimentActive, allocatedExperimentName, explicitParameters, rulePassed, parameterRuleIDs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APIDynamicConfig)) {
            return false;
        }
        APIDynamicConfig aPIDynamicConfig = (APIDynamicConfig) other;
        return Intrinsics.areEqual(this.name, aPIDynamicConfig.name) && Intrinsics.areEqual(this.value, aPIDynamicConfig.value) && Intrinsics.areEqual(this.ruleID, aPIDynamicConfig.ruleID) && Intrinsics.areEqual(this.groupName, aPIDynamicConfig.groupName) && Intrinsics.areEqual(this.secondaryExposures, aPIDynamicConfig.secondaryExposures) && Intrinsics.areEqual(this.undelegatedSecondaryExposures, aPIDynamicConfig.undelegatedSecondaryExposures) && this.isDeviceBased == aPIDynamicConfig.isDeviceBased && this.isUserInExperiment == aPIDynamicConfig.isUserInExperiment && this.isExperimentActive == aPIDynamicConfig.isExperimentActive && Intrinsics.areEqual(this.allocatedExperimentName, aPIDynamicConfig.allocatedExperimentName) && Intrinsics.areEqual(this.explicitParameters, aPIDynamicConfig.explicitParameters) && Intrinsics.areEqual(this.rulePassed, aPIDynamicConfig.rulePassed) && Intrinsics.areEqual(this.parameterRuleIDs, aPIDynamicConfig.parameterRuleIDs);
    }

    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final String[] getExplicitParameters() {
        return this.explicitParameters;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getParameterRuleIDs() {
        return this.parameterRuleIDs;
    }

    @NotNull
    public final String getRuleID() {
        return this.ruleID;
    }

    public final Boolean getRulePassed() {
        return this.rulePassed;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final Map<String, String>[] getUndelegatedSecondaryExposures() {
        return this.undelegatedSecondaryExposures;
    }

    @NotNull
    public final Map<String, Object> getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + this.ruleID.hashCode()) * 31;
        String str = this.groupName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String>[] mapArr = this.secondaryExposures;
        int iHashCode3 = (iHashCode2 + (mapArr == null ? 0 : Arrays.hashCode(mapArr))) * 31;
        Map<String, String>[] mapArr2 = this.undelegatedSecondaryExposures;
        int iHashCode4 = (iHashCode3 + (mapArr2 == null ? 0 : Arrays.hashCode(mapArr2))) * 31;
        boolean z11 = this.isDeviceBased;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (iHashCode4 + r12) * 31;
        boolean z12 = this.isUserInExperiment;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int i12 = (i11 + r13) * 31;
        boolean z13 = this.isExperimentActive;
        int i13 = (i12 + (z13 ? 1 : z13)) * 31;
        String str2 = this.allocatedExperimentName;
        int iHashCode5 = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String[] strArr = this.explicitParameters;
        int iHashCode6 = (iHashCode5 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        Boolean bool = this.rulePassed;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.parameterRuleIDs;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isDeviceBased() {
        return this.isDeviceBased;
    }

    public final boolean isExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean isUserInExperiment() {
        return this.isUserInExperiment;
    }

    @NotNull
    public String toString() {
        return "APIDynamicConfig(name=" + this.name + ", value=" + this.value + ", ruleID=" + this.ruleID + ", groupName=" + ((Object) this.groupName) + ", secondaryExposures=" + Arrays.toString(this.secondaryExposures) + ", undelegatedSecondaryExposures=" + Arrays.toString(this.undelegatedSecondaryExposures) + ", isDeviceBased=" + this.isDeviceBased + ", isUserInExperiment=" + this.isUserInExperiment + ", isExperimentActive=" + this.isExperimentActive + ", allocatedExperimentName=" + ((Object) this.allocatedExperimentName) + ", explicitParameters=" + Arrays.toString(this.explicitParameters) + ", rulePassed=" + this.rulePassed + ", parameterRuleIDs=" + this.parameterRuleIDs + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ APIDynamicConfig(java.lang.String r17, java.util.Map r18, java.lang.String r19, java.lang.String r20, java.util.Map[] r21, java.util.Map[] r22, boolean r23, boolean r24, boolean r25, java.lang.String r26, java.lang.String[] r27, java.lang.Boolean r28, java.util.Map r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 4
            if (r1 == 0) goto La
            java.lang.String r1 = ""
            r5 = r1
            goto Lc
        La:
            r5 = r19
        Lc:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L13
            r6 = r2
            goto L15
        L13:
            r6 = r20
        L15:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L1e
            java.util.Map[] r1 = new java.util.Map[r3]
            r7 = r1
            goto L20
        L1e:
            r7 = r21
        L20:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            java.util.Map[] r1 = new java.util.Map[r3]
            r8 = r1
            goto L2a
        L28:
            r8 = r22
        L2a:
            r1 = r0 & 64
            if (r1 == 0) goto L30
            r9 = r3
            goto L32
        L30:
            r9 = r23
        L32:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L38
            r10 = r3
            goto L3a
        L38:
            r10 = r24
        L3a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L40
            r11 = r3
            goto L42
        L40:
            r11 = r25
        L42:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L48
            r12 = r2
            goto L4a
        L48:
            r12 = r26
        L4a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            java.lang.String[] r1 = new java.lang.String[r3]
            r13 = r1
            goto L54
        L52:
            r13 = r27
        L54:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5a
            r14 = r2
            goto L5c
        L5a:
            r14 = r28
        L5c:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L68
            r15 = r2
            r3 = r17
            r4 = r18
            r2 = r16
            goto L70
        L68:
            r15 = r29
            r2 = r16
            r3 = r17
            r4 = r18
        L70:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.APIDynamicConfig.<init>(java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.util.Map[], java.util.Map[], boolean, boolean, boolean, java.lang.String, java.lang.String[], java.lang.Boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
