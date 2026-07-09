package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DeleteBackupRequest extends AmazonWebServiceRequest implements Serializable {
    private String backupArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteBackupRequest)) {
            return false;
        }
        DeleteBackupRequest deleteBackupRequest = (DeleteBackupRequest) obj;
        if ((deleteBackupRequest.getBackupArn() == null) ^ (getBackupArn() == null)) {
            return false;
        }
        return deleteBackupRequest.getBackupArn() == null || deleteBackupRequest.getBackupArn().equals(getBackupArn());
    }

    public String getBackupArn() {
        return this.backupArn;
    }

    public int hashCode() {
        return 31 + (getBackupArn() == null ? 0 : getBackupArn().hashCode());
    }

    public void setBackupArn(String str) {
        this.backupArn = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getBackupArn() != null) {
            sb2.append("BackupArn: " + getBackupArn());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DeleteBackupRequest withBackupArn(String str) {
        this.backupArn = str;
        return this;
    }
}
