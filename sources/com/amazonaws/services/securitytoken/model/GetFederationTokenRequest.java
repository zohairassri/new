package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class GetFederationTokenRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String name;
    private String policy;

    public GetFederationTokenRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetFederationTokenRequest)) {
            return false;
        }
        GetFederationTokenRequest getFederationTokenRequest = (GetFederationTokenRequest) obj;
        if ((getFederationTokenRequest.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (getFederationTokenRequest.getName() != null && !getFederationTokenRequest.getName().equals(getName())) {
            return false;
        }
        if ((getFederationTokenRequest.getPolicy() == null) ^ (getPolicy() == null)) {
            return false;
        }
        if (getFederationTokenRequest.getPolicy() != null && !getFederationTokenRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if ((getFederationTokenRequest.getDurationSeconds() == null) ^ (getDurationSeconds() == null)) {
            return false;
        }
        return getFederationTokenRequest.getDurationSeconds() == null || getFederationTokenRequest.getDurationSeconds().equals(getDurationSeconds());
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public String getName() {
        return this.name;
    }

    public String getPolicy() {
        return this.policy;
    }

    public int hashCode() {
        return (((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getPolicy() == null ? 0 : getPolicy().hashCode())) * 31) + (getDurationSeconds() != null ? getDurationSeconds().hashCode() : 0);
    }

    public void setDurationSeconds(Integer num) {
        this.durationSeconds = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPolicy(String str) {
        this.policy = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getName() != null) {
            sb2.append("Name: " + getName() + ",");
        }
        if (getPolicy() != null) {
            sb2.append("Policy: " + getPolicy() + ",");
        }
        if (getDurationSeconds() != null) {
            sb2.append("DurationSeconds: " + getDurationSeconds());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public GetFederationTokenRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public GetFederationTokenRequest withName(String str) {
        this.name = str;
        return this;
    }

    public GetFederationTokenRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public GetFederationTokenRequest(String str) {
        setName(str);
    }
}
