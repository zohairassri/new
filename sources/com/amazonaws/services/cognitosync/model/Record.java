package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class Record implements Serializable {
    private Date deviceLastModifiedDate;
    private String key;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private Long syncCount;
    private String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Record)) {
            return false;
        }
        Record record = (Record) obj;
        if ((record.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        if (record.getKey() != null && !record.getKey().equals(getKey())) {
            return false;
        }
        if ((record.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        if (record.getValue() != null && !record.getValue().equals(getValue())) {
            return false;
        }
        if ((record.getSyncCount() == null) ^ (getSyncCount() == null)) {
            return false;
        }
        if (record.getSyncCount() != null && !record.getSyncCount().equals(getSyncCount())) {
            return false;
        }
        if ((record.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        if (record.getLastModifiedDate() != null && !record.getLastModifiedDate().equals(getLastModifiedDate())) {
            return false;
        }
        if ((record.getLastModifiedBy() == null) ^ (getLastModifiedBy() == null)) {
            return false;
        }
        if (record.getLastModifiedBy() != null && !record.getLastModifiedBy().equals(getLastModifiedBy())) {
            return false;
        }
        if ((record.getDeviceLastModifiedDate() == null) ^ (getDeviceLastModifiedDate() == null)) {
            return false;
        }
        return record.getDeviceLastModifiedDate() == null || record.getDeviceLastModifiedDate().equals(getDeviceLastModifiedDate());
    }

    public Date getDeviceLastModifiedDate() {
        return this.deviceLastModifiedDate;
    }

    public String getKey() {
        return this.key;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public Long getSyncCount() {
        return this.syncCount;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((getKey() == null ? 0 : getKey().hashCode()) + 31) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getSyncCount() == null ? 0 : getSyncCount().hashCode())) * 31) + (getLastModifiedDate() == null ? 0 : getLastModifiedDate().hashCode())) * 31) + (getLastModifiedBy() == null ? 0 : getLastModifiedBy().hashCode())) * 31) + (getDeviceLastModifiedDate() != null ? getDeviceLastModifiedDate().hashCode() : 0);
    }

    public void setDeviceLastModifiedDate(Date date) {
        this.deviceLastModifiedDate = date;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLastModifiedBy(String str) {
        this.lastModifiedBy = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
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
        if (getKey() != null) {
            sb2.append("Key: " + getKey() + ",");
        }
        if (getValue() != null) {
            sb2.append("Value: " + getValue() + ",");
        }
        if (getSyncCount() != null) {
            sb2.append("SyncCount: " + getSyncCount() + ",");
        }
        if (getLastModifiedDate() != null) {
            sb2.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        }
        if (getLastModifiedBy() != null) {
            sb2.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        }
        if (getDeviceLastModifiedDate() != null) {
            sb2.append("DeviceLastModifiedDate: " + getDeviceLastModifiedDate());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Record withDeviceLastModifiedDate(Date date) {
        this.deviceLastModifiedDate = date;
        return this;
    }

    public Record withKey(String str) {
        this.key = str;
        return this;
    }

    public Record withLastModifiedBy(String str) {
        this.lastModifiedBy = str;
        return this;
    }

    public Record withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public Record withSyncCount(Long l11) {
        this.syncCount = l11;
        return this;
    }

    public Record withValue(String str) {
        this.value = str;
        return this;
    }
}
