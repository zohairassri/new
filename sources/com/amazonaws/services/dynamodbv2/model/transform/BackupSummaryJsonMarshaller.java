package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.BackupSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class BackupSummaryJsonMarshaller {
    private static BackupSummaryJsonMarshaller instance;

    BackupSummaryJsonMarshaller() {
    }

    public static BackupSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BackupSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BackupSummary backupSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (backupSummary.getTableName() != null) {
            String tableName = backupSummary.getTableName();
            awsJsonWriter.name("TableName");
            awsJsonWriter.value(tableName);
        }
        if (backupSummary.getTableId() != null) {
            String tableId = backupSummary.getTableId();
            awsJsonWriter.name("TableId");
            awsJsonWriter.value(tableId);
        }
        if (backupSummary.getTableArn() != null) {
            String tableArn = backupSummary.getTableArn();
            awsJsonWriter.name("TableArn");
            awsJsonWriter.value(tableArn);
        }
        if (backupSummary.getBackupArn() != null) {
            String backupArn = backupSummary.getBackupArn();
            awsJsonWriter.name("BackupArn");
            awsJsonWriter.value(backupArn);
        }
        if (backupSummary.getBackupName() != null) {
            String backupName = backupSummary.getBackupName();
            awsJsonWriter.name("BackupName");
            awsJsonWriter.value(backupName);
        }
        if (backupSummary.getBackupCreationDateTime() != null) {
            Date backupCreationDateTime = backupSummary.getBackupCreationDateTime();
            awsJsonWriter.name("BackupCreationDateTime");
            awsJsonWriter.value(backupCreationDateTime);
        }
        if (backupSummary.getBackupExpiryDateTime() != null) {
            Date backupExpiryDateTime = backupSummary.getBackupExpiryDateTime();
            awsJsonWriter.name("BackupExpiryDateTime");
            awsJsonWriter.value(backupExpiryDateTime);
        }
        if (backupSummary.getBackupStatus() != null) {
            String backupStatus = backupSummary.getBackupStatus();
            awsJsonWriter.name("BackupStatus");
            awsJsonWriter.value(backupStatus);
        }
        if (backupSummary.getBackupType() != null) {
            String backupType = backupSummary.getBackupType();
            awsJsonWriter.name("BackupType");
            awsJsonWriter.value(backupType);
        }
        if (backupSummary.getBackupSizeBytes() != null) {
            Long backupSizeBytes = backupSummary.getBackupSizeBytes();
            awsJsonWriter.name("BackupSizeBytes");
            awsJsonWriter.value(backupSizeBytes);
        }
        awsJsonWriter.endObject();
    }
}
