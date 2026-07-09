package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class RegisterDeviceResult implements Serializable {
    private String deviceId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterDeviceResult)) {
            return false;
        }
        RegisterDeviceResult registerDeviceResult = (RegisterDeviceResult) obj;
        if ((registerDeviceResult.getDeviceId() == null) ^ (getDeviceId() == null)) {
            return false;
        }
        return registerDeviceResult.getDeviceId() == null || registerDeviceResult.getDeviceId().equals(getDeviceId());
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return 31 + (getDeviceId() == null ? 0 : getDeviceId().hashCode());
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getDeviceId() != null) {
            sb2.append("DeviceId: " + getDeviceId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public RegisterDeviceResult withDeviceId(String str) {
        this.deviceId = str;
        return this;
    }
}
