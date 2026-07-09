package com.google.android.exoplayer2.drm;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class UnsupportedDrmException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20456a;

    public UnsupportedDrmException(int i11) {
        this.f20456a = i11;
    }

    public UnsupportedDrmException(int i11, Exception exc) {
        super(exc);
        this.f20456a = i11;
    }
}
