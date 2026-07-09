package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListTagsOfResourceRequest extends AmazonWebServiceRequest implements Serializable {
    private String nextToken;
    private String resourceArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsOfResourceRequest)) {
            return false;
        }
        ListTagsOfResourceRequest listTagsOfResourceRequest = (ListTagsOfResourceRequest) obj;
        if ((listTagsOfResourceRequest.getResourceArn() == null) ^ (getResourceArn() == null)) {
            return false;
        }
        if (listTagsOfResourceRequest.getResourceArn() != null && !listTagsOfResourceRequest.getResourceArn().equals(getResourceArn())) {
            return false;
        }
        if ((listTagsOfResourceRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTagsOfResourceRequest.getNextToken() == null || listTagsOfResourceRequest.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public int hashCode() {
        return (((getResourceArn() == null ? 0 : getResourceArn().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getResourceArn() != null) {
            sb2.append("ResourceArn: " + getResourceArn() + ",");
        }
        if (getNextToken() != null) {
            sb2.append("NextToken: " + getNextToken());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ListTagsOfResourceRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTagsOfResourceRequest withResourceArn(String str) {
        this.resourceArn = str;
        return this;
    }
}
