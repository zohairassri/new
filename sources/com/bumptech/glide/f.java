package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18851a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f18852a = new HashMap();

        a() {
        }

        f b() {
            return new f(this);
        }
    }

    f(a aVar) {
        this.f18851a = Collections.unmodifiableMap(new HashMap(aVar.f18852a));
    }

    public boolean a(Class cls) {
        return this.f18851a.containsKey(cls);
    }
}
