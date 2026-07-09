package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ot extends ft {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f32101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32103e;

    public ot(int i11) {
        int i12 = i11 >> 3;
        this.f32102d = (i11 & 7) > 0 ? i12 + 1 : i12;
        this.f32103e = i11;
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final byte[] a(String str) {
        synchronized (this.f26561a) {
            try {
                MessageDigest messageDigestB = b();
                this.f32101c = messageDigestB;
                if (messageDigestB == null) {
                    return new byte[0];
                }
                messageDigestB.reset();
                this.f32101c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f32101c.digest();
                int length = bArrDigest.length;
                int i11 = this.f32102d;
                if (length > i11) {
                    length = i11;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i12 = this.f32103e & 7;
                if (i12 > 0) {
                    long j11 = 0;
                    for (int i13 = 0; i13 < length; i13++) {
                        if (i13 > 0) {
                            j11 <<= 8;
                        }
                        j11 += (long) (bArr[i13] & 255);
                    }
                    long j12 = j11 >>> (8 - i12);
                    while (true) {
                        i11--;
                        if (i11 < 0) {
                            break;
                        }
                        bArr[i11] = (byte) (255 & j12);
                        j12 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
