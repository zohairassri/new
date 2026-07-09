package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AutoScalingPolicyUpdate implements Serializable {
    private String policyName;
    private AutoScalingTargetTrackingScalingPolicyConfigurationUpdate targetTrackingScalingPolicyConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoScalingPolicyUpdate)) {
            return false;
        }
        AutoScalingPolicyUpdate autoScalingPolicyUpdate = (AutoScalingPolicyUpdate) obj;
        if ((autoScalingPolicyUpdate.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (autoScalingPolicyUpdate.getPolicyName() != null && !autoScalingPolicyUpdate.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((autoScalingPolicyUpdate.getTargetTrackingScalingPolicyConfiguration() == null) ^ (getTargetTrackingScalingPolicyConfiguration() == null)) {
            return false;
        }
        return autoScalingPolicyUpdate.getTargetTrackingScalingPolicyConfiguration() == null || autoScalingPolicyUpdate.getTargetTrackingScalingPolicyConfiguration().equals(getTargetTrackingScalingPolicyConfiguration());
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate getTargetTrackingScalingPolicyConfiguration() {
        return this.targetTrackingScalingPolicyConfiguration;
    }

    public int hashCode() {
        return (((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getTargetTrackingScalingPolicyConfiguration() != null ? getTargetTrackingScalingPolicyConfiguration().hashCode() : 0);
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setTargetTrackingScalingPolicyConfiguration(AutoScalingTargetTrackingScalingPolicyConfigurationUpdate autoScalingTargetTrackingScalingPolicyConfigurationUpdate) {
        this.targetTrackingScalingPolicyConfiguration = autoScalingTargetTrackingScalingPolicyConfigurationUpdate;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getPolicyName() != null) {
            sb2.append("PolicyName: " + getPolicyName() + ",");
        }
        if (getTargetTrackingScalingPolicyConfiguration() != null) {
            sb2.append("TargetTrackingScalingPolicyConfiguration: " + getTargetTrackingScalingPolicyConfiguration());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AutoScalingPolicyUpdate withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public AutoScalingPolicyUpdate withTargetTrackingScalingPolicyConfiguration(AutoScalingTargetTrackingScalingPolicyConfigurationUpdate autoScalingTargetTrackingScalingPolicyConfigurationUpdate) {
        this.targetTrackingScalingPolicyConfiguration = autoScalingTargetTrackingScalingPolicyConfigurationUpdate;
        return this;
    }
}
