package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36956a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                Map map = this.f36956a;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) this.f36956a.get(str);
    }
}
