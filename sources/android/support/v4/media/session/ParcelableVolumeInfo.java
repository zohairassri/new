package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1262e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i11) {
            return new ParcelableVolumeInfo[i11];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1258a = parcel.readInt();
        this.f1260c = parcel.readInt();
        this.f1261d = parcel.readInt();
        this.f1262e = parcel.readInt();
        this.f1259b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1258a);
        parcel.writeInt(this.f1260c);
        parcel.writeInt(this.f1261d);
        parcel.writeInt(this.f1262e);
        parcel.writeInt(this.f1259b);
    }
}
