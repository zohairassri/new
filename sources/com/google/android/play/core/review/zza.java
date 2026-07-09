package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class zza extends ReviewInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f45805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45806b;

    zza(PendingIntent pendingIntent, boolean z11) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f45805a = pendingIntent;
        this.f45806b = z11;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    final PendingIntent a() {
        return this.f45805a;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    final boolean b() {
        return this.f45806b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f45805a.equals(reviewInfo.a()) && this.f45806b == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f45806b ? 1237 : 1231) ^ ((this.f45805a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f45805a.toString() + ", isNoOp=" + this.f45806b + "}";
    }
}
