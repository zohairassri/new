package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ProvisionedThroughputDescription implements Serializable {
    private Date lastDecreaseDateTime;
    private Date lastIncreaseDateTime;
    private Long numberOfDecreasesToday;
    private Long readCapacityUnits;
    private Long writeCapacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProvisionedThroughputDescription)) {
            return false;
        }
        ProvisionedThroughputDescription provisionedThroughputDescription = (ProvisionedThroughputDescription) obj;
        if ((provisionedThroughputDescription.getLastIncreaseDateTime() == null) ^ (getLastIncreaseDateTime() == null)) {
            return false;
        }
        if (provisionedThroughputDescription.getLastIncreaseDateTime() != null && !provisionedThroughputDescription.getLastIncreaseDateTime().equals(getLastIncreaseDateTime())) {
            return false;
        }
        if ((provisionedThroughputDescription.getLastDecreaseDateTime() == null) ^ (getLastDecreaseDateTime() == null)) {
            return false;
        }
        if (provisionedThroughputDescription.getLastDecreaseDateTime() != null && !provisionedThroughputDescription.getLastDecreaseDateTime().equals(getLastDecreaseDateTime())) {
            return false;
        }
        if ((provisionedThroughputDescription.getNumberOfDecreasesToday() == null) ^ (getNumberOfDecreasesToday() == null)) {
            return false;
        }
        if (provisionedThroughputDescription.getNumberOfDecreasesToday() != null && !provisionedThroughputDescription.getNumberOfDecreasesToday().equals(getNumberOfDecreasesToday())) {
            return false;
        }
        if ((provisionedThroughputDescription.getReadCapacityUnits() == null) ^ (getReadCapacityUnits() == null)) {
            return false;
        }
        if (provisionedThroughputDescription.getReadCapacityUnits() != null && !provisionedThroughputDescription.getReadCapacityUnits().equals(getReadCapacityUnits())) {
            return false;
        }
        if ((provisionedThroughputDescription.getWriteCapacityUnits() == null) ^ (getWriteCapacityUnits() == null)) {
            return false;
        }
        return provisionedThroughputDescription.getWriteCapacityUnits() == null || provisionedThroughputDescription.getWriteCapacityUnits().equals(getWriteCapacityUnits());
    }

    public Date getLastDecreaseDateTime() {
        return this.lastDecreaseDateTime;
    }

    public Date getLastIncreaseDateTime() {
        return this.lastIncreaseDateTime;
    }

    public Long getNumberOfDecreasesToday() {
        return this.numberOfDecreasesToday;
    }

    public Long getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    public Long getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    public int hashCode() {
        return (((((((((getLastIncreaseDateTime() == null ? 0 : getLastIncreaseDateTime().hashCode()) + 31) * 31) + (getLastDecreaseDateTime() == null ? 0 : getLastDecreaseDateTime().hashCode())) * 31) + (getNumberOfDecreasesToday() == null ? 0 : getNumberOfDecreasesToday().hashCode())) * 31) + (getReadCapacityUnits() == null ? 0 : getReadCapacityUnits().hashCode())) * 31) + (getWriteCapacityUnits() != null ? getWriteCapacityUnits().hashCode() : 0);
    }

    public void setLastDecreaseDateTime(Date date) {
        this.lastDecreaseDateTime = date;
    }

    public void setLastIncreaseDateTime(Date date) {
        this.lastIncreaseDateTime = date;
    }

    public void setNumberOfDecreasesToday(Long l11) {
        this.numberOfDecreasesToday = l11;
    }

    public void setReadCapacityUnits(Long l11) {
        this.readCapacityUnits = l11;
    }

    public void setWriteCapacityUnits(Long l11) {
        this.writeCapacityUnits = l11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getLastIncreaseDateTime() != null) {
            sb2.append("LastIncreaseDateTime: " + getLastIncreaseDateTime() + ",");
        }
        if (getLastDecreaseDateTime() != null) {
            sb2.append("LastDecreaseDateTime: " + getLastDecreaseDateTime() + ",");
        }
        if (getNumberOfDecreasesToday() != null) {
            sb2.append("NumberOfDecreasesToday: " + getNumberOfDecreasesToday() + ",");
        }
        if (getReadCapacityUnits() != null) {
            sb2.append("ReadCapacityUnits: " + getReadCapacityUnits() + ",");
        }
        if (getWriteCapacityUnits() != null) {
            sb2.append("WriteCapacityUnits: " + getWriteCapacityUnits());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ProvisionedThroughputDescription withLastDecreaseDateTime(Date date) {
        this.lastDecreaseDateTime = date;
        return this;
    }

    public ProvisionedThroughputDescription withLastIncreaseDateTime(Date date) {
        this.lastIncreaseDateTime = date;
        return this;
    }

    public ProvisionedThroughputDescription withNumberOfDecreasesToday(Long l11) {
        this.numberOfDecreasesToday = l11;
        return this;
    }

    public ProvisionedThroughputDescription withReadCapacityUnits(Long l11) {
        this.readCapacityUnits = l11;
        return this;
    }

    public ProvisionedThroughputDescription withWriteCapacityUnits(Long l11) {
        this.writeCapacityUnits = l11;
        return this;
    }
}
