package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbfp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfp> CREATOR = new pu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f39557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39560i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39561l;

    zzbfp(String str, long j11, String str2, String str3, String str4, Bundle bundle, boolean z11, long j12, String str5, int i11) {
        this.f39552a = str;
        this.f39553b = j11;
        this.f39554c = str2 == null ? "" : str2;
        this.f39555d = str3 == null ? "" : str3;
        this.f39556e = str4 == null ? "" : str4;
        this.f39557f = bundle == null ? new Bundle() : bundle;
        this.f39558g = z11;
        this.f39559h = j12;
        this.f39560i = str5;
        this.f39561l = i11;
    }

    public static zzbfp j(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 51);
                sb2.append("Expected 2 path parts for namespace and id, found :");
                sb2.append(size);
                String string = sb2.toString();
                int i11 = bm.k1.f14837b;
                cm.o.f(string);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(Constants.URL_ENCODING);
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j11 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbfp(queryParameter, j11, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e11) {
            int i12 = bm.k1.f14837b;
            cm.o.g("Unable to parse Uri into cache offering.", e11);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39552a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 2, str, false);
        um.a.p(parcel, 3, this.f39553b);
        um.a.u(parcel, 4, this.f39554c, false);
        um.a.u(parcel, 5, this.f39555d, false);
        um.a.u(parcel, 6, this.f39556e, false);
        um.a.e(parcel, 7, this.f39557f, false);
        um.a.c(parcel, 8, this.f39558g);
        um.a.p(parcel, 9, this.f39559h);
        um.a.u(parcel, 10, this.f39560i, false);
        um.a.l(parcel, 11, this.f39561l);
        um.a.b(parcel, iA);
    }
}
