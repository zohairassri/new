package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzccb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzccb> CREATOR = new oj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f39674h;

    public zzccb(String str, String str2, boolean z11, boolean z12, List list, boolean z13, boolean z14, List list2) {
        this.f39667a = str;
        this.f39668b = str2;
        this.f39669c = z11;
        this.f39670d = z12;
        this.f39671e = list;
        this.f39672f = z13;
        this.f39673g = z14;
        this.f39674h = list2 == null ? new ArrayList() : list2;
    }

    public static zzccb j(JSONObject jSONObject) {
        return new zzccb(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), bm.o0.a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), bm.o0.a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39667a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 2, str, false);
        um.a.u(parcel, 3, this.f39668b, false);
        um.a.c(parcel, 4, this.f39669c);
        um.a.c(parcel, 5, this.f39670d);
        um.a.w(parcel, 6, this.f39671e, false);
        um.a.c(parcel, 7, this.f39672f);
        um.a.c(parcel, 8, this.f39673g);
        um.a.w(parcel, 9, this.f39674h, false);
        um.a.b(parcel, iA);
    }
}
