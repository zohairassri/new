package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static Object a(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static int a(AppOpsManager appOpsManager, String str, int i11, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i11, str2);
        }

        static String b(Context context) {
            return context.getOpPackageName();
        }

        static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, int i11, String str, String str2) {
        AppOpsManager appOpsManagerC = b.c(context);
        int iA = b.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : b.a(appOpsManagerC, str, i11, b.b(context));
    }

    public static int b(Context context, String str, int i11, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i11, str2);
    }

    public static int c(Context context, String str, String str2) {
        return a.b((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static String d(String str) {
        return a.c(str);
    }
}
