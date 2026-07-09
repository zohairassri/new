package yl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends pr implements g0 {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // yl.g0
    public final void B0(String str, String str2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        I0(1, parcelR);
    }
}
