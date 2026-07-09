package aa;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebSettingsBoundaryInterface f472a;

    public o(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f472a = webSettingsBoundaryInterface;
    }

    public void a(boolean z11) {
        this.f472a.setAlgorithmicDarkeningAllowed(z11);
    }

    public void b(int i11) {
        this.f472a.setForceDark(i11);
    }
}
