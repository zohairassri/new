package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class FederatedUser implements Serializable {
    private String arn;
    private String federatedUserId;

    public FederatedUser() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FederatedUser)) {
            return false;
        }
        FederatedUser federatedUser = (FederatedUser) obj;
        if ((federatedUser.getFederatedUserId() == null) ^ (getFederatedUserId() == null)) {
            return false;
        }
        if (federatedUser.getFederatedUserId() != null && !federatedUser.getFederatedUserId().equals(getFederatedUserId())) {
            return false;
        }
        if ((federatedUser.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        return federatedUser.getArn() == null || federatedUser.getArn().equals(getArn());
    }

    public String getArn() {
        return this.arn;
    }

    public String getFederatedUserId() {
        return this.federatedUserId;
    }

    public int hashCode() {
        return (((getFederatedUserId() == null ? 0 : getFederatedUserId().hashCode()) + 31) * 31) + (getArn() != null ? getArn().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setFederatedUserId(String str) {
        this.federatedUserId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getFederatedUserId() != null) {
            sb2.append("FederatedUserId: " + getFederatedUserId() + ",");
        }
        if (getArn() != null) {
            sb2.append("Arn: " + getArn());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public FederatedUser withArn(String str) {
        this.arn = str;
        return this;
    }

    public FederatedUser withFederatedUserId(String str) {
        this.federatedUserId = str;
        return this;
    }

    public FederatedUser(String str, String str2) {
        setFederatedUserId(str);
        setArn(str2);
    }
}
