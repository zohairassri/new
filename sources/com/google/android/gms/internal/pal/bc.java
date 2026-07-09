package com.google.android.gms.internal.pal;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class bc extends w9 implements cc {
    public bc() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.pal.w9
    protected final boolean R(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 2:
                a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                parcel.readString();
                x9.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                x9.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                x9.b(parcel);
                break;
            case 6:
                parcel.readInt();
                x9.b(parcel);
                break;
            case 7:
                parcel.readInt();
                x9.b(parcel);
                break;
            case 8:
                a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                x9.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
