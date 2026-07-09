package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f42731d;

    PlaceReport(int i11, String str, String str2, String str3) {
        this.f42728a = i11;
        this.f42729b = str;
        this.f42730c = str2;
        this.f42731d = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return m.a(this.f42729b, placeReport.f42729b) && m.a(this.f42730c, placeReport.f42730c) && m.a(this.f42731d, placeReport.f42731d);
    }

    public int hashCode() {
        return m.b(this.f42729b, this.f42730c, this.f42731d);
    }

    public String j() {
        return this.f42729b;
    }

    public String l() {
        return this.f42730c;
    }

    public String toString() {
        m.a aVarC = m.c(this);
        aVarC.a("placeId", this.f42729b);
        aVarC.a("tag", this.f42730c);
        if (!"unknown".equals(this.f42731d)) {
            aVarC.a("source", this.f42731d);
        }
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f42728a);
        um.a.u(parcel, 2, j(), false);
        um.a.u(parcel, 3, l(), false);
        um.a.u(parcel, 4, this.f42731d, false);
        um.a.b(parcel, iA);
    }
}
