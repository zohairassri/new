package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f19156b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((gd.c) message.obj).b();
            return true;
        }
    }

    u() {
    }

    synchronized void a(gd.c cVar, boolean z11) {
        try {
            if (this.f19155a || z11) {
                this.f19156b.obtainMessage(1, cVar).sendToTarget();
            } else {
                this.f19155a = true;
                cVar.b();
                this.f19155a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
