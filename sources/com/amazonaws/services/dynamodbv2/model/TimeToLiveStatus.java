package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum TimeToLiveStatus {
    ENABLING("ENABLING"),
    DISABLING("DISABLING"),
    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private static final Map<String, TimeToLiveStatus> enumMap;
    private String value;

    static {
        TimeToLiveStatus timeToLiveStatus = ENABLING;
        TimeToLiveStatus timeToLiveStatus2 = DISABLING;
        TimeToLiveStatus timeToLiveStatus3 = ENABLED;
        TimeToLiveStatus timeToLiveStatus4 = DISABLED;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ENABLING", timeToLiveStatus);
        map.put("DISABLING", timeToLiveStatus2);
        map.put("ENABLED", timeToLiveStatus3);
        map.put("DISABLED", timeToLiveStatus4);
    }

    TimeToLiveStatus(String str) {
        this.value = str;
    }

    public static TimeToLiveStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, TimeToLiveStatus> map = enumMap;
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
