package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wh4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final qv4 f37396b = qv4.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f37397a;

    public final Iterable a(byte[] bArr) {
        Map map = this.f37397a;
        List list = (List) map.get(f37396b);
        List list2 = bArr.length >= 5 ? (List) map.get(qv4.b(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new th4(this, list2, list);
    }
}
