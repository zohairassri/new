package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ItemCollectionMetrics;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class ItemCollectionMetricsJsonMarshaller {
    private static ItemCollectionMetricsJsonMarshaller instance;

    ItemCollectionMetricsJsonMarshaller() {
    }

    public static ItemCollectionMetricsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ItemCollectionMetricsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ItemCollectionMetrics itemCollectionMetrics, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (itemCollectionMetrics.getItemCollectionKey() != null) {
            Map<String, AttributeValue> itemCollectionKey = itemCollectionMetrics.getItemCollectionKey();
            awsJsonWriter.name("ItemCollectionKey");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, AttributeValue> entry : itemCollectionKey.entrySet()) {
                AttributeValue value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(value, awsJsonWriter);
                }
            }
            awsJsonWriter.endObject();
        }
        if (itemCollectionMetrics.getSizeEstimateRangeGB() != null) {
            List<Double> sizeEstimateRangeGB = itemCollectionMetrics.getSizeEstimateRangeGB();
            awsJsonWriter.name("SizeEstimateRangeGB");
            awsJsonWriter.beginArray();
            for (Double d11 : sizeEstimateRangeGB) {
                if (d11 != null) {
                    awsJsonWriter.value(d11);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
