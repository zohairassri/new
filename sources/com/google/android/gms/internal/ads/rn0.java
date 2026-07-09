package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class rn0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f34273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qn0 f34274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f34278f = 1.0f;

    public rn0(Context context, qn0 qn0Var) {
        this.f34273a = (AudioManager) context.getSystemService("audio");
        this.f34274b = qn0Var;
    }

    private final void f() {
        if (!this.f34276d || this.f34277e || this.f34278f <= 0.0f) {
            if (this.f34275c) {
                AudioManager audioManager = this.f34273a;
                if (audioManager != null) {
                    this.f34275c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f34274b.zzq();
                return;
            }
            return;
        }
        if (this.f34275c) {
            return;
        }
        AudioManager audioManager2 = this.f34273a;
        if (audioManager2 != null) {
            this.f34275c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f34274b.zzq();
    }

    public final void a(boolean z11) {
        this.f34277e = z11;
        f();
    }

    public final void b(float f11) {
        this.f34278f = f11;
        f();
    }

    public final float c() {
        float f11 = this.f34277e ? 0.0f : this.f34278f;
        if (this.f34275c) {
            return f11;
        }
        return 0.0f;
    }

    public final void d() {
        this.f34276d = true;
        f();
    }

    public final void e() {
        this.f34276d = false;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i11) {
        this.f34275c = i11 > 0;
        this.f34274b.zzq();
    }
}
