package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Capacity implements Serializable {
    private Double capacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Capacity)) {
            return false;
        }
        Capacity capacity = (Capacity) obj;
        if ((capacity.getCapacityUnits() == null) ^ (getCapacityUnits() == null)) {
            return false;
        }
        return capacity.getCapacityUnits() == null || capacity.getCapacityUnits().equals(getCapacityUnits());
    }

    public Double getCapacityUnits() {
        return this.capacityUnits;
    }

    public int hashCode() {
        return 31 + (getCapacityUnits() == null ? 0 : getCapacityUnits().hashCode());
    }

    public void setCapacityUnits(Double d11) {
        this.capacityUnits = d11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCapacityUnits() != null) {
            sb2.append("CapacityUnits: " + getCapacityUnits());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Capacity withCapacityUnits(Double d11) {
        this.capacityUnits = d11;
        return this;
    }
}
