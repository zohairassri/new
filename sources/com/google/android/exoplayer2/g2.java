package com.google.android.exoplayer2;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PowerManager f20610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f20611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20613d;

    public g2(Context context) {
        this.f20610a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f20611b;
        if (wakeLock == null) {
            return;
        }
        if (this.f20612c && this.f20613d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z11) {
        if (z11 && this.f20611b == null) {
            PowerManager powerManager = this.f20610a;
            if (powerManager == null) {
                ml.q.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f20611b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f20612c = z11;
        c();
    }

    public void b(boolean z11) {
        this.f20613d = z11;
        c();
    }
}
