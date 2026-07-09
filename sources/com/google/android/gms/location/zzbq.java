package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import in.n;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f42739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PendingIntent f42740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42741c;

    zzbq(List list, PendingIntent pendingIntent, String str) {
        this.f42739a = list == null ? n.m() : n.p(list);
        this.f42740b = pendingIntent;
        this.f42741c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.w(parcel, 1, this.f42739a, false);
        um.a.s(parcel, 2, this.f42740b, i11, false);
        um.a.u(parcel, 3, this.f42741c, false);
        um.a.b(parcel, iA);
    }
}
