package w7;

import io.agora.rtc2.internal.AudioRoutingController;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f134929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f134930b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER);
        this.f134929a = byteArrayOutputStream;
        this.f134930b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f134929a.reset();
        try {
            b(this.f134930b, aVar.f134923a);
            String str = aVar.f134924b;
            if (str == null) {
                str = "";
            }
            b(this.f134930b, str);
            this.f134930b.writeLong(aVar.f134925c);
            this.f134930b.writeLong(aVar.f134926d);
            this.f134930b.write(aVar.f134927e);
            this.f134930b.flush();
            return this.f134929a.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}
