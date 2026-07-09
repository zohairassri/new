package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Endpoint;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class EndpointJsonMarshaller {
    private static EndpointJsonMarshaller instance;

    EndpointJsonMarshaller() {
    }

    public static EndpointJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EndpointJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Endpoint endpoint, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (endpoint.getAddress() != null) {
            String address = endpoint.getAddress();
            awsJsonWriter.name("Address");
            awsJsonWriter.value(address);
        }
        if (endpoint.getCachePeriodInMinutes() != null) {
            Long cachePeriodInMinutes = endpoint.getCachePeriodInMinutes();
            awsJsonWriter.name("CachePeriodInMinutes");
            awsJsonWriter.value(cachePeriodInMinutes);
        }
        awsJsonWriter.endObject();
    }
}
