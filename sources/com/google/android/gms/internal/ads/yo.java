package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f38600a = Collections.EMPTY_LIST;

    public final void a(List list) {
        this.f38600a = new ArrayList(list);
    }

    public final List b() {
        List list = this.f38600a;
        this.f38600a = Collections.EMPTY_LIST;
        return list;
    }
}
