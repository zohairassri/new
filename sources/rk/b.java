package rk;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f125013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f125014b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER);
        this.f125013a = byteArrayOutputStream;
        this.f125014b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f125013a.reset();
        try {
            b(this.f125014b, eventMessage.f20908a);
            String str = eventMessage.f20909b;
            if (str == null) {
                str = "";
            }
            b(this.f125014b, str);
            this.f125014b.writeLong(eventMessage.f20910c);
            this.f125014b.writeLong(eventMessage.f20911d);
            this.f125014b.write(eventMessage.f20912e);
            this.f125014b.flush();
            return this.f125013a.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}
