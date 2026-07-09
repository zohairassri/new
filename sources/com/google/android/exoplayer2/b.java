package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f20305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20306c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0308b f20307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f20308b;

        public a(Handler handler, InterfaceC0308b interfaceC0308b) {
            this.f20308b = handler;
            this.f20307a = interfaceC0308b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f20308b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f20306c) {
                this.f20307a.t();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC0308b {
        void t();
    }

    public b(Context context, Handler handler, InterfaceC0308b interfaceC0308b) {
        this.f20304a = context.getApplicationContext();
        this.f20305b = new a(handler, interfaceC0308b);
    }

    public void b(boolean z11) {
        if (z11 && !this.f20306c) {
            this.f20304a.registerReceiver(this.f20305b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f20306c = true;
        } else {
            if (z11 || !this.f20306c) {
                return;
            }
            this.f20304a.unregisterReceiver(this.f20305b);
            this.f20306c = false;
        }
    }
}
