package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new od5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f39795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f39798e;

    zzp(Parcel parcel) {
        this.f39795b = new UUID(parcel.readLong(), parcel.readLong());
        this.f39796c = parcel.readString();
        String string = parcel.readString();
        String str = yy2.f38899a;
        this.f39797d = string;
        this.f39798e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzp zzpVar = (zzp) obj;
        return Objects.equals(this.f39796c, zzpVar.f39796c) && Objects.equals(this.f39797d, zzpVar.f39797d) && Objects.equals(this.f39795b, zzpVar.f39795b) && Arrays.equals(this.f39798e, zzpVar.f39798e);
    }

    public final int hashCode() {
        int i11 = this.f39794a;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = this.f39795b.hashCode() * 31;
        String str = this.f39796c;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f39797d.hashCode()) * 31) + Arrays.hashCode(this.f39798e);
        this.f39794a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        UUID uuid = this.f39795b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f39796c);
        parcel.writeString(this.f39797d);
        parcel.writeByteArray(this.f39798e);
    }

    public zzp(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f39795b = uuid;
        this.f39796c = null;
        this.f39797d = gh.h(str2);
        this.f39798e = bArr;
    }
}
