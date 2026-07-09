package in;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f103925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103926b;

    protected a(IBinder iBinder, String str) {
        this.f103925a = iBinder;
        this.f103926b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f103925a;
    }
}
