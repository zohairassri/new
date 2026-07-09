package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class tg5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioTrack f35475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f35476b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35480f;

    public tg5(AudioTrack audioTrack) {
        this.f35475a = audioTrack;
    }

    public final boolean a() {
        AudioTrack audioTrack = this.f35475a;
        AudioTimestamp audioTimestamp = this.f35476b;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j11 = audioTimestamp.framePosition;
            if (this.f35478d > j11) {
                this.f35477c++;
            }
            this.f35478d = j11;
            this.f35479e = j11 + this.f35480f + (this.f35477c << 32);
        }
        return timestamp;
    }

    public final long b() {
        return this.f35476b.nanoTime / 1000;
    }

    public final long c() {
        return this.f35479e;
    }
}
