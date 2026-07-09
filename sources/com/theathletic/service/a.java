package com.theathletic.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {
    void Q3(String str, String str2);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: com.theathletic.service.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        private static class C0810a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f81185a;

            @Override // com.theathletic.service.a
            public void Q3(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.theathletic.service.LiveAudioRoomControls");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f81185a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f81185a;
            }
        }

        public b() {
            attachInterface(this, "com.theathletic.service.LiveAudioRoomControls");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("com.theathletic.service.LiveAudioRoomControls");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("com.theathletic.service.LiveAudioRoomControls");
                return true;
            }
            if (i11 != 1) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            Q3(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.theathletic.service.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class C0809a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.theathletic.service.a
        public void Q3(String str, String str2) {
        }
    }
}
