package z20;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "", QueryKeys.SUBDOMAIN, "(Ljava/lang/String;)Z", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Ljava/lang/String;)Ljava/lang/Double;", "toSpreadValue", "mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Double c(String str) {
        if (str != null) {
            return StringsKt.u(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(String str) {
        Double dC = c(str);
        return dC != null && dC.doubleValue() < 0.0d;
    }
}
