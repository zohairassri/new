package com.amazonaws.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class RegionMetadataParser {
    private static final String DOMAIN_TAG = "Domain";
    private static final String ENDPOINT_TAG = "Endpoint";
    private static final String HOSTNAME_TAG = "Hostname";
    private static final String HTTPS_TAG = "Https";
    private static final String HTTP_TAG = "Http";
    private static final String REGION_ID_TAG = "Name";
    private static final String REGION_TAG = "Region";
    private static final String SERVICE_TAG = "ServiceName";

    @Deprecated
    public RegionMetadataParser() {
    }

    private static void addRegionEndpoint(Region region, Element element, boolean z11) {
        String childElementValue = getChildElementValue(SERVICE_TAG, element);
        String childElementValue2 = getChildElementValue(HOSTNAME_TAG, element);
        String childElementValue3 = getChildElementValue(HTTP_TAG, element);
        String childElementValue4 = getChildElementValue(HTTPS_TAG, element);
        if (!z11 || verifyLegacyEndpoint(childElementValue2)) {
            region.getServiceEndpoints().put(childElementValue, childElementValue2);
            region.getHttpSupport().put(childElementValue, Boolean.valueOf("true".equals(childElementValue3)));
            region.getHttpsSupport().put(childElementValue, Boolean.valueOf("true".equals(childElementValue4)));
        } else {
            throw new IllegalStateException("Invalid service endpoint (" + childElementValue2 + ") is detected.");
        }
    }

    private static String getChildElementValue(String str, Element element) {
        Node nodeItem = element.getElementsByTagName(str).item(0);
        if (nodeItem == null) {
            return null;
        }
        return nodeItem.getChildNodes().item(0).getNodeValue();
    }

    private static List<Region> internalParse(InputStream inputStream, boolean z11) throws IOException {
        try {
            try {
                NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getElementsByTagName(REGION_TAG);
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < elementsByTagName.getLength(); i11++) {
                    Node nodeItem = elementsByTagName.item(i11);
                    if (nodeItem.getNodeType() == 1) {
                        arrayList.add(parseRegionElement((Element) nodeItem, z11));
                    }
                }
                return arrayList;
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (IOException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new IOException("Unable to parse region metadata file: " + e12.getMessage(), e12);
        }
    }

    public static RegionMetadata parse(InputStream inputStream) throws IOException {
        return new RegionMetadata(internalParse(inputStream, false));
    }

    private static Region parseRegionElement(Element element, boolean z11) {
        Region region = new Region(getChildElementValue(REGION_ID_TAG, element), getChildElementValue(DOMAIN_TAG, element));
        NodeList elementsByTagName = element.getElementsByTagName(ENDPOINT_TAG);
        for (int i11 = 0; i11 < elementsByTagName.getLength(); i11++) {
            addRegionEndpoint(region, (Element) elementsByTagName.item(i11), z11);
        }
        return region;
    }

    private static boolean verifyLegacyEndpoint(String str) {
        return str.endsWith(".amazonaws.com");
    }

    @Deprecated
    public List<Region> parseRegionMetadata(InputStream inputStream) throws IOException {
        return internalParse(inputStream, false);
    }

    @Deprecated
    public List<Region> parseRegionMetadata(InputStream inputStream, boolean z11) throws IOException {
        return internalParse(inputStream, z11);
    }
}
