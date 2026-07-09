package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.DeleteGlobalSecondaryIndexAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class DeleteGlobalSecondaryIndexActionJsonMarshaller {
    private static DeleteGlobalSecondaryIndexActionJsonMarshaller instance;

    DeleteGlobalSecondaryIndexActionJsonMarshaller() {
    }

    public static DeleteGlobalSecondaryIndexActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteGlobalSecondaryIndexActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DeleteGlobalSecondaryIndexAction deleteGlobalSecondaryIndexAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (deleteGlobalSecondaryIndexAction.getIndexName() != null) {
            String indexName = deleteGlobalSecondaryIndexAction.getIndexName();
            awsJsonWriter.name("IndexName");
            awsJsonWriter.value(indexName);
        }
        awsJsonWriter.endObject();
    }
}
