package aa;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f513a;

    public u(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f513a = webkitToCompatConverterBoundaryInterface;
    }

    public o a(WebSettings webSettings) {
        return new o((WebSettingsBoundaryInterface) wg0.a.a(WebSettingsBoundaryInterface.class, this.f513a.convertSettings(webSettings)));
    }
}
