package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class y8 implements n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final n6 f42640a = new y8();

    private y8() {
    }

    @Override // com.google.android.gms.internal.play_billing.n6
    public final boolean zza(int i11) {
        return (i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : z8.ALTERNATIVE_BILLING_ACTION : z8.LOCAL_PURCHASES_UPDATED_ACTION : z8.PURCHASES_UPDATED_ACTION : z8.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
