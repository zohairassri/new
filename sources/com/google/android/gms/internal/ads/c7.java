package com.google.android.gms.internal.ads;

import io.agora.rtc2.internal.AudioRoutingController;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f24405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f24406b;

    public c7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER);
        this.f24405a = byteArrayOutputStream;
        this.f24406b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(b7 b7Var) {
        ByteArrayOutputStream byteArrayOutputStream = this.f24405a;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.f24406b;
            b(dataOutputStream, b7Var.f23705a);
            b(dataOutputStream, b7Var.f23706b);
            dataOutputStream.writeLong(b7Var.f23707c);
            dataOutputStream.writeLong(b7Var.f23708d);
            dataOutputStream.write(b7Var.f23709e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}
