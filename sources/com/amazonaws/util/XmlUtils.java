package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class XmlUtils {
    public static XMLReader parse(InputStream inputStream, ContentHandler contentHandler) throws SAXException, IOException {
        XMLReader xMLReaderCreateXMLReader = XMLReaderFactory.createXMLReader();
        xMLReaderCreateXMLReader.setContentHandler(contentHandler);
        xMLReaderCreateXMLReader.parse(new InputSource(inputStream));
        inputStream.close();
        return xMLReaderCreateXMLReader;
    }
}
