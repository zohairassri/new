package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k6.o f9366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9368d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f9370b;

        public a(Context context) {
            this.f9369a = context;
        }

        public void a(boolean z11, boolean z12) {
            if (z11 && this.f9370b == null) {
                WifiManager wifiManager = (WifiManager) this.f9369a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    k6.s.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f9370b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f9370b;
            if (wifiLock == null) {
                return;
            }
            if (z11 && z12) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public b3(Context context, Looper looper, k6.i iVar) {
        this.f9365a = new a(context.getApplicationContext());
        this.f9366b = iVar.d(looper, null);
    }

    public void c(final boolean z11) {
        if (this.f9367c == z11) {
            return;
        }
        this.f9367c = z11;
        final boolean z12 = this.f9368d;
        this.f9366b.h(new Runnable() { // from class: androidx.media3.exoplayer.z2
            @Override // java.lang.Runnable
            public final void run() {
                this.f10936a.f9365a.a(z11, z12);
            }
        });
    }

    public void d(final boolean z11) {
        if (this.f9368d == z11) {
            return;
        }
        this.f9368d = z11;
        if (this.f9367c) {
            this.f9366b.h(new Runnable() { // from class: androidx.media3.exoplayer.a3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9151a.f9365a.a(true, z11);
                }
            });
        }
    }
}
