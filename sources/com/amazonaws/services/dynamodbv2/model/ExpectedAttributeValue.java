package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ExpectedAttributeValue implements Serializable {
    private List<AttributeValue> attributeValueList;
    private String comparisonOperator;
    private Boolean exists;
    private AttributeValue value;

    public ExpectedAttributeValue() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ExpectedAttributeValue)) {
            return false;
        }
        ExpectedAttributeValue expectedAttributeValue = (ExpectedAttributeValue) obj;
        if ((expectedAttributeValue.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        if (expectedAttributeValue.getValue() != null && !expectedAttributeValue.getValue().equals(getValue())) {
            return false;
        }
        if ((expectedAttributeValue.getExists() == null) ^ (getExists() == null)) {
            return false;
        }
        if (expectedAttributeValue.getExists() != null && !expectedAttributeValue.getExists().equals(getExists())) {
            return false;
        }
        if ((expectedAttributeValue.getComparisonOperator() == null) ^ (getComparisonOperator() == null)) {
            return false;
        }
        if (expectedAttributeValue.getComparisonOperator() != null && !expectedAttributeValue.getComparisonOperator().equals(getComparisonOperator())) {
            return false;
        }
        if ((expectedAttributeValue.getAttributeValueList() == null) ^ (getAttributeValueList() == null)) {
            return false;
        }
        return expectedAttributeValue.getAttributeValueList() == null || expectedAttributeValue.getAttributeValueList().equals(getAttributeValueList());
    }

    public List<AttributeValue> getAttributeValueList() {
        return this.attributeValueList;
    }

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public Boolean getExists() {
        return this.exists;
    }

    public AttributeValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((getValue() == null ? 0 : getValue().hashCode()) + 31) * 31) + (getExists() == null ? 0 : getExists().hashCode())) * 31) + (getComparisonOperator() == null ? 0 : getComparisonOperator().hashCode())) * 31) + (getAttributeValueList() != null ? getAttributeValueList().hashCode() : 0);
    }

    public Boolean isExists() {
        return this.exists;
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

    public void setExists(Boolean bool) {
        this.exists = bool;
    }

    public void setValue(AttributeValue attributeValue) {
        this.value = attributeValue;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getValue() != null) {
            sb2.append("Value: " + getValue() + ",");
        }
        if (getExists() != null) {
            sb2.append("Exists: " + getExists() + ",");
        }
        if (getComparisonOperator() != null) {
            sb2.append("ComparisonOperator: " + getComparisonOperator() + ",");
        }
        if (getAttributeValueList() != null) {
            sb2.append("AttributeValueList: " + getAttributeValueList());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ExpectedAttributeValue withAttributeValueList(AttributeValue... attributeValueArr) {
        if (getAttributeValueList() == null) {
            this.attributeValueList = new ArrayList(attributeValueArr.length);
        }
        for (AttributeValue attributeValue : attributeValueArr) {
            this.attributeValueList.add(attributeValue);
        }
        return this;
    }

    public ExpectedAttributeValue withComparisonOperator(String str) {
        this.comparisonOperator = str;
        return this;
    }

    public ExpectedAttributeValue withExists(Boolean bool) {
        this.exists = bool;
        return this;
    }

    public ExpectedAttributeValue withValue(AttributeValue attributeValue) {
        this.value = attributeValue;
        return this;
    }

    public ExpectedAttributeValue(AttributeValue attributeValue) {
        setValue(attributeValue);
    }

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    public ExpectedAttributeValue withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    public ExpectedAttributeValue(Boolean bool) {
        setExists(bool);
    }

    public ExpectedAttributeValue withAttributeValueList(Collection<AttributeValue> collection) {
        setAttributeValueList(collection);
        return this;
    }
}
