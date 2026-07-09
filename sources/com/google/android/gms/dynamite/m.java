package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import hn.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m extends hn.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final com.google.android.gms.dynamic.a I0(com.google.android.gms.dynamic.a aVar, String str, int i11) {
        Parcel parcelY = Y();
        o.d(parcelY, aVar);
        parcelY.writeString(str);
        parcelY.writeInt(i11);
        Parcel parcelR = R(2, parcelY);
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcelR.readStrongBinder());
        parcelR.recycle();
        return aVarY;
    }

    public final int V1(com.google.android.gms.dynamic.a aVar, String str, boolean z11) {
        Parcel parcelY = Y();
        o.d(parcelY, aVar);
        parcelY.writeString(str);
        parcelY.writeInt(z11 ? 1 : 0);
        Parcel parcelR = R(5, parcelY);
        int i11 = parcelR.readInt();
        parcelR.recycle();
        return i11;
    }

    public final com.google.android.gms.dynamic.a c2(com.google.android.gms.dynamic.a aVar, String str, boolean z11, long j11) {
        Parcel parcelY = Y();
        o.d(parcelY, aVar);
        parcelY.writeString(str);
        parcelY.writeInt(z11 ? 1 : 0);
        parcelY.writeLong(j11);
        Parcel parcelR = R(7, parcelY);
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcelR.readStrongBinder());
        parcelR.recycle();
        return aVarY;
    }

    public final int k1(com.google.android.gms.dynamic.a aVar, String str, boolean z11) {
        Parcel parcelY = Y();
        o.d(parcelY, aVar);
        parcelY.writeString(str);
        parcelY.writeInt(z11 ? 1 : 0);
        Parcel parcelR = R(3, parcelY);
        int i11 = parcelR.readInt();
        parcelR.recycle();
        return i11;
    }

    public final com.google.android.gms.dynamic.a x2(com.google.android.gms.dynamic.a aVar, String str, int i11, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelY = Y();
        o.d(parcelY, aVar);
        parcelY.writeString(str);
        parcelY.writeInt(i11);
        o.d(parcelY, aVar2);
        Parcel parcelR = R(8, parcelY);
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcelR.readStrongBinder());
        parcelR.recycle();
        return aVarY;
    }

    public final com.google.android.gms.dynamic.a z1(com.google.android.gms.dynamic.a aVar, String str, int i11) {
        Parcel parcelY = Y();
        o.d(parcelY, aVar);
        parcelY.writeString(str);
        parcelY.writeInt(i11);
        Parcel parcelR = R(4, parcelY);
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcelR.readStrongBinder());
        parcelR.recycle();
        return aVarY;
    }

    public final int zzi() {
        Parcel parcelR = R(6, Y());
        int i11 = parcelR.readInt();
        parcelR.recycle();
        return i11;
    }
}
