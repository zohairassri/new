package com.chartbeat.androidsdk;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class ViewContent {
    private static final float INVALID_LOAD_TIME = -1.0f;
    private String authors;
    private float pageLoadTime;
    private String sections;
    private String zones;

    ViewContent() {
        this.pageLoadTime = INVALID_LOAD_TIME;
    }

    String getAuthors() {
        return this.authors;
    }

    float getPageLoadTime() {
        return this.pageLoadTime;
    }

    String getSections() {
        return this.sections;
    }

    String getZones() {
        return this.zones;
    }

    LinkedHashMap<String, String> toPingParams() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        String str = this.sections;
        if (str != null) {
            linkedHashMap.put(QueryKeys.SECTION_G0, str);
        }
        String str2 = this.authors;
        if (str2 != null) {
            linkedHashMap.put(QueryKeys.AUTHOR_G1, str2);
        }
        String str3 = this.zones;
        if (str3 != null) {
            linkedHashMap.put(QueryKeys.ZONE_G2, str3);
        }
        return linkedHashMap;
    }

    ViewContent(String str, String str2, String str3, float f11) {
        this.sections = str;
        this.authors = str2;
        this.zones = str3;
        this.pageLoadTime = f11;
    }
}
