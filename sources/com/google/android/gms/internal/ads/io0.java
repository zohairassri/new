package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class io0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f28498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f28499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w71 f28500d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f28502f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28497a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f28501e = false;

    io0(int i11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, w71 w71Var, boolean z11) {
        this.f28499c = handler;
        this.f28500d = w71Var;
        this.f28498b = onAudioFocusChangeListener;
        this.f28502f = new AudioFocusRequest.Builder(1).setAudioAttributes(w71Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    final AudioFocusRequest a() {
        Object obj = this.f28502f;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io0)) {
            return false;
        }
        io0 io0Var = (io0) obj;
        return Objects.equals(this.f28498b, io0Var.f28498b) && Objects.equals(this.f28499c, io0Var.f28499c) && Objects.equals(this.f28500d, io0Var.f28500d);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f28498b, this.f28499c, this.f28500d, Boolean.FALSE);
    }
}
