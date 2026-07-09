package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f30285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f30286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w71 f30287c = w71.f37186b;

    public ll0(int i11) {
    }

    public final ll0 a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f30285a = onAudioFocusChangeListener;
        this.f30286b = handler;
        return this;
    }

    public final ll0 b(w71 w71Var) {
        this.f30287c = w71Var;
        return this;
    }

    public final io0 c() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f30285a;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.f30286b;
        handler.getClass();
        return new io0(1, onAudioFocusChangeListener, handler, this.f30287c, false);
    }
}
