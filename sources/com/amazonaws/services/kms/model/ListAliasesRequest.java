package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListAliasesRequest extends AmazonWebServiceRequest implements Serializable {
    private String keyId;
    private Integer limit;
    private String marker;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAliasesRequest)) {
            return false;
        }
        ListAliasesRequest listAliasesRequest = (ListAliasesRequest) obj;
        if ((listAliasesRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (listAliasesRequest.getKeyId() != null && !listAliasesRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((listAliasesRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (listAliasesRequest.getLimit() != null && !listAliasesRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((listAliasesRequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        return listAliasesRequest.getMarker() == null || listAliasesRequest.getMarker().equals(getMarker());
    }

    public String getKeyId() {
        return this.keyId;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getMarker() {
        return this.marker;
    }

    public int hashCode() {
        return (((((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getMarker() != null ? getMarker().hashCode() : 0);
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setMarker(String str) {
        this.marker = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getKeyId() != null) {
            sb2.append("KeyId: " + getKeyId() + ",");
        }
        if (getLimit() != null) {
            sb2.append("Limit: " + getLimit() + ",");
        }
        if (getMarker() != null) {
            sb2.append("Marker: " + getMarker());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ListAliasesRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public ListAliasesRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListAliasesRequest withMarker(String str) {
        this.marker = str;
        return this;
    }
}
