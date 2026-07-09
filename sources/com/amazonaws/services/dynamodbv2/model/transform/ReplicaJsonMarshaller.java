package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Replica;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class ReplicaJsonMarshaller {
    private static ReplicaJsonMarshaller instance;

    ReplicaJsonMarshaller() {
    }

    public static ReplicaJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ReplicaJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Replica replica, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (replica.getRegionName() != null) {
            String regionName = replica.getRegionName();
            awsJsonWriter.name("RegionName");
            awsJsonWriter.value(regionName);
        }
        awsJsonWriter.endObject();
    }
}
