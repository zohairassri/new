package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static void a(AlarmManager alarmManager, int i11, long j11, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i11, j11, pendingIntent);
        }
    }

    public static void a(AlarmManager alarmManager, int i11, long j11, PendingIntent pendingIntent) {
        a.a(alarmManager, i11, j11, pendingIntent);
    }
}
