package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f47392a = c();

    public static j a() {
        j jVarB = b("getEmptyRegistry");
        return jVarB != null ? jVarB : j.f47428d;
    }

    private static final j b(String str) {
        Class cls = f47392a;
        if (cls == null) {
            return null;
        }
        try {
            return (j) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
