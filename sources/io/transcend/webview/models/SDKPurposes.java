package io.transcend.webview.models;

import java.util.ArrayList;
import java.util.List;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class SDKPurposes {

    @c("purposes")
    private List<String> purposes;

    @c("tcfFlow")
    private boolean tcfFlow;

    public SDKPurposes(List<String> list, boolean z11) {
        this.purposes = list;
        this.tcfFlow = z11;
    }

    public List<String> getPurposes() {
        List<String> list = this.purposes;
        return list != null ? list : new ArrayList();
    }

    public boolean isTcfFlow() {
        return this.tcfFlow;
    }
}
