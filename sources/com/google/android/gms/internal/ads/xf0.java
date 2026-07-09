package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xf0 extends pr implements zf0 {
    xf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zf0
    public final void c(String str) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        I0(2, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.zf0
    public final void q3(List list) {
        Parcel parcelR = R();
        parcelR.writeTypedList(list);
        I0(1, parcelR);
    }
}
