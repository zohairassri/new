package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum KeyManagerType {
    AWS("AWS"),
    CUSTOMER("CUSTOMER");

    private static final Map<String, KeyManagerType> enumMap;
    private String value;

    static {
        KeyManagerType keyManagerType = AWS;
        KeyManagerType keyManagerType2 = CUSTOMER;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("AWS", keyManagerType);
        map.put("CUSTOMER", keyManagerType2);
    }

    KeyManagerType(String str) {
        this.value = str;
    }

    public static KeyManagerType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, KeyManagerType> map = enumMap;
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
