package b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {
    public static final String D = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: b.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        private static class C0219a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f13705a;

            C0219a(IBinder iBinder) {
                this.f13705a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13705a;
            }
        }

        public static c R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.D);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0219a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }
    }
}
