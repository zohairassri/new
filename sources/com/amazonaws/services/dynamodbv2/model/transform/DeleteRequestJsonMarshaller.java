package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.DeleteRequest;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class DeleteRequestJsonMarshaller {
    private static DeleteRequestJsonMarshaller instance;

    DeleteRequestJsonMarshaller() {
    }

    public static DeleteRequestJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteRequestJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DeleteRequest deleteRequest, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (deleteRequest.getKey() != null) {
            Map<String, AttributeValue> key = deleteRequest.getKey();
            awsJsonWriter.name("Key");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, AttributeValue> entry : key.entrySet()) {
                AttributeValue value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(value, awsJsonWriter);
                }
            }
            awsJsonWriter.endObject();
        }
        awsJsonWriter.endObject();
    }
}
