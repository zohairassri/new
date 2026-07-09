package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.DeleteReplicaAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class DeleteReplicaActionJsonMarshaller {
    private static DeleteReplicaActionJsonMarshaller instance;

    DeleteReplicaActionJsonMarshaller() {
    }

    public static DeleteReplicaActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteReplicaActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DeleteReplicaAction deleteReplicaAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (deleteReplicaAction.getRegionName() != null) {
            String regionName = deleteReplicaAction.getRegionName();
            awsJsonWriter.name("RegionName");
            awsJsonWriter.value(regionName);
        }
        awsJsonWriter.endObject();
    }
}
