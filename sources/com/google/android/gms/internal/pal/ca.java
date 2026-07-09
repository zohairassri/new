package com.google.android.gms.internal.pal;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ca extends w9 implements da {
    public ca() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.android.gms.internal.pal.w9
    protected final boolean R(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(zzj());
                return true;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                x9.b(parcel);
                zzn(string, string2);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                boolean zZzp = zzp(aVarY);
                parcel2.writeNoException();
                x9.c(parcel2, zZzp);
                return true;
            case 4:
                com.google.android.gms.dynamic.a aVarY2 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                boolean zZzq = zzq(aVarY2);
                parcel2.writeNoException();
                x9.c(parcel2, zZzq);
                return true;
            case 5:
                String string3 = parcel.readString();
                x9.b(parcel);
                zzo(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.a aVarY3 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarY4 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                com.google.android.gms.dynamic.a aVarZzd = zzd(aVarY3, aVarY4);
                parcel2.writeNoException();
                x9.e(parcel2, aVarZzd);
                return true;
            case 7:
                com.google.android.gms.dynamic.a aVarY5 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                String strZzf = zzf(aVarY5);
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 8:
                com.google.android.gms.dynamic.a aVarY6 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                String string4 = parcel.readString();
                x9.b(parcel);
                String strZze = zze(aVarY6, string4);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 9:
                com.google.android.gms.dynamic.a aVarY7 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                zzl(aVarY7);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.dynamic.a aVarY8 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarY9 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                com.google.android.gms.dynamic.a aVarZzc = zzc(aVarY8, aVarY9);
                parcel2.writeNoException();
                x9.e(parcel2, aVarZzc);
                return true;
            case 11:
                String string5 = parcel.readString();
                boolean zF = x9.f(parcel);
                x9.b(parcel);
                boolean zV3 = V3(string5, zF);
                parcel2.writeNoException();
                x9.c(parcel2, zV3);
                return true;
            case 12:
                com.google.android.gms.dynamic.a aVarY10 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                byte[] bArrCreateByteArray = parcel.createByteArray();
                x9.b(parcel);
                String strZzg = zzg(aVarY10, bArrCreateByteArray);
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 13:
                com.google.android.gms.dynamic.a aVarY11 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                String strZzi = zzi(aVarY11);
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 14:
                com.google.android.gms.dynamic.a aVarY12 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarY13 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarY14 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                String strZzk = zzk(aVarY12, aVarY13, aVarY14);
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 15:
                com.google.android.gms.dynamic.a aVarY15 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                zzm(aVarY15);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                com.google.android.gms.dynamic.a aVarY16 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarY17 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarY18 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarY19 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                x9.b(parcel);
                String strZzh = zzh(aVarY16, aVarY17, aVarY18, aVarY19);
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 18:
                parcel2.writeNoException();
                x9.c(parcel2, true);
                return true;
            case 19:
                parcel2.writeNoException();
                x9.c(parcel2, true);
                return true;
            case 20:
                int iZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
        }
    }
}
