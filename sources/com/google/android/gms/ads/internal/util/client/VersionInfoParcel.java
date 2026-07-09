package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22414e;

    public VersionInfoParcel(int i11, int i12, boolean z11) {
        this(i11, i12, z11, false, false);
    }

    public static VersionInfoParcel j() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.u(parcel, 2, this.f22410a, false);
        um.a.l(parcel, 3, this.f22411b);
        um.a.l(parcel, 4, this.f22412c);
        um.a.c(parcel, 5, this.f22413d);
        um.a.c(parcel, 6, this.f22414e);
        um.a.b(parcel, iA);
    }

    public VersionInfoParcel(int i11, int i12, boolean z11, boolean z12) {
        this(i11, i12, z11, false, z12);
    }

    public VersionInfoParcel(int i11, int i12, boolean z11, boolean z12, boolean z13) {
        String str;
        if (z11) {
            str = "0";
        } else {
            str = z12 ? "2" : "1";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 13 + String.valueOf(i12).length() + 2);
        sb2.append("afma-sdk-a-v");
        sb2.append(i11);
        sb2.append(InstructionFileId.DOT);
        sb2.append(i12);
        sb2.append(InstructionFileId.DOT);
        sb2.append(str);
        this(sb2.toString(), i11, i12, z11, z13);
    }

    VersionInfoParcel(String str, int i11, int i12, boolean z11, boolean z12) {
        this.f22410a = str;
        this.f22411b = i11;
        this.f22412c = i12;
        this.f22413d = z11;
        this.f22414e = z12;
    }
}
