package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f47327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f47328b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f47329c;

    static {
        f47329c = (f47327a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f47328b;
    }

    static boolean c() {
        if (f47327a) {
            return true;
        }
        return (f47328b == null || f47329c) ? false : true;
    }
}
