package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum ExpirationModelType {
    KEY_MATERIAL_EXPIRES("KEY_MATERIAL_EXPIRES"),
    KEY_MATERIAL_DOES_NOT_EXPIRE("KEY_MATERIAL_DOES_NOT_EXPIRE");

    private static final Map<String, ExpirationModelType> enumMap;
    private String value;

    static {
        ExpirationModelType expirationModelType = KEY_MATERIAL_EXPIRES;
        ExpirationModelType expirationModelType2 = KEY_MATERIAL_DOES_NOT_EXPIRE;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("KEY_MATERIAL_EXPIRES", expirationModelType);
        map.put("KEY_MATERIAL_DOES_NOT_EXPIRE", expirationModelType2);
    }

    ExpirationModelType(String str) {
        this.value = str;
    }

    public static ExpirationModelType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ExpirationModelType> map = enumMap;
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
