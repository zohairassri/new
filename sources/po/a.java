package po;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import jn.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: po.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class AbstractBinderC1610a extends jn.b implements a {

        /* JADX INFO: renamed from: po.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static class C1611a extends jn.a implements a {
            C1611a(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // po.a
            public void z6(String str, Bundle bundle, b bVar) {
                Parcel parcelR = R();
                parcelR.writeString(str);
                c.c(parcelR, bundle);
                if (bVar == null) {
                    parcelR.writeStrongBinder(null);
                } else {
                    parcelR.writeStrongBinder(bVar.asBinder());
                }
                Y(1, parcelR);
            }
        }

        public static a Y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C1611a(iBinder);
        }
    }

    void z6(String str, Bundle bundle, b bVar);
}
