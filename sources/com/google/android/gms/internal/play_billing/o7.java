package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o7 f42501c = new o7();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f42502d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f42504b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7 f42503a = new z6();

    private o7() {
    }

    public static o7 a() {
        return f42501c;
    }

    public final r7 b(Class cls) {
        q6.c(cls, "messageType");
        r7 r7Var = (r7) this.f42504b.get(cls);
        if (r7Var != null) {
            return r7Var;
        }
        r7 r7VarZza = this.f42503a.zza(cls);
        q6.c(cls, "messageType");
        r7 r7Var2 = (r7) this.f42504b.putIfAbsent(cls, r7VarZza);
        return r7Var2 == null ? r7VarZza : r7Var2;
    }
}
