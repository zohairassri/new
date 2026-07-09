package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21110c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f21113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f21114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f21115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f21116f;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int i11) {
                return new VariantInfo[i11];
            }
        }

        VariantInfo(Parcel parcel) {
            this.f21111a = parcel.readInt();
            this.f21112b = parcel.readInt();
            this.f21113c = parcel.readString();
            this.f21114d = parcel.readString();
            this.f21115e = parcel.readString();
            this.f21116f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && VariantInfo.class == obj.getClass()) {
                VariantInfo variantInfo = (VariantInfo) obj;
                if (this.f21111a == variantInfo.f21111a && this.f21112b == variantInfo.f21112b && TextUtils.equals(this.f21113c, variantInfo.f21113c) && TextUtils.equals(this.f21114d, variantInfo.f21114d) && TextUtils.equals(this.f21115e, variantInfo.f21115e) && TextUtils.equals(this.f21116f, variantInfo.f21116f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f21111a * 31) + this.f21112b) * 31;
            String str = this.f21113c;
            int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f21114d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f21115e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f21116f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f21111a);
            parcel.writeInt(this.f21112b);
            parcel.writeString(this.f21113c);
            parcel.writeString(this.f21114d);
            parcel.writeString(this.f21115e);
            parcel.writeString(this.f21116f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int i11) {
            return new HlsTrackMetadataEntry[i11];
        }
    }

    HlsTrackMetadataEntry(Parcel parcel) {
        this.f21108a = parcel.readString();
        this.f21109b = parcel.readString();
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f21110c = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HlsTrackMetadataEntry.class == obj.getClass()) {
            HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
            if (TextUtils.equals(this.f21108a, hlsTrackMetadataEntry.f21108a) && TextUtils.equals(this.f21109b, hlsTrackMetadataEntry.f21109b) && this.f21110c.equals(hlsTrackMetadataEntry.f21110c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f21108a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f21109b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f21110c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f21108a != null) {
            str = " [" + this.f21108a + ", " + this.f21109b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f21108a);
        parcel.writeString(this.f21109b);
        int size = this.f21110c.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeParcelable((Parcelable) this.f21110c.get(i12), 0);
        }
    }
}
