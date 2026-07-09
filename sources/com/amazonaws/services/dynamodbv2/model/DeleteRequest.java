package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DeleteRequest implements Serializable {
    private Map<String, AttributeValue> key;

    public DeleteRequest() {
    }

    public DeleteRequest addKeyEntry(String str, AttributeValue attributeValue) {
        if (this.key == null) {
            this.key = new HashMap();
        }
        if (!this.key.containsKey(str)) {
            this.key.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DeleteRequest clearKeyEntries() {
        this.key = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteRequest)) {
            return false;
        }
        DeleteRequest deleteRequest = (DeleteRequest) obj;
        if ((deleteRequest.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        return deleteRequest.getKey() == null || deleteRequest.getKey().equals(getKey());
    }

    public Map<String, AttributeValue> getKey() {
        return this.key;
    }

    public int hashCode() {
        return 31 + (getKey() == null ? 0 : getKey().hashCode());
    }

    public void setKey(Map<String, AttributeValue> map) {
        this.key = map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getKey() != null) {
            sb2.append("Key: " + getKey());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DeleteRequest withKey(Map<String, AttributeValue> map) {
        this.key = map;
        return this;
    }

    public DeleteRequest(Map<String, AttributeValue> map) {
        setKey(map);
    }
}
