package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DescribeLimitsResult implements Serializable {
    private Long accountMaxReadCapacityUnits;
    private Long accountMaxWriteCapacityUnits;
    private Long tableMaxReadCapacityUnits;
    private Long tableMaxWriteCapacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLimitsResult)) {
            return false;
        }
        DescribeLimitsResult describeLimitsResult = (DescribeLimitsResult) obj;
        if ((describeLimitsResult.getAccountMaxReadCapacityUnits() == null) ^ (getAccountMaxReadCapacityUnits() == null)) {
            return false;
        }
        if (describeLimitsResult.getAccountMaxReadCapacityUnits() != null && !describeLimitsResult.getAccountMaxReadCapacityUnits().equals(getAccountMaxReadCapacityUnits())) {
            return false;
        }
        if ((describeLimitsResult.getAccountMaxWriteCapacityUnits() == null) ^ (getAccountMaxWriteCapacityUnits() == null)) {
            return false;
        }
        if (describeLimitsResult.getAccountMaxWriteCapacityUnits() != null && !describeLimitsResult.getAccountMaxWriteCapacityUnits().equals(getAccountMaxWriteCapacityUnits())) {
            return false;
        }
        if ((describeLimitsResult.getTableMaxReadCapacityUnits() == null) ^ (getTableMaxReadCapacityUnits() == null)) {
            return false;
        }
        if (describeLimitsResult.getTableMaxReadCapacityUnits() != null && !describeLimitsResult.getTableMaxReadCapacityUnits().equals(getTableMaxReadCapacityUnits())) {
            return false;
        }
        if ((describeLimitsResult.getTableMaxWriteCapacityUnits() == null) ^ (getTableMaxWriteCapacityUnits() == null)) {
            return false;
        }
        return describeLimitsResult.getTableMaxWriteCapacityUnits() == null || describeLimitsResult.getTableMaxWriteCapacityUnits().equals(getTableMaxWriteCapacityUnits());
    }

    public Long getAccountMaxReadCapacityUnits() {
        return this.accountMaxReadCapacityUnits;
    }

    public Long getAccountMaxWriteCapacityUnits() {
        return this.accountMaxWriteCapacityUnits;
    }

    public Long getTableMaxReadCapacityUnits() {
        return this.tableMaxReadCapacityUnits;
    }

    public Long getTableMaxWriteCapacityUnits() {
        return this.tableMaxWriteCapacityUnits;
    }

    public int hashCode() {
        return (((((((getAccountMaxReadCapacityUnits() == null ? 0 : getAccountMaxReadCapacityUnits().hashCode()) + 31) * 31) + (getAccountMaxWriteCapacityUnits() == null ? 0 : getAccountMaxWriteCapacityUnits().hashCode())) * 31) + (getTableMaxReadCapacityUnits() == null ? 0 : getTableMaxReadCapacityUnits().hashCode())) * 31) + (getTableMaxWriteCapacityUnits() != null ? getTableMaxWriteCapacityUnits().hashCode() : 0);
    }

    public void setAccountMaxReadCapacityUnits(Long l11) {
        this.accountMaxReadCapacityUnits = l11;
    }

    public void setAccountMaxWriteCapacityUnits(Long l11) {
        this.accountMaxWriteCapacityUnits = l11;
    }

    public void setTableMaxReadCapacityUnits(Long l11) {
        this.tableMaxReadCapacityUnits = l11;
    }

    public void setTableMaxWriteCapacityUnits(Long l11) {
        this.tableMaxWriteCapacityUnits = l11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getAccountMaxReadCapacityUnits() != null) {
            sb2.append("AccountMaxReadCapacityUnits: " + getAccountMaxReadCapacityUnits() + ",");
        }
        if (getAccountMaxWriteCapacityUnits() != null) {
            sb2.append("AccountMaxWriteCapacityUnits: " + getAccountMaxWriteCapacityUnits() + ",");
        }
        if (getTableMaxReadCapacityUnits() != null) {
            sb2.append("TableMaxReadCapacityUnits: " + getTableMaxReadCapacityUnits() + ",");
        }
        if (getTableMaxWriteCapacityUnits() != null) {
            sb2.append("TableMaxWriteCapacityUnits: " + getTableMaxWriteCapacityUnits());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DescribeLimitsResult withAccountMaxReadCapacityUnits(Long l11) {
        this.accountMaxReadCapacityUnits = l11;
        return this;
    }

    public DescribeLimitsResult withAccountMaxWriteCapacityUnits(Long l11) {
        this.accountMaxWriteCapacityUnits = l11;
        return this;
    }

    public DescribeLimitsResult withTableMaxReadCapacityUnits(Long l11) {
        this.tableMaxReadCapacityUnits = l11;
        return this;
    }

    public DescribeLimitsResult withTableMaxWriteCapacityUnits(Long l11) {
        this.tableMaxWriteCapacityUnits = l11;
        return this;
    }
}
