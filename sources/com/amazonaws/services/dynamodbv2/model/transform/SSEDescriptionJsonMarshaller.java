package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.SSEDescription;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class SSEDescriptionJsonMarshaller {
    private static SSEDescriptionJsonMarshaller instance;

    SSEDescriptionJsonMarshaller() {
    }

    public static SSEDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SSEDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SSEDescription sSEDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (sSEDescription.getStatus() != null) {
            String status = sSEDescription.getStatus();
            awsJsonWriter.name("Status");
            awsJsonWriter.value(status);
        }
        if (sSEDescription.getSSEType() != null) {
            String sSEType = sSEDescription.getSSEType();
            awsJsonWriter.name("SSEType");
            awsJsonWriter.value(sSEType);
        }
        if (sSEDescription.getKMSMasterKeyArn() != null) {
            String kMSMasterKeyArn = sSEDescription.getKMSMasterKeyArn();
            awsJsonWriter.name("KMSMasterKeyArn");
            awsJsonWriter.value(kMSMasterKeyArn);
        }
        awsJsonWriter.endObject();
    }
}
