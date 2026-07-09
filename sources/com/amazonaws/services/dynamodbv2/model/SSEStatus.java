package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum SSEStatus {
    ENABLING("ENABLING"),
    ENABLED("ENABLED"),
    DISABLING("DISABLING"),
    DISABLED("DISABLED"),
    UPDATING("UPDATING");

    private static final Map<String, SSEStatus> enumMap;
    private String value;

    static {
        SSEStatus sSEStatus = ENABLING;
        SSEStatus sSEStatus2 = ENABLED;
        SSEStatus sSEStatus3 = DISABLING;
        SSEStatus sSEStatus4 = DISABLED;
        SSEStatus sSEStatus5 = UPDATING;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ENABLING", sSEStatus);
        map.put("ENABLED", sSEStatus2);
        map.put("DISABLING", sSEStatus3);
        map.put("DISABLED", sSEStatus4);
        map.put("UPDATING", sSEStatus5);
    }

    SSEStatus(String str) {
        this.value = str;
    }

    public static SSEStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, SSEStatus> map = enumMap;
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
