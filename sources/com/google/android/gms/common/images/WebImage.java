package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class WebImage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f22666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22668d;

    WebImage(int i11, Uri uri, int i12, int i13) {
        this.f22665a = i11;
        this.f22666b = uri;
        this.f22667c = i12;
        this.f22668d = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (m.a(this.f22666b, webImage.f22666b) && this.f22667c == webImage.f22667c && this.f22668d == webImage.f22668d) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f22668d;
    }

    public int getWidth() {
        return this.f22667c;
    }

    public int hashCode() {
        return m.b(this.f22666b, Integer.valueOf(this.f22667c), Integer.valueOf(this.f22668d));
    }

    public Uri j() {
        return this.f22666b;
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f22667c), Integer.valueOf(this.f22668d), this.f22666b.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22665a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.s(parcel, 2, j(), i11, false);
        um.a.l(parcel, 3, getWidth());
        um.a.l(parcel, 4, getHeight());
        um.a.b(parcel, iA);
    }
}
