package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum ConnectionErrorCodeType {
    INVALID_CREDENTIALS("INVALID_CREDENTIALS"),
    CLUSTER_NOT_FOUND("CLUSTER_NOT_FOUND"),
    NETWORK_ERRORS("NETWORK_ERRORS"),
    INSUFFICIENT_CLOUDHSM_HSMS("INSUFFICIENT_CLOUDHSM_HSMS"),
    USER_LOCKED_OUT("USER_LOCKED_OUT");

    private static final Map<String, ConnectionErrorCodeType> enumMap;
    private String value;

    static {
        ConnectionErrorCodeType connectionErrorCodeType = INVALID_CREDENTIALS;
        ConnectionErrorCodeType connectionErrorCodeType2 = CLUSTER_NOT_FOUND;
        ConnectionErrorCodeType connectionErrorCodeType3 = NETWORK_ERRORS;
        ConnectionErrorCodeType connectionErrorCodeType4 = INSUFFICIENT_CLOUDHSM_HSMS;
        ConnectionErrorCodeType connectionErrorCodeType5 = USER_LOCKED_OUT;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("INVALID_CREDENTIALS", connectionErrorCodeType);
        map.put("CLUSTER_NOT_FOUND", connectionErrorCodeType2);
        map.put("NETWORK_ERRORS", connectionErrorCodeType3);
        map.put("INSUFFICIENT_CLOUDHSM_HSMS", connectionErrorCodeType4);
        map.put("USER_LOCKED_OUT", connectionErrorCodeType5);
    }

    ConnectionErrorCodeType(String str) {
        this.value = str;
    }

    public static ConnectionErrorCodeType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ConnectionErrorCodeType> map = enumMap;
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
