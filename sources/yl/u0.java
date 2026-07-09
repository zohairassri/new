package yl;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.qr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u0 extends qr implements v0 {
    public static v0 n7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new t0(iBinder);
    }
}
