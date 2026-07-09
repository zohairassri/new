package po;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import jn.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends jn.b implements b {
        public a() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        }

        @Override // jn.b
        protected boolean R(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1) {
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                L1(bundle);
            } else {
                if (i11 != 3) {
                    return false;
                }
                Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                P3(bundle2);
            }
            return true;
        }
    }

    void L1(Bundle bundle);

    void P3(Bundle bundle);
}
