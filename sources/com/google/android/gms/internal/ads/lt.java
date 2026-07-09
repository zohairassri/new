package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class lt extends ft {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f30426c;

    @Override // com.google.android.gms.internal.ads.ft
    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i11 = 4;
        if (length == 1) {
            int iA = kt.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    int iA2 = kt.a(strArrSplit[i12]);
                    int i13 = (iA2 >> 16) ^ ((char) iA2);
                    byte b11 = (byte) i13;
                    byte b12 = (byte) (i13 >> 8);
                    int i14 = i12 + i12;
                    bArr[i14] = new byte[]{b11, b12}[0];
                    bArr[i14 + 1] = b12;
                }
            } else {
                bArr = new byte[length];
                for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                    int iA3 = kt.a(strArrSplit[i15]);
                    bArr[i15] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f30426c = b();
        synchronized (this.f26561a) {
            try {
                MessageDigest messageDigest = this.f30426c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f30426c.update(bArrArray);
                byte[] bArrDigest = this.f30426c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i11 = length2;
                }
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i11);
                return bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
