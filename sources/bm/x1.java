package bm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a2 f14932a;

    /* synthetic */ x1(a2 a2Var, byte[] bArr) {
        Objects.requireNonNull(a2Var);
        this.f14932a = a2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.f14932a.b0(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f14932a.b0(false);
        }
    }
}
