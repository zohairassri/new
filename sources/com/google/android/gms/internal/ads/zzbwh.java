package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbwh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwh> CREATOR = new fe0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39598c;

    zzbwh(int i11, int i12, int i13) {
        this.f39596a = i11;
        this.f39597b = i12;
        this.f39598c = i13;
    }

    public static zzbwh j(ql.q qVar) {
        return new zzbwh(qVar.a(), qVar.c(), qVar.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwh)) {
            zzbwh zzbwhVar = (zzbwh) obj;
            if (zzbwhVar.f39598c == this.f39598c && zzbwhVar.f39597b == this.f39597b && zzbwhVar.f39596a == this.f39596a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f39596a, this.f39597b, this.f39598c});
    }

    public final String toString() {
        int i11 = this.f39596a;
        int length = String.valueOf(i11).length();
        int i12 = this.f39597b;
        int length2 = String.valueOf(i12).length();
        int i13 = this.f39598c;
        StringBuilder sb2 = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i13).length());
        sb2.append(i11);
        sb2.append(InstructionFileId.DOT);
        sb2.append(i12);
        sb2.append(InstructionFileId.DOT);
        sb2.append(i13);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f39596a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.f39597b);
        um.a.l(parcel, 3, this.f39598c);
        um.a.b(parcel, iA);
    }
}
