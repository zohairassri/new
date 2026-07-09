package ya0;

import kotlin.jvm.internal.Intrinsics;
import ya0.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements d {
    @Override // ya0.d
    public void a(String str, mb0.c preferencesService) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        preferencesService.q(str);
    }

    @Override // ya0.d
    public String b(mb0.c preferencesService) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        return preferencesService.T();
    }

    @Override // ya0.d
    public String c(mb0.c preferencesService) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        return preferencesService.U();
    }

    @Override // ya0.d
    public void d(String str, mb0.c preferencesService) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        preferencesService.A(str);
    }

    @Override // ya0.d
    public String e(mb0.c cVar) {
        return d.a.a(this, cVar);
    }

    @Override // ya0.d
    public void f(String str, mb0.c cVar) {
        d.a.c(this, str, cVar);
    }

    @Override // ya0.d
    public void g(String str, mb0.c preferencesService) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        preferencesService.i(str);
    }

    @Override // ya0.d
    public String h(mb0.c preferencesService) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        return preferencesService.Z();
    }
}
