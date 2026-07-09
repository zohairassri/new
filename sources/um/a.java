package um;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    private static int A(Parcel parcel, int i11) {
        parcel.writeInt(i11 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void B(Parcel parcel, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i11 - 4);
        parcel.writeInt(iDataPosition - i11);
        parcel.setDataPosition(iDataPosition);
    }

    private static void C(Parcel parcel, Parcelable parcelable, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i11);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static int a(Parcel parcel) {
        return A(parcel, 20293);
    }

    public static void b(Parcel parcel, int i11) {
        B(parcel, i11);
    }

    public static void c(Parcel parcel, int i11, boolean z11) {
        z(parcel, i11, 4);
        parcel.writeInt(z11 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i11, Boolean bool, boolean z11) {
        if (bool != null) {
            z(parcel, i11, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z11) {
            z(parcel, i11, 0);
        }
    }

    public static void e(Parcel parcel, int i11, Bundle bundle, boolean z11) {
        if (bundle == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.writeBundle(bundle);
            B(parcel, iA);
        }
    }

    public static void f(Parcel parcel, int i11, byte[] bArr, boolean z11) {
        if (bArr == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.writeByteArray(bArr);
            B(parcel, iA);
        }
    }

    public static void g(Parcel parcel, int i11, double d11) {
        z(parcel, i11, 8);
        parcel.writeDouble(d11);
    }

    public static void h(Parcel parcel, int i11, Double d11, boolean z11) {
        if (d11 != null) {
            z(parcel, i11, 8);
            parcel.writeDouble(d11.doubleValue());
        } else if (z11) {
            z(parcel, i11, 0);
        }
    }

    public static void i(Parcel parcel, int i11, float f11) {
        z(parcel, i11, 4);
        parcel.writeFloat(f11);
    }

    public static void j(Parcel parcel, int i11, Float f11, boolean z11) {
        if (f11 != null) {
            z(parcel, i11, 4);
            parcel.writeFloat(f11.floatValue());
        } else if (z11) {
            z(parcel, i11, 0);
        }
    }

    public static void k(Parcel parcel, int i11, IBinder iBinder, boolean z11) {
        if (iBinder == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.writeStrongBinder(iBinder);
            B(parcel, iA);
        }
    }

    public static void l(Parcel parcel, int i11, int i12) {
        z(parcel, i11, 4);
        parcel.writeInt(i12);
    }

    public static void m(Parcel parcel, int i11, int[] iArr, boolean z11) {
        if (iArr == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.writeIntArray(iArr);
            B(parcel, iA);
        }
    }

    public static void n(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                z(parcel, i11, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(((Integer) list.get(i12)).intValue());
        }
        B(parcel, iA);
    }

    public static void o(Parcel parcel, int i11, Integer num, boolean z11) {
        if (num != null) {
            z(parcel, i11, 4);
            parcel.writeInt(num.intValue());
        } else if (z11) {
            z(parcel, i11, 0);
        }
    }

    public static void p(Parcel parcel, int i11, long j11) {
        z(parcel, i11, 8);
        parcel.writeLong(j11);
    }

    public static void q(Parcel parcel, int i11, Long l11, boolean z11) {
        if (l11 != null) {
            z(parcel, i11, 8);
            parcel.writeLong(l11.longValue());
        } else if (z11) {
            z(parcel, i11, 0);
        }
    }

    public static void r(Parcel parcel, int i11, Parcel parcel2, boolean z11) {
        if (parcel2 == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            B(parcel, iA);
        }
    }

    public static void s(Parcel parcel, int i11, Parcelable parcelable, int i12, boolean z11) {
        if (parcelable == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcelable.writeToParcel(parcel, i12);
            B(parcel, iA);
        }
    }

    public static void t(Parcel parcel, int i11, short s11) {
        z(parcel, i11, 4);
        parcel.writeInt(s11);
    }

    public static void u(Parcel parcel, int i11, String str, boolean z11) {
        if (str == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.writeString(str);
            B(parcel, iA);
        }
    }

    public static void v(Parcel parcel, int i11, String[] strArr, boolean z11) {
        if (strArr == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.writeStringArray(strArr);
            B(parcel, iA);
        }
    }

    public static void w(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                z(parcel, i11, 0);
            }
        } else {
            int iA = A(parcel, i11);
            parcel.writeStringList(list);
            B(parcel, iA);
        }
    }

    public static void x(Parcel parcel, int i11, Parcelable[] parcelableArr, int i12, boolean z11) {
        if (parcelableArr == null) {
            if (z11) {
                z(parcel, i11, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i11);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, parcelable, i12);
            }
        }
        B(parcel, iA);
    }

    public static void y(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                z(parcel, i11, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            Parcelable parcelable = (Parcelable) list.get(i12);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, parcelable, 0);
            }
        }
        B(parcel, iA);
    }

    private static void z(Parcel parcel, int i11, int i12) {
        parcel.writeInt(i11 | (i12 << 16));
    }
}
