package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class v70 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iL = SafeParcelReader.L(parcel);
        long jG = 0;
        boolean zW = false;
        int iE = 0;
        boolean zW2 = false;
        String strP = null;
        byte[] bArrG = null;
        String[] strArrQ = null;
        String[] strArrQ2 = null;
        while (parcel.dataPosition() < iL) {
            int iC = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(iC)) {
                case 1:
                    zW = SafeParcelReader.w(parcel, iC);
                    break;
                case 2:
                    strP = SafeParcelReader.p(parcel, iC);
                    break;
                case 3:
                    iE = SafeParcelReader.E(parcel, iC);
                    break;
                case 4:
                    bArrG = SafeParcelReader.g(parcel, iC);
                    break;
                case 5:
                    strArrQ = SafeParcelReader.q(parcel, iC);
                    break;
                case 6:
                    strArrQ2 = SafeParcelReader.q(parcel, iC);
                    break;
                case 7:
                    zW2 = SafeParcelReader.w(parcel, iC);
                    break;
                case 8:
                    jG = SafeParcelReader.G(parcel, iC);
                    break;
                default:
                    SafeParcelReader.K(parcel, iC);
                    break;
            }
        }
        SafeParcelReader.u(parcel, iL);
        return new zzbpv(zW, strP, iE, bArrG, strArrQ, strArrQ2, zW2, jG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbpv[i11];
    }
}
