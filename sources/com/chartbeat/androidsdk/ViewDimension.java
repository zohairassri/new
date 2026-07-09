package com.chartbeat.androidsdk;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class ViewDimension {
    private int fullyRenderedDocWidth;
    private int maxScrollDepth;
    private int scrollPositionTop;
    private int scrollWindowHeight;
    private int totalContentHeight;

    ViewDimension() {
        this.scrollPositionTop = -1;
        this.totalContentHeight = -1;
        this.scrollWindowHeight = -1;
        this.fullyRenderedDocWidth = -1;
        this.maxScrollDepth = -1;
    }

    int getMaxScrollDepth() {
        return this.maxScrollDepth;
    }

    LinkedHashMap<String, String> toPingParams() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        int i11 = this.scrollPositionTop;
        if (i11 != -1) {
            linkedHashMap.put("x", String.valueOf(i11));
        }
        int i12 = this.maxScrollDepth;
        if (i12 != -1) {
            linkedHashMap.put(QueryKeys.MAX_SCROLL_DEPTH, String.valueOf(i12));
        }
        int i13 = this.totalContentHeight;
        if (i13 != -1) {
            linkedHashMap.put(QueryKeys.CONTENT_HEIGHT, String.valueOf(i13));
        }
        int i14 = this.fullyRenderedDocWidth;
        if (i14 != -1) {
            linkedHashMap.put(QueryKeys.DOCUMENT_WIDTH, String.valueOf(i14));
        }
        int i15 = this.scrollWindowHeight;
        if (i15 != -1) {
            linkedHashMap.put(QueryKeys.SCROLL_WINDOW_HEIGHT, String.valueOf(i15));
        }
        return linkedHashMap;
    }

    ViewDimension(int i11, int i12, int i13, int i14, int i15) {
        this.scrollPositionTop = i11;
        this.totalContentHeight = i13;
        this.scrollWindowHeight = i12;
        this.fullyRenderedDocWidth = i14;
        this.maxScrollDepth = i15;
    }
}
