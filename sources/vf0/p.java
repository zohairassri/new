package vf0;

import java.util.concurrent.CancellationException;
import tf0.n1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract /* synthetic */ class p {
    public static final void a(w wVar, Throwable th2) {
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = n1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        wVar.f(cancellationExceptionA);
    }
}
