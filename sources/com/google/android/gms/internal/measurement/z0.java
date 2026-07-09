package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class z0 extends Binder implements IInterface {
    protected z0(String str) {
        attachInterface(this, str);
    }

    protected abstract boolean R(int i11, Parcel parcel, Parcel parcel2, int i12);

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        boolean zOnTransact;
        if (i11 > 16777215) {
            zOnTransact = super.onTransact(i11, parcel, parcel2, i12);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return R(i11, parcel, parcel2, i12);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
