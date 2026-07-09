package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Condition implements Serializable {
    private List<AttributeValue> attributeValueList;
    private String comparisonOperator;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        if ((condition.getAttributeValueList() == null) ^ (getAttributeValueList() == null)) {
            return false;
        }
        if (condition.getAttributeValueList() != null && !condition.getAttributeValueList().equals(getAttributeValueList())) {
            return false;
        }
        if ((condition.getComparisonOperator() == null) ^ (getComparisonOperator() == null)) {
            return false;
        }
        return condition.getComparisonOperator() == null || condition.getComparisonOperator().equals(getComparisonOperator());
    }

    public List<AttributeValue> getAttributeValueList() {
        return this.attributeValueList;
    }

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public int hashCode() {
        return (((getAttributeValueList() == null ? 0 : getAttributeValueList().hashCode()) + 31) * 31) + (getComparisonOperator() != null ? getComparisonOperator().hashCode() : 0);
    }

    public void setAttributeValueList(Collection<AttributeValue> collection) {
        if (collection == null) {
            this.attributeValueList = null;
        } else {
            this.attributeValueList = new ArrayList(collection);
        }
    }

    public void setComparisonOperator(String str) {
        this.comparisonOperator = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getAttributeValueList() != null) {
            sb2.append("AttributeValueList: " + getAttributeValueList() + ",");
        }
        if (getComparisonOperator() != null) {
            sb2.append("ComparisonOperator: " + getComparisonOperator());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Condition withAttributeValueList(AttributeValue... attributeValueArr) {
        if (getAttributeValueList() == null) {
            this.attributeValueList = new ArrayList(attributeValueArr.length);
        }
        for (AttributeValue attributeValue : attributeValueArr) {
            this.attributeValueList.add(attributeValue);
        }
        return this;
    }

    public Condition withComparisonOperator(String str) {
        this.comparisonOperator = str;
        return this;
    }

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    public Condition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    public Condition withAttributeValueList(Collection<AttributeValue> collection) {
        setAttributeValueList(collection);
        return this;
    }
}
