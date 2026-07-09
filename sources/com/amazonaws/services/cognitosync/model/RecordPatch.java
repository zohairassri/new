package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class RecordPatch implements Serializable {
    private Date deviceLastModifiedDate;
    private String key;

    /* JADX INFO: renamed from: op, reason: collision with root package name */
    private String f18416op;
    private Long syncCount;
    private String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RecordPatch)) {
            return false;
        }
        RecordPatch recordPatch = (RecordPatch) obj;
        if ((recordPatch.getOp() == null) ^ (getOp() == null)) {
            return false;
        }
        if (recordPatch.getOp() != null && !recordPatch.getOp().equals(getOp())) {
            return false;
        }
        if ((recordPatch.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        if (recordPatch.getKey() != null && !recordPatch.getKey().equals(getKey())) {
            return false;
        }
        if ((recordPatch.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        if (recordPatch.getValue() != null && !recordPatch.getValue().equals(getValue())) {
            return false;
        }
        if ((recordPatch.getSyncCount() == null) ^ (getSyncCount() == null)) {
            return false;
        }
        if (recordPatch.getSyncCount() != null && !recordPatch.getSyncCount().equals(getSyncCount())) {
            return false;
        }
        if ((recordPatch.getDeviceLastModifiedDate() == null) ^ (getDeviceLastModifiedDate() == null)) {
            return false;
        }
        return recordPatch.getDeviceLastModifiedDate() == null || recordPatch.getDeviceLastModifiedDate().equals(getDeviceLastModifiedDate());
    }

    public Date getDeviceLastModifiedDate() {
        return this.deviceLastModifiedDate;
    }

    public String getKey() {
        return this.key;
    }

    public String getOp() {
        return this.f18416op;
    }

    public Long getSyncCount() {
        return this.syncCount;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((getOp() == null ? 0 : getOp().hashCode()) + 31) * 31) + (getKey() == null ? 0 : getKey().hashCode())) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getSyncCount() == null ? 0 : getSyncCount().hashCode())) * 31) + (getDeviceLastModifiedDate() != null ? getDeviceLastModifiedDate().hashCode() : 0);
    }

    public void setDeviceLastModifiedDate(Date date) {
        this.deviceLastModifiedDate = date;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOp(String str) {
        this.f18416op = str;
    }

    public void setSyncCount(Long l11) {
        this.syncCount = l11;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getOp() != null) {
            sb2.append("Op: " + getOp() + ",");
        }
        if (getKey() != null) {
            sb2.append("Key: " + getKey() + ",");
        }
        if (getValue() != null) {
            sb2.append("Value: " + getValue() + ",");
        }
        if (getSyncCount() != null) {
            sb2.append("SyncCount: " + getSyncCount() + ",");
        }
        if (getDeviceLastModifiedDate() != null) {
            sb2.append("DeviceLastModifiedDate: " + getDeviceLastModifiedDate());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public RecordPatch withDeviceLastModifiedDate(Date date) {
        this.deviceLastModifiedDate = date;
        return this;
    }

    public RecordPatch withKey(String str) {
        this.key = str;
        return this;
    }

    public RecordPatch withOp(String str) {
        this.f18416op = str;
        return this;
    }

    public RecordPatch withSyncCount(Long l11) {
        this.syncCount = l11;
        return this;
    }

    public RecordPatch withValue(String str) {
        this.value = str;
        return this;
    }

    public void setOp(Operation operation) {
        this.f18416op = operation.toString();
    }

    public RecordPatch withOp(Operation operation) {
        this.f18416op = operation.toString();
        return this;
    }
}
