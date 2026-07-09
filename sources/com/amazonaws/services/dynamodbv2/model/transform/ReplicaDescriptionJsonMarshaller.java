package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.ReplicaDescription;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class ReplicaDescriptionJsonMarshaller {
    private static ReplicaDescriptionJsonMarshaller instance;

    ReplicaDescriptionJsonMarshaller() {
    }

    public static ReplicaDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ReplicaDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ReplicaDescription replicaDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (replicaDescription.getRegionName() != null) {
            String regionName = replicaDescription.getRegionName();
            awsJsonWriter.name("RegionName");
            awsJsonWriter.value(regionName);
        }
        awsJsonWriter.endObject();
    }
}
