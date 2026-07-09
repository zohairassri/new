package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class UnsubscribeFromDatasetResultJsonUnmarshaller implements Unmarshaller<UnsubscribeFromDatasetResult, JsonUnmarshallerContext> {
    private static UnsubscribeFromDatasetResultJsonUnmarshaller instance;

    public static UnsubscribeFromDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnsubscribeFromDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnsubscribeFromDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new UnsubscribeFromDatasetResult();
    }
}
