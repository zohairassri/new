package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.util.json.AwsJsonWriter;
import com.chartbeat.androidsdk.QueryKeys;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class AttributeValueJsonMarshaller {
    private static AttributeValueJsonMarshaller instance;

    AttributeValueJsonMarshaller() {
    }

    public static AttributeValueJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AttributeValueJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AttributeValue attributeValue, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (attributeValue.getS() != null) {
            String s11 = attributeValue.getS();
            awsJsonWriter.name(QueryKeys.SCREEN_WIDTH);
            awsJsonWriter.value(s11);
        }
        if (attributeValue.getN() != null) {
            String n11 = attributeValue.getN();
            awsJsonWriter.name("N");
            awsJsonWriter.value(n11);
        }
        if (attributeValue.getB() != null) {
            ByteBuffer b11 = attributeValue.getB();
            awsJsonWriter.name("B");
            awsJsonWriter.value(b11);
        }
        if (attributeValue.getSS() != null) {
            List<String> ss2 = attributeValue.getSS();
            awsJsonWriter.name("SS");
            awsJsonWriter.beginArray();
            for (String str : ss2) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (attributeValue.getNS() != null) {
            List<String> ns2 = attributeValue.getNS();
            awsJsonWriter.name("NS");
            awsJsonWriter.beginArray();
            for (String str2 : ns2) {
                if (str2 != null) {
                    awsJsonWriter.value(str2);
                }
            }
            awsJsonWriter.endArray();
        }
        if (attributeValue.getBS() != null) {
            List<ByteBuffer> bs2 = attributeValue.getBS();
            awsJsonWriter.name("BS");
            awsJsonWriter.beginArray();
            for (ByteBuffer byteBuffer : bs2) {
                if (byteBuffer != null) {
                    awsJsonWriter.value(byteBuffer);
                }
            }
            awsJsonWriter.endArray();
        }
        if (attributeValue.getM() != null) {
            Map<String, AttributeValue> m11 = attributeValue.getM();
            awsJsonWriter.name("M");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, AttributeValue> entry : m11.entrySet()) {
                AttributeValue value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    getInstance().marshall(value, awsJsonWriter);
                }
            }
            awsJsonWriter.endObject();
        }
        if (attributeValue.getL() != null) {
            List<AttributeValue> l11 = attributeValue.getL();
            awsJsonWriter.name("L");
            awsJsonWriter.beginArray();
            for (AttributeValue attributeValue2 : l11) {
                if (attributeValue2 != null) {
                    getInstance().marshall(attributeValue2, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (attributeValue.getNULL() != null) {
            Boolean bool = attributeValue.getNULL();
            awsJsonWriter.name("NULL");
            awsJsonWriter.value(bool.booleanValue());
        }
        if (attributeValue.getBOOL() != null) {
            Boolean bool2 = attributeValue.getBOOL();
            awsJsonWriter.name("BOOL");
            awsJsonWriter.value(bool2.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
