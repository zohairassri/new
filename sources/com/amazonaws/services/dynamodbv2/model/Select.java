package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum Select {
    ALL_ATTRIBUTES("ALL_ATTRIBUTES"),
    ALL_PROJECTED_ATTRIBUTES("ALL_PROJECTED_ATTRIBUTES"),
    SPECIFIC_ATTRIBUTES("SPECIFIC_ATTRIBUTES"),
    COUNT("COUNT");

    private static final Map<String, Select> enumMap;
    private String value;

    static {
        Select select = ALL_ATTRIBUTES;
        Select select2 = ALL_PROJECTED_ATTRIBUTES;
        Select select3 = SPECIFIC_ATTRIBUTES;
        Select select4 = COUNT;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ALL_ATTRIBUTES", select);
        map.put("ALL_PROJECTED_ATTRIBUTES", select2);
        map.put("SPECIFIC_ATTRIBUTES", select3);
        map.put("COUNT", select4);
    }

    Select(String str) {
        this.value = str;
    }

    public static Select fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Select> map = enumMap;
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
