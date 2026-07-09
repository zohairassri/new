package im;

import android.net.Uri;
import com.google.android.gms.internal.ads.j10;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103923a = (String) j10.f28828a.e();

    public String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f103923a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
