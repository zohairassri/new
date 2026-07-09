package io.transcend.webview.models;

import java.util.ArrayList;
import java.util.List;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class Service {

    @c("name")
    private String name;

    @c("sdks")
    private List<SDK> sdks;

    @c("tcfId")
    private int tcfId;

    public String getName() {
        return this.name;
    }

    public List<SDK> getSdks() {
        List<SDK> list = this.sdks;
        return list != null ? list : new ArrayList();
    }

    public int getTcfId() {
        return this.tcfId;
    }
}
