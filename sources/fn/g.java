package fn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g extends l4.a {
    public static Intent q(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (f.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != f.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
