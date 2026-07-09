package com.amazonaws.auth.policy;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Condition {
    protected String conditionKey;
    protected String type;
    protected List<String> values;

    public String getConditionKey() {
        return this.conditionKey;
    }

    public String getType() {
        return this.type;
    }

    public List<String> getValues() {
        return this.values;
    }

    public void setConditionKey(String str) {
        this.conditionKey = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValues(List<String> list) {
        this.values = list;
    }

    public Condition withConditionKey(String str) {
        setConditionKey(str);
        return this;
    }

    public Condition withType(String str) {
        setType(str);
        return this;
    }

    public Condition withValues(String... strArr) {
        setValues(Arrays.asList(strArr));
        return this;
    }

    public Condition withValues(List<String> list) {
        setValues(list);
        return this;
    }
}
