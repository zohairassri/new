package com.amazonaws.services.cognitosync.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public enum Operation {
    Replace("replace"),
    Remove("remove");

    private static final Map<String, Operation> enumMap;
    private String value;

    static {
        Operation operation = Replace;
        Operation operation2 = Remove;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("replace", operation);
        map.put("remove", operation2);
    }

    Operation(String str) {
        this.value = str;
    }

    public static Operation fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Operation> map = enumMap;
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
