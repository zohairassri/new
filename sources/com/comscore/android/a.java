package com.comscore.android;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f19381a;

    a() {
    }

    static Boolean a(Context context, String str) {
        Boolean bool = Boolean.FALSE;
        if (f19381a == null) {
            try {
                f19381a = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            } catch (Exception unused) {
            }
        }
        if (f19381a == null) {
            return bool;
        }
        int i11 = 0;
        while (true) {
            String[] strArr = f19381a;
            if (i11 >= strArr.length) {
                return bool;
            }
            if (strArr[i11].equals(str)) {
                return Boolean.TRUE;
            }
            i11++;
        }
    }
}
