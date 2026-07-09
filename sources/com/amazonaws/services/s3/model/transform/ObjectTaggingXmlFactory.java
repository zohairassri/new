package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.Tag;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ObjectTaggingXmlFactory {
    public byte[] convertToXmlByteArray(ObjectTagging objectTagging) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.start("Tagging").start("TagSet");
        for (Tag tag : objectTagging.getTagSet()) {
            xmlWriter.start("Tag");
            xmlWriter.start("Key").value(tag.getKey()).end();
            xmlWriter.start("Value").value(tag.getValue()).end();
            xmlWriter.end();
        }
        xmlWriter.end();
        xmlWriter.end();
        return xmlWriter.getBytes();
    }
}
