package k4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String V = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* JADX INFO: renamed from: k4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class AbstractBinderC1313a extends Binder implements a {

        /* JADX INFO: renamed from: k4.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        private static class C1314a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f107438a;

            C1314a(IBinder iBinder) {
                this.f107438a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f107438a;
            }
        }

        public static a R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.V);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1314a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }
}
