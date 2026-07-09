package com.amazonaws.services.kms.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Tag implements Serializable {
    private String tagKey;
    private String tagValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if ((tag.getTagKey() == null) ^ (getTagKey() == null)) {
            return false;
        }
        if (tag.getTagKey() != null && !tag.getTagKey().equals(getTagKey())) {
            return false;
        }
        if ((tag.getTagValue() == null) ^ (getTagValue() == null)) {
            return false;
        }
        return tag.getTagValue() == null || tag.getTagValue().equals(getTagValue());
    }

    public String getTagKey() {
        return this.tagKey;
    }

    public String getTagValue() {
        return this.tagValue;
    }

    public int hashCode() {
        return (((getTagKey() == null ? 0 : getTagKey().hashCode()) + 31) * 31) + (getTagValue() != null ? getTagValue().hashCode() : 0);
    }

    public void setTagKey(String str) {
        this.tagKey = str;
    }

    public void setTagValue(String str) {
        this.tagValue = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getTagKey() != null) {
            sb2.append("TagKey: " + getTagKey() + ",");
        }
        if (getTagValue() != null) {
            sb2.append("TagValue: " + getTagValue());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Tag withTagKey(String str) {
        this.tagKey = str;
        return this;
    }

    public Tag withTagValue(String str) {
        this.tagValue = str;
        return this;
    }
}
