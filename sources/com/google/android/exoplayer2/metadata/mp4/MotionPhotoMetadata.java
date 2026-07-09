package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20980e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i11) {
            return new MotionPhotoMetadata[i11];
        }
    }

    /* synthetic */ MotionPhotoMetadata(Parcel parcel, a aVar) {
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
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.f20976a == motionPhotoMetadata.f20976a && this.f20977b == motionPhotoMetadata.f20977b && this.f20978c == motionPhotoMetadata.f20978c && this.f20979d == motionPhotoMetadata.f20979d && this.f20980e == motionPhotoMetadata.f20980e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f20976a)) * 31) + h.c(this.f20977b)) * 31) + h.c(this.f20978c)) * 31) + h.c(this.f20979d)) * 31) + h.c(this.f20980e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f20976a + ", photoSize=" + this.f20977b + ", photoPresentationTimestampUs=" + this.f20978c + ", videoStartPosition=" + this.f20979d + ", videoSize=" + this.f20980e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f20976a);
        parcel.writeLong(this.f20977b);
        parcel.writeLong(this.f20978c);
        parcel.writeLong(this.f20979d);
        parcel.writeLong(this.f20980e);
    }

    public MotionPhotoMetadata(long j11, long j12, long j13, long j14, long j15) {
        this.f20976a = j11;
        this.f20977b = j12;
        this.f20978c = j13;
        this.f20979d = j14;
        this.f20980e = j15;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f20976a = parcel.readLong();
        this.f20977b = parcel.readLong();
        this.f20978c = parcel.readLong();
        this.f20979d = parcel.readLong();
        this.f20980e = parcel.readLong();
    }
}
