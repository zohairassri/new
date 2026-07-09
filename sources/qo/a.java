package qo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f122867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f122868b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected a(IBinder iBinder, String str) {
        this.f122867a = iBinder;
    }

    protected final Parcel R() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f122868b);
        return parcelObtain;
    }

    protected final void Y(int i11, Parcel parcel) {
        try {
            this.f122867a.transact(i11, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f122867a;
    }
}
