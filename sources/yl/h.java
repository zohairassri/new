package yl;

import android.os.Parcel;
import com.google.android.gms.internal.ads.qr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h extends qr implements i {
    public h() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
