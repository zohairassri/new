package rx.exceptions;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class OnErrorFailedException extends RuntimeException {
    public OnErrorFailedException(String str, Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }

    public OnErrorFailedException(Throwable th2) {
        super(th2 != null ? th2.getMessage() : null, th2 == null ? new NullPointerException() : th2);
    }
}
