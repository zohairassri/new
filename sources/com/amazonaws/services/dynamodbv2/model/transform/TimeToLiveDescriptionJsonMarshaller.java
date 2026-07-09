package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.TimeToLiveDescription;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class TimeToLiveDescriptionJsonMarshaller {
    private static TimeToLiveDescriptionJsonMarshaller instance;

    TimeToLiveDescriptionJsonMarshaller() {
    }

    public static TimeToLiveDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TimeToLiveDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TimeToLiveDescription timeToLiveDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (timeToLiveDescription.getTimeToLiveStatus() != null) {
            String timeToLiveStatus = timeToLiveDescription.getTimeToLiveStatus();
            awsJsonWriter.name("TimeToLiveStatus");
            awsJsonWriter.value(timeToLiveStatus);
        }
        if (timeToLiveDescription.getAttributeName() != null) {
            String attributeName = timeToLiveDescription.getAttributeName();
            awsJsonWriter.name("AttributeName");
            awsJsonWriter.value(attributeName);
        }
        awsJsonWriter.endObject();
    }
}
