package yl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.rr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f0 extends qr implements g0 {
    public f0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static g0 n7(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof g0 ? (g0) iInterfaceQueryLocalInterface : new e0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        rr.h(parcel);
        B0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
