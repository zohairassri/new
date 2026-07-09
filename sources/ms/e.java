package ms;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ks.b f116935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f116936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ms.a f116937c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f116938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f116939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f116940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ks.b f116941d;

        b(long j11, long j12, long j13, ks.b bVar) {
            this.f116938a = j11;
            this.f116939b = j12;
            this.f116940c = j13;
            this.f116941d = bVar;
        }

        public long a() {
            return this.f116938a + this.f116940c + e();
        }

        long b() {
            return this.f116938a;
        }

        long c() {
            return this.f116939b;
        }

        public long d() {
            return this.f116940c;
        }

        public long e() {
            return this.f116941d.c() - this.f116939b;
        }

        boolean f() {
            return Math.abs((this.f116938a - this.f116939b) - (this.f116941d.a() - this.f116941d.c())) < 1000;
        }
    }

    public e(ks.b bVar, c cVar, ms.a aVar) {
        this.f116935a = bVar;
        this.f116936b = cVar;
        this.f116937c = aVar;
    }

    private static void a(byte b11, byte b12, int i11, long j11) throws a {
        if (b11 == 3) {
            throw new a("unsynchronized server");
        }
        if (b12 != 4 && b12 != 5) {
            throw new a("untrusted mode: " + ((int) b12));
        }
        if (i11 != 0 && i11 <= 15) {
            if (j11 == 0) {
                throw new a("zero transmitTime");
            }
        } else {
            throw new a("untrusted stratum: " + i11);
        }
    }

    private static long b(byte[] bArr, int i11) {
        int i12 = bArr[i11];
        int i13 = bArr[i11 + 1];
        int i14 = bArr[i11 + 2];
        int i15 = bArr[i11 + 3];
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        return (((long) i12) << 24) + (((long) i13) << 16) + (((long) i14) << 8) + ((long) i15);
    }

    static long c(byte[] bArr, int i11) {
        return ((b(bArr, i11) - 2208988800L) * 1000) + ((b(bArr, i11 + 4) * 1000) / 4294967296L);
    }

    private static void e(byte[] bArr, int i11, long j11) {
        long j12 = j11 / 1000;
        long j13 = j11 - (j12 * 1000);
        bArr[i11] = (byte) (r2 >> 24);
        bArr[i11 + 1] = (byte) (r2 >> 16);
        bArr[i11 + 2] = (byte) (r2 >> 8);
        bArr[i11 + 3] = (byte) (j12 + 2208988800L);
        long j14 = (j13 * 4294967296L) / 1000;
        bArr[i11 + 4] = (byte) (j14 >> 24);
        bArr[i11 + 5] = (byte) (j14 >> 16);
        bArr[i11 + 6] = (byte) (j14 >> 8);
        bArr[i11 + 7] = (byte) (Math.random() * 255.0d);
    }

    public b d(String str, Long l11) throws Throwable {
        byte[] bArrCopyOf;
        long jC;
        long j11;
        byte b11;
        byte b12;
        int i11;
        long jC2;
        long jC3;
        DatagramSocket datagramSocketCreateSocket = null;
        try {
            InetAddress inetAddressResolve = this.f116936b.resolve(str);
            datagramSocketCreateSocket = this.f116937c.createSocket();
            try {
                datagramSocketCreateSocket.setSoTimeout(l11.intValue());
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacketB = this.f116937c.b(bArr, inetAddressResolve, 123);
                bArr[0] = 27;
                long jA = this.f116935a.a();
                long jC4 = this.f116935a.c();
                e(bArr, 40, jA);
                datagramSocketCreateSocket.send(datagramPacketB);
                bArrCopyOf = Arrays.copyOf(bArr, 48);
                datagramSocketCreateSocket.receive(this.f116937c.a(bArrCopyOf));
                jC = this.f116935a.c();
                j11 = jA + (jC - jC4);
                byte b13 = bArrCopyOf[0];
                b11 = (byte) ((b13 >> 6) & 3);
                b12 = (byte) (b13 & 7);
                i11 = bArrCopyOf[1] & 255;
                jC2 = c(bArrCopyOf, 24);
                jC3 = c(bArrCopyOf, 32);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            long jC5 = c(bArrCopyOf, 40);
            a(b11, b12, i11, jC5);
            b bVar = new b(j11, jC, ((jC3 - jC2) + (jC5 - j11)) / 2, this.f116935a);
            datagramSocketCreateSocket.close();
            return bVar;
        } catch (Throwable th4) {
            th = th4;
            datagramSocketCreateSocket = datagramSocketCreateSocket;
            if (datagramSocketCreateSocket != null) {
                datagramSocketCreateSocket.close();
            }
            throw th;
        }
    }
}
