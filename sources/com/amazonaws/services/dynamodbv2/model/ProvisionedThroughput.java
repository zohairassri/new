package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ProvisionedThroughput implements Serializable {
    private Long readCapacityUnits;
    private Long writeCapacityUnits;

    public ProvisionedThroughput() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProvisionedThroughput)) {
            return false;
        }
        ProvisionedThroughput provisionedThroughput = (ProvisionedThroughput) obj;
        if ((provisionedThroughput.getReadCapacityUnits() == null) ^ (getReadCapacityUnits() == null)) {
            return false;
        }
        if (provisionedThroughput.getReadCapacityUnits() != null && !provisionedThroughput.getReadCapacityUnits().equals(getReadCapacityUnits())) {
            return false;
        }
        if ((provisionedThroughput.getWriteCapacityUnits() == null) ^ (getWriteCapacityUnits() == null)) {
            return false;
        }
        return provisionedThroughput.getWriteCapacityUnits() == null || provisionedThroughput.getWriteCapacityUnits().equals(getWriteCapacityUnits());
    }

    public Long getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    public Long getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    public int hashCode() {
        return (((getReadCapacityUnits() == null ? 0 : getReadCapacityUnits().hashCode()) + 31) * 31) + (getWriteCapacityUnits() != null ? getWriteCapacityUnits().hashCode() : 0);
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
        if (getReadCapacityUnits() != null) {
            sb2.append("ReadCapacityUnits: " + getReadCapacityUnits() + ",");
        }
        if (getWriteCapacityUnits() != null) {
            sb2.append("WriteCapacityUnits: " + getWriteCapacityUnits());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ProvisionedThroughput withReadCapacityUnits(Long l11) {
        this.readCapacityUnits = l11;
        return this;
    }

    public ProvisionedThroughput withWriteCapacityUnits(Long l11) {
        this.writeCapacityUnits = l11;
        return this;
    }

    public ProvisionedThroughput(Long l11, Long l12) {
        setReadCapacityUnits(l11);
        setWriteCapacityUnits(l12);
    }
}
