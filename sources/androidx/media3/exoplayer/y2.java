package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f10927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k6.o f10928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10930d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f10931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f10932b;

        public a(Context context) {
            this.f10931a = context;
        }

        public void a(boolean z11, boolean z12) {
            if (z11 && this.f10932b == null) {
                PowerManager powerManager = (PowerManager) this.f10931a.getSystemService("power");
                if (powerManager == null) {
                    k6.s.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f10932b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f10932b;
            if (wakeLock == null) {
                return;
            }
            if (z11 && z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public y2(Context context, Looper looper, k6.i iVar) {
        this.f10927a = new a(context.getApplicationContext());
        this.f10928b = iVar.d(looper, null);
    }

    public void c(final boolean z11) {
        if (this.f10929c == z11) {
            return;
        }
        this.f10929c = z11;
        final boolean z12 = this.f10930d;
        this.f10928b.h(new Runnable() { // from class: androidx.media3.exoplayer.x2
            @Override // java.lang.Runnable
            public final void run() {
                this.f10918a.f10927a.a(z11, z12);
            }
        });
    }

    public void d(final boolean z11) {
        if (this.f10930d == z11) {
            return;
        }
        this.f10930d = z11;
        if (this.f10929c) {
            this.f10928b.h(new Runnable() { // from class: androidx.media3.exoplayer.w2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10911a.f10927a.a(true, z11);
                }
            });
        }
    }
}
