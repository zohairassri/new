package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class ProvisionedThroughputDescriptionJsonMarshaller {
    private static ProvisionedThroughputDescriptionJsonMarshaller instance;

    ProvisionedThroughputDescriptionJsonMarshaller() {
    }

    public static ProvisionedThroughputDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProvisionedThroughputDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProvisionedThroughputDescription provisionedThroughputDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (provisionedThroughputDescription.getLastIncreaseDateTime() != null) {
            Date lastIncreaseDateTime = provisionedThroughputDescription.getLastIncreaseDateTime();
            awsJsonWriter.name("LastIncreaseDateTime");
            awsJsonWriter.value(lastIncreaseDateTime);
        }
        if (provisionedThroughputDescription.getLastDecreaseDateTime() != null) {
            Date lastDecreaseDateTime = provisionedThroughputDescription.getLastDecreaseDateTime();
            awsJsonWriter.name("LastDecreaseDateTime");
            awsJsonWriter.value(lastDecreaseDateTime);
        }
        if (provisionedThroughputDescription.getNumberOfDecreasesToday() != null) {
            Long numberOfDecreasesToday = provisionedThroughputDescription.getNumberOfDecreasesToday();
            awsJsonWriter.name("NumberOfDecreasesToday");
            awsJsonWriter.value(numberOfDecreasesToday);
        }
        if (provisionedThroughputDescription.getReadCapacityUnits() != null) {
            Long readCapacityUnits = provisionedThroughputDescription.getReadCapacityUnits();
            awsJsonWriter.name("ReadCapacityUnits");
            awsJsonWriter.value(readCapacityUnits);
        }
        if (provisionedThroughputDescription.getWriteCapacityUnits() != null) {
            Long writeCapacityUnits = provisionedThroughputDescription.getWriteCapacityUnits();
            awsJsonWriter.name("WriteCapacityUnits");
            awsJsonWriter.value(writeCapacityUnits);
        }
        awsJsonWriter.endObject();
    }
}
