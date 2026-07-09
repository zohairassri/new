package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f27881a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f27882b;

    public final synchronized Map a() {
        try {
            if (this.f27882b == null) {
                this.f27882b = Collections.unmodifiableMap(new HashMap(this.f27881a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f27882b;
    }
}
