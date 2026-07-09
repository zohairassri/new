package qo;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class m extends h implements n {
    public m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // qo.h
    protected final boolean R(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            Bundle bundle = (Bundle) i.a(parcel, Bundle.CREATOR);
            i.b(parcel);
            zzc(bundle);
            return true;
        }
        if (i11 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) i.a(parcel, Bundle.CREATOR);
        i.b(parcel);
        W(bundle2);
        return true;
    }
}
