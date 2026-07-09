package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20987b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry[] newArray(int i11) {
            return new SmtaMetadataEntry[i11];
        }
    }

    /* synthetic */ SmtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.f20986a == smtaMetadataEntry.f20986a && this.f20987b == smtaMetadataEntry.f20987b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + c.a(this.f20986a)) * 31) + this.f20987b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f20986a + ", svcTemporalLayerCount=" + this.f20987b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f20986a);
        parcel.writeInt(this.f20987b);
    }

    public SmtaMetadataEntry(float f11, int i11) {
        this.f20986a = f11;
        this.f20987b = i11;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f20986a = parcel.readFloat();
        this.f20987b = parcel.readInt();
    }
}
