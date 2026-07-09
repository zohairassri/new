package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f47426b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile j f47427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j f47428d = new j(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47429a = Collections.EMPTY_MAP;

    j(boolean z11) {
    }

    public static j a() {
        j jVarA;
        j jVar = f47427c;
        if (jVar != null) {
            return jVar;
        }
        synchronized (j.class) {
            try {
                jVarA = f47427c;
                if (jVarA == null) {
                    jVarA = f47426b ? i.a() : f47428d;
                    f47427c = jVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVarA;
    }
}
