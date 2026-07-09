package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class yi0 implements cm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ yi0 f38497a = new yi0();

    private /* synthetic */ yi0() {
    }

    @Override // cm.q
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof ri0 ? (ri0) iInterfaceQueryLocalInterface : new ri0(iBinder);
    }
}
