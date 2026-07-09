package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.PointInTimeRecoveryDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class PointInTimeRecoveryDescriptionJsonMarshaller {
    private static PointInTimeRecoveryDescriptionJsonMarshaller instance;

    PointInTimeRecoveryDescriptionJsonMarshaller() {
    }

    public static PointInTimeRecoveryDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PointInTimeRecoveryDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PointInTimeRecoveryDescription pointInTimeRecoveryDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (pointInTimeRecoveryDescription.getPointInTimeRecoveryStatus() != null) {
            String pointInTimeRecoveryStatus = pointInTimeRecoveryDescription.getPointInTimeRecoveryStatus();
            awsJsonWriter.name("PointInTimeRecoveryStatus");
            awsJsonWriter.value(pointInTimeRecoveryStatus);
        }
        if (pointInTimeRecoveryDescription.getEarliestRestorableDateTime() != null) {
            Date earliestRestorableDateTime = pointInTimeRecoveryDescription.getEarliestRestorableDateTime();
            awsJsonWriter.name("EarliestRestorableDateTime");
            awsJsonWriter.value(earliestRestorableDateTime);
        }
        if (pointInTimeRecoveryDescription.getLatestRestorableDateTime() != null) {
            Date latestRestorableDateTime = pointInTimeRecoveryDescription.getLatestRestorableDateTime();
            awsJsonWriter.name("LatestRestorableDateTime");
            awsJsonWriter.value(latestRestorableDateTime);
        }
        awsJsonWriter.endObject();
    }
}
