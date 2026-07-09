package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.Tag;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class TagJsonMarshaller {
    private static TagJsonMarshaller instance;

    TagJsonMarshaller() {
    }

    public static TagJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TagJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Tag tag, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (tag.getTagKey() != null) {
            String tagKey = tag.getTagKey();
            awsJsonWriter.name("TagKey");
            awsJsonWriter.value(tagKey);
        }
        if (tag.getTagValue() != null) {
            String tagValue = tag.getTagValue();
            awsJsonWriter.name("TagValue");
            awsJsonWriter.value(tagValue);
        }
        awsJsonWriter.endObject();
    }
}
