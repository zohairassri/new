package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f46109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f46110b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f46111c;

    static {
        f46111c = (f46109a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f46110b;
    }

    static boolean c() {
        if (f46109a) {
            return true;
        }
        return (f46110b == null || f46111c) ? false : true;
    }
}
