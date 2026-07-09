package com.amazonaws.services.dynamodbv2.model;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum ScalarAttributeType {
    S(QueryKeys.SCREEN_WIDTH),
    N("N"),
    B("B");

    private static final Map<String, ScalarAttributeType> enumMap;
    private String value;

    static {
        ScalarAttributeType scalarAttributeType = S;
        ScalarAttributeType scalarAttributeType2 = N;
        ScalarAttributeType scalarAttributeType3 = B;
        HashMap map = new HashMap();
        enumMap = map;
        map.put(QueryKeys.SCREEN_WIDTH, scalarAttributeType);
        map.put("N", scalarAttributeType2);
        map.put("B", scalarAttributeType3);
    }

    ScalarAttributeType(String str) {
        this.value = str;
    }

    public static ScalarAttributeType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ScalarAttributeType> map = enumMap;
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
