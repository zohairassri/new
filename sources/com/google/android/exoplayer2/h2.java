package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WifiManager f20646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f20647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20649d;

    public h2(Context context) {
        this.f20646a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f20647b;
        if (wifiLock == null) {
            return;
        }
        if (this.f20648c && this.f20649d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z11) {
        if (z11 && this.f20647b == null) {
            WifiManager wifiManager = this.f20646a;
            if (wifiManager == null) {
                ml.q.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f20647b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f20648c = z11;
        c();
    }

    public void b(boolean z11) {
        this.f20649d = z11;
        c();
    }
}
