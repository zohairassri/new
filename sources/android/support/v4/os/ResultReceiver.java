package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f1295a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f1296b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.support.v4.os.a f1297c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i11) {
            return new ResultReceiver[i11];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b extends a.AbstractBinderC0044a {
        b() {
        }

        @Override // android.support.v4.os.a
        public void W3(int i11, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f1296b;
            if (handler != null) {
                handler.post(resultReceiver.new c(i11, bundle));
            } else {
                resultReceiver.a(i11, bundle);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f1299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f1300b;

        c(int i11, Bundle bundle) {
            this.f1299a = i11;
            this.f1300b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f1299a, this.f1300b);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1297c = a.AbstractBinderC0044a.R(parcel.readStrongBinder());
    }

    public void b(int i11, Bundle bundle) {
        if (this.f1295a) {
            Handler handler = this.f1296b;
            if (handler != null) {
                handler.post(new c(i11, bundle));
                return;
            } else {
                a(i11, bundle);
                return;
            }
        }
        android.support.v4.os.a aVar = this.f1297c;
        if (aVar != null) {
            try {
                aVar.W3(i11, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        synchronized (this) {
            try {
                if (this.f1297c == null) {
                    this.f1297c = new b();
                }
                parcel.writeStrongBinder(this.f1297c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void a(int i11, Bundle bundle) {
    }
}
