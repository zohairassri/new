package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Tag implements Serializable {
    private String key;
    private String value;

    public Tag(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Tag tag = (Tag) obj;
            String str = this.key;
            if (str == null ? tag.key != null : !str.equals(tag.key)) {
                return false;
            }
            String str2 = this.value;
            if (str2 != null) {
                return str2.equals(tag.value);
            }
            if (tag.value == null) {
                return true;
            }
        }
        return false;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Tag withKey(String str) {
        setKey(str);
        return this;
    }

    public Tag withValue(String str) {
        setValue(str);
        return this;
    }
}
