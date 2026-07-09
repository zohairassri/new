package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzor> CREATOR = new zzos();
    public final int zza;
    private zzbp zzb = null;
    private byte[] zzc;

    zzor(int i11, byte[] bArr) {
        this.zza = i11;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzbp zzbpVar = this.zzb;
        if (zzbpVar != null || this.zzc == null) {
            if (zzbpVar == null || this.zzc != null) {
                if (zzbpVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzbpVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        byte[] bArrZzav = this.zzc;
        if (bArrZzav == null) {
            bArrZzav = this.zzb.zzav();
        }
        um.a.f(parcel, 2, bArrZzav, false);
        um.a.b(parcel, iA);
    }

    public final zzbp zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzbp.zzd(this.zzc, zzadk.zza());
                this.zzc = null;
            } catch (zzaeg | NullPointerException e11) {
                throw new IllegalStateException(e11);
            }
        }
        zzb();
        return this.zzb;
    }
}
