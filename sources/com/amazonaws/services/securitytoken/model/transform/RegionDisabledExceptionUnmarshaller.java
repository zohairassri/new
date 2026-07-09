package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.securitytoken.model.RegionDisabledException;
import com.amazonaws.transform.StandardErrorUnmarshaller;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class RegionDisabledExceptionUnmarshaller extends StandardErrorUnmarshaller {
    public RegionDisabledExceptionUnmarshaller() {
        super(RegionDisabledException.class);
    }

    @Override // com.amazonaws.transform.StandardErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(Node node) throws Exception {
        String errorCode = parseErrorCode(node);
        if (errorCode == null || !errorCode.equals("RegionDisabledException")) {
            return null;
        }
        return (RegionDisabledException) super.unmarshall(node);
    }
}
