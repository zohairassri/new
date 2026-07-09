package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21059d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i11) {
            return new StreamKey[i11];
        }
    }

    StreamKey(Parcel parcel) {
        this.f21056a = parcel.readInt();
        this.f21057b = parcel.readInt();
        int i11 = parcel.readInt();
        this.f21058c = i11;
        this.f21059d = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i11 = this.f21056a - streamKey.f21056a;
        return (i11 == 0 && (i11 = this.f21057b - streamKey.f21057b) == 0) ? this.f21058c - streamKey.f21058c : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f21056a == streamKey.f21056a && this.f21057b == streamKey.f21057b && this.f21058c == streamKey.f21058c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21056a * 31) + this.f21057b) * 31) + this.f21058c;
    }

    public String toString() {
        return this.f21056a + InstructionFileId.DOT + this.f21057b + InstructionFileId.DOT + this.f21058c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f21056a);
        parcel.writeInt(this.f21057b);
        parcel.writeInt(this.f21058c);
    }
}
