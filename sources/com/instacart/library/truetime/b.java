package com.instacart.library.truetime;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47597d = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicLong f47598a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicLong f47599b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f47600c = new AtomicBoolean(false);

    private double b(long j11) {
        return j11 / 65.536d;
    }

    public static long e(long[] jArr) {
        return ((jArr[1] - jArr[0]) + (jArr[2] - jArr[3])) / 2;
    }

    private long f(byte[] bArr, int i11) {
        return (((long) j(bArr[i11])) << 24) + (((long) j(bArr[i11 + 1])) << 16) + (((long) j(bArr[i11 + 2])) << 8) + ((long) j(bArr[i11 + 3]));
    }

    private long g(byte[] bArr, int i11) {
        return ((f(bArr, i11) - 2208988800L) * 1000) + ((f(bArr, i11 + 4) * 1000) / 4294967296L);
    }

    private int j(byte b11) {
        return b11 & 255;
    }

    private void l(byte[] bArr, int i11, long j11) {
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

    private void m(byte[] bArr) {
        bArr[0] = 27;
    }

    void a(long[] jArr) {
        this.f47599b.set(i(jArr));
        this.f47598a.set(jArr[7]);
    }

    long c() {
        return this.f47598a.get();
    }

    long d() {
        return this.f47599b.get();
    }

    synchronized long[] h(String str, float f11, float f12, int i11, int i12) {
        byte[] bArr;
        DatagramPacket datagramPacket;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        DatagramSocket datagramSocket;
        long[] jArr;
        DatagramSocket datagramSocket2 = null;
        try {
            try {
                bArr = new byte[48];
                datagramPacket = new DatagramPacket(bArr, 48, InetAddress.getByName(str), 123);
                m(bArr);
                jCurrentTimeMillis = System.currentTimeMillis();
                jElapsedRealtime = SystemClock.elapsedRealtime();
                l(bArr, 40, jCurrentTimeMillis);
                datagramSocket = new DatagramSocket();
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            datagramSocket.setSoTimeout(i12);
            datagramSocket.send(datagramPacket);
            jArr = new long[8];
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            jArr[7] = jElapsedRealtime2;
            long jG = g(bArr, 24);
            long jG2 = g(bArr, 32);
            long jG3 = g(bArr, 40);
            long j11 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            jArr[0] = jG;
            jArr[1] = jG2;
            jArr[2] = jG3;
            jArr[3] = j11;
            long jF = f(bArr, 4);
            jArr[4] = jF;
            double dB = b(jF);
            if (dB > f11) {
                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_delay", (float) dB, f11);
            }
            long jF2 = f(bArr, 8);
            jArr[5] = jF2;
            double dB2 = b(jF2);
            if (dB2 > f12) {
                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_dispersion", (float) dB2, f12);
            }
            byte b11 = bArr[0];
            byte b12 = (byte) (b11 & 7);
            if (b12 != 4 && b12 != 5) {
                throw new InvalidNtpServerResponseException("untrusted mode value for TrueTime: " + ((int) b12));
            }
            int i13 = bArr[1] & 255;
            jArr[6] = i13;
            if (i13 < 1 || i13 > 15) {
                throw new InvalidNtpServerResponseException("untrusted stratum value for TrueTime: " + i13);
            }
            if (((byte) ((b11 >> 6) & 3)) == 3) {
                throw new InvalidNtpServerResponseException("unsynchronized server responded for TrueTime");
            }
            double dAbs = Math.abs((j11 - jG) - (jG3 - jG2));
            if (dAbs >= i11) {
                throw new InvalidNtpServerResponseException("%s too large for comfort %f [actual] >= %f [expected]", "server_response_delay", (float) dAbs, i11);
            }
            long jAbs = Math.abs(jG - System.currentTimeMillis());
            if (jAbs >= 10000) {
                throw new InvalidNtpServerResponseException("Request was sent more than 10 seconds back " + jAbs);
            }
            this.f47600c.set(true);
            c.b(f47597d, "---- SNTP successful response from " + str);
            a(jArr);
            datagramSocket.close();
        } catch (Exception e12) {
            e = e12;
            datagramSocket2 = datagramSocket;
            c.a(f47597d, "---- SNTP request failed for " + str);
            throw e;
        } catch (Throwable th3) {
            th = th3;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
        return jArr;
    }

    long i(long[] jArr) {
        return jArr[3] + e(jArr);
    }

    boolean k() {
        return this.f47600c.get();
    }
}
