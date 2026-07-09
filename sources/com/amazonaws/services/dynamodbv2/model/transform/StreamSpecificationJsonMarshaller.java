package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.StreamSpecification;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class StreamSpecificationJsonMarshaller {
    private static StreamSpecificationJsonMarshaller instance;

    StreamSpecificationJsonMarshaller() {
    }

    public static StreamSpecificationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamSpecificationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamSpecification streamSpecification, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (streamSpecification.getStreamEnabled() != null) {
            Boolean streamEnabled = streamSpecification.getStreamEnabled();
            awsJsonWriter.name("StreamEnabled");
            awsJsonWriter.value(streamEnabled.booleanValue());
        }
        if (streamSpecification.getStreamViewType() != null) {
            String streamViewType = streamSpecification.getStreamViewType();
            awsJsonWriter.name("StreamViewType");
            awsJsonWriter.value(streamViewType);
        }
        awsJsonWriter.endObject();
    }
}
