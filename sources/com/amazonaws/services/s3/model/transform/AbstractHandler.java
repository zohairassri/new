package com.amazonaws.services.s3.model.transform;

import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class AbstractHandler extends DefaultHandler {
    private final StringBuilder text = new StringBuilder();
    private final LinkedList<String> context = new LinkedList<>();

    AbstractHandler() {
    }

    protected final boolean atTopLevel() {
        return this.context.isEmpty();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i11, int i12) {
        this.text.append(cArr, i11, i12);
    }

    protected abstract void doEndElement(String str, String str2, String str3);

    protected abstract void doStartElement(String str, String str2, String str3, Attributes attributes);

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.context.removeLast();
        doEndElement(str, str2, str3);
    }

    protected final String getText() {
        return this.text.toString();
    }

    protected final boolean in(String... strArr) {
        if (strArr.length != this.context.size()) {
            return false;
        }
        int i11 = 0;
        for (String str : this.context) {
            String str2 = strArr[i11];
            if (!str2.equals("*") && !str2.equals(str)) {
                return false;
            }
            i11++;
        }
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.text.setLength(0);
        doStartElement(str, str2, str3, attributes);
        this.context.add(str2);
    }
}
