package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzq implements Comparator<zzp>, Parcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new nc5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzp[] f39799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39802d;

    zzq(Parcel parcel) {
        this.f39801c = parcel.readString();
        zzp[] zzpVarArr = (zzp[]) parcel.createTypedArray(zzp.CREATOR);
        String str = yy2.f38899a;
        this.f39799a = zzpVarArr;
        this.f39802d = zzpVarArr.length;
    }

    public final zzp a(int i11) {
        return this.f39799a[i11];
    }

    public final zzq b(String str) {
        return Objects.equals(this.f39801c, str) ? this : new zzq(str, false, this.f39799a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzp zzpVar, zzp zzpVar2) {
        zzp zzpVar3 = zzpVar2;
        UUID uuid = tf3.f35451a;
        UUID uuid2 = zzpVar.f39795b;
        return uuid.equals(uuid2) ? !uuid.equals(zzpVar3.f39795b) ? 1 : 0 : uuid2.compareTo(zzpVar3.f39795b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzq.class == obj.getClass()) {
            zzq zzqVar = (zzq) obj;
            if (Objects.equals(this.f39801c, zzqVar.f39801c) && Arrays.equals(this.f39799a, zzqVar.f39799a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f39800b;
        if (i11 != 0) {
            return i11;
        }
        String str = this.f39801c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f39799a);
        this.f39800b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f39801c);
        parcel.writeTypedArray(this.f39799a, 0);
    }

    private zzq(String str, boolean z11, zzp... zzpVarArr) {
        this.f39801c = str;
        zzpVarArr = z11 ? (zzp[]) zzpVarArr.clone() : zzpVarArr;
        this.f39799a = zzpVarArr;
        this.f39802d = zzpVarArr.length;
        Arrays.sort(zzpVarArr, this);
    }

    public zzq(String str, zzp... zzpVarArr) {
        this(null, true, zzpVarArr);
    }

    public zzq(List list) {
        this(null, false, (zzp[]) list.toArray(new zzp[0]));
    }
}
