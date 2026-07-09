package pl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ij.b;
import ij.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: pl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class AbstractBinderC1608a extends b implements a {

        /* JADX INFO: renamed from: pl.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static class C1609a extends ij.a implements a {
            C1609a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // pl.a
            public final Bundle G1(Bundle bundle) {
                Parcel parcelR = R();
                c.b(parcelR, bundle);
                Parcel parcelY = Y(parcelR);
                Bundle bundle2 = (Bundle) c.a(parcelY, Bundle.CREATOR);
                parcelY.recycle();
                return bundle2;
            }
        }

        public static a R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C1609a(iBinder);
        }
    }

    Bundle G1(Bundle bundle);
}
