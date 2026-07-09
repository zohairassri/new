package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class AttributeDefinitionJsonMarshaller {
    private static AttributeDefinitionJsonMarshaller instance;

    AttributeDefinitionJsonMarshaller() {
    }

    public static AttributeDefinitionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AttributeDefinitionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AttributeDefinition attributeDefinition, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (attributeDefinition.getAttributeName() != null) {
            String attributeName = attributeDefinition.getAttributeName();
            awsJsonWriter.name("AttributeName");
            awsJsonWriter.value(attributeName);
        }
        if (attributeDefinition.getAttributeType() != null) {
            String attributeType = attributeDefinition.getAttributeType();
            awsJsonWriter.name("AttributeType");
            awsJsonWriter.value(attributeType);
        }
        awsJsonWriter.endObject();
    }
}
