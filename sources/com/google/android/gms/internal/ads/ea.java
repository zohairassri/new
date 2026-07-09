package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f25663a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f25664b = "media3.common";

    public static synchronized String a() {
        return f25664b;
    }

    public static synchronized void b(String str) {
        if (f25663a.add(str)) {
            String str2 = f25664b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            f25664b = sb2.toString();
        }
    }
}
