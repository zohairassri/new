package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class ExoTimeoutException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9143a;

    public ExoTimeoutException(int i11) {
        super(a(i11));
        this.f9143a = i11;
    }

    private static String a(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
