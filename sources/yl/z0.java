package yl;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f140823b;

    public z0(y0 y0Var) {
        String strZze;
        this.f140823b = y0Var;
        try {
            strZze = y0Var.zze();
        } catch (RemoteException e11) {
            cm.o.d("", e11);
            strZze = null;
        }
        this.f140822a = strZze;
    }

    public final String toString() {
        return this.f140822a;
    }
}
