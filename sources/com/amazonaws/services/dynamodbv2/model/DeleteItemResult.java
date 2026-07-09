package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DeleteItemResult implements Serializable {
    private Map<String, AttributeValue> attributes;
    private ConsumedCapacity consumedCapacity;
    private ItemCollectionMetrics itemCollectionMetrics;

    public DeleteItemResult addAttributesEntry(String str, AttributeValue attributeValue) {
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        if (!this.attributes.containsKey(str)) {
            this.attributes.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DeleteItemResult clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteItemResult)) {
            return false;
        }
        DeleteItemResult deleteItemResult = (DeleteItemResult) obj;
        if ((deleteItemResult.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        if (deleteItemResult.getAttributes() != null && !deleteItemResult.getAttributes().equals(getAttributes())) {
            return false;
        }
        if ((deleteItemResult.getConsumedCapacity() == null) ^ (getConsumedCapacity() == null)) {
            return false;
        }
        if (deleteItemResult.getConsumedCapacity() != null && !deleteItemResult.getConsumedCapacity().equals(getConsumedCapacity())) {
            return false;
        }
        if ((deleteItemResult.getItemCollectionMetrics() == null) ^ (getItemCollectionMetrics() == null)) {
            return false;
        }
        return deleteItemResult.getItemCollectionMetrics() == null || deleteItemResult.getItemCollectionMetrics().equals(getItemCollectionMetrics());
    }

    public Map<String, AttributeValue> getAttributes() {
        return this.attributes;
    }

    public ConsumedCapacity getConsumedCapacity() {
        return this.consumedCapacity;
    }

    public ItemCollectionMetrics getItemCollectionMetrics() {
        return this.itemCollectionMetrics;
    }

    public int hashCode() {
        return (((((getAttributes() == null ? 0 : getAttributes().hashCode()) + 31) * 31) + (getConsumedCapacity() == null ? 0 : getConsumedCapacity().hashCode())) * 31) + (getItemCollectionMetrics() != null ? getItemCollectionMetrics().hashCode() : 0);
    }

    public void setAttributes(Map<String, AttributeValue> map) {
        this.attributes = map;
    }

    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    public void setItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getAttributes() != null) {
            sb2.append("Attributes: " + getAttributes() + ",");
        }
        if (getConsumedCapacity() != null) {
            sb2.append("ConsumedCapacity: " + getConsumedCapacity() + ",");
        }
        if (getItemCollectionMetrics() != null) {
            sb2.append("ItemCollectionMetrics: " + getItemCollectionMetrics());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DeleteItemResult withAttributes(Map<String, AttributeValue> map) {
        this.attributes = map;
        return this;
    }

    public DeleteItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
        return this;
    }

    public DeleteItemResult withItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
        return this;
    }
}
