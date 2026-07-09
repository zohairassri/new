package ck;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f17862a = new p() { // from class: ck.o
        @Override // ck.p
        public final k[] d() {
            return p.e();
        }
    };

    static /* synthetic */ k[] e() {
        return new k[0];
    }

    default k[] c(Uri uri, Map map) {
        return d();
    }

    k[] d();
}
