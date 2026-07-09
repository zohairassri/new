package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class MultiObjectDeleteXmlFactory {
    private void writeKeyVersion(XmlWriter xmlWriter, DeleteObjectsRequest.KeyVersion keyVersion) {
        xmlWriter.start("Object");
        xmlWriter.start("Key").value(keyVersion.getKey()).end();
        if (keyVersion.getVersion() != null) {
            xmlWriter.start("VersionId").value(keyVersion.getVersion()).end();
        }
        xmlWriter.end();
    }

    public byte[] convertToXmlByteArray(DeleteObjectsRequest deleteObjectsRequest) throws AmazonClientException {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.start("Delete");
        if (deleteObjectsRequest.getQuiet()) {
            xmlWriter.start("Quiet").value("true").end();
        }
        Iterator<DeleteObjectsRequest.KeyVersion> it = deleteObjectsRequest.getKeys().iterator();
        while (it.hasNext()) {
            writeKeyVersion(xmlWriter, it.next());
        }
        xmlWriter.end();
        return xmlWriter.getBytes();
    }
}
