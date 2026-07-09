package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class FilterRule implements Serializable {
    private String name;
    private String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String str) {
        if (str == null) {
            throw new IllegalArgumentException("FilterRule Name is a required argument");
        }
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public FilterRule withName(String str) {
        setName(str);
        return this;
    }

    public FilterRule withValue(String str) {
        setValue(str);
        return this;
    }
}
