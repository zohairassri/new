package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class QueryResult implements Serializable {
    private ConsumedCapacity consumedCapacity;
    private Integer count;
    private List<Map<String, AttributeValue>> items;
    private Map<String, AttributeValue> lastEvaluatedKey;
    private Integer scannedCount;

    public QueryResult addLastEvaluatedKeyEntry(String str, AttributeValue attributeValue) {
        if (this.lastEvaluatedKey == null) {
            this.lastEvaluatedKey = new HashMap();
        }
        if (!this.lastEvaluatedKey.containsKey(str)) {
            this.lastEvaluatedKey.put(str, attributeValue);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public QueryResult clearLastEvaluatedKeyEntries() {
        this.lastEvaluatedKey = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof QueryResult)) {
            return false;
        }
        QueryResult queryResult = (QueryResult) obj;
        if ((queryResult.getItems() == null) ^ (getItems() == null)) {
            return false;
        }
        if (queryResult.getItems() != null && !queryResult.getItems().equals(getItems())) {
            return false;
        }
        if ((queryResult.getCount() == null) ^ (getCount() == null)) {
            return false;
        }
        if (queryResult.getCount() != null && !queryResult.getCount().equals(getCount())) {
            return false;
        }
        if ((queryResult.getScannedCount() == null) ^ (getScannedCount() == null)) {
            return false;
        }
        if (queryResult.getScannedCount() != null && !queryResult.getScannedCount().equals(getScannedCount())) {
            return false;
        }
        if ((queryResult.getLastEvaluatedKey() == null) ^ (getLastEvaluatedKey() == null)) {
            return false;
        }
        if (queryResult.getLastEvaluatedKey() != null && !queryResult.getLastEvaluatedKey().equals(getLastEvaluatedKey())) {
            return false;
        }
        if ((queryResult.getConsumedCapacity() == null) ^ (getConsumedCapacity() == null)) {
            return false;
        }
        return queryResult.getConsumedCapacity() == null || queryResult.getConsumedCapacity().equals(getConsumedCapacity());
    }

    public ConsumedCapacity getConsumedCapacity() {
        return this.consumedCapacity;
    }

    public Integer getCount() {
        return this.count;
    }

    public List<Map<String, AttributeValue>> getItems() {
        return this.items;
    }

    public Map<String, AttributeValue> getLastEvaluatedKey() {
        return this.lastEvaluatedKey;
    }

    public Integer getScannedCount() {
        return this.scannedCount;
    }

    public int hashCode() {
        return (((((((((getItems() == null ? 0 : getItems().hashCode()) + 31) * 31) + (getCount() == null ? 0 : getCount().hashCode())) * 31) + (getScannedCount() == null ? 0 : getScannedCount().hashCode())) * 31) + (getLastEvaluatedKey() == null ? 0 : getLastEvaluatedKey().hashCode())) * 31) + (getConsumedCapacity() != null ? getConsumedCapacity().hashCode() : 0);
    }

    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setItems(Collection<Map<String, AttributeValue>> collection) {
        if (collection == null) {
            this.items = null;
        } else {
            this.items = new ArrayList(collection);
        }
    }

    public void setLastEvaluatedKey(Map<String, AttributeValue> map) {
        this.lastEvaluatedKey = map;
    }

    public void setScannedCount(Integer num) {
        this.scannedCount = num;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getItems() != null) {
            sb2.append("Items: " + getItems() + ",");
        }
        if (getCount() != null) {
            sb2.append("Count: " + getCount() + ",");
        }
        if (getScannedCount() != null) {
            sb2.append("ScannedCount: " + getScannedCount() + ",");
        }
        if (getLastEvaluatedKey() != null) {
            sb2.append("LastEvaluatedKey: " + getLastEvaluatedKey() + ",");
        }
        if (getConsumedCapacity() != null) {
            sb2.append("ConsumedCapacity: " + getConsumedCapacity());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public QueryResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
        return this;
    }

    public QueryResult withCount(Integer num) {
        this.count = num;
        return this;
    }

    public QueryResult withItems(Map<String, AttributeValue>... mapArr) {
        if (getItems() == null) {
            this.items = new ArrayList(mapArr.length);
        }
        for (Map<String, AttributeValue> map : mapArr) {
            this.items.add(map);
        }
        return this;
    }

    public QueryResult withLastEvaluatedKey(Map<String, AttributeValue> map) {
        this.lastEvaluatedKey = map;
        return this;
    }

    public QueryResult withScannedCount(Integer num) {
        this.scannedCount = num;
        return this;
    }

    public QueryResult withItems(Collection<Map<String, AttributeValue>> collection) {
        setItems(collection);
        return this;
    }
}
