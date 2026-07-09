package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ts2 implements qu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Message f35730a;

    /* synthetic */ ts2(byte[] bArr) {
    }

    public final ts2 a(Message message, ut2 ut2Var) {
        this.f35730a = message;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.f35730a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f35730a = null;
        ut2.b(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.qu1
    public final void zza() {
        Message message = this.f35730a;
        message.getClass();
        message.sendToTarget();
        this.f35730a = null;
        ut2.b(this);
    }
}
