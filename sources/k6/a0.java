package k6;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static void a(Context context, String str, int i11, int i12, int i13) {
        NotificationManager notificationManager = (NotificationManager) a.e((NotificationManager) context.getSystemService("notification"));
        NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i11), i13);
        if (i12 != 0) {
            notificationChannel.setDescription(context.getString(i12));
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
