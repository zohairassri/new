package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class uh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36122a = new HashMap();

    public final uh4 a(qv4 qv4Var, Object obj) throws GeneralSecurityException {
        List list;
        if (qv4Var.d() != 0 && qv4Var.d() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.f36122a;
        if (map.containsKey(qv4Var)) {
            list = (List) map.get(qv4Var);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(qv4Var, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final wh4 b() {
        return new wh4(this.f36122a, null);
    }
}
