package i8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public byte[] a(List list, long j11) {
        ArrayList<? extends Parcelable> arrayListB = k6.h.b(list, new zo.g() { // from class: i8.c
            @Override // zo.g
            public final Object apply(Object obj) {
                return ((j6.a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(QueryKeys.TIME_ON_VIEW_IN_MINUTES, arrayListB);
        bundle.putLong(QueryKeys.SUBDOMAIN, j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
