package q0;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f122219a = new l0();

    private l0() {
    }

    public final void a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e11) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e11);
        }
    }
}
