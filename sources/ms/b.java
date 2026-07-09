package ms;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {
    @Override // ms.a
    public DatagramPacket a(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return new DatagramPacket(buffer, buffer.length);
    }

    @Override // ms.a
    public DatagramPacket b(byte[] buffer, InetAddress address, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(address, "address");
        return new DatagramPacket(buffer, buffer.length, address, i11);
    }

    @Override // ms.a
    public DatagramSocket createSocket() {
        return new DatagramSocket();
    }
}
