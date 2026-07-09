package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.RestoreSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class RestoreSummaryJsonMarshaller {
    private static RestoreSummaryJsonMarshaller instance;

    RestoreSummaryJsonMarshaller() {
    }

    public static RestoreSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RestoreSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RestoreSummary restoreSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (restoreSummary.getSourceBackupArn() != null) {
            String sourceBackupArn = restoreSummary.getSourceBackupArn();
            awsJsonWriter.name("SourceBackupArn");
            awsJsonWriter.value(sourceBackupArn);
        }
        if (restoreSummary.getSourceTableArn() != null) {
            String sourceTableArn = restoreSummary.getSourceTableArn();
            awsJsonWriter.name("SourceTableArn");
            awsJsonWriter.value(sourceTableArn);
        }
        if (restoreSummary.getRestoreDateTime() != null) {
            Date restoreDateTime = restoreSummary.getRestoreDateTime();
            awsJsonWriter.name("RestoreDateTime");
            awsJsonWriter.value(restoreDateTime);
        }
        if (restoreSummary.getRestoreInProgress() != null) {
            Boolean restoreInProgress = restoreSummary.getRestoreInProgress();
            awsJsonWriter.name("RestoreInProgress");
            awsJsonWriter.value(restoreInProgress.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
