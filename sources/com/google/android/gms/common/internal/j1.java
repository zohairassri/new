package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j1 extends hn.a implements i {
    j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.i
    public final Account zzb() {
        Parcel parcelR = R(2, Y());
        Account account = (Account) hn.o.b(parcelR, Account.CREATOR);
        parcelR.recycle();
        return account;
    }
}
