package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f37372a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f37373b = new HashMap();

    /* synthetic */ wf4(byte[] bArr) {
    }

    public final wf4 a(Enum r22, Object obj) {
        this.f37372a.put(r22, obj);
        this.f37373b.put(obj, r22);
        return this;
    }

    public final xf4 b() {
        return new xf4(Collections.unmodifiableMap(this.f37372a), Collections.unmodifiableMap(this.f37373b), null);
    }
}
