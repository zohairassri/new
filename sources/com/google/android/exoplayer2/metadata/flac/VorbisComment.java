package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.y0;
import ml.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20923b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i11) {
            return new VorbisComment[i11];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f20922a = str;
        this.f20923b = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void W0(y0.b bVar) {
        String str = this.f20922a;
        str.getClass();
        switch (str) {
            case "ALBUM":
                bVar.N(this.f20923b);
                break;
            case "TITLE":
                bVar.m0(this.f20923b);
                break;
            case "DESCRIPTION":
                bVar.U(this.f20923b);
                break;
            case "ALBUMARTIST":
                bVar.M(this.f20923b);
                break;
            case "ARTIST":
                bVar.O(this.f20923b);
                break;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f20922a.equals(vorbisComment.f20922a) && this.f20923b.equals(vorbisComment.f20923b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f20922a.hashCode()) * 31) + this.f20923b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f20922a + "=" + this.f20923b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f20922a);
        parcel.writeString(this.f20923b);
    }

    protected VorbisComment(Parcel parcel) {
        this.f20922a = (String) l0.j(parcel.readString());
        this.f20923b = (String) l0.j(parcel.readString());
    }
}
