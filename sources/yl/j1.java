package yl;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.rr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j1 extends qr implements k1 {
    public j1() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        String string = parcel.readString();
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
        com.google.android.gms.dynamic.a aVarY2 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
        rr.h(parcel);
        O2(string, aVarY, aVarY2);
        parcel2.writeNoException();
        return true;
    }
}
