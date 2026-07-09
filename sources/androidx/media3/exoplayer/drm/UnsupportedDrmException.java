package androidx.media3.exoplayer.drm;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedDrmException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9599a;

    public UnsupportedDrmException(int i11) {
        this.f9599a = i11;
    }

    public UnsupportedDrmException(int i11, Exception exc) {
        super(exc);
        this.f9599a = i11;
    }
}
