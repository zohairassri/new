package dq;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f90234a;

    d0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f90234a == null) {
                this.f90234a = b(context);
            }
        } finally {
        }
        return "".equals(this.f90234a) ? null : this.f90234a;
    }
}
