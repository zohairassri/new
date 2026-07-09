package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DescribeGlobalTableSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    private String globalTableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeGlobalTableSettingsRequest)) {
            return false;
        }
        DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest = (DescribeGlobalTableSettingsRequest) obj;
        if ((describeGlobalTableSettingsRequest.getGlobalTableName() == null) ^ (getGlobalTableName() == null)) {
            return false;
        }
        return describeGlobalTableSettingsRequest.getGlobalTableName() == null || describeGlobalTableSettingsRequest.getGlobalTableName().equals(getGlobalTableName());
    }

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    public int hashCode() {
        return 31 + (getGlobalTableName() == null ? 0 : getGlobalTableName().hashCode());
    }

    public void setGlobalTableName(String str) {
        this.globalTableName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getGlobalTableName() != null) {
            sb2.append("GlobalTableName: " + getGlobalTableName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DescribeGlobalTableSettingsRequest withGlobalTableName(String str) {
        this.globalTableName = str;
        return this;
    }
}
