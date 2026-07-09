package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CreateBackupResult implements Serializable {
    private BackupDetails backupDetails;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateBackupResult)) {
            return false;
        }
        CreateBackupResult createBackupResult = (CreateBackupResult) obj;
        if ((createBackupResult.getBackupDetails() == null) ^ (getBackupDetails() == null)) {
            return false;
        }
        return createBackupResult.getBackupDetails() == null || createBackupResult.getBackupDetails().equals(getBackupDetails());
    }

    public BackupDetails getBackupDetails() {
        return this.backupDetails;
    }

    public int hashCode() {
        return 31 + (getBackupDetails() == null ? 0 : getBackupDetails().hashCode());
    }

    public void setBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getBackupDetails() != null) {
            sb2.append("BackupDetails: " + getBackupDetails());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public CreateBackupResult withBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
        return this;
    }
}
