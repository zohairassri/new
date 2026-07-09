package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.k0;
import androidx.lifecycle.l;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f8043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f8044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f8045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f8046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f8048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f8049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f8050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f8051i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f8052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final CharSequence f8053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList f8054n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final ArrayList f8055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final boolean f8056s;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i11) {
            return new BackStackRecordState[i11];
        }
    }

    BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f8265c.size();
        this.f8043a = new int[size * 6];
        if (!aVar.f8271i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f8044b = new ArrayList(size);
        this.f8045c = new int[size];
        this.f8046d = new int[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            k0.a aVar2 = (k0.a) aVar.f8265c.get(i12);
            int i13 = i11 + 1;
            this.f8043a[i11] = aVar2.f8282a;
            ArrayList arrayList = this.f8044b;
            Fragment fragment = aVar2.f8283b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f8043a;
            iArr[i13] = aVar2.f8284c ? 1 : 0;
            iArr[i11 + 2] = aVar2.f8285d;
            iArr[i11 + 3] = aVar2.f8286e;
            int i14 = i11 + 5;
            iArr[i11 + 4] = aVar2.f8287f;
            i11 += 6;
            iArr[i14] = aVar2.f8288g;
            this.f8045c[i12] = aVar2.f8289h.ordinal();
            this.f8046d[i12] = aVar2.f8290i.ordinal();
        }
        this.f8047e = aVar.f8270h;
        this.f8048f = aVar.f8273k;
        this.f8049g = aVar.f8169v;
        this.f8050h = aVar.f8274l;
        this.f8051i = aVar.f8275m;
        this.f8052l = aVar.f8276n;
        this.f8053m = aVar.f8277o;
        this.f8054n = aVar.f8278p;
        this.f8055r = aVar.f8279q;
        this.f8056s = aVar.f8280r;
    }

    private void a(androidx.fragment.app.a aVar) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= this.f8043a.length) {
                aVar.f8270h = this.f8047e;
                aVar.f8273k = this.f8048f;
                aVar.f8271i = true;
                aVar.f8274l = this.f8050h;
                aVar.f8275m = this.f8051i;
                aVar.f8276n = this.f8052l;
                aVar.f8277o = this.f8053m;
                aVar.f8278p = this.f8054n;
                aVar.f8279q = this.f8055r;
                aVar.f8280r = this.f8056s;
                return;
            }
            k0.a aVar2 = new k0.a();
            int i13 = i11 + 1;
            aVar2.f8282a = this.f8043a[i11];
            if (FragmentManager.K0(2)) {
                Objects.toString(aVar);
                int i14 = this.f8043a[i13];
            }
            aVar2.f8289h = l.b.values()[this.f8045c[i12]];
            aVar2.f8290i = l.b.values()[this.f8046d[i12]];
            int[] iArr = this.f8043a;
            int i15 = i11 + 2;
            if (iArr[i13] == 0) {
                z11 = false;
            }
            aVar2.f8284c = z11;
            int i16 = iArr[i15];
            aVar2.f8285d = i16;
            int i17 = iArr[i11 + 3];
            aVar2.f8286e = i17;
            int i18 = i11 + 5;
            int i19 = iArr[i11 + 4];
            aVar2.f8287f = i19;
            i11 += 6;
            int i21 = iArr[i18];
            aVar2.f8288g = i21;
            aVar.f8266d = i16;
            aVar.f8267e = i17;
            aVar.f8268f = i19;
            aVar.f8269g = i21;
            aVar.f(aVar2);
            i12++;
        }
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.f8169v = this.f8049g;
        for (int i11 = 0; i11 < this.f8044b.size(); i11++) {
            String str = (String) this.f8044b.get(i11);
            if (str != null) {
                ((k0.a) aVar.f8265c.get(i11)).f8283b = fragmentManager.g0(str);
            }
        }
        aVar.v(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f8043a);
        parcel.writeStringList(this.f8044b);
        parcel.writeIntArray(this.f8045c);
        parcel.writeIntArray(this.f8046d);
        parcel.writeInt(this.f8047e);
        parcel.writeString(this.f8048f);
        parcel.writeInt(this.f8049g);
        parcel.writeInt(this.f8050h);
        TextUtils.writeToParcel(this.f8051i, parcel, 0);
        parcel.writeInt(this.f8052l);
        TextUtils.writeToParcel(this.f8053m, parcel, 0);
        parcel.writeStringList(this.f8054n);
        parcel.writeStringList(this.f8055r);
        parcel.writeInt(this.f8056s ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f8043a = parcel.createIntArray();
        this.f8044b = parcel.createStringArrayList();
        this.f8045c = parcel.createIntArray();
        this.f8046d = parcel.createIntArray();
        this.f8047e = parcel.readInt();
        this.f8048f = parcel.readString();
        this.f8049g = parcel.readInt();
        this.f8050h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f8051i = (CharSequence) creator.createFromParcel(parcel);
        this.f8052l = parcel.readInt();
        this.f8053m = (CharSequence) creator.createFromParcel(parcel);
        this.f8054n = parcel.createStringArrayList();
        this.f8055r = parcel.createStringArrayList();
        this.f8056s = parcel.readInt() != 0;
    }
}
