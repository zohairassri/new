package h6;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f100319a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f100320b = "media3.common";

    public static synchronized void a(String str) {
        if (f100319a.add(str)) {
            f100320b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f100320b;
    }
}
