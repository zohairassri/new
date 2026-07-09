package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateContinuousBackupsResult implements Serializable {
    private ContinuousBackupsDescription continuousBackupsDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateContinuousBackupsResult)) {
            return false;
        }
        UpdateContinuousBackupsResult updateContinuousBackupsResult = (UpdateContinuousBackupsResult) obj;
        if ((updateContinuousBackupsResult.getContinuousBackupsDescription() == null) ^ (getContinuousBackupsDescription() == null)) {
            return false;
        }
        return updateContinuousBackupsResult.getContinuousBackupsDescription() == null || updateContinuousBackupsResult.getContinuousBackupsDescription().equals(getContinuousBackupsDescription());
    }

    public ContinuousBackupsDescription getContinuousBackupsDescription() {
        return this.continuousBackupsDescription;
    }

    public int hashCode() {
        return 31 + (getContinuousBackupsDescription() == null ? 0 : getContinuousBackupsDescription().hashCode());
    }

    public void setContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getContinuousBackupsDescription() != null) {
            sb2.append("ContinuousBackupsDescription: " + getContinuousBackupsDescription());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateContinuousBackupsResult withContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
        return this;
    }
}
