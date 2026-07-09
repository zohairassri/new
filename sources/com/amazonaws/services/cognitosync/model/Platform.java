package com.amazonaws.services.cognitosync.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public enum Platform {
    APNS("APNS"),
    APNS_SANDBOX("APNS_SANDBOX"),
    GCM("GCM"),
    ADM("ADM");

    private static final Map<String, Platform> enumMap;
    private String value;

    static {
        Platform platform = APNS;
        Platform platform2 = APNS_SANDBOX;
        Platform platform3 = GCM;
        Platform platform4 = ADM;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("APNS", platform);
        map.put("APNS_SANDBOX", platform2);
        map.put("GCM", platform3);
        map.put("ADM", platform4);
    }

    Platform(String str) {
        this.value = str;
    }

    public static Platform fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Platform> map = enumMap;
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
