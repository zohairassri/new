package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcas> CREATOR = new gi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39664b;

    public zzcas(String str, int i11) {
        this.f39663a = str;
        this.f39664b = i11;
    }

    public static zzcas j(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcas(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcas)) {
            return false;
        }
        zzcas zzcasVar = (zzcas) obj;
        return com.google.android.gms.common.internal.m.a(this.f39663a, zzcasVar.f39663a) && com.google.android.gms.common.internal.m.a(Integer.valueOf(this.f39664b), Integer.valueOf(zzcasVar.f39664b));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.m.b(this.f39663a, Integer.valueOf(this.f39664b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39663a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 2, str, false);
        um.a.l(parcel, 3, this.f39664b);
        um.a.b(parcel, iA);
    }
}
