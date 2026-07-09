package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Projection implements Serializable {
    private List<String> nonKeyAttributes;
    private String projectionType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Projection)) {
            return false;
        }
        Projection projection = (Projection) obj;
        if ((projection.getProjectionType() == null) ^ (getProjectionType() == null)) {
            return false;
        }
        if (projection.getProjectionType() != null && !projection.getProjectionType().equals(getProjectionType())) {
            return false;
        }
        if ((projection.getNonKeyAttributes() == null) ^ (getNonKeyAttributes() == null)) {
            return false;
        }
        return projection.getNonKeyAttributes() == null || projection.getNonKeyAttributes().equals(getNonKeyAttributes());
    }

    public List<String> getNonKeyAttributes() {
        return this.nonKeyAttributes;
    }

    public String getProjectionType() {
        return this.projectionType;
    }

    public int hashCode() {
        return (((getProjectionType() == null ? 0 : getProjectionType().hashCode()) + 31) * 31) + (getNonKeyAttributes() != null ? getNonKeyAttributes().hashCode() : 0);
    }

    public void setNonKeyAttributes(Collection<String> collection) {
        if (collection == null) {
            this.nonKeyAttributes = null;
        } else {
            this.nonKeyAttributes = new ArrayList(collection);
        }
    }

    public void setProjectionType(String str) {
        this.projectionType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getProjectionType() != null) {
            sb2.append("ProjectionType: " + getProjectionType() + ",");
        }
        if (getNonKeyAttributes() != null) {
            sb2.append("NonKeyAttributes: " + getNonKeyAttributes());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Projection withNonKeyAttributes(String... strArr) {
        if (getNonKeyAttributes() == null) {
            this.nonKeyAttributes = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.nonKeyAttributes.add(str);
        }
        return this;
    }

    public Projection withProjectionType(String str) {
        this.projectionType = str;
        return this;
    }

    public void setProjectionType(ProjectionType projectionType) {
        this.projectionType = projectionType.toString();
    }

    public Projection withProjectionType(ProjectionType projectionType) {
        this.projectionType = projectionType.toString();
        return this;
    }

    public Projection withNonKeyAttributes(Collection<String> collection) {
        setNonKeyAttributes(collection);
        return this;
    }
}
