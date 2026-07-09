package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    public static final String C = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* JADX INFO: renamed from: b.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class C0218b {
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

    Bundle E1(String str, Bundle bundle);

    boolean F5(b.a aVar);

    boolean K1(b.a aVar, Uri uri, int i11, Bundle bundle);

    boolean N5(b.a aVar, Uri uri);

    boolean S0(b.a aVar, Uri uri, Bundle bundle);

    boolean S2(b.a aVar, Bundle bundle);

    int W0(b.a aVar, String str, Bundle bundle);

    boolean Z4(b.a aVar, Uri uri, Bundle bundle, List list);

    boolean b3(b.a aVar, Bundle bundle);

    boolean b6(b.a aVar, Bundle bundle);

    boolean f2(b.a aVar, IBinder iBinder, Bundle bundle);

    boolean h6(b.a aVar, int i11, Uri uri, Bundle bundle);

    boolean v5(long j11);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: b.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        private static class C0217a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f13704a;

            C0217a(IBinder iBinder) {
                this.f13704a = iBinder;
            }

            @Override // b.b
            public boolean F5(b.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.C);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f13704a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.b
            public boolean N5(b.a aVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.C);
                    parcelObtain.writeStrongInterface(aVar);
                    C0218b.d(parcelObtain, uri, 0);
                    this.f13704a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.b
            public boolean S0(b.a aVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.C);
                    parcelObtain.writeStrongInterface(aVar);
                    C0218b.d(parcelObtain, uri, 0);
                    C0218b.d(parcelObtain, bundle, 0);
                    this.f13704a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.b
            public int W0(b.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.C);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0218b.d(parcelObtain, bundle, 0);
                    this.f13704a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13704a;
            }

            @Override // b.b
            public boolean b3(b.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.C);
                    parcelObtain.writeStrongInterface(aVar);
                    C0218b.d(parcelObtain, bundle, 0);
                    this.f13704a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.b
            public boolean v5(long j11) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.C);
                    parcelObtain.writeLong(j11);
                    this.f13704a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.C);
        }

        public static b R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.C);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0217a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            String str = b.C;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i11) {
                case 2:
                    boolean zV5 = v5(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zV5 ? 1 : 0);
                    return true;
                case 3:
                    boolean zF5 = F5(a.AbstractBinderC0215a.R(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zF5 ? 1 : 0);
                    return true;
                case 4:
                    b.a aVarR = a.AbstractBinderC0215a.R(parcel.readStrongBinder());
                    Uri uri = (Uri) C0218b.c(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zZ4 = Z4(aVarR, uri, (Bundle) C0218b.c(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zZ4 ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleE1 = E1(parcel.readString(), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0218b.d(parcel2, bundleE1, 1);
                    return true;
                case 6:
                    boolean zS2 = S2(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS2 ? 1 : 0);
                    return true;
                case 7:
                    boolean zN5 = N5(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), (Uri) C0218b.c(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zN5 ? 1 : 0);
                    return true;
                case 8:
                    int iW0 = W0(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iW0);
                    return true;
                case 9:
                    boolean zH6 = h6(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), parcel.readInt(), (Uri) C0218b.c(parcel, Uri.CREATOR), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zH6 ? 1 : 0);
                    return true;
                case 10:
                    boolean zB3 = b3(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zB3 ? 1 : 0);
                    return true;
                case 11:
                    boolean zS0 = S0(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), (Uri) C0218b.c(parcel, Uri.CREATOR), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS0 ? 1 : 0);
                    return true;
                case 12:
                    boolean zK1 = K1(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), (Uri) C0218b.c(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zK1 ? 1 : 0);
                    return true;
                case 13:
                    boolean zB6 = b6(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zB6 ? 1 : 0);
                    return true;
                case 14:
                    boolean zF2 = f2(a.AbstractBinderC0215a.R(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) C0218b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zF2 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i11, parcel, parcel2, i12);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
