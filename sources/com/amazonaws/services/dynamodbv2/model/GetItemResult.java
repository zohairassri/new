package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class GetItemResult implements Serializable {
    private ConsumedCapacity consumedCapacity;
    private Map<String, AttributeValue> item;

    public GetItemResult addItemEntry(String str, AttributeValue attributeValue) {
        if (this.item == null) {
            this.item = new HashMap();
        }
        if (!this.item.containsKey(str)) {
            this.item.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public GetItemResult clearItemEntries() {
        this.item = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetItemResult)) {
            return false;
        }
        GetItemResult getItemResult = (GetItemResult) obj;
        if ((getItemResult.getItem() == null) ^ (getItem() == null)) {
            return false;
        }
        if (getItemResult.getItem() != null && !getItemResult.getItem().equals(getItem())) {
            return false;
        }
        if ((getItemResult.getConsumedCapacity() == null) ^ (getConsumedCapacity() == null)) {
            return false;
        }
        return getItemResult.getConsumedCapacity() == null || getItemResult.getConsumedCapacity().equals(getConsumedCapacity());
    }

    public ConsumedCapacity getConsumedCapacity() {
        return this.consumedCapacity;
    }

    public Map<String, AttributeValue> getItem() {
        return this.item;
    }

    public int hashCode() {
        return (((getItem() == null ? 0 : getItem().hashCode()) + 31) * 31) + (getConsumedCapacity() != null ? getConsumedCapacity().hashCode() : 0);
    }

    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    public void setItem(Map<String, AttributeValue> map) {
        this.item = map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getItem() != null) {
            sb2.append("Item: " + getItem() + ",");
        }
        if (getConsumedCapacity() != null) {
            sb2.append("ConsumedCapacity: " + getConsumedCapacity());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public GetItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
        return this;
    }

    public GetItemResult withItem(Map<String, AttributeValue> map) {
        this.item = map;
        return this;
    }
}
