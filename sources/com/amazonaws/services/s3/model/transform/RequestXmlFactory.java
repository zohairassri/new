package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.RestoreObjectRequest;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class RequestXmlFactory {
    public static byte[] convertToXmlByteArray(List<PartETag> list) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.start("CompleteMultipartUpload");
        if (list != null) {
            Collections.sort(list, new Comparator<PartETag>() { // from class: com.amazonaws.services.s3.model.transform.RequestXmlFactory.1
                @Override // java.util.Comparator
                public int compare(PartETag partETag, PartETag partETag2) {
                    if (partETag.getPartNumber() < partETag2.getPartNumber()) {
                        return -1;
                    }
                    return partETag.getPartNumber() > partETag2.getPartNumber() ? 1 : 0;
                }
            });
            for (PartETag partETag : list) {
                xmlWriter.start("Part");
                xmlWriter.start("PartNumber").value(Integer.toString(partETag.getPartNumber())).end();
                xmlWriter.start(Headers.ETAG).value(partETag.getETag()).end();
                xmlWriter.end();
            }
        }
        xmlWriter.end();
        return xmlWriter.getBytes();
    }

    public static byte[] convertToXmlByteArray(RestoreObjectRequest restoreObjectRequest) throws AmazonClientException {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.start("RestoreRequest");
        xmlWriter.start("Days").value(Integer.toString(restoreObjectRequest.getExpirationInDays())).end();
        xmlWriter.end();
        return xmlWriter.getBytes();
    }
}
