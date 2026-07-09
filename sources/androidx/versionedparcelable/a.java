package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class a extends VersionedParcel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f13105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f13106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f13108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f13109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13112k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new t.a(), new t.a(), new t.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f13106e.writeInt(-1);
        } else {
            this.f13106e.writeInt(bArr.length);
            this.f13106e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f13106e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i11) {
        this.f13106e.writeInt(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f13106e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f13106e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i11 = this.f13110i;
        if (i11 >= 0) {
            int i12 = this.f13105d.get(i11);
            int iDataPosition = this.f13106e.dataPosition();
            this.f13106e.setDataPosition(i12);
            this.f13106e.writeInt(iDataPosition - i12);
            this.f13106e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f13106e;
        int iDataPosition = parcel.dataPosition();
        int i11 = this.f13111j;
        if (i11 == this.f13107f) {
            i11 = this.f13108g;
        }
        return new a(parcel, iDataPosition, i11, this.f13109h + "  ", this.f13102a, this.f13103b, this.f13104c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f13106e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i11 = this.f13106e.readInt();
        if (i11 < 0) {
            return null;
        }
        byte[] bArr = new byte[i11];
        this.f13106e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f13106e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i11) {
        while (this.f13111j < this.f13108g) {
            int i12 = this.f13112k;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            this.f13106e.setDataPosition(this.f13111j);
            int i13 = this.f13106e.readInt();
            this.f13112k = this.f13106e.readInt();
            this.f13111j += i13;
        }
        return this.f13112k == i11;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f13106e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable q() {
        return this.f13106e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f13106e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i11) {
        a();
        this.f13110i = i11;
        this.f13105d.put(i11, this.f13106e.dataPosition());
        E(0);
        E(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z11) {
        this.f13106e.writeInt(z11 ? 1 : 0);
    }

    private a(Parcel parcel, int i11, int i12, String str, t.a aVar, t.a aVar2, t.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f13105d = new SparseIntArray();
        this.f13110i = -1;
        this.f13112k = -1;
        this.f13106e = parcel;
        this.f13107f = i11;
        this.f13108g = i12;
        this.f13111j = i11;
        this.f13109h = str;
    }
}
