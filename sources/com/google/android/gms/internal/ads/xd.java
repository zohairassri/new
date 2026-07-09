package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class xd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f37899f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f37904e = new byte[128];

    public xd(int i11) {
    }

    public final void a() {
        this.f37900a = false;
        this.f37902c = 0;
        this.f37901b = 0;
    }

    public final boolean b(int i11, int i12) {
        int i13 = this.f37901b;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i11 == 179 || i11 == 181) {
                            this.f37902c -= i12;
                            this.f37900a = false;
                            return true;
                        }
                    } else if ((i11 & 240) != 32) {
                        y22.c("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f37903d = this.f37902c;
                        this.f37901b = 4;
                    }
                } else if (i11 > 31) {
                    y22.c("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f37901b = 3;
                }
            } else if (i11 != 181) {
                y22.c("H263Reader", "Unexpected start code value");
                a();
            } else {
                this.f37901b = 2;
            }
        } else if (i11 == 176) {
            this.f37901b = 1;
            this.f37900a = true;
        }
        c(f37899f, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i11, int i12) {
        if (this.f37900a) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f37904e;
            int length = bArr2.length;
            int i14 = this.f37902c + i13;
            if (length < i14) {
                this.f37904e = Arrays.copyOf(bArr2, i14 + i14);
            }
            System.arraycopy(bArr, i11, this.f37904e, this.f37902c, i13);
            this.f37902c += i13;
        }
    }
}
