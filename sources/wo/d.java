package wo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wo.f
    public final void s2(String str, Bundle bundle, h hVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        int i11 = c.f135852a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        parcelR.writeStrongBinder(hVar);
        Y(2, parcelR);
    }
}
