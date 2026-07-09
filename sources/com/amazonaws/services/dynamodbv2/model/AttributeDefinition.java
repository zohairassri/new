package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AttributeDefinition implements Serializable {
    private String attributeName;
    private String attributeType;

    public AttributeDefinition() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AttributeDefinition)) {
            return false;
        }
        AttributeDefinition attributeDefinition = (AttributeDefinition) obj;
        if ((attributeDefinition.getAttributeName() == null) ^ (getAttributeName() == null)) {
            return false;
        }
        if (attributeDefinition.getAttributeName() != null && !attributeDefinition.getAttributeName().equals(getAttributeName())) {
            return false;
        }
        if ((attributeDefinition.getAttributeType() == null) ^ (getAttributeType() == null)) {
            return false;
        }
        return attributeDefinition.getAttributeType() == null || attributeDefinition.getAttributeType().equals(getAttributeType());
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getAttributeType() {
        return this.attributeType;
    }

    public int hashCode() {
        return (((getAttributeName() == null ? 0 : getAttributeName().hashCode()) + 31) * 31) + (getAttributeType() != null ? getAttributeType().hashCode() : 0);
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setAttributeType(String str) {
        this.attributeType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getAttributeName() != null) {
            sb2.append("AttributeName: " + getAttributeName() + ",");
        }
        if (getAttributeType() != null) {
            sb2.append("AttributeType: " + getAttributeType());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AttributeDefinition withAttributeName(String str) {
        this.attributeName = str;
        return this;
    }

    public AttributeDefinition withAttributeType(String str) {
        this.attributeType = str;
        return this;
    }

    public AttributeDefinition(String str, String str2) {
        setAttributeName(str);
        setAttributeType(str2);
    }

    public void setAttributeType(ScalarAttributeType scalarAttributeType) {
        this.attributeType = scalarAttributeType.toString();
    }

    public AttributeDefinition withAttributeType(ScalarAttributeType scalarAttributeType) {
        this.attributeType = scalarAttributeType.toString();
        return this;
    }

    public AttributeDefinition(String str, ScalarAttributeType scalarAttributeType) {
        setAttributeName(str);
        setAttributeType(scalarAttributeType.toString());
    }
}
