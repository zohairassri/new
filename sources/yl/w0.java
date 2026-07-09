package yl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class w0 extends pr implements y0 {
    w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // yl.y0
    public final String zze() {
        Parcel parcelY = Y(1, R());
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // yl.y0
    public final String zzf() {
        Parcel parcelY = Y(2, R());
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }
}
