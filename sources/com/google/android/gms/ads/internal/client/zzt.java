package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.theathletic.video.component.data.VideoRepository;
import org.json.JSONObject;
import yl.u2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new u2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22348d;

    public zzt(int i11, int i12, String str, long j11) {
        this.f22345a = i11;
        this.f22346b = i12;
        this.f22347c = str;
        this.f22348d = j11;
    }

    public static zzt j(JSONObject jSONObject) {
        return new zzt(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong(VideoRepository.XML_ATTR_VALUE));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22345a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.f22346b);
        um.a.u(parcel, 3, this.f22347c, false);
        um.a.p(parcel, 4, this.f22348d);
        um.a.b(parcel, iA);
    }
}
