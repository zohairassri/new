package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f40374a = new HashMap();

    public final r a(String str) {
        if (!this.f40374a.containsKey(str)) {
            return r.K;
        }
        try {
            return (r) ((Callable) this.f40374a.get(str)).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable callable) {
        this.f40374a.put(str, callable);
    }
}
