package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class v9 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f41878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41879b;

    protected v9(IBinder iBinder, String str) {
        this.f41878a = iBinder;
        this.f41879b = str;
    }

    protected final void I0(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f41878a.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final Parcel R() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f41879b);
        return parcelObtain;
    }

    protected final Parcel Y(int i11, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f41878a.transact(i11, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e11) {
                parcelObtain.recycle();
                throw e11;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f41878a;
    }

    protected final void k1(int i11, Parcel parcel) {
        try {
            this.f41878a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
