package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.y0;
import com.google.common.primitives.h;
import java.util.Arrays;
import java.util.List;
import ml.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Entry[] f20897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20898b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i11) {
            return new Metadata[i11];
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.f20898b, (Entry[]) l0.A0(this.f20897a, entryArr));
    }

    public Metadata b(Metadata metadata) {
        return metadata == null ? this : a(metadata.f20897a);
    }

    public Metadata c(long j11) {
        return this.f20898b == j11 ? this : new Metadata(j11, this.f20897a);
    }

    public Entry d(int i11) {
        return this.f20897a[i11];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.f20897a, metadata.f20897a) && this.f20898b == metadata.f20898b) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f20897a.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f20897a) * 31) + h.c(this.f20898b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f20897a));
        if (this.f20898b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f20898b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f20897a.length);
        for (Entry entry : this.f20897a) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f20898b);
    }

    public Metadata(long j11, Entry... entryArr) {
        this.f20898b = j11;
        this.f20897a = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j11, List list) {
        this(j11, (Entry[]) list.toArray(new Entry[0]));
    }

    Metadata(Parcel parcel) {
        this.f20897a = new Entry[parcel.readInt()];
        int i11 = 0;
        while (true) {
            Entry[] entryArr = this.f20897a;
            if (i11 < entryArr.length) {
                entryArr[i11] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i11++;
            } else {
                this.f20898b = parcel.readLong();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface Entry extends Parcelable {
        default byte[] E() {
            return null;
        }

        default u0 e() {
            return null;
        }

        default void W0(y0.b bVar) {
        }
    }
}
