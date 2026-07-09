package ms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements c {
    @Override // ms.c
    public InetAddress resolve(String host) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(host, "host");
        InetAddress byName = InetAddress.getByName(host);
        Intrinsics.checkNotNullExpressionValue(byName, "InetAddress.getByName(host)");
        return byName;
    }
}
