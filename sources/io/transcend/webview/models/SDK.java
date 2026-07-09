package io.transcend.webview.models;

import java.util.ArrayList;
import java.util.List;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class SDK {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    private String f104549id;

    @c("purposes")
    private List<String> purposes;

    public String getId() {
        return this.f104549id;
    }

    public List<String> getPurposes() {
        List<String> list = this.purposes;
        return list != null ? list : new ArrayList();
    }
}
