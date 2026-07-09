package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.PointInTimeRecoverySpecification;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class PointInTimeRecoverySpecificationJsonMarshaller {
    private static PointInTimeRecoverySpecificationJsonMarshaller instance;

    PointInTimeRecoverySpecificationJsonMarshaller() {
    }

    public static PointInTimeRecoverySpecificationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PointInTimeRecoverySpecificationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PointInTimeRecoverySpecification pointInTimeRecoverySpecification, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (pointInTimeRecoverySpecification.getPointInTimeRecoveryEnabled() != null) {
            Boolean pointInTimeRecoveryEnabled = pointInTimeRecoverySpecification.getPointInTimeRecoveryEnabled();
            awsJsonWriter.name("PointInTimeRecoveryEnabled");
            awsJsonWriter.value(pointInTimeRecoveryEnabled.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
