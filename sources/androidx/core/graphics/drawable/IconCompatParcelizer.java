package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f7354a = versionedParcel.p(iconCompat.f7354a, 1);
        iconCompat.f7356c = versionedParcel.j(iconCompat.f7356c, 2);
        iconCompat.f7357d = versionedParcel.r(iconCompat.f7357d, 3);
        iconCompat.f7358e = versionedParcel.p(iconCompat.f7358e, 4);
        iconCompat.f7359f = versionedParcel.p(iconCompat.f7359f, 5);
        iconCompat.f7360g = (ColorStateList) versionedParcel.r(iconCompat.f7360g, 6);
        iconCompat.f7362i = versionedParcel.t(iconCompat.f7362i, 7);
        iconCompat.f7363j = versionedParcel.t(iconCompat.f7363j, 8);
        iconCompat.p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.q(versionedParcel.f());
        int i11 = iconCompat.f7354a;
        if (-1 != i11) {
            versionedParcel.F(i11, 1);
        }
        byte[] bArr = iconCompat.f7356c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f7357d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i12 = iconCompat.f7358e;
        if (i12 != 0) {
            versionedParcel.F(i12, 4);
        }
        int i13 = iconCompat.f7359f;
        if (i13 != 0) {
            versionedParcel.F(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f7360g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f7362i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f7363j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
