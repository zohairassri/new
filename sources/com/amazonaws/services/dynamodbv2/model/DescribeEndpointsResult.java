package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DescribeEndpointsResult implements Serializable {
    private List<Endpoint> endpoints;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeEndpointsResult)) {
            return false;
        }
        DescribeEndpointsResult describeEndpointsResult = (DescribeEndpointsResult) obj;
        if ((describeEndpointsResult.getEndpoints() == null) ^ (getEndpoints() == null)) {
            return false;
        }
        return describeEndpointsResult.getEndpoints() == null || describeEndpointsResult.getEndpoints().equals(getEndpoints());
    }

    public List<Endpoint> getEndpoints() {
        return this.endpoints;
    }

    public int hashCode() {
        return 31 + (getEndpoints() == null ? 0 : getEndpoints().hashCode());
    }

    public void setEndpoints(Collection<Endpoint> collection) {
        if (collection == null) {
            this.endpoints = null;
        } else {
            this.endpoints = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getEndpoints() != null) {
            sb2.append("Endpoints: " + getEndpoints());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DescribeEndpointsResult withEndpoints(Endpoint... endpointArr) {
        if (getEndpoints() == null) {
            this.endpoints = new ArrayList(endpointArr.length);
        }
        for (Endpoint endpoint : endpointArr) {
            this.endpoints.add(endpoint);
        }
        return this;
    }

    public DescribeEndpointsResult withEndpoints(Collection<Endpoint> collection) {
        setEndpoints(collection);
        return this;
    }
}
