package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFk1tSDK extends FilterInputStream {
    private int AFInAppEventParameterName;
    private int AFKeystoreWrapper;
    private final int[] areAllFieldsValid;
    private final byte[][] component1;
    private final int component2;
    private final byte[] component3;
    private final int[] component4;
    private int copy;
    private final byte[] copydefault;
    private final int equals;
    private int hashCode;
    private final int toString;
    private static final byte[] getCurrencyIso4217Code = AFk1uSDK.getRevenue;
    private static final int[] getRevenue = AFk1uSDK.getMonetizationNetwork;
    private static final int[] getMediationNetwork = AFk1uSDK.getCurrencyIso4217Code;
    private static final int[] getMonetizationNetwork = AFk1uSDK.getMediationNetwork;
    private static final int[] AFAdRevenueData = AFk1uSDK.AFAdRevenueData;

    public AFk1tSDK(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i11, bArr, bArr2, (byte) 0);
    }

    private static byte[][] getCurrencyIso4217Code(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = new byte[bArr[i11].length];
            int i12 = 0;
            while (true) {
                byte[] bArr3 = bArr[i11];
                if (i12 < bArr3.length) {
                    bArr2[i11][bArr3[i12]] = (byte) i12;
                    i12++;
                }
            }
        }
        return bArr2;
    }

    private void getMediationNetwork(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component4;
        char c11 = 1;
        char c12 = 2;
        char c13 = '\b';
        char c14 = 3;
        int i11 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.areAllFieldsValid;
        iArr[0] = i11 ^ iArr2[0];
        char c15 = 5;
        char c16 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c17 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i12 = 1;
        int i13 = 4;
        while (i12 < this.component2) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component4;
            char c18 = c11;
            byte[][] bArr3 = this.component1;
            byte[] bArr4 = bArr3[0];
            int i14 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getMediationNetwork;
            byte[] bArr5 = bArr3[c18];
            char c19 = c12;
            int i15 = i14 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMonetizationNetwork;
            byte[] bArr6 = bArr3[c19];
            char c21 = c14;
            int i16 = i15 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = AFAdRevenueData;
            byte[] bArr7 = bArr3[c21];
            char c22 = c13;
            int i17 = i16 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.areAllFieldsValid;
            int i18 = i17 ^ iArr8[i13];
            char c23 = c17;
            char c24 = c15;
            int i19 = (((iArr3[iArr4[bArr4[c18]] >>> 24] ^ iArr5[(iArr4[bArr5[c18]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c18]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c18]] & 255]) ^ iArr8[i13 + 1];
            int i21 = (((iArr3[iArr4[bArr4[c19]] >>> 24] ^ iArr5[(iArr4[bArr5[c19]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c19]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c19]] & 255]) ^ iArr8[i13 + 2];
            int i22 = (((iArr3[iArr4[bArr4[c21]] >>> 24] ^ iArr5[(iArr4[bArr5[c21]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c21]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c21]] & 255]) ^ iArr8[i13 + 3];
            iArr4[0] = i18;
            iArr4[c18] = i19;
            iArr4[c19] = i21;
            iArr4[c21] = i22;
            i12++;
            i13 += 4;
            c11 = c18;
            c12 = c19;
            c14 = c21;
            c13 = c22;
            c15 = c24;
            c17 = c23;
            c16 = c16;
        }
        char c25 = c11;
        char c26 = c12;
        char c27 = c14;
        char c28 = c13;
        int[] iArr9 = this.areAllFieldsValid;
        int i23 = iArr9[i13];
        byte[] bArr8 = getCurrencyIso4217Code;
        int[] iArr10 = this.component4;
        byte[][] bArr9 = this.component1;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i23 >>> 24));
        byte[] bArr11 = bArr9[c25];
        bArr2[c25] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i23 >>> 16));
        byte[] bArr12 = bArr9[c26];
        bArr2[c26] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i23 >>> 8));
        byte[] bArr13 = bArr9[c27];
        bArr2[c27] = (byte) (i23 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i24 = iArr9[i13 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c25]] >>> 24] ^ (i24 >>> 24));
        bArr2[c15] = (byte) (bArr8[(iArr10[bArr11[c25]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[c16] = (byte) (bArr8[(iArr10[bArr12[c25]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[7] = (byte) (i24 ^ bArr8[iArr10[bArr13[c25]] & 255]);
        int i25 = iArr9[i13 + 2];
        bArr2[c28] = (byte) (bArr8[iArr10[bArr10[c26]] >>> 24] ^ (i25 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c26]] >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c26]] >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[11] = (byte) (i25 ^ bArr8[iArr10[bArr13[c26]] & 255]);
        int i26 = iArr9[i13 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c27]] >>> 24] ^ (i26 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c27]] >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[c17] = (byte) (bArr8[(iArr10[bArr12[c27]] >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[15] = (byte) (bArr8[iArr10[bArr13[c27]] & 255] ^ i26);
    }

    private int getRevenue() throws IOException {
        if (this.copy == Integer.MAX_VALUE) {
            this.copy = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 16) {
            byte[] bArr = this.component3;
            int i11 = this.copy;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.component3, i12, 16 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 16);
            if (i12 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.toString;
            if (i14 == this.equals) {
                getMediationNetwork(this.component3, this.copydefault);
            } else {
                if (this.hashCode <= i14) {
                    getMediationNetwork(this.component3, this.copydefault);
                } else {
                    byte[] bArr2 = this.component3;
                    System.arraycopy(bArr2, 0, this.copydefault, 0, bArr2.length);
                }
                int i15 = this.hashCode;
                if (i15 < this.equals) {
                    this.hashCode = i15 + 1;
                } else {
                    this.hashCode = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.copy = i16;
            this.AFKeystoreWrapper = 0;
            this.AFInAppEventParameterName = i16 < 0 ? 16 - (this.copydefault[15] & 255) : 16;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getRevenue();
        return this.AFInAppEventParameterName - this.AFKeystoreWrapper;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getRevenue();
        int i11 = this.AFKeystoreWrapper;
        if (i11 >= this.AFInAppEventParameterName) {
            return -1;
        }
        byte[] bArr = this.copydefault;
        this.AFKeystoreWrapper = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long j12 = 0;
        while (j12 < j11 && read() != -1) {
            j12++;
        }
        return j12;
    }

    private AFk1tSDK(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2, byte b11) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component4 = new int[4];
        this.component3 = new byte[16];
        this.copydefault = new byte[16];
        this.hashCode = 1;
        this.copy = Integer.MAX_VALUE;
        this.AFKeystoreWrapper = 16;
        this.AFInAppEventParameterName = 16;
        this.component2 = i11;
        this.areAllFieldsValid = AFk1uSDK.getMediationNetwork(bArr, i11);
        this.component1 = getCurrencyIso4217Code(bArr2);
        this.toString = 100;
        this.equals = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            getRevenue();
            int i15 = this.AFKeystoreWrapper;
            if (i15 >= this.AFInAppEventParameterName) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.copydefault;
            this.AFKeystoreWrapper = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
