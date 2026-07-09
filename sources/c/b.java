package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    public static final String G = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class C0257b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i11) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i11);
            }
        }
    }

    Bundle A2();

    Bundle N1(String str, Bundle bundle, IBinder iBinder);

    int R5();

    Bundle W5(Bundle bundle);

    Bundle a3(Bundle bundle);

    void l6(Bundle bundle);

    Bundle x4();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, b.G);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = b.G;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i11) {
                case 2:
                    Bundle bundleA3 = a3((Bundle) C0257b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0257b.d(parcel2, bundleA3, 1);
                    return true;
                case 3:
                    l6((Bundle) C0257b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iR5 = R5();
                    parcel2.writeNoException();
                    parcel2.writeInt(iR5);
                    return true;
                case 5:
                    Bundle bundleX4 = x4();
                    parcel2.writeNoException();
                    C0257b.d(parcel2, bundleX4, 1);
                    return true;
                case 6:
                    Bundle bundleW5 = W5((Bundle) C0257b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0257b.d(parcel2, bundleW5, 1);
                    return true;
                case 7:
                    Bundle bundleA2 = A2();
                    parcel2.writeNoException();
                    C0257b.d(parcel2, bundleA2, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i11, parcel, parcel2, i12);
                case 9:
                    Bundle bundleN1 = N1(parcel.readString(), (Bundle) C0257b.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    C0257b.d(parcel2, bundleN1, 1);
                    return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
