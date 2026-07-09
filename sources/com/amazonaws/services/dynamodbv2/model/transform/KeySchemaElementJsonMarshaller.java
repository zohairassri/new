package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class KeySchemaElementJsonMarshaller {
    private static KeySchemaElementJsonMarshaller instance;

    KeySchemaElementJsonMarshaller() {
    }

    public static KeySchemaElementJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KeySchemaElementJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KeySchemaElement keySchemaElement, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (keySchemaElement.getAttributeName() != null) {
            String attributeName = keySchemaElement.getAttributeName();
            awsJsonWriter.name("AttributeName");
            awsJsonWriter.value(attributeName);
        }
        if (keySchemaElement.getKeyType() != null) {
            String keyType = keySchemaElement.getKeyType();
            awsJsonWriter.name("KeyType");
            awsJsonWriter.value(keyType);
        }
        awsJsonWriter.endObject();
    }
}
