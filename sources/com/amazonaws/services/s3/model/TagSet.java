package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class TagSet {
    private Map<String, String> tags;

    public TagSet() {
        this.tags = new HashMap(1);
    }

    public Map<String, String> getAllTags() {
        return this.tags;
    }

    public String getTag(String str) {
        return this.tags.get(str);
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append("Tags: " + getAllTags());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public TagSet(Map<String, String> map) {
        HashMap map2 = new HashMap(1);
        this.tags = map2;
        map2.putAll(map);
    }
}
