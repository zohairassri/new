package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iL = SafeParcelReader.L(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        Boolean boolX = null;
        ArrayList arrayListR = null;
        String strP8 = null;
        String strP9 = null;
        long jG = 0;
        long jG2 = 0;
        long jG3 = 0;
        long jG4 = 0;
        long jG5 = 0;
        long jG6 = 0;
        long jG7 = 0;
        boolean zW = true;
        boolean zW2 = true;
        boolean zW3 = false;
        int iE = 0;
        boolean zW4 = false;
        boolean zW5 = false;
        int iE2 = 0;
        long jG8 = -2147483648L;
        String strP10 = "";
        String strP11 = strP10;
        String strP12 = strP11;
        int iE3 = 100;
        while (parcel.dataPosition() < iL) {
            int iC = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(iC)) {
                case 2:
                    strP = SafeParcelReader.p(parcel, iC);
                    break;
                case 3:
                    strP2 = SafeParcelReader.p(parcel, iC);
                    break;
                case 4:
                    strP3 = SafeParcelReader.p(parcel, iC);
                    break;
                case 5:
                    strP4 = SafeParcelReader.p(parcel, iC);
                    break;
                case 6:
                    jG = SafeParcelReader.G(parcel, iC);
                    break;
                case 7:
                    jG2 = SafeParcelReader.G(parcel, iC);
                    break;
                case 8:
                    strP5 = SafeParcelReader.p(parcel, iC);
                    break;
                case 9:
                    zW = SafeParcelReader.w(parcel, iC);
                    break;
                case 10:
                    zW3 = SafeParcelReader.w(parcel, iC);
                    break;
                case 11:
                    jG8 = SafeParcelReader.G(parcel, iC);
                    break;
                case 12:
                    strP6 = SafeParcelReader.p(parcel, iC);
                    break;
                case 13:
                    jG3 = SafeParcelReader.G(parcel, iC);
                    break;
                case 14:
                    jG4 = SafeParcelReader.G(parcel, iC);
                    break;
                case 15:
                    iE = SafeParcelReader.E(parcel, iC);
                    break;
                case 16:
                    zW2 = SafeParcelReader.w(parcel, iC);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.K(parcel, iC);
                    break;
                case 18:
                    zW4 = SafeParcelReader.w(parcel, iC);
                    break;
                case 19:
                    strP7 = SafeParcelReader.p(parcel, iC);
                    break;
                case 21:
                    boolX = SafeParcelReader.x(parcel, iC);
                    break;
                case 22:
                    jG5 = SafeParcelReader.G(parcel, iC);
                    break;
                case 23:
                    arrayListR = SafeParcelReader.r(parcel, iC);
                    break;
                case 24:
                    strP8 = SafeParcelReader.p(parcel, iC);
                    break;
                case 25:
                    strP10 = SafeParcelReader.p(parcel, iC);
                    break;
                case 26:
                    strP11 = SafeParcelReader.p(parcel, iC);
                    break;
                case 27:
                    strP9 = SafeParcelReader.p(parcel, iC);
                    break;
                case 28:
                    zW5 = SafeParcelReader.w(parcel, iC);
                    break;
                case 29:
                    jG6 = SafeParcelReader.G(parcel, iC);
                    break;
                case 30:
                    iE3 = SafeParcelReader.E(parcel, iC);
                    break;
                case 31:
                    strP12 = SafeParcelReader.p(parcel, iC);
                    break;
                case 32:
                    iE2 = SafeParcelReader.E(parcel, iC);
                    break;
                case 34:
                    jG7 = SafeParcelReader.G(parcel, iC);
                    break;
            }
        }
        SafeParcelReader.u(parcel, iL);
        return new zzo(strP, strP2, strP3, strP4, jG, jG2, strP5, zW, zW3, jG8, strP6, jG3, jG4, iE, zW2, zW4, strP7, boolX, jG5, arrayListR, strP8, strP10, strP11, strP9, zW5, jG6, iE3, strP12, iE2, jG7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzo[i11];
    }
}
