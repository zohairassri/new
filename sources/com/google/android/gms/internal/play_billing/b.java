package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.comscore.streaming.AdvertisementOwner;
import com.comscore.streaming.ContentDistributionModel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends g implements d {
    b(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final int K6(int i11, String str, String str2, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        i.c(parcelR, bundle);
        Parcel parcelY = Y(10, parcelR);
        int i12 = parcelY.readInt();
        parcelY.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle N2(int i11, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        parcelR.writeString(null);
        i.c(parcelR, bundle);
        Parcel parcelY = Y(8, parcelR);
        Bundle bundle2 = (Bundle) i.a(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle O1(int i11, String str, String str2, String str3) {
        Parcel parcelR = R();
        parcelR.writeInt(3);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        Parcel parcelY = Y(4, parcelR);
        Bundle bundle = (Bundle) i.a(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle V2(int i11, String str, String str2, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeInt(3);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        i.c(parcelR, bundle);
        Parcel parcelY = Y(2, parcelR);
        Bundle bundle2 = (Bundle) i.a(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle i7(int i11, String str, String str2, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeInt(9);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        i.c(parcelR, bundle);
        Parcel parcelY = Y(ContentDistributionModel.EXCLUSIVELY_ONLINE, parcelR);
        Bundle bundle2 = (Bundle) i.a(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle j4(int i11, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        i.c(parcelR, bundle);
        i.c(parcelR, bundle2);
        Parcel parcelY = Y(901, parcelR);
        Bundle bundle3 = (Bundle) i.a(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle p5(int i11, String str, String str2, String str3, String str4) {
        Parcel parcelR = R();
        parcelR.writeInt(3);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        parcelR.writeString(null);
        Parcel parcelY = Y(3, parcelR);
        Bundle bundle = (Bundle) i.a(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.d
    public final void v2(int i11, String str, Bundle bundle, f fVar) {
        Parcel parcelR = R();
        parcelR.writeInt(12);
        parcelR.writeString(str);
        i.c(parcelR, bundle);
        parcelR.writeStrongBinder(fVar);
        I0(AdvertisementOwner.DISTRIBUTOR, parcelR);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final int y4(int i11, String str, String str2) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        Parcel parcelY = Y(1, parcelR);
        int i12 = parcelY.readInt();
        parcelY.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle z3(int i11, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        i.c(parcelR, bundle);
        Parcel parcelY = Y(11, parcelR);
        Bundle bundle2 = (Bundle) i.a(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle2;
    }
}
