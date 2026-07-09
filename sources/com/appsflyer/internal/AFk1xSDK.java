package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFk1xSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private byte[] component1;
    private byte[] component2;
    private int[] component3;
    private int component4;
    private int copydefault;
    private int equals;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private AFj1aSDK getMonetizationNetwork;
    private int getRevenue;
    private int toString;

    public AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12) throws IOException {
        this(inputStream, iArr, bArr, i11, false, i12, (byte) 0);
    }

    private int AFAdRevenueData() throws IOException {
        if (this.equals == Integer.MAX_VALUE) {
            this.equals = ((FilterInputStream) this).in.read();
        }
        if (this.component4 == 8) {
            byte[] bArr = this.component2;
            int i11 = this.equals;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.component2, i12, 8 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 8);
            if (i12 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.getCurrencyIso4217Code;
            if (i14 == this.AFAdRevenueData) {
                getCurrencyIso4217Code();
            } else {
                if (this.getRevenue <= i14) {
                    getCurrencyIso4217Code();
                }
                int i15 = this.getRevenue;
                if (i15 < this.AFAdRevenueData) {
                    this.getRevenue = i15 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.equals = i16;
            this.component4 = 0;
            this.copydefault = i16 < 0 ? 8 - (this.component2[7] & 255) : 8;
        }
        return this.copydefault;
    }

    private void getCurrencyIso4217Code() {
        if (this.toString == 2) {
            byte[] bArr = this.component2;
            System.arraycopy(bArr, 0, this.areAllFieldsValid, 0, bArr.length);
        }
        byte[] bArr2 = this.component2;
        int i11 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = this.getMediationNetwork;
        AFj1aSDK aFj1aSDK = this.getMonetizationNetwork;
        AFk1ySDK.getRevenue(i11, i12, false, i13, aFj1aSDK.getRevenue, aFj1aSDK.getMonetizationNetwork, this.component3);
        int[] iArr = this.component3;
        int i14 = iArr[0];
        int i15 = iArr[1];
        byte[] bArr3 = this.component2;
        bArr3[0] = (byte) (i14 >> 24);
        bArr3[1] = (byte) (i14 >> 16);
        bArr3[2] = (byte) (i14 >> 8);
        bArr3[3] = (byte) i14;
        bArr3[4] = (byte) (i15 >> 24);
        bArr3[5] = (byte) (i15 >> 16);
        bArr3[6] = (byte) (i15 >> 8);
        bArr3[7] = (byte) i15;
        if (this.toString == 2) {
            for (int i16 = 0; i16 < 8; i16++) {
                byte[] bArr4 = this.component2;
                bArr4[i16] = (byte) (bArr4[i16] ^ this.component1[i16]);
            }
            byte[] bArr5 = this.areAllFieldsValid;
            System.arraycopy(bArr5, 0, this.component1, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.copydefault - this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i11 = this.component4;
        if (i11 >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component2;
        this.component4 = i11 + 1;
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

    private AFk1xSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12, byte b11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.equals = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i11, 3), 16);
        this.getMediationNetwork = iMin;
        this.component2 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component1 = bArr2;
        this.areAllFieldsValid = new byte[8];
        this.component3 = new int[2];
        this.component4 = 8;
        this.copydefault = 8;
        this.toString = i12;
        if (i12 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getMonetizationNetwork = new AFj1aSDK(iArr, iMin, true, false);
        this.getCurrencyIso4217Code = 100;
        this.AFAdRevenueData = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            AFAdRevenueData();
            int i15 = this.component4;
            if (i15 >= this.copydefault) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.component2;
            this.component4 = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
