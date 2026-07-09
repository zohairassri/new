package in;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzbe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iL = SafeParcelReader.L(parcel);
        String strP = null;
        int iE = 0;
        short sI = 0;
        int iE2 = 0;
        double dY = 0.0d;
        double dY2 = 0.0d;
        float fA = 0.0f;
        long jG = 0;
        int iE3 = -1;
        while (parcel.dataPosition() < iL) {
            int iC = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(iC)) {
                case 1:
                    strP = SafeParcelReader.p(parcel, iC);
                    break;
                case 2:
                    jG = SafeParcelReader.G(parcel, iC);
                    break;
                case 3:
                    sI = SafeParcelReader.I(parcel, iC);
                    break;
                case 4:
                    dY = SafeParcelReader.y(parcel, iC);
                    break;
                case 5:
                    dY2 = SafeParcelReader.y(parcel, iC);
                    break;
                case 6:
                    fA = SafeParcelReader.A(parcel, iC);
                    break;
                case 7:
                    iE = SafeParcelReader.E(parcel, iC);
                    break;
                case 8:
                    iE2 = SafeParcelReader.E(parcel, iC);
                    break;
                case 9:
                    iE3 = SafeParcelReader.E(parcel, iC);
                    break;
                default:
                    SafeParcelReader.K(parcel, iC);
                    break;
            }
        }
        SafeParcelReader.u(parcel, iL);
        return new zzbe(strP, iE, sI, dY, dY2, fA, jG, iE2, iE3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new zzbe[i11];
    }
}
