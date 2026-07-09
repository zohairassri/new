package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class PutRequest implements Serializable {
    private Map<String, AttributeValue> item;

    public PutRequest() {
    }

    public PutRequest addItemEntry(String str, AttributeValue attributeValue) {
        if (this.item == null) {
            this.item = new HashMap();
        }
        if (!this.item.containsKey(str)) {
            this.item.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public PutRequest clearItemEntries() {
        this.item = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRequest)) {
            return false;
        }
        PutRequest putRequest = (PutRequest) obj;
        if ((putRequest.getItem() == null) ^ (getItem() == null)) {
            return false;
        }
        return putRequest.getItem() == null || putRequest.getItem().equals(getItem());
    }

    public Map<String, AttributeValue> getItem() {
        return this.item;
    }

    public int hashCode() {
        return 31 + (getItem() == null ? 0 : getItem().hashCode());
    }

    public void setItem(Map<String, AttributeValue> map) {
        this.item = map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getItem() != null) {
            sb2.append("Item: " + getItem());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public PutRequest withItem(Map<String, AttributeValue> map) {
        this.item = map;
        return this;
    }

    public PutRequest(Map<String, AttributeValue> map) {
        setItem(map);
    }
}
