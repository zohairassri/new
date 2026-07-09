package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class ProjectionJsonMarshaller {
    private static ProjectionJsonMarshaller instance;

    ProjectionJsonMarshaller() {
    }

    public static ProjectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Projection projection, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (projection.getProjectionType() != null) {
            String projectionType = projection.getProjectionType();
            awsJsonWriter.name("ProjectionType");
            awsJsonWriter.value(projectionType);
        }
        if (projection.getNonKeyAttributes() != null) {
            List<String> nonKeyAttributes = projection.getNonKeyAttributes();
            awsJsonWriter.name("NonKeyAttributes");
            awsJsonWriter.beginArray();
            for (String str : nonKeyAttributes) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
