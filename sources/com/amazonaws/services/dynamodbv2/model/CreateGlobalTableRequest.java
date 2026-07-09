package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CreateGlobalTableRequest extends AmazonWebServiceRequest implements Serializable {
    private String globalTableName;
    private List<Replica> replicationGroup;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateGlobalTableRequest)) {
            return false;
        }
        CreateGlobalTableRequest createGlobalTableRequest = (CreateGlobalTableRequest) obj;
        if ((createGlobalTableRequest.getGlobalTableName() == null) ^ (getGlobalTableName() == null)) {
            return false;
        }
        if (createGlobalTableRequest.getGlobalTableName() != null && !createGlobalTableRequest.getGlobalTableName().equals(getGlobalTableName())) {
            return false;
        }
        if ((createGlobalTableRequest.getReplicationGroup() == null) ^ (getReplicationGroup() == null)) {
            return false;
        }
        return createGlobalTableRequest.getReplicationGroup() == null || createGlobalTableRequest.getReplicationGroup().equals(getReplicationGroup());
    }

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    public List<Replica> getReplicationGroup() {
        return this.replicationGroup;
    }

    public int hashCode() {
        return (((getGlobalTableName() == null ? 0 : getGlobalTableName().hashCode()) + 31) * 31) + (getReplicationGroup() != null ? getReplicationGroup().hashCode() : 0);
    }

    public void setGlobalTableName(String str) {
        this.globalTableName = str;
    }

    public void setReplicationGroup(Collection<Replica> collection) {
        if (collection == null) {
            this.replicationGroup = null;
        } else {
            this.replicationGroup = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getGlobalTableName() != null) {
            sb2.append("GlobalTableName: " + getGlobalTableName() + ",");
        }
        if (getReplicationGroup() != null) {
            sb2.append("ReplicationGroup: " + getReplicationGroup());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public CreateGlobalTableRequest withGlobalTableName(String str) {
        this.globalTableName = str;
        return this;
    }

    public CreateGlobalTableRequest withReplicationGroup(Replica... replicaArr) {
        if (getReplicationGroup() == null) {
            this.replicationGroup = new ArrayList(replicaArr.length);
        }
        for (Replica replica : replicaArr) {
            this.replicationGroup.add(replica);
        }
        return this;
    }

    public CreateGlobalTableRequest withReplicationGroup(Collection<Replica> collection) {
        setReplicationGroup(collection);
        return this;
    }
}
