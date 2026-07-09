package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f46239a = c();

    public static o a() {
        o oVarB = b("getEmptyRegistry");
        return oVarB != null ? oVarB : o.f46245d;
    }

    private static final o b(String str) {
        Class cls = f46239a;
        if (cls == null) {
            return null;
        }
        try {
            return (o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
