package com.amazonaws.services.cognitosync.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class RegisterDeviceRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityId;
    private String identityPoolId;
    private String platform;
    private String token;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterDeviceRequest)) {
            return false;
        }
        RegisterDeviceRequest registerDeviceRequest = (RegisterDeviceRequest) obj;
        if ((registerDeviceRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (registerDeviceRequest.getIdentityPoolId() != null && !registerDeviceRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((registerDeviceRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (registerDeviceRequest.getIdentityId() != null && !registerDeviceRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((registerDeviceRequest.getPlatform() == null) ^ (getPlatform() == null)) {
            return false;
        }
        if (registerDeviceRequest.getPlatform() != null && !registerDeviceRequest.getPlatform().equals(getPlatform())) {
            return false;
        }
        if ((registerDeviceRequest.getToken() == null) ^ (getToken() == null)) {
            return false;
        }
        return registerDeviceRequest.getToken() == null || registerDeviceRequest.getToken().equals(getToken());
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityId() == null ? 0 : getIdentityId().hashCode())) * 31) + (getPlatform() == null ? 0 : getPlatform().hashCode())) * 31) + (getToken() != null ? getToken().hashCode() : 0);
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getIdentityPoolId() != null) {
            sb2.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getIdentityId() != null) {
            sb2.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getPlatform() != null) {
            sb2.append("Platform: " + getPlatform() + ",");
        }
        if (getToken() != null) {
            sb2.append("Token: " + getToken());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public RegisterDeviceRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public RegisterDeviceRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public RegisterDeviceRequest withPlatform(String str) {
        this.platform = str;
        return this;
    }

    public RegisterDeviceRequest withToken(String str) {
        this.token = str;
        return this;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }

    public RegisterDeviceRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }
}
