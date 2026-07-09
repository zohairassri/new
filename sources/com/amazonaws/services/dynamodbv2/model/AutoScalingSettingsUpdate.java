package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AutoScalingSettingsUpdate implements Serializable {
    private Boolean autoScalingDisabled;
    private String autoScalingRoleArn;
    private Long maximumUnits;
    private Long minimumUnits;
    private AutoScalingPolicyUpdate scalingPolicyUpdate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoScalingSettingsUpdate)) {
            return false;
        }
        AutoScalingSettingsUpdate autoScalingSettingsUpdate = (AutoScalingSettingsUpdate) obj;
        if ((autoScalingSettingsUpdate.getMinimumUnits() == null) ^ (getMinimumUnits() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getMinimumUnits() != null && !autoScalingSettingsUpdate.getMinimumUnits().equals(getMinimumUnits())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getMaximumUnits() == null) ^ (getMaximumUnits() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getMaximumUnits() != null && !autoScalingSettingsUpdate.getMaximumUnits().equals(getMaximumUnits())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getAutoScalingDisabled() == null) ^ (getAutoScalingDisabled() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getAutoScalingDisabled() != null && !autoScalingSettingsUpdate.getAutoScalingDisabled().equals(getAutoScalingDisabled())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getAutoScalingRoleArn() == null) ^ (getAutoScalingRoleArn() == null)) {
            return false;
        }
        if (autoScalingSettingsUpdate.getAutoScalingRoleArn() != null && !autoScalingSettingsUpdate.getAutoScalingRoleArn().equals(getAutoScalingRoleArn())) {
            return false;
        }
        if ((autoScalingSettingsUpdate.getScalingPolicyUpdate() == null) ^ (getScalingPolicyUpdate() == null)) {
            return false;
        }
        return autoScalingSettingsUpdate.getScalingPolicyUpdate() == null || autoScalingSettingsUpdate.getScalingPolicyUpdate().equals(getScalingPolicyUpdate());
    }

    public Boolean getAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    public String getAutoScalingRoleArn() {
        return this.autoScalingRoleArn;
    }

    public Long getMaximumUnits() {
        return this.maximumUnits;
    }

    public Long getMinimumUnits() {
        return this.minimumUnits;
    }

    public AutoScalingPolicyUpdate getScalingPolicyUpdate() {
        return this.scalingPolicyUpdate;
    }

    public int hashCode() {
        return (((((((((getMinimumUnits() == null ? 0 : getMinimumUnits().hashCode()) + 31) * 31) + (getMaximumUnits() == null ? 0 : getMaximumUnits().hashCode())) * 31) + (getAutoScalingDisabled() == null ? 0 : getAutoScalingDisabled().hashCode())) * 31) + (getAutoScalingRoleArn() == null ? 0 : getAutoScalingRoleArn().hashCode())) * 31) + (getScalingPolicyUpdate() != null ? getScalingPolicyUpdate().hashCode() : 0);
    }

    public Boolean isAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    public void setAutoScalingDisabled(Boolean bool) {
        this.autoScalingDisabled = bool;
    }

    public void setAutoScalingRoleArn(String str) {
        this.autoScalingRoleArn = str;
    }

    public void setMaximumUnits(Long l11) {
        this.maximumUnits = l11;
    }

    public void setMinimumUnits(Long l11) {
        this.minimumUnits = l11;
    }

    public void setScalingPolicyUpdate(AutoScalingPolicyUpdate autoScalingPolicyUpdate) {
        this.scalingPolicyUpdate = autoScalingPolicyUpdate;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getMinimumUnits() != null) {
            sb2.append("MinimumUnits: " + getMinimumUnits() + ",");
        }
        if (getMaximumUnits() != null) {
            sb2.append("MaximumUnits: " + getMaximumUnits() + ",");
        }
        if (getAutoScalingDisabled() != null) {
            sb2.append("AutoScalingDisabled: " + getAutoScalingDisabled() + ",");
        }
        if (getAutoScalingRoleArn() != null) {
            sb2.append("AutoScalingRoleArn: " + getAutoScalingRoleArn() + ",");
        }
        if (getScalingPolicyUpdate() != null) {
            sb2.append("ScalingPolicyUpdate: " + getScalingPolicyUpdate());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AutoScalingSettingsUpdate withAutoScalingDisabled(Boolean bool) {
        this.autoScalingDisabled = bool;
        return this;
    }

    public AutoScalingSettingsUpdate withAutoScalingRoleArn(String str) {
        this.autoScalingRoleArn = str;
        return this;
    }

    public AutoScalingSettingsUpdate withMaximumUnits(Long l11) {
        this.maximumUnits = l11;
        return this;
    }

    public AutoScalingSettingsUpdate withMinimumUnits(Long l11) {
        this.minimumUnits = l11;
        return this;
    }

    public AutoScalingSettingsUpdate withScalingPolicyUpdate(AutoScalingPolicyUpdate autoScalingPolicyUpdate) {
        this.scalingPolicyUpdate = autoScalingPolicyUpdate;
        return this;
    }
}
