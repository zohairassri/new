package yl;

import android.os.Parcel;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.rr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n1 extends qr implements o1 {
    public n1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zze();
        } else if (i11 == 2) {
            zzf();
        } else if (i11 == 3) {
            zzg();
        } else if (i11 == 4) {
            zzh();
        } else {
            if (i11 != 5) {
                return false;
            }
            boolean zA = rr.a(parcel);
            rr.h(parcel);
            L2(zA);
        }
        parcel2.writeNoException();
        return true;
    }
}
