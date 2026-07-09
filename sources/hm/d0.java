package hm;

import com.google.android.gms.internal.ads.i75;
import com.google.android.gms.internal.ads.q75;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f102286a;

    private d0(a0 a0Var) {
        this.f102286a = a0Var;
    }

    public static d0 a(a0 a0Var) {
        return new d0(a0Var);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        String strB = this.f102286a.b();
        q75.b(strB);
        return strB;
    }
}
