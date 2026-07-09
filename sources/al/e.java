package al;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.List;
import ml.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f1064c = new e(x.A(), 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f1065d = l0.o0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f1066e = l0.o0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g.a f1067f = new g.a() { // from class: al.d
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return e.b(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f1068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1069b;

    public e(List list, long j11) {
        this.f1068a = x.w(list);
        this.f1069b = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1065d);
        return new e(parcelableArrayList == null ? x.A() : ml.c.b(b.f1028t0, parcelableArrayList), bundle.getLong(f1066e));
    }
}
