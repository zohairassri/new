package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ReplicaUpdate implements Serializable {
    private CreateReplicaAction create;
    private DeleteReplicaAction delete;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReplicaUpdate)) {
            return false;
        }
        ReplicaUpdate replicaUpdate = (ReplicaUpdate) obj;
        if ((replicaUpdate.getCreate() == null) ^ (getCreate() == null)) {
            return false;
        }
        if (replicaUpdate.getCreate() != null && !replicaUpdate.getCreate().equals(getCreate())) {
            return false;
        }
        if ((replicaUpdate.getDelete() == null) ^ (getDelete() == null)) {
            return false;
        }
        return replicaUpdate.getDelete() == null || replicaUpdate.getDelete().equals(getDelete());
    }

    public CreateReplicaAction getCreate() {
        return this.create;
    }

    public DeleteReplicaAction getDelete() {
        return this.delete;
    }

    public int hashCode() {
        return (((getCreate() == null ? 0 : getCreate().hashCode()) + 31) * 31) + (getDelete() != null ? getDelete().hashCode() : 0);
    }

    public void setCreate(CreateReplicaAction createReplicaAction) {
        this.create = createReplicaAction;
    }

    public void setDelete(DeleteReplicaAction deleteReplicaAction) {
        this.delete = deleteReplicaAction;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCreate() != null) {
            sb2.append("Create: " + getCreate() + ",");
        }
        if (getDelete() != null) {
            sb2.append("Delete: " + getDelete());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ReplicaUpdate withCreate(CreateReplicaAction createReplicaAction) {
        this.create = createReplicaAction;
        return this;
    }

    public ReplicaUpdate withDelete(DeleteReplicaAction deleteReplicaAction) {
        this.delete = deleteReplicaAction;
        return this;
    }
}
