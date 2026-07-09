package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.Credentials;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class CredentialsJsonMarshaller {
    private static CredentialsJsonMarshaller instance;

    CredentialsJsonMarshaller() {
    }

    public static CredentialsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CredentialsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Credentials credentials, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (credentials.getAccessKeyId() != null) {
            String accessKeyId = credentials.getAccessKeyId();
            awsJsonWriter.name("AccessKeyId");
            awsJsonWriter.value(accessKeyId);
        }
        if (credentials.getSecretKey() != null) {
            String secretKey = credentials.getSecretKey();
            awsJsonWriter.name("SecretKey");
            awsJsonWriter.value(secretKey);
        }
        if (credentials.getSessionToken() != null) {
            String sessionToken = credentials.getSessionToken();
            awsJsonWriter.name("SessionToken");
            awsJsonWriter.value(sessionToken);
        }
        if (credentials.getExpiration() != null) {
            Date expiration = credentials.getExpiration();
            awsJsonWriter.name("Expiration");
            awsJsonWriter.value(expiration);
        }
        awsJsonWriter.endObject();
    }
}
