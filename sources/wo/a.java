package wo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f135850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f135851b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected a(IBinder iBinder, String str) {
        this.f135850a = iBinder;
    }

    protected final Parcel R() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f135851b);
        return parcelObtain;
    }

    protected final void Y(int i11, Parcel parcel) {
        try {
            this.f135850a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f135850a;
    }
}
