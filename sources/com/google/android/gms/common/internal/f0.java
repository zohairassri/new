package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iL = SafeParcelReader.L(parcel);
        int iE = -1;
        int iE2 = 0;
        int iE3 = 0;
        int iE4 = 0;
        int iE5 = 0;
        String strP = null;
        String strP2 = null;
        long jG = 0;
        long jG2 = 0;
        while (parcel.dataPosition() < iL) {
            int iC = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(iC)) {
                case 1:
                    iE2 = SafeParcelReader.E(parcel, iC);
                    break;
                case 2:
                    iE3 = SafeParcelReader.E(parcel, iC);
                    break;
                case 3:
                    iE4 = SafeParcelReader.E(parcel, iC);
                    break;
                case 4:
                    jG = SafeParcelReader.G(parcel, iC);
                    break;
                case 5:
                    jG2 = SafeParcelReader.G(parcel, iC);
                    break;
                case 6:
                    strP = SafeParcelReader.p(parcel, iC);
                    break;
                case 7:
                    strP2 = SafeParcelReader.p(parcel, iC);
                    break;
                case 8:
                    iE5 = SafeParcelReader.E(parcel, iC);
                    break;
                case 9:
                    iE = SafeParcelReader.E(parcel, iC);
                    break;
                default:
                    SafeParcelReader.K(parcel, iC);
                    break;
            }
        }
        SafeParcelReader.u(parcel, iL);
        return new MethodInvocation(iE2, iE3, iE4, jG, jG2, strP, strP2, iE5, iE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new MethodInvocation[i11];
    }
}
