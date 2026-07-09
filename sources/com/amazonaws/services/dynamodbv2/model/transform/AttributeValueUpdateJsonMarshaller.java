package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class AttributeValueUpdateJsonMarshaller {
    private static AttributeValueUpdateJsonMarshaller instance;

    AttributeValueUpdateJsonMarshaller() {
    }

    public static AttributeValueUpdateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AttributeValueUpdateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AttributeValueUpdate attributeValueUpdate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (attributeValueUpdate.getValue() != null) {
            AttributeValue value = attributeValueUpdate.getValue();
            awsJsonWriter.name("Value");
            AttributeValueJsonMarshaller.getInstance().marshall(value, awsJsonWriter);
        }
        if (attributeValueUpdate.getAction() != null) {
            String action = attributeValueUpdate.getAction();
            awsJsonWriter.name(JsonDocumentFields.ACTION);
            awsJsonWriter.value(action);
        }
        awsJsonWriter.endObject();
    }
}
