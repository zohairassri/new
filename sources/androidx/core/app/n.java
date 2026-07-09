package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f7319c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set f7320d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f7321e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f7323b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private n(Context context) {
        this.f7322a = context;
        this.f7323b = (NotificationManager) context.getSystemService("notification");
    }

    public static n b(Context context) {
        return new n(context);
    }

    public boolean a() {
        return a.a(this.f7323b);
    }
}
