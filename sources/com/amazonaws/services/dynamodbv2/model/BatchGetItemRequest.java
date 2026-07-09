package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class BatchGetItemRequest extends AmazonWebServiceRequest implements Serializable {
    private Map<String, KeysAndAttributes> requestItems;
    private String returnConsumedCapacity;

    public BatchGetItemRequest() {
    }

    public BatchGetItemRequest addRequestItemsEntry(String str, KeysAndAttributes keysAndAttributes) {
        if (this.requestItems == null) {
            this.requestItems = new HashMap();
        }
        if (!this.requestItems.containsKey(str)) {
            this.requestItems.put(str, keysAndAttributes);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public BatchGetItemRequest clearRequestItemsEntries() {
        this.requestItems = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BatchGetItemRequest)) {
            return false;
        }
        BatchGetItemRequest batchGetItemRequest = (BatchGetItemRequest) obj;
        if ((batchGetItemRequest.getRequestItems() == null) ^ (getRequestItems() == null)) {
            return false;
        }
        if (batchGetItemRequest.getRequestItems() != null && !batchGetItemRequest.getRequestItems().equals(getRequestItems())) {
            return false;
        }
        if ((batchGetItemRequest.getReturnConsumedCapacity() == null) ^ (getReturnConsumedCapacity() == null)) {
            return false;
        }
        return batchGetItemRequest.getReturnConsumedCapacity() == null || batchGetItemRequest.getReturnConsumedCapacity().equals(getReturnConsumedCapacity());
    }

    public Map<String, KeysAndAttributes> getRequestItems() {
        return this.requestItems;
    }

    public String getReturnConsumedCapacity() {
        return this.returnConsumedCapacity;
    }

    public int hashCode() {
        return (((getRequestItems() == null ? 0 : getRequestItems().hashCode()) + 31) * 31) + (getReturnConsumedCapacity() != null ? getReturnConsumedCapacity().hashCode() : 0);
    }

    public void setRequestItems(Map<String, KeysAndAttributes> map) {
        this.requestItems = map;
    }

    public void setReturnConsumedCapacity(String str) {
        this.returnConsumedCapacity = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getRequestItems() != null) {
            sb2.append("RequestItems: " + getRequestItems() + ",");
        }
        if (getReturnConsumedCapacity() != null) {
            sb2.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public BatchGetItemRequest withRequestItems(Map<String, KeysAndAttributes> map) {
        this.requestItems = map;
        return this;
    }

    public BatchGetItemRequest withReturnConsumedCapacity(String str) {
        this.returnConsumedCapacity = str;
        return this;
    }

    public BatchGetItemRequest(Map<String, KeysAndAttributes> map) {
        setRequestItems(map);
    }

    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    public BatchGetItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    public BatchGetItemRequest(Map<String, KeysAndAttributes> map, String str) {
        setRequestItems(map);
        setReturnConsumedCapacity(str);
    }

    public BatchGetItemRequest(Map<String, KeysAndAttributes> map, ReturnConsumedCapacity returnConsumedCapacity) {
        setRequestItems(map);
        setReturnConsumedCapacity(returnConsumedCapacity.toString());
    }
}
