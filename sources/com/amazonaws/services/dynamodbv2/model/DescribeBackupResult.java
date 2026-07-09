package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DescribeBackupResult implements Serializable {
    private BackupDescription backupDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeBackupResult)) {
            return false;
        }
        DescribeBackupResult describeBackupResult = (DescribeBackupResult) obj;
        if ((describeBackupResult.getBackupDescription() == null) ^ (getBackupDescription() == null)) {
            return false;
        }
        return describeBackupResult.getBackupDescription() == null || describeBackupResult.getBackupDescription().equals(getBackupDescription());
    }

    public BackupDescription getBackupDescription() {
        return this.backupDescription;
    }

    public int hashCode() {
        return 31 + (getBackupDescription() == null ? 0 : getBackupDescription().hashCode());
    }

    public void setBackupDescription(BackupDescription backupDescription) {
        this.backupDescription = backupDescription;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getBackupDescription() != null) {
            sb2.append("BackupDescription: " + getBackupDescription());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DescribeBackupResult withBackupDescription(BackupDescription backupDescription) {
        this.backupDescription = backupDescription;
        return this;
    }
}
