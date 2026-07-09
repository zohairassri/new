package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFk1vSDK extends FilterInputStream {
    private static final short getMediationNetwork = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private byte[] getCurrencyIso4217Code;
    private int getMonetizationNetwork;
    private byte[] getRevenue;
    private int hashCode;
    private int toString;
    private int valueOf;

    public AFk1vSDK(InputStream inputStream, int[] iArr, int i11, byte[] bArr, int i12, int i13) throws IOException {
        this(inputStream, iArr, i11, bArr, i12, i13, (byte) 0);
    }

    private int AFAdRevenueData() throws IOException {
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.getMonetizationNetwork == 8) {
            byte[] bArr = this.getRevenue;
            int i11 = this.component3;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.getRevenue, i12, 8 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 8);
            if (i12 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.copydefault;
            if (i14 == this.equals) {
                getMonetizationNetwork();
            } else {
                if (this.valueOf <= i14) {
                    getMonetizationNetwork();
                }
                int i15 = this.valueOf;
                if (i15 < this.equals) {
                    this.valueOf = i15 + 1;
                } else {
                    this.valueOf = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.component3 = i16;
            this.getMonetizationNetwork = 0;
            this.areAllFieldsValid = i16 < 0 ? 8 - (this.getRevenue[7] & 255) : 8;
        }
        return this.areAllFieldsValid;
    }

    private void getMonetizationNetwork() {
        if (this.component4 == 3) {
            byte[] bArr = this.getRevenue;
            System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, bArr.length);
        }
        byte[] bArr2 = this.getRevenue;
        boolean z11 = true;
        char c11 = 2;
        int i11 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = 0;
        while (true) {
            int i14 = this.component2;
            if (i13 >= i14) {
                break;
            }
            short s11 = getMediationNetwork;
            i12 -= ((((i14 - i13) * s11) + i11) ^ ((i11 << 4) + this.toString)) ^ ((i11 >>> 5) + this.hashCode);
            i11 -= (((i12 << 4) + this.component1) ^ ((s11 * (i14 - i13)) + i12)) ^ ((i12 >>> 5) + this.copy);
            i13++;
            c11 = c11;
            z11 = z11;
        }
        byte[] bArr3 = this.getRevenue;
        bArr3[0] = (byte) (i11 >> 24);
        bArr3[z11 ? 1 : 0] = (byte) (i11 >> 16);
        bArr3[c11] = (byte) (i11 >> 8);
        bArr3[3] = (byte) i11;
        bArr3[4] = (byte) (i12 >> 24);
        bArr3[5] = (byte) (i12 >> 16);
        bArr3[6] = (byte) (i12 >> 8);
        bArr3[7] = (byte) i12;
        if (this.component4 == 3) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.getRevenue;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.getCurrencyIso4217Code[i15]);
            }
            byte[] bArr5 = this.AFAdRevenueData;
            System.arraycopy(bArr5, 0, this.getCurrencyIso4217Code, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.areAllFieldsValid - this.getMonetizationNetwork;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i11 = this.getMonetizationNetwork;
        if (i11 >= this.areAllFieldsValid) {
            return -1;
        }
        byte[] bArr = this.getRevenue;
        this.getMonetizationNetwork = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long j12 = 0;
        while (j12 < j11 && read() != -1) {
            j12++;
        }
        return j12;
    }

    private AFk1vSDK(InputStream inputStream, int[] iArr, int i11, byte[] bArr, int i12, int i13, byte b11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component3 = Integer.MAX_VALUE;
        this.valueOf = 1;
        this.getRevenue = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.AFAdRevenueData = new byte[8];
        this.getMonetizationNetwork = 8;
        this.areAllFieldsValid = 8;
        this.component2 = Math.min(Math.max(i12, 5), 16);
        this.component4 = i13;
        if (i13 == 3) {
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, 8);
        }
        long j11 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i11 == 0) {
            this.component1 = (int) j11;
            long j12 = j11 >> 3;
            short s11 = getMediationNetwork;
            this.copy = (int) ((((long) s11) * j12) >> 32);
            this.toString = (int) (j11 >> 32);
            this.hashCode = (int) (j12 + ((long) s11));
        } else {
            int i14 = (int) j11;
            this.component1 = i14;
            this.copy = i14 * i11;
            this.toString = i11 ^ i14;
            this.hashCode = (int) (j11 >> 32);
        }
        this.copydefault = 100;
        this.equals = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            AFAdRevenueData();
            int i15 = this.getMonetizationNetwork;
            if (i15 >= this.areAllFieldsValid) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.getRevenue;
            this.getMonetizationNetwork = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
