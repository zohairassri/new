package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k6.o f9381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9382d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f9383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k6.o f9384b;

        public a(k6.o oVar, b bVar) {
            this.f9384b = oVar;
            this.f9383a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (d.this.f9382d) {
                this.f9383a.t();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f9384b.h(new Runnable() { // from class: androidx.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9371a.b();
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void t();
    }

    public d(Context context, Looper looper, Looper looper2, b bVar, k6.i iVar) {
        this.f9379a = context.getApplicationContext();
        this.f9381c = iVar.d(looper, null);
        this.f9380b = new a(iVar.d(looper2, null), bVar);
    }

    public void d(boolean z11) {
        if (z11 == this.f9382d) {
            return;
        }
        if (z11) {
            this.f9381c.h(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f9144a;
                    dVar.f9379a.registerReceiver(dVar.f9380b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f9382d = true;
        } else {
            this.f9381c.h(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f9359a;
                    dVar.f9379a.unregisterReceiver(dVar.f9380b);
                }
            });
            this.f9382d = false;
        }
    }
}
