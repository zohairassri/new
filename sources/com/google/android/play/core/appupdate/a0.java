package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a0 extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f45741c;

    a0() {
    }

    @Override // com.google.android.play.core.appupdate.d.a
    public final d a() {
        if (this.f45741c == 3) {
            return new c0(this.f45739a, this.f45740b, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f45741c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f45741c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.appupdate.d.a
    public final d.a b(boolean z11) {
        this.f45740b = z11;
        this.f45741c = (byte) (this.f45741c | 2);
        return this;
    }

    public final d.a c(int i11) {
        this.f45739a = i11;
        this.f45741c = (byte) (this.f45741c | 1);
        return this;
    }
}
