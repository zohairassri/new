package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AutoScalingTargetTrackingScalingPolicyConfigurationDescription implements Serializable {
    private Boolean disableScaleIn;
    private Integer scaleInCooldown;
    private Integer scaleOutCooldown;
    private Double targetValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoScalingTargetTrackingScalingPolicyConfigurationDescription)) {
            return false;
        }
        AutoScalingTargetTrackingScalingPolicyConfigurationDescription autoScalingTargetTrackingScalingPolicyConfigurationDescription = (AutoScalingTargetTrackingScalingPolicyConfigurationDescription) obj;
        if ((autoScalingTargetTrackingScalingPolicyConfigurationDescription.getDisableScaleIn() == null) ^ (getDisableScaleIn() == null)) {
            return false;
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription.getDisableScaleIn() != null && !autoScalingTargetTrackingScalingPolicyConfigurationDescription.getDisableScaleIn().equals(getDisableScaleIn())) {
            return false;
        }
        if ((autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleInCooldown() == null) ^ (getScaleInCooldown() == null)) {
            return false;
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleInCooldown() != null && !autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleInCooldown().equals(getScaleInCooldown())) {
            return false;
        }
        if ((autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleOutCooldown() == null) ^ (getScaleOutCooldown() == null)) {
            return false;
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleOutCooldown() != null && !autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleOutCooldown().equals(getScaleOutCooldown())) {
            return false;
        }
        if ((autoScalingTargetTrackingScalingPolicyConfigurationDescription.getTargetValue() == null) ^ (getTargetValue() == null)) {
            return false;
        }
        return autoScalingTargetTrackingScalingPolicyConfigurationDescription.getTargetValue() == null || autoScalingTargetTrackingScalingPolicyConfigurationDescription.getTargetValue().equals(getTargetValue());
    }

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    public Double getTargetValue() {
        return this.targetValue;
    }

    public int hashCode() {
        return (((((((getDisableScaleIn() == null ? 0 : getDisableScaleIn().hashCode()) + 31) * 31) + (getScaleInCooldown() == null ? 0 : getScaleInCooldown().hashCode())) * 31) + (getScaleOutCooldown() == null ? 0 : getScaleOutCooldown().hashCode())) * 31) + (getTargetValue() != null ? getTargetValue().hashCode() : 0);
    }

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
    }

    public void setDisableScaleIn(Boolean bool) {
        this.disableScaleIn = bool;
    }

    public void setScaleInCooldown(Integer num) {
        this.scaleInCooldown = num;
    }

    public void setScaleOutCooldown(Integer num) {
        this.scaleOutCooldown = num;
    }

    public void setTargetValue(Double d11) {
        this.targetValue = d11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getDisableScaleIn() != null) {
            sb2.append("DisableScaleIn: " + getDisableScaleIn() + ",");
        }
        if (getScaleInCooldown() != null) {
            sb2.append("ScaleInCooldown: " + getScaleInCooldown() + ",");
        }
        if (getScaleOutCooldown() != null) {
            sb2.append("ScaleOutCooldown: " + getScaleOutCooldown() + ",");
        }
        if (getTargetValue() != null) {
            sb2.append("TargetValue: " + getTargetValue());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withDisableScaleIn(Boolean bool) {
        this.disableScaleIn = bool;
        return this;
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withScaleInCooldown(Integer num) {
        this.scaleInCooldown = num;
        return this;
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withScaleOutCooldown(Integer num) {
        this.scaleOutCooldown = num;
        return this;
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withTargetValue(Double d11) {
        this.targetValue = d11;
        return this;
    }
}
