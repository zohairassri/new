package qo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends a implements l {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qo.l
    public final void I5(String str, Bundle bundle, n nVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        i.c(parcelR, bundle);
        parcelR.writeStrongBinder(nVar);
        Y(3, parcelR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qo.l
    public final void m5(String str, Bundle bundle, n nVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        i.c(parcelR, bundle);
        parcelR.writeStrongBinder(nVar);
        Y(2, parcelR);
    }
}
