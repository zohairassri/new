package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum IndexStatus {
    CREATING("CREATING"),
    UPDATING("UPDATING"),
    DELETING("DELETING"),
    ACTIVE("ACTIVE");

    private static final Map<String, IndexStatus> enumMap;
    private String value;

    static {
        IndexStatus indexStatus = CREATING;
        IndexStatus indexStatus2 = UPDATING;
        IndexStatus indexStatus3 = DELETING;
        IndexStatus indexStatus4 = ACTIVE;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("CREATING", indexStatus);
        map.put("UPDATING", indexStatus2);
        map.put("DELETING", indexStatus3);
        map.put("ACTIVE", indexStatus4);
    }

    IndexStatus(String str) {
        this.value = str;
    }

    public static IndexStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, IndexStatus> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
